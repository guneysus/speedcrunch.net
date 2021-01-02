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
	 * Visit a parse tree produced by {@link CalcParser#startrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartrule(CalcParser.StartruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryAddSimple}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryAddSimple(CalcParser.BinaryAddSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryMultiplyInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryMultiplyInt(CalcParser.BinaryMultiplyIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinarySubstractInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySubstractInt(CalcParser.BinarySubstractIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryDivisionInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryDivisionInt(CalcParser.BinaryDivisionIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryModulusInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryModulusInt(CalcParser.BinaryModulusIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#signedatom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedatom(CalcParser.SignedatomContext ctx);
}