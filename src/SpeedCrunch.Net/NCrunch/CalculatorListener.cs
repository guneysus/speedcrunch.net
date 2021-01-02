using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Tree.Pattern;
using System;
using System.Linq.Expressions;
using static System.Linq.Expressions.Expression;

namespace NCrunch
{

    public class CalculatorListener : CalcBaseListener
    {
        Expression _expression = Constant(int.MaxValue);

        public Expression GetExpression() => _expression;

        //public override void EnterInt([NotNull] CalcParser.IntContext context)
        //{
        //    //switch (context.Start.Type)
        //    //{
        //    //    case CalcParser.INT:
        //    //        break;
        //    //    case CalcParser.HEX:
        //    //        break;
        //    //    default:
        //    //        break;
        //    //}

        //    var c = Constant(int.Parse(context.GetText()), typeof(int));

        //    base.EnterInt(context);
        //}


        public override void EnterBinaryAddInt([NotNull] CalcParser.BinaryAddIntContext context)
        {
            var leftText = context.children[0].GetText();
            var rightText = context.children[2].GetText();
            var leftInt = int.Parse(leftText);
            var rightInt = int.Parse(rightText);

            _expression = Add(Constant(leftInt), Constant(rightInt));

            base.EnterBinaryAddInt(context);
        }

        public override void EnterEveryRule([NotNull] ParserRuleContext context)
        {
            base.EnterEveryRule(context);
        }

    }
}
