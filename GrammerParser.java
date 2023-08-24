// Generated from java-escape by ANTLR 4.11.1
package com.example.demo.grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, COMMENT=40, WS=41, ID=42, DIGIT=43, CHAR=44, Operator=45;
	public static final int
		RULE_prog = 0, RULE_dec1 = 1, RULE_def = 2, RULE_block = 3, RULE_classheader = 4, 
		RULE_stat = 5, RULE_expr = 6, RULE_symbols = 7, RULE_number = 8, RULE_identifire = 9, 
		RULE_keyword = 10, RULE_character = 11, RULE_term = 12, RULE_type = 13, 
		RULE_funcheader = 14, RULE_args = 15, RULE_arg = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec1", "def", "block", "classheader", "stat", "expr", "symbols", 
			"number", "identifire", "keyword", "character", "term", "type", "funcheader", 
			"args", "arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'{'", "'}'", "'('", "')'", "'while'", "'return'", 
			"','", "'*'", "'+'", "'/'", "'-'", "'if'", "'else'", "'for'", "'else if'", 
			"' while'", "' do'", "'public'", "'class'", "' privet'", "' protect'", 
			"'package'", "'new'", "'int'", "'double'", "'float'", "'static'", "'char'", 
			"'boolean'", "'void'", "'this'", "'try'", "'catch'", "'true'", "'print'", 
			"'println'", "'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "WS", "ID", "DIGIT", "CHAR", "Operator"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Dec1Context dec1() {
			return getRuleContext(Dec1Context.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				dec1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278376L) != 0) {
					{
					{
					setState(35);
					def();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec1Context extends ParserRuleContext {
		public FuncheaderContext funcheader() {
			return getRuleContext(FuncheaderContext.class,0);
		}
		public ClassheaderContext classheader() {
			return getRuleContext(ClassheaderContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Dec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterDec1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitDec1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitDec1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec1Context dec1() throws RecognitionException {
		Dec1Context _localctx = new Dec1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec1);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				funcheader();
				setState(44);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				classheader();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				type();
				setState(49);
				expr(0);
				setState(50);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__1);
				setState(54);
				expr(0);
				setState(55);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				stat();
				setState(58);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public FuncheaderContext funcheader() {
			return getRuleContext(FuncheaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				funcheader();
				setState(63);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				type();
				setState(66);
				expr(0);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(67);
					match(T__1);
					setState(68);
					expr(0);
					}
				}

				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(71);
					match(T__0);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				funcheader();
				setState(78);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				type();
				setState(81);
				match(ID);
				setState(82);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				type();
				setState(85);
				expr(0);
				setState(86);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__2);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278376L) != 0) {
					{
					{
					setState(92);
					stat();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__2);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278376L) != 0) {
					{
					{
					setState(100);
					stat();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__0);
				setState(107);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__2);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278240L) != 0) {
					{
					{
					setState(109);
					expr(0);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassheaderContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ClassheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterClassheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitClassheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitClassheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheaderContext classheader() throws RecognitionException {
		ClassheaderContext _localctx = new ClassheaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 549755797760L) != 0) {
				{
				{
				setState(118);
				keyword();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__4);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278240L) != 0) {
				{
				setState(125);
				args();
				}
			}

			setState(128);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__6);
				setState(132);
				match(T__4);
				setState(133);
				expr(0);
				setState(134);
				match(T__5);
				setState(135);
				stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__7);
				setState(138);
				expr(0);
				setState(139);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifireContext identifire() {
			return getRuleContext(IdentifireContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public ClassheaderContext classheader() {
			return getRuleContext(ClassheaderContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(145);
				number();
				}
				break;
			case 2:
				{
				setState(146);
				identifire();
				}
				break;
			case 3:
				{
				setState(147);
				character();
				}
				break;
			case 4:
				{
				setState(148);
				keyword();
				}
				break;
			case 5:
				{
				setState(149);
				match(ID);
				setState(150);
				match(T__4);
				setState(151);
				expr(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(152);
					match(T__8);
					setState(153);
					expr(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(161);
				type();
				}
				break;
			case 7:
				{
				setState(162);
				symbols();
				}
				break;
			case 8:
				{
				setState(163);
				identifire();
				setState(164);
				symbols();
				}
				break;
			case 9:
				{
				setState(166);
				type();
				setState(167);
				match(ID);
				setState(168);
				match(T__0);
				}
				break;
			case 10:
				{
				setState(170);
				type();
				setState(171);
				expr(0);
				setState(172);
				match(T__0);
				}
				break;
			case 11:
				{
				setState(174);
				classheader();
				}
				break;
			case 12:
				{
				setState(175);
				keyword();
				setState(176);
				match(T__4);
				setState(177);
				type();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278240L) != 0) {
					{
					{
					setState(178);
					expr(0);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__5);
				setState(185);
				stat();
				}
				break;
			case 13:
				{
				setState(187);
				match(T__4);
				setState(188);
				expr(0);
				setState(189);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(T__10);
						setState(195);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197);
						match(T__1);
						setState(198);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						match(T__12);
						setState(201);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(203);
						symbols();
						setState(204);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(207);
						match(T__4);
						setState(208);
						expr(0);
						setState(209);
						match(T__5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						match(T__9);
						setState(213);
						expr(0);
						setState(214);
						match(T__0);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						match(T__11);
						setState(218);
						expr(0);
						setState(219);
						match(T__0);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(222);
						match(T__1);
						setState(223);
						expr(0);
						setState(224);
						match(T__0);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						symbols();
						setState(228);
						expr(0);
						setState(229);
						match(T__0);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(GrammerParser.Operator, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Operator);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GrammerParser.DIGIT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifireContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public IdentifireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterIdentifire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitIdentifire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitIdentifire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifireContext identifire() throws RecognitionException {
		IdentifireContext _localctx = new IdentifireContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 549755797760L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(GrammerParser.CHAR, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CHAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public TerminalNode DIGIT() { return getToken(GrammerParser.DIGIT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DIGIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 557741768704L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncheaderContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammerParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterFuncheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitFuncheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitFuncheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncheaderContext funcheader() throws RecognitionException {
		FuncheaderContext _localctx = new FuncheaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			type();
			setState(251);
			match(ID);
			setState(252);
			match(T__4);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 67070209278240L) != 0) {
				{
				setState(253);
				args();
				}
			}

			setState(256);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			arg();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(259);
				match(T__8);
				setState(260);
				arg();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammerListener ) ((GrammerListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammerVisitor ) return ((GrammerVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				type();
				setState(267);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0003\u0000*\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002F\b\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003f\b\u0003\n\u0003\f\u0003i\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003o\b\u0003\n\u0003\f\u0003r\t\u0003"+
		"\u0001\u0003\u0003\u0003u\b\u0003\u0001\u0004\u0005\u0004x\b\u0004\n\u0004"+
		"\f\u0004{\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008f\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009b\b\u0006\n\u0006\f\u0006\u009e\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b4\b\u0006\n\u0006\f\u0006\u00b7"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c0\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00e8\b\u0006\n\u0006\f\u0006\u00eb\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ff\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0106\b\u000f\n\u000f\f\u000f\u0109\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u010f\b\u0010"+
		"\u0001\u0010\u0000\u0001\f\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0003\u0002\u0000\b"+
		"\b\u000e&\u0001\u0000*+\u0003\u0000\u001a\u001c\u001e \'\'\u0131\u0000"+
		")\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004Y\u0001"+
		"\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000"+
		"\u0000\n\u008e\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000\u0000\u0000"+
		"\u000e\u00ec\u0001\u0000\u0000\u0000\u0010\u00ee\u0001\u0000\u0000\u0000"+
		"\u0012\u00f0\u0001\u0000\u0000\u0000\u0014\u00f2\u0001\u0000\u0000\u0000"+
		"\u0016\u00f4\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000"+
		"\u001a\u00f8\u0001\u0000\u0000\u0000\u001c\u00fa\u0001\u0000\u0000\u0000"+
		"\u001e\u0102\u0001\u0000\u0000\u0000 \u010e\u0001\u0000\u0000\u0000\""+
		"*\u0003\u0002\u0001\u0000#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000"+
		"\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)\"\u0001"+
		"\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000*\u0001\u0001\u0000\u0000"+
		"\u0000+,\u0003\u001c\u000e\u0000,-\u0005\u0001\u0000\u0000-=\u0001\u0000"+
		"\u0000\u0000.=\u0001\u0000\u0000\u0000/=\u0003\b\u0004\u000001\u0003\u001a"+
		"\r\u000012\u0003\f\u0006\u000023\u0005\u0001\u0000\u00003=\u0001\u0000"+
		"\u0000\u000045\u0005*\u0000\u000056\u0005\u0002\u0000\u000067\u0003\f"+
		"\u0006\u000078\u0005\u0001\u0000\u00008=\u0001\u0000\u0000\u00009:\u0003"+
		"\n\u0005\u0000:;\u0005\u0001\u0000\u0000;=\u0001\u0000\u0000\u0000<+\u0001"+
		"\u0000\u0000\u0000<.\u0001\u0000\u0000\u0000</\u0001\u0000\u0000\u0000"+
		"<0\u0001\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000"+
		"\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0003\u001c\u000e\u0000?@\u0003"+
		"\u0006\u0003\u0000@Z\u0001\u0000\u0000\u0000AB\u0003\u001a\r\u0000BE\u0003"+
		"\f\u0006\u0000CD\u0005\u0002\u0000\u0000DF\u0003\f\u0006\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0001\u0000\u0000\u0000"+
		"GI\u0005\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KZ\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0003\u001c\u000e\u0000NO\u0005"+
		"\u0001\u0000\u0000OZ\u0001\u0000\u0000\u0000PQ\u0003\u001a\r\u0000QR\u0005"+
		"*\u0000\u0000RS\u0005\u0001\u0000\u0000SZ\u0001\u0000\u0000\u0000TU\u0003"+
		"\u001a\r\u0000UV\u0003\f\u0006\u0000VW\u0005\u0001\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XZ\u0003\n\u0005\u0000Y>\u0001\u0000\u0000\u0000YA\u0001"+
		"\u0000\u0000\u0000YM\u0001\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000"+
		"YT\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000"+
		"\u0000\u0000[_\u0005\u0003\u0000\u0000\\^\u0003\n\u0005\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bu\u0005\u0004\u0000\u0000cg\u0005\u0003\u0000\u0000df\u0003\n\u0005"+
		"\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0001\u0000\u0000ku\u0005\u0004\u0000\u0000"+
		"lp\u0005\u0003\u0000\u0000mo\u0003\f\u0006\u0000nm\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0005\u0004"+
		"\u0000\u0000t[\u0001\u0000\u0000\u0000tc\u0001\u0000\u0000\u0000tl\u0001"+
		"\u0000\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vx\u0003\u0014\n\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|~\u0005\u0005\u0000\u0000}\u007f\u0003\u001e\u000f\u0000"+
		"~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081\t\u0001"+
		"\u0000\u0000\u0000\u0082\u008f\u0003\f\u0006\u0000\u0083\u0084\u0005\u0007"+
		"\u0000\u0000\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0003\f\u0006"+
		"\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0088\u0003\n\u0005\u0000"+
		"\u0088\u008f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a"+
		"\u008b\u0003\f\u0006\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0006\u0003\u0000\u008e\u0082"+
		"\u0001\u0000\u0000\u0000\u008e\u0083\u0001\u0000\u0000\u0000\u008e\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u000b"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0006\uffff\uffff\u0000\u0091"+
		"\u00c0\u0003\u0010\b\u0000\u0092\u00c0\u0003\u0012\t\u0000\u0093\u00c0"+
		"\u0003\u0016\u000b\u0000\u0094\u00c0\u0003\u0014\n\u0000\u0095\u0096\u0005"+
		"*\u0000\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u009c\u0003\f"+
		"\u0006\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009b\u0003\f\u0006"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u0006\u0000\u0000\u00a0\u00c0\u0001\u0000\u0000"+
		"\u0000\u00a1\u00c0\u0003\u001a\r\u0000\u00a2\u00c0\u0003\u000e\u0007\u0000"+
		"\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0003\u000e\u0007\u0000\u00a5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u001a\r\u0000\u00a7\u00a8"+
		"\u0005*\u0000\u0000\u00a8\u00a9\u0005\u0001\u0000\u0000\u00a9\u00c0\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0003\f"+
		"\u0006\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00c0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00c0\u0003\b\u0004\u0000\u00af\u00b0\u0003\u0014\n"+
		"\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b5\u0003\u001a\r\u0000"+
		"\u00b2\u00b4\u0003\f\u0006\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9"+
		"\u00ba\u0003\n\u0005\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0005\u0000\u0000\u00bc\u00bd\u0003\f\u0006\u0000\u00bd\u00be\u0005"+
		"\u0006\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u0090\u0001"+
		"\u0000\u0000\u0000\u00bf\u0092\u0001\u0000\u0000\u0000\u00bf\u0093\u0001"+
		"\u0000\u0000\u0000\u00bf\u0094\u0001\u0000\u0000\u0000\u00bf\u0095\u0001"+
		"\u0000\u0000\u0000\u00bf\u00a1\u0001\u0000\u0000\u0000\u00bf\u00a2\u0001"+
		"\u0000\u0000\u0000\u00bf\u00a3\u0001\u0000\u0000\u0000\u00bf\u00a6\u0001"+
		"\u0000\u0000\u0000\u00bf\u00aa\u0001\u0000\u0000\u0000\u00bf\u00ae\u0001"+
		"\u0000\u0000\u0000\u00bf\u00af\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c0\u00e9\u0001\u0000\u0000\u0000\u00c1\u00c2\n\b"+
		"\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000\u0000\u00c3\u00e8\u0003\f\u0006"+
		"\t\u00c4\u00c5\n\u0005\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000"+
		"\u00c6\u00e8\u0003\f\u0006\u0006\u00c7\u00c8\n\u0004\u0000\u0000\u00c8"+
		"\u00c9\u0005\r\u0000\u0000\u00c9\u00e8\u0003\f\u0006\u0005\u00ca\u00cb"+
		"\n\u0002\u0000\u0000\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u00cd\u0003"+
		"\f\u0006\u0003\u00cd\u00e8\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0012"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0005\u0000\u0000\u00d0\u00d1\u0003\f\u0006"+
		"\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2\u00e8\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\n\t\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000\u00d5"+
		"\u00d6\u0003\f\u0006\u0000\u00d6\u00d7\u0005\u0001\u0000\u0000\u00d7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\n\u0007\u0000\u0000\u00d9\u00da\u0005"+
		"\f\u0000\u0000\u00da\u00db\u0003\f\u0006\u0000\u00db\u00dc\u0005\u0001"+
		"\u0000\u0000\u00dc\u00e8\u0001\u0000\u0000\u0000\u00dd\u00de\n\u0006\u0000"+
		"\u0000\u00de\u00df\u0005\u0002\u0000\u0000\u00df\u00e0\u0003\f\u0006\u0000"+
		"\u00e0\u00e1\u0005\u0001\u0000\u0000\u00e1\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\n\u0003\u0000\u0000\u00e3\u00e4\u0003\u000e\u0007\u0000\u00e4"+
		"\u00e5\u0003\f\u0006\u0000\u00e5\u00e6\u0005\u0001\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00c1\u0001\u0000\u0000\u0000\u00e7\u00c4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00c7\u0001\u0000\u0000\u0000\u00e7\u00ca"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ce\u0001\u0000\u0000\u0000\u00e7\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e7\u00d8\u0001\u0000\u0000\u0000\u00e7\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\r\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005-\u0000\u0000\u00ed\u000f\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005+\u0000\u0000\u00ef\u0011\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005*\u0000\u0000\u00f1\u0013\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3\u0015\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005,\u0000\u0000\u00f5\u0017\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0007\u0001\u0000\u0000\u00f7\u0019\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0007\u0002\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0003\u001a\r\u0000\u00fb\u00fc\u0005*\u0000\u0000\u00fc\u00fe"+
		"\u0005\u0005\u0000\u0000\u00fd\u00ff\u0003\u001e\u000f\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0006\u0000\u0000\u0101\u001d"+
		"\u0001\u0000\u0000\u0000\u0102\u0107\u0003 \u0010\u0000\u0103\u0104\u0005"+
		"\t\u0000\u0000\u0104\u0106\u0003 \u0010\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u001f\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u001a"+
		"\r\u0000\u010b\u010c\u0003\f\u0006\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0003\f\u0006\u0000\u010e\u010a\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f!\u0001\u0000\u0000\u0000\u0015"+
		"&)<EJY_gpty~\u008e\u009c\u00b5\u00bf\u00e7\u00e9\u00fe\u0107\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}