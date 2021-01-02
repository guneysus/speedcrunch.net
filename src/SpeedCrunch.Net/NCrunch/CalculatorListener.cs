using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Tree.Pattern;
using System;
using System.Linq.Expressions;

namespace NCrunch
{

    public class CalculatorListener : CalcBaseListener
    {
        Expression expression;

        public override void EnterInt([NotNull] CalcParser.IntContext context)
        {
            //switch (context.Start.Type)
            //{
            //    case CalcParser.INT:
            //        break;
            //    case CalcParser.HEX:
            //        break;
            //    default:
            //        break;
            //}

            base.EnterInt(context);
        }

        public override void EnterHex([NotNull] CalcParser.HexContext context)
        {
            base.EnterHex(context);
        }

        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            base.EnterEveryRule(context);
        }

        public override void EnterAdd([NotNull] CalcParser.AddContext context)
        {
            base.EnterAdd(context);
        }

        public override void EnterMult([NotNull] CalcParser.MultContext context)
        {
            base.EnterMult(context);
        }

        public override void VisitErrorNode([NotNull] IErrorNode node)
        {
            base.VisitErrorNode(node);
        }


    }
}
