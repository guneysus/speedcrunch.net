using System;
using static System.Linq.Expressions.Expression;
using static Calc;
using static System.Console;
using System.Collections.Generic;
using System.Text;
using System.Linq;

//input(3, 7, Op.Plus, 2, Op.Division)
//    .calculate()
//    .Dump("3 + 7 / 2");

input(3, 7, 2, Op.TIMES, Op.PLUS)
    .calculate()
    .Dump("3 + (7 * 2)");

public enum Op
{
    PLUS, MINUS, TIMES, DIVISION
}


public static class Calc
{
    public static object[] input(params object[] inputs) => inputs;
    public static int stackIndex = -1;
    public static object[] stack = new object[MAX_STACK]; // inputs.Length];

    public const int MAX_STACK = 1 << 2;

    public static object calculate(this object[] inputs)
    {
        object result = default;
        var enumerator = inputs.GetEnumerator();

        //System.Array.Clear(stack, 0, stack.Length);

        static object pop(object[] stack)
        {
            object result = stack[stackIndex];
            Array.Clear(stack, stackIndex, 1);
            stackIndex--;
            return result;
        }

        while (enumerator.MoveNext())
        {
            stack.Dump();

            try
            {
                switch (enumerator.Current)
                {
                    case int s:
                        $"Int {_.ARROW_RIGHT} {s}".Dump();
                        stackIndex++;
                        stack[stackIndex] = s;
                        break;

                    case Op op:
                        switch (op)
                        {
                            case Op.PLUS:
                                {
                                    object right = pop(stack);
                                    object left = pop(stack);

                                    result = Lambda(Add(Constant(left), Constant(right))).Compile().DynamicInvoke();

                                    stackIndex++;

                                    stack[stackIndex] = result;
                                    break;
                                }

                            case Op.DIVISION:
                                {
                                    object right = pop(stack);
                                    object left = pop(stack);

                                    result = Lambda(Divide(Constant(left), Constant(right))).Compile().DynamicInvoke();

                                    stackIndex++;
                                    stack[stackIndex] = result;
                                    break;
                                }

                            case Op.TIMES:
                                {
                                    object right = pop(stack);
                                    object left = pop(stack);

                                    result = Lambda(Multiply(Constant(left), Constant(right))).Compile().DynamicInvoke();

                                    stackIndex++;
                                    stack[stackIndex] = result;
                                    break;
                                }

                            default:
                                break;
                        }

                        $"Op {_.ARROW_RIGHT} {op}".Dump();

                        break;
                    default:
                        break;
                }
            }
            catch (IndexOutOfRangeException x)
            {
                throw new StackOverflowException(nameof(MAX_STACK), x);
            }
        }

        stack.Dump();

        if (stackIndex == 0 && stack[0] != default)
        {
            object result = pop(stack);
            return result;
        }

        throw new InsufficientExecutionStackException();

    }
}

public static class _
{
    public static string ARROW_RIGHT = "→";
    public static string HR = "─────────────────────────";
    public static string BOX = "■";
    public static string SPACE = " ";

}

public static class DebugHelpers
{

    public static void Dump<T>(this IEnumerable<T> values, string title = default, Action<string> logger = default)
    {
        init()
        .setTitle(title)
            .AppendLine(string.Join(",", values.Select(x => x == null ? _.BOX : x.ToString())))
            .AppendLine(_.HR)
        .dump(logger);
    }

    private static StringBuilder init() => new StringBuilder().Append(_.SPACE);

    public static void dump(this StringBuilder sb, Action<string> logger)
    {
        if (logger == default)
            Write(sb.ToString());
        else
            logger(sb.ToString());
    }

    public static StringBuilder setTitle(this StringBuilder sb, string title)
    {
        if (title != default)
            sb
                .Append(title)
                .Append(_.SPACE)
                .Append(_.ARROW_RIGHT)
                .Append(_.SPACE)
                ;

        return sb;
    }

    public static void Dump(this string value, string title = default, Action<string> logger = default)
    {
        init()
        .setTitle(title)
            .AppendLine(value)
            .AppendLine(_.HR)
        .dump(logger);
    }

    public static void Dump(this object value, string title = default, Action<string> logger = default)
    {
        init()
        .setTitle(title)
            .AppendLine(value.ToString())
            .AppendLine(_.HR)
        .dump(logger);
    }
}