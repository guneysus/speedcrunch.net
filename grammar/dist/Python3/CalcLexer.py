# Generated from Calc.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6")
        buf.write("\34\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3")
        buf.write("\3\3\4\6\4\21\n\4\r\4\16\4\22\3\5\3\5\3\5\3\5\6\5\31\n")
        buf.write("\5\r\5\16\5\32\2\2\6\3\3\5\4\7\5\t\6\3\2\4\3\2\62;\5\2")
        buf.write("\62;CHch\2\35\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t")
        buf.write("\3\2\2\2\3\13\3\2\2\2\5\r\3\2\2\2\7\20\3\2\2\2\t\24\3")
        buf.write("\2\2\2\13\f\7,\2\2\f\4\3\2\2\2\r\16\7-\2\2\16\6\3\2\2")
        buf.write("\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2")
        buf.write("\2\2\22\23\3\2\2\2\23\b\3\2\2\2\24\25\7\62\2\2\25\26\7")
        buf.write("z\2\2\26\30\3\2\2\2\27\31\t\3\2\2\30\27\3\2\2\2\31\32")
        buf.write("\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\n\3\2\2\2\5\2")
        buf.write("\22\32\2")
        return buf.getvalue()


class CalcLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    INT = 3
    HEX = 4

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'*'", "'+'" ]

    symbolicNames = [ "<INVALID>",
            "INT", "HEX" ]

    ruleNames = [ "T__0", "T__1", "INT", "HEX" ]

    grammarFileName = "Calc.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


