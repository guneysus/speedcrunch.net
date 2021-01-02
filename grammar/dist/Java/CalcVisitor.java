// Generated from Calc.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CalcParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(CalcParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(CalcParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalcParser.IntContext ctx);
}