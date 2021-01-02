// Generated from Calc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CalcParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CalcParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMult(CalcParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMult(CalcParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void enterHex(CalcParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Hex}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void exitHex(CalcParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalcParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalcParser.IntContext ctx);
}