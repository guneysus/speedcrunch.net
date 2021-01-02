// Generated from grammar/Calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
}