// Generated from Calc.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var CalcListener = require('./CalcListener').CalcListener;
var CalcVisitor = require('./CalcVisitor').CalcVisitor;

var grammarFileName = "Calc.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u0006\u0015\u0004\u0002\t\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0002\u0005\u0002\b\n\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0010\n\u0002\f\u0002\u000e",
    "\u0002\u0013\u000b\u0002\u0003\u0002\u0002\u0003\u0002\u0003\u0002\u0002",
    "\u0002\u0002\u0016\u0002\u0007\u0003\u0002\u0002\u0002\u0004\u0005\b",
    "\u0002\u0001\u0002\u0005\b\u0007\u0005\u0002\u0002\u0006\b\u0007\u0006",
    "\u0002\u0002\u0007\u0004\u0003\u0002\u0002\u0002\u0007\u0006\u0003\u0002",
    "\u0002\u0002\b\u0011\u0003\u0002\u0002\u0002\t\n\f\u0006\u0002\u0002",
    "\n\u000b\u0007\u0003\u0002\u0002\u000b\u0010\u0005\u0002\u0002\u0007",
    "\f\r\f\u0005\u0002\u0002\r\u000e\u0007\u0004\u0002\u0002\u000e\u0010",
    "\u0005\u0002\u0002\u0006\u000f\t\u0003\u0002\u0002\u0002\u000f\f\u0003",
    "\u0002\u0002\u0002\u0010\u0013\u0003\u0002\u0002\u0002\u0011\u000f\u0003",
    "\u0002\u0002\u0002\u0011\u0012\u0003\u0002\u0002\u0002\u0012\u0003\u0003",
    "\u0002\u0002\u0002\u0013\u0011\u0003\u0002\u0002\u0002\u0005\u0007\u000f",
    "\u0011"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'*'", "'+'" ];

var symbolicNames = [ null, null, null, "INT", "HEX" ];

var ruleNames =  [ "e" ];

function CalcParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

CalcParser.prototype = Object.create(antlr4.Parser.prototype);
CalcParser.prototype.constructor = CalcParser;

Object.defineProperty(CalcParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

CalcParser.EOF = antlr4.Token.EOF;
CalcParser.T__0 = 1;
CalcParser.T__1 = 2;
CalcParser.INT = 3;
CalcParser.HEX = 4;

CalcParser.RULE_e = 0;


function EContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CalcParser.RULE_e;
    return this;
}

EContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EContext.prototype.constructor = EContext;


 
EContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};

function AddContext(parser, ctx) {
	EContext.call(this, parser);
    EContext.prototype.copyFrom.call(this, ctx);
    return this;
}

AddContext.prototype = Object.create(EContext.prototype);
AddContext.prototype.constructor = AddContext;

CalcParser.AddContext = AddContext;

AddContext.prototype.e = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(EContext);
    } else {
        return this.getTypedRuleContext(EContext,i);
    }
};
AddContext.prototype.enterRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.enterAdd(this);
	}
};

AddContext.prototype.exitRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.exitAdd(this);
	}
};

AddContext.prototype.accept = function(visitor) {
    if ( visitor instanceof CalcVisitor ) {
        return visitor.visitAdd(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function MultContext(parser, ctx) {
	EContext.call(this, parser);
    EContext.prototype.copyFrom.call(this, ctx);
    return this;
}

MultContext.prototype = Object.create(EContext.prototype);
MultContext.prototype.constructor = MultContext;

CalcParser.MultContext = MultContext;

MultContext.prototype.e = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(EContext);
    } else {
        return this.getTypedRuleContext(EContext,i);
    }
};
MultContext.prototype.enterRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.enterMult(this);
	}
};

MultContext.prototype.exitRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.exitMult(this);
	}
};

MultContext.prototype.accept = function(visitor) {
    if ( visitor instanceof CalcVisitor ) {
        return visitor.visitMult(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function HexContext(parser, ctx) {
	EContext.call(this, parser);
    EContext.prototype.copyFrom.call(this, ctx);
    return this;
}

HexContext.prototype = Object.create(EContext.prototype);
HexContext.prototype.constructor = HexContext;

CalcParser.HexContext = HexContext;

HexContext.prototype.HEX = function() {
    return this.getToken(CalcParser.HEX, 0);
};
HexContext.prototype.enterRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.enterHex(this);
	}
};

HexContext.prototype.exitRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.exitHex(this);
	}
};

HexContext.prototype.accept = function(visitor) {
    if ( visitor instanceof CalcVisitor ) {
        return visitor.visitHex(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function IntContext(parser, ctx) {
	EContext.call(this, parser);
    EContext.prototype.copyFrom.call(this, ctx);
    return this;
}

IntContext.prototype = Object.create(EContext.prototype);
IntContext.prototype.constructor = IntContext;

CalcParser.IntContext = IntContext;

IntContext.prototype.INT = function() {
    return this.getToken(CalcParser.INT, 0);
};
IntContext.prototype.enterRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.enterInt(this);
	}
};

IntContext.prototype.exitRule = function(listener) {
    if(listener instanceof CalcListener ) {
        listener.exitInt(this);
	}
};

IntContext.prototype.accept = function(visitor) {
    if ( visitor instanceof CalcVisitor ) {
        return visitor.visitInt(this);
    } else {
        return visitor.visitChildren(this);
    }
};



CalcParser.prototype.e = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new EContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 0;
    this.enterRecursionRule(localctx, 0, CalcParser.RULE_e, _p);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 5;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case CalcParser.INT:
            localctx = new IntContext(this, localctx);
            this._ctx = localctx;
            _prevctx = localctx;

            this.state = 3;
            this.match(CalcParser.INT);
            break;
        case CalcParser.HEX:
            localctx = new HexContext(this, localctx);
            this._ctx = localctx;
            _prevctx = localctx;
            this.state = 4;
            this.match(CalcParser.HEX);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this._ctx.stop = this._input.LT(-1);
        this.state = 15;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,2,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 13;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new MultContext(this, new EContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, CalcParser.RULE_e);
                    this.state = 7;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 8;
                    this.match(CalcParser.T__0);
                    this.state = 9;
                    this.e(5);
                    break;

                case 2:
                    localctx = new AddContext(this, new EContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, CalcParser.RULE_e);
                    this.state = 10;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 11;
                    this.match(CalcParser.T__1);
                    this.state = 12;
                    this.e(4);
                    break;

                } 
            }
            this.state = 17;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,2,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


CalcParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 0:
			return this.e_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

CalcParser.prototype.e_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 4);
		case 1:
			return this.precpred(this._ctx, 3);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.CalcParser = CalcParser;
