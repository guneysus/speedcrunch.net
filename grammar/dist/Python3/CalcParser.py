# Generated from grammar/Calc.g4 by ANTLR 4.9
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5")
        buf.write("\t\4\2\t\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\7\2\4\3\2")
        buf.write("\2\2\4\5\7\5\2\2\5\6\7\3\2\2\6\7\7\5\2\2\7\3\3\2\2\2\2")
        return buf.getvalue()


class CalcParser ( Parser ):

    grammarFileName = "Calc.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'*'" ]

    symbolicNames = [ "<INVALID>", "PLUS", "TIMES", "INT" ]

    RULE_startRule = 0

    ruleNames =  [ "startRule" ]

    EOF = Token.EOF
    PLUS=1
    TIMES=2
    INT=3

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartRuleContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return CalcParser.RULE_startRule

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class BinaryAddIntContext(StartRuleContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a CalcParser.StartRuleContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(CalcParser.INT)
            else:
                return self.getToken(CalcParser.INT, i)
        def PLUS(self):
            return self.getToken(CalcParser.PLUS, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBinaryAddInt" ):
                listener.enterBinaryAddInt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBinaryAddInt" ):
                listener.exitBinaryAddInt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBinaryAddInt" ):
                return visitor.visitBinaryAddInt(self)
            else:
                return visitor.visitChildren(self)



    def startRule(self):

        localctx = CalcParser.StartRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_startRule)
        try:
            localctx = CalcParser.BinaryAddIntContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(CalcParser.INT)
            self.state = 3
            self.match(CalcParser.PLUS)
            self.state = 4
            self.match(CalcParser.INT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





