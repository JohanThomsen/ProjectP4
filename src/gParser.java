// Generated from C:/Users/Christoffer/IdeaProjects/ProjectP4\g.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, Id=27, String=28, Number=29, WS=30;
	public static final int
		RULE_program = 0, RULE_declares = 1, RULE_declare = 2, RULE_ctrlstruc = 3, 
		RULE_ctrlstrucparam = 4, RULE_classdcl = 5, RULE_methoddcl = 6, RULE_bodies = 7, 
		RULE_body = 8, RULE_init = 9, RULE_assigns = 10, RULE_assign = 11, RULE_attributes = 12, 
		RULE_math = 13, RULE_methodcall = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declares", "declare", "ctrlstruc", "ctrlstrucparam", "classdcl", 
			"methoddcl", "bodies", "body", "init", "assigns", "assign", "attributes", 
			"math", "methodcall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'xd'", "'.'", "'if'", "'is equal to'", "'is less than'", "'is more than'", 
			"'There can exist a'", "':'", "'There can exist an'", "'can'", "'is'", 
			"'-'", "' + '", "'There is a'", "'n'", "'called'", "'upon action'", "','", 
			"'which'", "'has'", "'a'", "'an'", "'and'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Id", "String", "Number", "WS"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclaresContext declares() {
			return getRuleContext(DeclaresContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			declares();
			setState(31);
			match(T__0);
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

	public static class DeclaresContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public DeclaresContext declares() {
			return getRuleContext(DeclaresContext.class,0);
		}
		public DeclaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaresContext declares() throws RecognitionException {
		DeclaresContext _localctx = new DeclaresContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declares);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				declare();
				setState(34);
				match(T__1);
				setState(35);
				declares();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				declare();
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

	public static class DeclareContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public ClassdclContext classdcl() {
			return getRuleContext(ClassdclContext.class,0);
		}
		public MethoddclContext methoddcl() {
			return getRuleContext(MethoddclContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				init();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				assigns();
				}
				break;
			case T__6:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				classdcl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				methoddcl();
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

	public static class CtrlstrucContext extends ParserRuleContext {
		public List<CtrlstrucparamContext> ctrlstrucparam() {
			return getRuleContexts(CtrlstrucparamContext.class);
		}
		public CtrlstrucparamContext ctrlstrucparam(int i) {
			return getRuleContext(CtrlstrucparamContext.class,i);
		}
		public CtrlstrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstruc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCtrlstruc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCtrlstruc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCtrlstruc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstrucContext ctrlstruc() throws RecognitionException {
		CtrlstrucContext _localctx = new CtrlstrucContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ctrlstruc);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__2);
				setState(47);
				ctrlstrucparam();
				setState(48);
				match(T__3);
				setState(49);
				ctrlstrucparam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__2);
				setState(52);
				ctrlstrucparam();
				setState(53);
				match(T__4);
				setState(54);
				ctrlstrucparam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__2);
				setState(57);
				ctrlstrucparam();
				setState(58);
				match(T__5);
				setState(59);
				ctrlstrucparam();
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

	public static class CtrlstrucparamContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public CtrlstrucparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstrucparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCtrlstrucparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCtrlstrucparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCtrlstrucparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstrucparamContext ctrlstrucparam() throws RecognitionException {
		CtrlstrucparamContext _localctx = new CtrlstrucparamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ctrlstrucparam);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				math();
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

	public static class ClassdclContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public ClassdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterClassdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitClassdcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitClassdcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdclContext classdcl() throws RecognitionException {
		ClassdclContext _localctx = new ClassdclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classdcl);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__6);
				setState(69);
				match(Id);
				setState(70);
				match(T__7);
				setState(71);
				assigns();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__8);
				setState(73);
				match(Id);
				setState(74);
				match(T__7);
				setState(75);
				assigns();
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

	public static class MethoddclContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public BodiesContext bodies() {
			return getRuleContext(BodiesContext.class,0);
		}
		public MethoddclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMethoddcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMethoddcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMethoddcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddclContext methoddcl() throws RecognitionException {
		MethoddclContext _localctx = new MethoddclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methoddcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__9);
			setState(79);
			match(Id);
			setState(80);
			match(Id);
			setState(81);
			match(T__7);
			setState(82);
			bodies();
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

	public static class BodiesContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodiesContext bodies() {
			return getRuleContext(BodiesContext.class,0);
		}
		public BodiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBodies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBodies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBodies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodiesContext bodies() throws RecognitionException {
		BodiesContext _localctx = new BodiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bodies);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				body();
				setState(85);
				bodies();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public CtrlstrucContext ctrlstruc() {
			return getRuleContext(CtrlstrucContext.class,0);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(Id);
				setState(91);
				match(T__10);
				setState(92);
				match(Id);
				setState(93);
				match(T__11);
				setState(94);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(Id);
				setState(96);
				match(T__10);
				setState(97);
				match(Id);
				setState(98);
				match(T__12);
				setState(99);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				ctrlstruc();
				setState(101);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				methodcall();
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

	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__13);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(107);
					match(T__14);
					}
				}

				}
				setState(110);
				match(Id);
				setState(111);
				match(T__15);
				setState(112);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__13);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(114);
					match(T__14);
					}
				}

				}
				setState(117);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__16);
				setState(119);
				methodcall();
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

	public static class AssignsContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public AssignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignsContext assigns() throws RecognitionException {
		AssignsContext _localctx = new AssignsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assigns);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				assign();
				setState(123);
				match(T__17);
				setState(124);
				assigns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				assign();
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(Id);
				setState(130);
				match(T__18);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(131);
					match(T__19);
					}
				}

				}
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(134);
					match(T__20);
					}
				}

				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(137);
					match(T__21);
					}
				}

				}
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(140);
					match(T__10);
					}
				}

				}
				setState(143);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(Id);
				setState(145);
				match(T__18);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(146);
					match(T__19);
					}
				}

				}
				{
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(149);
					match(T__20);
					}
				}

				}
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(152);
					match(T__10);
					}
				}

				}
				setState(155);
				attributes();
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

	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(gParser.String, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributes);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(String);
				setState(160);
				match(T__22);
				setState(161);
				attributes();
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

	public static class MathContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(gParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(gParser.Number, i);
		}
		public List<TerminalNode> WS() { return getTokens(gParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(gParser.WS, i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_math);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(Number);
				setState(165);
				match(WS);
				setState(166);
				match(T__11);
				setState(167);
				match(WS);
				setState(168);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(Number);
				setState(170);
				match(WS);
				setState(171);
				match(T__23);
				setState(172);
				match(WS);
				setState(173);
				match(Number);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(Number);
				setState(175);
				match(WS);
				setState(176);
				match(T__24);
				setState(177);
				match(WS);
				setState(178);
				match(Number);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(Number);
				setState(180);
				match(WS);
				setState(181);
				match(T__25);
				setState(182);
				match(WS);
				setState(183);
				match(Number);
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

	public static class MethodcallContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Id);
			setState(187);
			match(Id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\5\6E\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nk\n\n\3\13\3\13\5\13o\n\13\3\13\3\13\3\13\3\13\3\13\5\13v\n\13"+
		"\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r\3"+
		"\r\5\r\u0087\n\r\3\r\5\r\u008a\n\r\3\r\5\r\u008d\n\r\3\r\5\r\u0090\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\5\r\u0099\n\r\3\r\5\r\u009c\n\r\3\r"+
		"\5\r\u009f\n\r\3\16\3\16\3\16\3\16\5\16\u00a5\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00bb\n\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\2\2\u00ce\2 \3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b?"+
		"\3\2\2\2\nD\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20Z\3\2\2\2\22j\3\2\2\2\24"+
		"z\3\2\2\2\26\u0081\3\2\2\2\30\u009e\3\2\2\2\32\u00a4\3\2\2\2\34\u00ba"+
		"\3\2\2\2\36\u00bc\3\2\2\2 !\5\4\3\2!\"\7\3\2\2\"\3\3\2\2\2#$\5\6\4\2$"+
		"%\7\4\2\2%&\5\4\3\2&)\3\2\2\2\')\5\6\4\2(#\3\2\2\2(\'\3\2\2\2)\5\3\2\2"+
		"\2*/\5\24\13\2+/\5\26\f\2,/\5\f\7\2-/\5\16\b\2.*\3\2\2\2.+\3\2\2\2.,\3"+
		"\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61\7\5\2\2\61\62\5\n\6\2\62\63\7\6\2\2"+
		"\63\64\5\n\6\2\64@\3\2\2\2\65\66\7\5\2\2\66\67\5\n\6\2\678\7\7\2\289\5"+
		"\n\6\29@\3\2\2\2:;\7\5\2\2;<\5\n\6\2<=\7\b\2\2=>\5\n\6\2>@\3\2\2\2?\60"+
		"\3\2\2\2?\65\3\2\2\2?:\3\2\2\2@\t\3\2\2\2AE\7\37\2\2BE\7\35\2\2CE\5\34"+
		"\17\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\t\2\2GH\7\35\2\2H"+
		"I\7\n\2\2IO\5\26\f\2JK\7\13\2\2KL\7\35\2\2LM\7\n\2\2MO\5\26\f\2NF\3\2"+
		"\2\2NJ\3\2\2\2O\r\3\2\2\2PQ\7\f\2\2QR\7\35\2\2RS\7\35\2\2ST\7\n\2\2TU"+
		"\5\20\t\2U\17\3\2\2\2VW\5\22\n\2WX\5\20\t\2X[\3\2\2\2Y[\3\2\2\2ZV\3\2"+
		"\2\2ZY\3\2\2\2[\21\3\2\2\2\\]\7\35\2\2]^\7\r\2\2^_\7\35\2\2_`\7\16\2\2"+
		"`k\7\35\2\2ab\7\35\2\2bc\7\r\2\2cd\7\35\2\2de\7\17\2\2ek\7\35\2\2fg\5"+
		"\b\5\2gh\7\n\2\2hk\3\2\2\2ik\5\36\20\2j\\\3\2\2\2ja\3\2\2\2jf\3\2\2\2"+
		"ji\3\2\2\2k\23\3\2\2\2ln\7\20\2\2mo\7\21\2\2nm\3\2\2\2no\3\2\2\2op\3\2"+
		"\2\2pq\7\35\2\2qr\7\22\2\2r{\7\35\2\2su\7\20\2\2tv\7\21\2\2ut\3\2\2\2"+
		"uv\3\2\2\2vw\3\2\2\2w{\7\35\2\2xy\7\23\2\2y{\5\36\20\2zl\3\2\2\2zs\3\2"+
		"\2\2zx\3\2\2\2{\25\3\2\2\2|}\5\30\r\2}~\7\24\2\2~\177\5\26\f\2\177\u0082"+
		"\3\2\2\2\u0080\u0082\5\30\r\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\27\3\2\2\2\u0083\u0084\7\35\2\2\u0084\u0086\7\25\2\2\u0085\u0087\7\26"+
		"\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u008a\7\27\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3"+
		"\2\2\2\u008b\u008d\7\30\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0090\7\r\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u009f\7\35\2\2\u0092\u0093\7\35\2\2\u0093"+
		"\u0095\7\25\2\2\u0094\u0096\7\26\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\27\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\7\r\2\2\u009b\u009a\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\5\32\16\2\u009e"+
		"\u0083\3\2\2\2\u009e\u0092\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a5\7\36\2"+
		"\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a5\5\32\16\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\37\2"+
		"\2\u00a7\u00a8\7 \2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\7 \2\2\u00aa\u00bb"+
		"\7\37\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\7 \2\2\u00ad\u00ae\7\32\2\2"+
		"\u00ae\u00af\7 \2\2\u00af\u00bb\7\37\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2"+
		"\7 \2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7 \2\2\u00b4\u00bb\7\37\2\2\u00b5"+
		"\u00b6\7\37\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\7"+
		" \2\2\u00b9\u00bb\7\37\2\2\u00ba\u00a6\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba"+
		"\u00b0\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\35\2"+
		"\2\u00bd\u00be\7\35\2\2\u00be\37\3\2\2\2\27(.?DNZjnuz\u0081\u0086\u0089"+
		"\u008c\u008f\u0095\u0098\u009b\u009e\u00a4\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}