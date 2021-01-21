using Antlr4.Runtime.Tree;
using System;
using System.Diagnostics;
using System.Linq.Expressions;
using Xunit;
using Xunit.Abstractions;

namespace NCrunch.Net.Tests
{
    public class SimpleTests
    {
        private readonly ITestOutputHelper logger;
        private readonly Action<object> writer;
        private readonly CalcVisitor visitor;

        public SimpleTests(ITestOutputHelper testoutputHelper)
        {
            this.logger = testoutputHelper;

            this.writer = s =>
            {

                Trace.WriteLine(s);
                logger.WriteLine(s.ToString());
            };

            this.visitor = new CalcVisitor(writer);
        }

        [Theory]
        [InlineData("0+0", 0)]
        [InlineData("0+1", 1)]
        [InlineData("1+0", 1)]
        [InlineData("0+10", 10)]
        [InlineData("10+0", 10)]
        [InlineData("10+10", 20)]
        [InlineData("10+100", 110)]
        [InlineData("100+10", 110)]
        public void Positive_Integer_Add(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        private object getResult(string input)
        {
            Delegate lambda = getLambda(input);
            var result = lambda.DynamicInvoke();
            return result;
        }

        private Delegate getLambda(string input)
        {
            var (_, _, _, tree) = NCrunch.CalculatorParser.Parse(input);
            var lambda = visitor.Visit(tree);
            return Expression.Lambda(lambda).Compile();
        }

        [Theory]
        [InlineData("-1+-1", -2)]
        [InlineData("-1+2", +1)]
        [InlineData("1+-2", -1)]
        public void Negative_Integer_Add(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("0*5", 0)]
        [InlineData("5*0", 0)]
        [InlineData("1*5", 5)]
        [InlineData("5*1", 5)]
        [InlineData("10*5", 50)]
        [InlineData("5*10", 50)]
        public void Positive_Integer_Multiply(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("-0*-5", 0)]
        [InlineData("-1*5", -5)]
        [InlineData("-1*-5", 5)]
        [InlineData("1*-5", -5)]
        public void Negative_Integer_Multiply(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }


        [Theory]
        [InlineData("0-5", -5)]
        [InlineData("5-0", 5)]
        [InlineData("1-5", -4)]
        [InlineData("5-1", 4)]
        [InlineData("10-5", 5)]
        [InlineData("5-10", -5)]
        [InlineData("5-1000", -995)]
        public void Positive_Integer_Substraction(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("0--1", 1)]
        [InlineData("0--5", 5)]
        [InlineData("1-+1", 0)]
        [InlineData("5--1", 6)]
        [InlineData("-5--1", -4)]
        public void Negative_Integer_Substraction(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("0/5", 0)]
        [InlineData("1/5", 0)]
        [InlineData("5/1", 5)]
        [InlineData("5/10", 0)]
        [InlineData("10/2", 5)]
        [InlineData("10/3", 3)]
        [InlineData("10/4", 2)]
        [InlineData("10/5", 2)]
        [InlineData("10/6", 1)]
        public void Positive_Integer_Division(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("5/0")]
        public void Positive_Divide_By_Zero(string input)
        {
            Delegate lambda = getLambda(input);
            Assert.Throws<DivideByZeroException>(() => _ = lambda.DynamicInvoke());
        }

        [Theory]
        [InlineData("5%0")]
        [InlineData("-1%0")]
        public void Modulo_By_Zero(string input)
        {
            Delegate lambda = getLambda(input);
            Assert.Throws<DivideByZeroException>(() => _ = lambda.DynamicInvoke());
        }

        [Theory]
        [InlineData("10%1", 0)]
        [InlineData("10%2", 0)]
        [InlineData("10%3", 1)]
        [InlineData("10%4", 2)]
        [InlineData("10%6", 4)]
        [InlineData("10%7", 3)]
        [InlineData("10%8", 2)]
        [InlineData("10%9", 1)]
        [InlineData("10%10", 0)]
        public void Positive_Integer_Modulo(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("10%-3", 1)]
        [InlineData("-10%-3", -1)]
        public void Negative_Integer_Modulo(string input, object expected)
        {
            object result = getResult(input);
            Assert.Equal(expected, result);
        }

    }

    public class TroubleshootTests
    {
        private readonly ITestOutputHelper logger;
        private readonly Action<object> writer;
        private readonly CalcVisitor visitor;

        public TroubleshootTests(ITestOutputHelper testoutputHelper)
        {
            this.logger = testoutputHelper;

            this.writer = s =>
            {

                Trace.WriteLine(s);
                logger.WriteLine(s.ToString());
            };

            this.visitor = new CalcVisitor(writer);

        }

        [Theory]
        [InlineData("3*50+20", 170)]
        [InlineData("1", 1)]
        [InlineData("10", 10)]
        [InlineData("0*1", 0)]
        [InlineData("0*1+10", 10)]
        [InlineData("0*1+10/2", 5)]
        [InlineData("0*1+10/2+3", 8)]
        public void Visit(string input, object expected)
        {
            var (_, _, exp, tree) = NCrunch.CalculatorParser.Parse(input, writer);

            var result = Expression.Lambda(visitor.Visit(tree)).Compile().DynamicInvoke();


            logger.WriteLine("--------------------------");
            logger.WriteLine(result.ToString());

            Assert.Equal(expected, result);
        }
    }
}
