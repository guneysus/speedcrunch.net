// Generated from d:\repos\speedcrunch.net\grammar\Calc.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, TIMES=2, INT=3;
	public static final int
		RULE_startRule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"startRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "TIMES", "INT"
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

	public static class StartRuleContext extends ParserRuleContext {
		public StartRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startRule; }
	 
		public StartRuleContext() { }
		public void copyFrom(StartRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryMultiplyIntContext extends StartRuleContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode TIMES() { return getToken(CalcParser.TIMES, 0); }
		public BinaryMultiplyIntContext(StartRuleContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryAddIntContext extends StartRuleContext {
		public List<TerminalNode> INT() { return getTokens(CalcParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalcParser.INT, i);
		}
		public TerminalNode PLUS() { return getToken(CalcParser.PLUS, 0); }
		public BinaryAddIntContext(StartRuleContext ctx) { copyFrom(ctx); }
	}

	public final StartRuleContext startRule() throws RecognitionException {
		StartRuleContext _localctx = new StartRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startRule);
		try {
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new BinaryAddIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(INT);
				setState(3);
				match(PLUS);
				setState(4);
				match(INT);
				}
				break;
			case 2:
				_localctx = new BinaryMultiplyIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(INT);
				setState(6);
				match(TIMES);
				setState(7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\r\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\13\n\2\3\2\2\2\3\2\2\2\2\f\2\n\3\2\2\2\4\5\7\5"+
		"\2\2\5\6\7\3\2\2\6\13\7\5\2\2\7\b\7\5\2\2\b\t\7\4\2\2\t\13\7\5\2\2\n\4"+
		"\3\2\2\2\n\7\3\2\2\2\13\3\3\2\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}