// Generated from grammar/Calc.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIVISION=4, MODULUS=5, INT=6, WS=7;
	public static final int
		RULE_startrule = 0, RULE_binaryexpression = 1, RULE_signedatom = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"startrule", "binaryexpression", "signedatom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "DIVISION", "MODULUS", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartruleContext extends ParserRuleContext {
		public BinaryexpressionContext binaryexpression() {
			return getRuleContext(BinaryexpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalcParser.EOF, 0); }
		public StartruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStartrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStartrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitStartrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartruleContext startrule() throws RecognitionException {
		StartruleContext _localctx = new StartruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			binaryexpression();
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(7);
				match(EOF);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryexpressionContext extends ParserRuleContext {
		public BinaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryexpression; }
	 
		public BinaryexpressionContext() { }
		public void copyFrom(BinaryexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryMultiplyIntContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode TIMES() { return getToken(CalcParser.TIMES, 0); }
		public BinaryMultiplyIntContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinaryMultiplyInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinaryMultiplyInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryMultiplyInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryAddIntContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode PLUS() { return getToken(CalcParser.PLUS, 0); }
		public BinaryAddIntContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinaryAddInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinaryAddInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryAddInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryAddSimpleContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public BinaryAddSimpleContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinaryAddSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinaryAddSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryAddSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryModulusIntContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode MODULUS() { return getToken(CalcParser.MODULUS, 0); }
		public BinaryModulusIntContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinaryModulusInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinaryModulusInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryModulusInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinarySubstractIntContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public BinarySubstractIntContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinarySubstractInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinarySubstractInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinarySubstractInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryDivisionIntContext extends BinaryexpressionContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode DIVISION() { return getToken(CalcParser.DIVISION, 0); }
		public BinaryDivisionIntContext(BinaryexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterBinaryDivisionInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitBinaryDivisionInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitBinaryDivisionInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryexpressionContext binaryexpression() throws RecognitionException {
		BinaryexpressionContext _localctx = new BinaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binaryexpression);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BinaryAddIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(INT);
				setState(11);
				match(PLUS);
				setState(12);
				match(INT);
				}
				break;
			case 2:
				_localctx = new BinaryAddSimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(INT);
				setState(14);
				match(INT);
				}
				break;
			case 3:
				_localctx = new BinaryMultiplyIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(INT);
				setState(16);
				match(TIMES);
				setState(17);
				match(INT);
				}
				break;
			case 4:
				_localctx = new BinarySubstractIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				match(INT);
				setState(19);
				match(MINUS);
				setState(20);
				match(INT);
				}
				break;
			case 5:
				_localctx = new BinaryDivisionIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(21);
				match(INT);
				setState(22);
				match(DIVISION);
				setState(23);
				match(INT);
				}
				break;
			case 6:
				_localctx = new BinaryModulusIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(INT);
				setState(25);
				match(MODULUS);
				setState(26);
				match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedatomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CalcParser.PLUS, 0); }
		public SignedatomContext signedatom() {
			return getRuleContext(SignedatomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public SignedatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterSignedatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitSignedatom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcVisitor ) return ((CalcVisitor<? extends T>)visitor).visitSignedatom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedatomContext signedatom() throws RecognitionException {
		SignedatomContext _localctx = new SignedatomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signedatom);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(PLUS);
				setState(30);
				signedatom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(MINUS);
				setState(32);
				signedatom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\5\2\13\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\5\4$\n\4\3\4\2"+
		"\2\5\2\4\6\2\2\2)\2\b\3\2\2\2\4\35\3\2\2\2\6#\3\2\2\2\b\n\5\4\3\2\t\13"+
		"\7\2\2\3\n\t\3\2\2\2\n\13\3\2\2\2\13\3\3\2\2\2\f\r\7\b\2\2\r\16\7\3\2"+
		"\2\16\36\7\b\2\2\17\20\7\b\2\2\20\36\7\b\2\2\21\22\7\b\2\2\22\23\7\5\2"+
		"\2\23\36\7\b\2\2\24\25\7\b\2\2\25\26\7\4\2\2\26\36\7\b\2\2\27\30\7\b\2"+
		"\2\30\31\7\6\2\2\31\36\7\b\2\2\32\33\7\b\2\2\33\34\7\7\2\2\34\36\7\b\2"+
		"\2\35\f\3\2\2\2\35\17\3\2\2\2\35\21\3\2\2\2\35\24\3\2\2\2\35\27\3\2\2"+
		"\2\35\32\3\2\2\2\36\5\3\2\2\2\37 \7\3\2\2 $\5\6\4\2!\"\7\4\2\2\"$\5\6"+
		"\4\2#\37\3\2\2\2#!\3\2\2\2$\7\3\2\2\2\5\n\35#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}