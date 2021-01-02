// Generated from grammar/Calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
}