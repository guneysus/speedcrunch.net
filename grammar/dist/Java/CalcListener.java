// Generated from grammar/Calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(CalcParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(CalcParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(CalcParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(CalcParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(CalcParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(CalcParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CalcParser.AtomContext ctx);
}