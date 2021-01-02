using System;
using System.Linq.Expressions;
using Xunit;

namespace NCrunch.Net.Tests
{
    public class SimpleTests
    {

        [Theory]
        [InlineData("0+0", 0)]
        [InlineData("0+1", 1)]
        [InlineData("1+0", 1)]
        [InlineData("0+10", 10)]
        [InlineData("10+0", 10)]
        [InlineData("10+10", 20)]
        [InlineData("10+100", 110)]
        [InlineData("100+10", 110)]
        public void Simple_Integer_Add(string input, object expected)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var lambda = Expression.Lambda(exp).Compile();
            var result = lambda.DynamicInvoke();
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("0*5", 0)]
        [InlineData("5*0", 0)]
        [InlineData("1*5", 5)]
        [InlineData("5*1", 5)]
        [InlineData("10*5", 50)]
        [InlineData("5*10", 50)]
        public void Simple_Integer_Multiply(string input, object expected)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var lambda = Expression.Lambda(exp).Compile();
            var result = lambda.DynamicInvoke();
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
        public void Simple_Integer_Substraction(string input, object expected)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var lambda = Expression.Lambda(exp).Compile();
            var result = lambda.DynamicInvoke();
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
        public void Simple_Integer_Division(string input, object expected)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var lambda = Expression.Lambda(exp).Compile();
            var result = lambda.DynamicInvoke();
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData("5/0")]
        public void Integer_Divide_By_Zero(string input)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var f = Expression.Lambda<Func<int>>(exp).Compile();
            Assert.Throws<DivideByZeroException>(() => _ = f());
        }

    }
}
