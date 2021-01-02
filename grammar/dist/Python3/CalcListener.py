# Generated from Calc.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CalcParser import CalcParser
else:
    from CalcParser import CalcParser

# This class defines a complete listener for a parse tree produced by CalcParser.
class CalcListener(ParseTreeListener):

    # Enter a parse tree produced by CalcParser#Add.
    def enterAdd(self, ctx:CalcParser.AddContext):
        pass

    # Exit a parse tree produced by CalcParser#Add.
    def exitAdd(self, ctx:CalcParser.AddContext):
        pass


    # Enter a parse tree produced by CalcParser#Mult.
    def enterMult(self, ctx:CalcParser.MultContext):
        pass

    # Exit a parse tree produced by CalcParser#Mult.
    def exitMult(self, ctx:CalcParser.MultContext):
        pass


    # Enter a parse tree produced by CalcParser#Hex.
    def enterHex(self, ctx:CalcParser.HexContext):
        pass

    # Exit a parse tree produced by CalcParser#Hex.
    def exitHex(self, ctx:CalcParser.HexContext):
        pass


    # Enter a parse tree produced by CalcParser#Int.
    def enterInt(self, ctx:CalcParser.IntContext):
        pass

    # Exit a parse tree produced by CalcParser#Int.
    def exitInt(self, ctx:CalcParser.IntContext):
        pass



del CalcParser