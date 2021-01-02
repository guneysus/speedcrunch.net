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
    }
}
