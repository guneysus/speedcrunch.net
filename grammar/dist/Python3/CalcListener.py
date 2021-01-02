# Generated from grammar/Calc.g4 by ANTLR 4.9
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalcParser import CalcParser
else:
    from CalcParser import CalcParser

# This class defines a complete listener for a parse tree produced by CalcParser.
class CalcListener(ParseTreeListener):

    # Enter a parse tree produced by CalcParser#BinaryAddInt.
    def enterBinaryAddInt(self, ctx:CalcParser.BinaryAddIntContext):
        pass

    # Exit a parse tree produced by CalcParser#BinaryAddInt.
    def exitBinaryAddInt(self, ctx:CalcParser.BinaryAddIntContext):
        pass



del CalcParser