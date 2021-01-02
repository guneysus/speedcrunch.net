// Generated from grammar/Calc.g4 by ANTLR 4.9
// jshint ignore: start
import antlr4 from 'antlr4';
import CalcListener from './CalcListener.js';
import CalcVisitor from './CalcVisitor.js';


const serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786",
    "\u5964\u0003\u0005\t\u0004\u0002\t\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0002\u0003\u0002\u0003\u0002\u0002\u0002\u0003\u0002\u0002\u0002\u0002",
    "\u0007\u0002\u0004\u0003\u0002\u0002\u0002\u0004\u0005\u0007\u0005\u0002",
    "\u0002\u0005\u0006\u0007\u0003\u0002\u0002\u0006\u0007\u0007\u0005\u0002",
    "\u0002\u0007\u0003\u0003\u0002\u0002\u0002\u0002"].join("");


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.PredictionContextCache();

export default class CalcParser extends antlr4.Parser {

    static grammarFileName = "Calc.g4";
    static literalNames = [ null, "'+'", "'*'" ];
    static symbolicNames = [ null, "PLUS", "TIMES", "INT" ];
    static ruleNames = [ "startRule" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CalcParser.ruleNames;
        this.literalNames = CalcParser.literalNames;
        this.symbolicNames = CalcParser.symbolicNames;
    }

    get atn() {
        return atn;
    }



	startRule() {
	    let localctx = new StartRuleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CalcParser.RULE_startRule);
	    try {
	        localctx = new BinaryAddIntContext(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 2;
	        this.match(CalcParser.INT);
	        this.state = 3;
	        this.match(CalcParser.PLUS);
	        this.state = 4;
	        this.match(CalcParser.INT);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CalcParser.EOF = antlr4.Token.EOF;
CalcParser.PLUS = 1;
CalcParser.TIMES = 2;
CalcParser.INT = 3;

CalcParser.RULE_startRule = 0;

class StartRuleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalcParser.RULE_startRule;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class BinaryAddIntContext extends StartRuleContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(CalcParser.INT);
	    } else {
	        return this.getToken(CalcParser.INT, i);
	    }
	};


	PLUS() {
	    return this.getToken(CalcParser.PLUS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalcListener ) {
	        listener.enterBinaryAddInt(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalcListener ) {
	        listener.exitBinaryAddInt(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalcVisitor ) {
	        return visitor.visitBinaryAddInt(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalcParser.BinaryAddIntContext = BinaryAddIntContext;


CalcParser.StartRuleContext = StartRuleContext; 
