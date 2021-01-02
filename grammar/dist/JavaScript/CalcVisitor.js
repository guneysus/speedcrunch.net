// Generated from grammar/Calc.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';

// This class defines a complete generic visitor for a parse tree produced by CalcParser.

export default class CalcVisitor extends antlr4.tree.ParseTreeVisitor {

	// Visit a parse tree produced by CalcParser#BinaryAddInt.
	visitBinaryAddInt(ctx) {
	  return this.visitChildren(ctx);
	}



}