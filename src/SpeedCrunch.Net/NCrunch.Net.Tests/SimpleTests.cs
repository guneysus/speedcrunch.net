using System;
using System.Linq.Expressions;
using Xunit;

namespace NCrunch.Net.Tests
{
    public class SimpleTests
    {

        [Fact]
        public void Simple_addition()
        {
            var input = "3+5";
            var exp = NCrunch.CalculatorParser.Compile(input);

            Assert.True(exp is BinaryExpression);
        }

    }
}
