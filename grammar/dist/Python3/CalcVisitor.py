# Generated from grammar/Calc.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalcParser import CalcParser
else:
    from CalcParser import CalcParser

# This class defines a complete generic visitor for a parse tree produced by CalcParser.

class CalcVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CalcParser#BinaryAddInt.
    def visitBinaryAddInt(self, ctx:CalcParser.BinaryAddIntContext):
        return self.visitChildren(ctx)



del CalcParser