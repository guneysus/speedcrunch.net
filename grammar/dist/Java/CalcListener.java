// Generated from grammar/Calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#startrule}.
	 * @param ctx the parse tree
	 */
	void enterStartrule(CalcParser.StartruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#startrule}.
	 * @param ctx the parse tree
	 */
	void exitStartrule(CalcParser.StartruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddInt(CalcParser.BinaryAddIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAddSimple}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddSimple(CalcParser.BinaryAddSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddSimple}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddSimple(CalcParser.BinaryAddSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryMultiplyInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMultiplyInt(CalcParser.BinaryMultiplyIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryMultiplyInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMultiplyInt(CalcParser.BinaryMultiplyIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinarySubstractInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinarySubstractInt(CalcParser.BinarySubstractIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinarySubstractInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinarySubstractInt(CalcParser.BinarySubstractIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryDivisionInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryDivisionInt(CalcParser.BinaryDivisionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryDivisionInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryDivisionInt(CalcParser.BinaryDivisionIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryModulusInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryModulusInt(CalcParser.BinaryModulusIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryModulusInt}
	 * labeled alternative in {@link CalcParser#binaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryModulusInt(CalcParser.BinaryModulusIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#signedatom}.
	 * @param ctx the parse tree
	 */
	void enterSignedatom(CalcParser.SignedatomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#signedatom}.
	 * @param ctx the parse tree
	 */
	void exitSignedatom(CalcParser.SignedatomContext ctx);
}