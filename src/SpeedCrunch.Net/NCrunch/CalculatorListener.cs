using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Tree.Pattern;
using NCrunch.Exp;
using System;
using System.Linq.Expressions;
using static System.Linq.Expressions.Expression;

namespace NCrunch
{

    public class CalculatorListener : CalcBaseListener
    {
        ExpNode _current = new ExpNode("Start");

        Expression _exp = default;

        private readonly Action<object> writer;
        private readonly Parser parser;

        public CalculatorListener(Action<object> writer, Parser parser)
        {
            this.writer = writer ?? new Action<object>(s => { });
            this.parser = parser;
        }

        public Expression GetExpression() => _exp;

        #region Troubleshoot
        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            if (this.writer != default)
                writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()} | {context.ToStringTree(parser)}");

            base.EnterEveryRule(context);
        }

        public override void ExitEveryRule([NotNull] ParserRuleContext context)
        {
            if (this.writer != default)
                writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()} | {context.ToStringTree(parser)}");

            base.ExitEveryRule(context);
        }
        #endregion

        public override void EnterExpression([NotNull] CalcParser.ExpressionContext context)
        {
            base.EnterExpression(context);
        }


    }

    public class CalcVisitor : CalcBaseVisitor<Expression>
    {
        private readonly Action<object> writer;
        ExpressionType ExpressionType = ExpressionType.Default;
        Expression current;

        public CalcVisitor(Action<object> writer)
        {
            this.writer = writer ?? new Action<object>(_ => { });
        }

        public override Expression Visit(IParseTree tree)
        {
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {tree.ToStringTree()}");
            return base.Visit(tree);
        }

        public override Expression VisitChildren(IRuleNode node)
        {
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | Childs: {node.ChildCount} |{node.SourceInterval} | {node.GetText()}");
            Expression expression = base.VisitChildren(node);
            return expression;
        }

        public override Expression VisitStartRule([NotNull] CalcParser.StartRuleContext context)
        {
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()}");
            return base.VisitStartRule(context);
        }

        public override Expression VisitErrorNode(IErrorNode node)
        {
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {node.GetText()}");
            return base.VisitErrorNode(node);
        }

        protected override Expression AggregateResult(Expression aggregate, Expression nextResult)
        {
            if(aggregate != null && nextResult != null)
            {
                aggregate = MakeBinary(ExpressionType, aggregate, nextResult);
                //ExpressionType = ExpressionType.Default;
            }
            Expression expression = base.AggregateResult(aggregate, nextResult);
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {(aggregate is null ? "aggregate is null" : $"{aggregate}")}, {(nextResult is null ? "nextResult is null" : $"{nextResult}")}");
            return aggregate ?? nextResult;
        }

        public override Expression VisitExpression([NotNull] CalcParser.ExpressionContext context)
        {
            Expression result = base.VisitExpression(context);
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()}");
            return result;
        }
        public override Expression VisitTerminal(ITerminalNode node)
        {
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {node.GetText()}");
            Expression result = default;
            switch (node.Symbol.Type)
            {
                case CalcParser.NUMBER:
                    {
                        result = Expression.Constant(int.Parse(node.GetText()));
                        break;
                    }
                case CalcParser.PLUS:
                    ExpressionType = ExpressionType.Add;
                    break;
                case CalcParser.TIMES:
                    ExpressionType = ExpressionType.Multiply;
                    break;
                case CalcParser.DIV:
                    ExpressionType = ExpressionType.Divide;
                    break;
                case CalcParser.MINUS:
                    ExpressionType = ExpressionType.Subtract;
                    break;
                default:
                    break;
            }
            return result;
        }

        public override Expression VisitAddition([NotNull] CalcParser.AdditionContext context)
        {
            Expression expression = base.VisitAddition(context);
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()}");
            return expression;
        }

        public override Expression VisitAtom([NotNull] CalcParser.AtomContext context)
        {
            Expression expression = base.VisitAtom(context);
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()}");
            return expression;
        }

        public override Expression VisitMultiplication([NotNull] CalcParser.MultiplicationContext context)
        {
            Expression expression = base.VisitMultiplication(context);
            writer($"{System.Reflection.MethodBase.GetCurrentMethod().Name} | {context.GetText()}");
            return expression;
        }

    }
}
