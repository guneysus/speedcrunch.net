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
	 * Visit a parse tree produced by {@link CalcParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(CalcParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CalcParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(CalcParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalcParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CalcParser.AtomContext ctx);
}