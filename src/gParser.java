// Generated from C:/Users/Christoffer/IdeaProjects/hello\g.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Id=24, String=25, 
		Number=26, WS=27;
	public static final int
		RULE_program = 0, RULE_declares = 1, RULE_declare = 2, RULE_ctrlstruc = 3, 
		RULE_ctrlstrucparam = 4, RULE_classdcls = 5, RULE_classdcl = 6, RULE_methoddcl = 7, 
		RULE_bodies = 8, RULE_body = 9, RULE_inits = 10, RULE_init = 11, RULE_assigns = 12, 
		RULE_assign = 13, RULE_math = 14, RULE_methodcall = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declares", "declare", "ctrlstruc", "ctrlstrucparam", "classdcls", 
			"classdcl", "methoddcl", "bodies", "body", "inits", "init", "assigns", 
			"assign", "math", "methodcall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'xd'", "'if'", "'is equal to'", "'is less than'", "'is more than'", 
			"'There can exist a'", "':'", "'There can exist an'", "'can'", "'is'", 
			"'-'", "' + '", "'There is a'", "'n'", "'called'", "'upon action'", "'.'", 
			"'which'", "'has'", "'a'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Id", "String", "Number", "WS"
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
			setState(32);
			declares();
			setState(33);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declare();
				setState(36);
				declares();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
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
		public InitsContext inits() {
			return getRuleContext(InitsContext.class,0);
		}
		public AssignsContext assigns() {
			return getRuleContext(AssignsContext.class,0);
		}
		public ClassdclsContext classdcls() {
			return getRuleContext(ClassdclsContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				inits();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				assigns();
				}
				break;
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				classdcls();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__1);
				setState(48);
				ctrlstrucparam();
				setState(49);
				match(T__2);
				setState(50);
				ctrlstrucparam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__1);
				setState(53);
				ctrlstrucparam();
				setState(54);
				match(T__3);
				setState(55);
				ctrlstrucparam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__1);
				setState(58);
				ctrlstrucparam();
				setState(59);
				match(T__4);
				setState(60);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
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

	public static class ClassdclsContext extends ParserRuleContext {
		public ClassdclContext classdcl() {
			return getRuleContext(ClassdclContext.class,0);
		}
		public ClassdclsContext classdcls() {
			return getRuleContext(ClassdclsContext.class,0);
		}
		public ClassdclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdcls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterClassdcls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitClassdcls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitClassdcls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdclsContext classdcls() throws RecognitionException {
		ClassdclsContext _localctx = new ClassdclsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classdcls);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				classdcl();
				setState(70);
				classdcls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				classdcl();
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
		public DeclaresContext declares() {
			return getRuleContext(DeclaresContext.class,0);
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
		enterRule(_localctx, 12, RULE_classdcl);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__5);
				setState(76);
				match(Id);
				setState(77);
				match(T__6);
				setState(78);
				declares();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__7);
				setState(80);
				match(Id);
				setState(81);
				match(T__6);
				setState(82);
				declares();
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
		enterRule(_localctx, 14, RULE_methoddcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
			setState(86);
			match(Id);
			setState(87);
			match(Id);
			setState(88);
			match(T__6);
			setState(89);
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
		enterRule(_localctx, 16, RULE_bodies);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				body();
				setState(92);
				bodies();
				}
				break;
			case T__0:
			case T__5:
			case T__7:
			case T__8:
			case T__12:
			case T__15:
			case T__17:
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
		enterRule(_localctx, 18, RULE_body);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(Id);
				setState(98);
				match(T__9);
				setState(99);
				match(Id);
				setState(100);
				match(T__10);
				setState(101);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(Id);
				setState(103);
				match(T__9);
				setState(104);
				match(Id);
				setState(105);
				match(T__11);
				setState(106);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				ctrlstruc();
				setState(108);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
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

	public static class InitsContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public InitsContext inits() {
			return getRuleContext(InitsContext.class,0);
		}
		public InitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterInits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitInits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitInits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitsContext inits() throws RecognitionException {
		InitsContext _localctx = new InitsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inits);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				init();
				setState(114);
				inits();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				init();
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
		enterRule(_localctx, 22, RULE_init);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__12);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(120);
					match(T__13);
					}
				}

				}
				setState(123);
				match(Id);
				setState(124);
				match(T__14);
				setState(125);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__12);
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(127);
					match(T__13);
					}
				}

				}
				setState(130);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__15);
				setState(132);
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
		enterRule(_localctx, 24, RULE_assigns);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				assign();
				setState(136);
				match(T__16);
				setState(137);
				assigns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public TerminalNode String() { return getToken(gParser.String, 0); }
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
		enterRule(_localctx, 26, RULE_assign);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__17);
				{
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(143);
					match(T__18);
					}
				}

				}
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
				if (_la==T__9) {
					{
					setState(149);
					match(T__9);
					}
				}

				}
				setState(152);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__17);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(154);
					match(T__18);
					}
				}

				}
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(157);
					match(T__19);
					}
				}

				}
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(160);
					match(T__9);
					}
				}

				}
				setState(163);
				match(String);
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
		enterRule(_localctx, 28, RULE_math);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(Number);
				setState(167);
				match(WS);
				setState(168);
				match(T__10);
				setState(169);
				match(WS);
				setState(170);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(Number);
				setState(172);
				match(WS);
				setState(173);
				match(T__20);
				setState(174);
				match(WS);
				setState(175);
				match(Number);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(Number);
				setState(177);
				match(WS);
				setState(178);
				match(T__21);
				setState(179);
				match(WS);
				setState(180);
				match(Number);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(Number);
				setState(182);
				match(WS);
				setState(183);
				match(T__22);
				setState(184);
				match(WS);
				setState(185);
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
		enterRule(_localctx, 30, RULE_methodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Id);
			setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\5"+
		"\6F\n\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13r\n\13\3\f\3"+
		"\f\3\f\3\f\5\fx\n\f\3\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r"+
		"\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3"+
		"\17\3\17\5\17\u0093\n\17\3\17\5\17\u0096\n\17\3\17\5\17\u0099\n\17\3\17"+
		"\3\17\3\17\5\17\u009e\n\17\3\17\5\17\u00a1\n\17\3\17\5\17\u00a4\n\17\3"+
		"\17\5\17\u00a7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21"+
		"\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00cf"+
		"\2\"\3\2\2\2\4)\3\2\2\2\6/\3\2\2\2\b@\3\2\2\2\nE\3\2\2\2\fK\3\2\2\2\16"+
		"U\3\2\2\2\20W\3\2\2\2\22a\3\2\2\2\24q\3\2\2\2\26w\3\2\2\2\30\u0087\3\2"+
		"\2\2\32\u008e\3\2\2\2\34\u00a6\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2\2"+
		"\"#\5\4\3\2#$\7\3\2\2$\3\3\2\2\2%&\5\6\4\2&\'\5\4\3\2\'*\3\2\2\2(*\5\6"+
		"\4\2)%\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+\60\5\26\f\2,\60\5\32\16\2-\60\5\f"+
		"\7\2.\60\5\20\t\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2"+
		"\61\62\7\4\2\2\62\63\5\n\6\2\63\64\7\5\2\2\64\65\5\n\6\2\65A\3\2\2\2\66"+
		"\67\7\4\2\2\678\5\n\6\289\7\6\2\29:\5\n\6\2:A\3\2\2\2;<\7\4\2\2<=\5\n"+
		"\6\2=>\7\7\2\2>?\5\n\6\2?A\3\2\2\2@\61\3\2\2\2@\66\3\2\2\2@;\3\2\2\2A"+
		"\t\3\2\2\2BF\7\34\2\2CF\7\32\2\2DF\5\36\20\2EB\3\2\2\2EC\3\2\2\2ED\3\2"+
		"\2\2F\13\3\2\2\2GH\5\16\b\2HI\5\f\7\2IL\3\2\2\2JL\5\16\b\2KG\3\2\2\2K"+
		"J\3\2\2\2L\r\3\2\2\2MN\7\b\2\2NO\7\32\2\2OP\7\t\2\2PV\5\4\3\2QR\7\n\2"+
		"\2RS\7\32\2\2ST\7\t\2\2TV\5\4\3\2UM\3\2\2\2UQ\3\2\2\2V\17\3\2\2\2WX\7"+
		"\13\2\2XY\7\32\2\2YZ\7\32\2\2Z[\7\t\2\2[\\\5\22\n\2\\\21\3\2\2\2]^\5\24"+
		"\13\2^_\5\22\n\2_b\3\2\2\2`b\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\23\3\2\2\2c"+
		"d\7\32\2\2de\7\f\2\2ef\7\32\2\2fg\7\r\2\2gr\7\32\2\2hi\7\32\2\2ij\7\f"+
		"\2\2jk\7\32\2\2kl\7\16\2\2lr\7\32\2\2mn\5\b\5\2no\7\t\2\2or\3\2\2\2pr"+
		"\5 \21\2qc\3\2\2\2qh\3\2\2\2qm\3\2\2\2qp\3\2\2\2r\25\3\2\2\2st\5\30\r"+
		"\2tu\5\26\f\2ux\3\2\2\2vx\5\30\r\2ws\3\2\2\2wv\3\2\2\2x\27\3\2\2\2y{\7"+
		"\17\2\2z|\7\20\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\32\2\2~\177\7\21"+
		"\2\2\177\u0088\7\32\2\2\u0080\u0082\7\17\2\2\u0081\u0083\7\20\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\7\32"+
		"\2\2\u0085\u0086\7\22\2\2\u0086\u0088\5 \21\2\u0087y\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\31\3\2\2\2\u0089\u008a\5\34\17\2\u008a"+
		"\u008b\7\23\2\2\u008b\u008c\5\32\16\2\u008c\u008f\3\2\2\2\u008d\u008f"+
		"\5\34\17\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\33\3\2\2\2\u0090"+
		"\u0092\7\24\2\2\u0091\u0093\7\25\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7\26\2\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\f\2\2\u0098\u0097\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a7\7\32\2\2\u009b"+
		"\u009d\7\24\2\2\u009c\u009e\7\25\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\7\26\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4\7\f\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\7\33\2\2\u00a6"+
		"\u0090\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\7\34\2"+
		"\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7\35\2\2\u00ac"+
		"\u00bd\7\34\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af\7\35\2\2\u00af\u00b0"+
		"\7\27\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00bd\7\34\2\2\u00b2\u00b3\7\34\2"+
		"\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\7\35\2\2\u00b6"+
		"\u00bd\7\34\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00ba"+
		"\7\31\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bd\7\34\2\2\u00bc\u00a8\3\2\2"+
		"\2\u00bc\u00ad\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\37"+
		"\3\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\7\32\2\2\u00c0!\3\2\2\2\27)"+
		"/@EKUaqw{\u0082\u0087\u008e\u0092\u0095\u0098\u009d\u00a0\u00a3\u00a6"+
		"\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}