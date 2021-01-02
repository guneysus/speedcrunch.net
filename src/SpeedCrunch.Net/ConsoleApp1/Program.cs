using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = "3+5+7";
            var (parser, ctx) = NCrunch.CalculatorParser.Parse(input);

            Console.WriteLine("Hello World!");
        }
    }
}
