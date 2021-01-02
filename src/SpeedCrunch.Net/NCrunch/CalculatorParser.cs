using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree.Pattern;
using System;
using System.Linq.Expressions;

namespace NCrunch
{
    public static class CalculatorParser
    {
        public static (ParseTreePattern tree, string) Compile(string input)
        {
            var stream = new AntlrInputStream(input);
            var lexer = new CalcLexer(stream);
            var tokens = new CommonTokenStream(lexer);
            var parser = new CalcParser(tokens);
            parser.BuildParseTree = true;
            parser.TrimParseTree = true;

            var listener = new CalculatorListener();
            parser.AddParseListener(listener);

            var errorListener = new CalcErrorListener();
            parser.AddErrorListener(errorListener);
            try
            {
                ParseTreePattern tree = parser.CompileParseTreePattern(input, CalcParser.RULE_e);
                tree.PatternTree.ToStringTree();
                return (tree, tree.PatternTree.ToStringTree());
            }
            catch (InputMismatchException ex)
            {
                throw;
            }
            catch (NoViableAltException)
            {
                throw;
            }

            throw new NotImplementedException();
        }

        public static (CalcParser parser, CalcParser.EContext ctx) Parse(string input)
        {
            var stream = new AntlrInputStream(input);
            var lexer = new CalcLexer(stream);
            var tokens = new CommonTokenStream(lexer);
            var parser = new CalcParser(tokens);
            parser.BuildParseTree = true;
            parser.TrimParseTree = true;

            CalcParser.EContext ctx = parser.e();

            var errorListener = new CalcErrorListener();
            parser.AddErrorListener(errorListener);

            var listener = new CalculatorListener();
            parser.AddParseListener(listener);

            Antlr4.Runtime.Tree.ParseTreeWalker.Default.Walk(listener, ctx);

            return (parser, ctx);
        }
    }
}
