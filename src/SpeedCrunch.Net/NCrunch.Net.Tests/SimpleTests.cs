using System;
using System.Linq.Expressions;
using Xunit;

namespace NCrunch.Net.Tests
{
    public class SimpleTests
    {

        [Theory]
        [InlineData("3+5", 8)]
        public void Simple_Binary_Add(string input, object expected)
        {
            var (_, _, exp) = NCrunch.CalculatorParser.Parse(input);
            var lambda = Expression.Lambda(exp).Compile();
            var result = lambda.DynamicInvoke();
            Assert.Equal(expected, result);
        }

    }
}
