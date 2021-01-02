// Generated from grammar/Calc.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';



const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0002\u0005\u0012\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003",
    "\u0004\u0004\t\u0004\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003",
    "\u0003\u0004\u0006\u0004\u000f\n\u0004\r\u0004\u000e\u0004\u0010\u0002",
    "\u0002\u0005\u0003\u0003\u0005\u0004\u0007\u0005\u0003\u0002\u0003\u0003",
    "\u00022;\u0002\u0012\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005",
    "\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0003\t",
    "\u0003\u0002\u0002\u0002\u0005\u000b\u0003\u0002\u0002\u0002\u0007\u000e",
    "\u0003\u0002\u0002\u0002\t\n\u0007-\u0002\u0002\n\u0004\u0003\u0002",
    "\u0002\u0002\u000b\f\u0007,\u0002\u0002\f\u0006\u0003\u0002\u0002\u0002",
    "\r\u000f\t\u0002\u0002\u0002\u000e\r\u0003\u0002\u0002\u0002\u000f\u0010",
    "\u0003\u0002\u0002\u0002\u0010\u000e\u0003\u0002\u0002\u0002\u0010\u0011",
    "\u0003\u0002\u0002\u0002\u0011\b\u0003\u0002\u0002\u0002\u0004\u0002",
    "\u0010\u0002"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

export default class CalcLexer extends antlr4.Lexer {

    static grammarFileName = "Calc.g4";
    static channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	static modeNames = [ "DEFAULT_MODE" ];
	static literalNames = [ null, "'+'", "'*'" ];
	static symbolicNames = [ null, "PLUS", "TIMES", "INT" ];
	static ruleNames = [ "PLUS", "TIMES", "INT" ];

    constructor(input) {
        super(input)
        this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    }

    get atn() {
        return atn;
    }
}

CalcLexer.EOF = antlr4.Token.EOF;
CalcLexer.PLUS = 1;
CalcLexer.TIMES = 2;
CalcLexer.INT = 3;



