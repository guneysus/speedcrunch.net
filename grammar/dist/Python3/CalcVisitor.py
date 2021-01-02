# Generated from Calc.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalcParser import CalcParser
else:
    from CalcParser import CalcParser

# This class defines a complete generic visitor for a parse tree produced by CalcParser.

class CalcVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CalcParser#Add.
    def visitAdd(self, ctx:CalcParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CalcParser#Mult.
    def visitMult(self, ctx:CalcParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CalcParser#Hex.
    def visitHex(self, ctx:CalcParser.HexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CalcParser#Int.
    def visitInt(self, ctx:CalcParser.IntContext):
        return self.visitChildren(ctx)



del CalcParser