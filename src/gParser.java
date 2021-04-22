// Generated from D:/Repos/ProjectP4\g.g4 by ANTLR 4.9.1
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, Id=38, String=39, 
		Number=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_ctrlstruc = 4, RULE_classdcl = 5, RULE_methoddcl = 6, RULE_assign = 7, 
		RULE_init = 8, RULE_math = 9, RULE_bool = 10, RULE_attributes = 11, RULE_methodcall = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "expression", "ctrlstruc", "classdcl", 
			"methoddcl", "assign", "init", "math", "bool", "attributes", "methodcall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'then continue'", "'.'", "'if'", "'then do'", "'as long as'", 
			"'is true, do'", "'repeat'", "'from'", "'to'", "'There can exist a'", 
			"'n'", "'for which:'", "'does'", "'with'", "'and'", "'has'", "'is'", 
			"'an'", "'a'", "'There is a'", "'called'", "'('", "')'", "'*'", "'/'", 
			"'+'", "'-'", "'is equal to'", "'is less than'", "'is greater than'", 
			"'is less or equal to'", "'is greater or equal to'", "'contains'", "'or'", 
			"'not'", "'do'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Id", "String", "Number", "WS"
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gParser.EOF, 0); }
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
			setState(26);
			statements();
			setState(27);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				statement();
				setState(30);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassdclContext classdcl() {
			return getRuleContext(ClassdclContext.class,0);
		}
		public MethoddclContext methoddcl() {
			return getRuleContext(MethoddclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				classdcl();
				setState(37);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				methoddcl();
				setState(40);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				assign();
				setState(43);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				init();
				setState(46);
				match(T__1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CtrlstrucContext ctrlstruc() {
			return getRuleContext(CtrlstrucContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				methodcall();
				setState(52);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				math(0);
				setState(55);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				bool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				ctrlstruc();
				setState(59);
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

	public static class CtrlstrucContext extends ParserRuleContext {
		public CtrlstrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstruc; }
	 
		public CtrlstrucContext() { }
		public void copyFrom(CtrlstrucContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CtrlwhileContext extends CtrlstrucContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CtrlwhileContext(CtrlstrucContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCtrlwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCtrlwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCtrlwhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtrlforContext extends CtrlstrucContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CtrlforContext(CtrlstrucContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCtrlfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCtrlfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCtrlfor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CtrlifContext extends CtrlstrucContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CtrlifContext(CtrlstrucContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCtrlif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCtrlif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCtrlif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstrucContext ctrlstruc() throws RecognitionException {
		CtrlstrucContext _localctx = new CtrlstrucContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ctrlstruc);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new CtrlifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__2);
				setState(64);
				expression();
				setState(65);
				match(T__3);
				setState(66);
				statements();
				}
				break;
			case T__4:
				_localctx = new CtrlwhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__4);
				setState(69);
				expression();
				setState(70);
				match(T__5);
				setState(71);
				statements();
				}
				break;
			case T__6:
				_localctx = new CtrlforContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__6);
				setState(74);
				match(Id);
				setState(75);
				match(T__7);
				setState(76);
				math(0);
				setState(77);
				match(T__8);
				setState(78);
				math(0);
				setState(79);
				statements();
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

	public static class ClassdclContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__9);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(84);
				match(T__10);
				}
			}

			}
			setState(87);
			match(Id);
			setState(88);
			match(T__11);
			setState(89);
			statements();
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(Id);
				setState(92);
				match(T__12);
				setState(93);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(Id);
				setState(95);
				match(T__13);
				setState(96);
				match(Id);
				setState(97);
				match(Id);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(98);
					match(T__14);
					setState(99);
					match(Id);
					setState(100);
					match(Id);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__12);
				setState(107);
				statements();
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
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
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
		enterRule(_localctx, 14, RULE_assign);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(Id);
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(112);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(115);
					match(Id);
					}
					break;
				case 2:
					{
					setState(116);
					match(Number);
					}
					break;
				case 3:
					{
					setState(117);
					math(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(Id);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(122);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(125);
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

	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
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
		enterRule(_localctx, 16, RULE_init);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__19);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(129);
					match(T__10);
					}
				}

				}
				setState(132);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__19);
				{
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(134);
					match(T__10);
					}
				}

				}
				setState(137);
				match(Id);
				setState(138);
				match(T__20);
				setState(139);
				match(Id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(Id);
				setState(141);
				match(T__15);
				setState(142);
				match(T__18);
				{
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(143);
					match(T__10);
					}
				}

				}
				setState(146);
				match(Id);
				setState(147);
				match(T__20);
				setState(148);
				match(Id);
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
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
	 
		public MathContext() { }
		public void copyFrom(MathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathIdContext extends MathContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public MathIdContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathNumberContext extends MathContext {
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public MathNumberContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathMultContext extends MathContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MathMultContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathDivContext extends MathContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MathDivContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathAddContext extends MathContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MathAddContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathParenthesisContext extends MathContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public MathParenthesisContext(MathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMathParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMathParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMathParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		return math(0);
	}

	private MathContext math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathContext _localctx = new MathContext(_ctx, _parentState);
		MathContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_math, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				_localctx = new MathParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(T__21);
				setState(153);
				math(0);
				setState(154);
				match(T__22);
				}
				break;
			case Id:
				{
				_localctx = new MathIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(Id);
				}
				break;
			case Number:
				{
				_localctx = new MathNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MathMultContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(160);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(161);
						match(T__23);
						setState(162);
						math(6);
						}
						break;
					case 2:
						{
						_localctx = new MathDivContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						match(T__24);
						setState(165);
						math(5);
						}
						break;
					case 3:
						{
						_localctx = new MathAddContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(167);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						math(4);
						}
						break;
					}
					} 
				}
				setState(173);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContainsContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolContainsContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolContains(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolGEContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolGEContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolGE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLessContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolLessContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolOrContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolOrContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLEContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolLEContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNumberContext extends BoolContext {
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public BoolNumberContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolNotContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolEqualsContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolEqualsContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolIdContext extends BoolContext {
		public TerminalNode Id() { return getToken(gParser.Id, 0); }
		public BoolIdContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolMathContext extends BoolContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public BoolMathContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolMath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolAndContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParanthesisContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolParanthesisContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolGreaterContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BoolGreaterContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBoolGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBoolGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBoolGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(T__21);
				setState(176);
				bool(0);
				setState(177);
				match(T__22);
				}
				break;
			case 2:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__34);
				setState(180);
				bool(4);
				}
				break;
			case 3:
				{
				_localctx = new BoolIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(Id);
				}
				break;
			case 4:
				{
				_localctx = new BoolNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(Number);
				}
				break;
			case 5:
				{
				_localctx = new BoolMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				math(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new BoolEqualsContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(186);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(187);
						match(T__27);
						setState(188);
						bool(13);
						}
						break;
					case 2:
						{
						_localctx = new BoolLessContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(189);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(190);
						match(T__28);
						setState(191);
						bool(12);
						}
						break;
					case 3:
						{
						_localctx = new BoolGreaterContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						match(T__29);
						setState(194);
						bool(11);
						}
						break;
					case 4:
						{
						_localctx = new BoolLEContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(195);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(196);
						match(T__30);
						setState(197);
						bool(10);
						}
						break;
					case 5:
						{
						_localctx = new BoolGEContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(198);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(199);
						match(T__31);
						setState(200);
						bool(9);
						}
						break;
					case 6:
						{
						_localctx = new BoolContainsContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(201);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(202);
						match(T__32);
						setState(203);
						bool(8);
						}
						break;
					case 7:
						{
						_localctx = new BoolAndContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						match(T__14);
						setState(206);
						bool(7);
						}
						break;
					case 8:
						{
						_localctx = new BoolOrContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						match(T__33);
						setState(209);
						bool(6);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 22, RULE_attributes);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(String);
				setState(217);
				match(T__14);
				setState(218);
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
		enterRule(_localctx, 24, RULE_methodcall);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__35);
				setState(222);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__35);
				setState(224);
				match(Id);
				setState(225);
				match(T__13);
				setState(226);
				match(Id);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__36) {
					{
					{
					setState(227);
					match(T__36);
					setState(228);
					match(Id);
					}
					}
					setState(233);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return math_sempred((MathContext)_localctx, predIndex);
		case 10:
			return bool_sempred((BoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sempred(MathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3$\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6\3\7\3\7\5\7X\n"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bh\n\b\f"+
		"\b\16\bk\13\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\5\tt\n\t\3\t\3\t\3\t\5\ty\n"+
		"\t\3\t\3\t\3\t\5\t~\n\t\3\t\5\t\u0081\n\t\3\n\3\n\5\n\u0085\n\n\3\n\3"+
		"\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\n\3\n"+
		"\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ac\n\13\f\13\16"+
		"\13\u00af\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bb\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\r\3\r\3"+
		"\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e8"+
		"\n\16\f\16\16\16\u00eb\13\16\5\16\u00ed\n\16\3\16\2\4\24\26\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\5\3\2\22\23\3\2\24\25\3\2\34\35\2\u010d\2"+
		"\34\3\2\2\2\4#\3\2\2\2\6\62\3\2\2\2\b?\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16"+
		"n\3\2\2\2\20\u0080\3\2\2\2\22\u0097\3\2\2\2\24\u00a0\3\2\2\2\26\u00ba"+
		"\3\2\2\2\30\u00dd\3\2\2\2\32\u00ec\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3"+
		"\36\3\3\2\2\2\37 \5\6\4\2 !\5\4\3\2!$\3\2\2\2\"$\5\6\4\2#\37\3\2\2\2#"+
		"\"\3\2\2\2$\5\3\2\2\2%\63\5\b\5\2&\'\5\f\7\2\'(\7\3\2\2(\63\3\2\2\2)*"+
		"\5\16\b\2*+\7\3\2\2+\63\3\2\2\2,-\5\20\t\2-.\7\4\2\2.\63\3\2\2\2/\60\5"+
		"\22\n\2\60\61\7\4\2\2\61\63\3\2\2\2\62%\3\2\2\2\62&\3\2\2\2\62)\3\2\2"+
		"\2\62,\3\2\2\2\62/\3\2\2\2\63\7\3\2\2\2\64@\7(\2\2\65\66\5\32\16\2\66"+
		"\67\7\4\2\2\67@\3\2\2\289\5\24\13\29:\7\4\2\2:@\3\2\2\2;@\5\26\f\2<=\5"+
		"\n\6\2=>\7\3\2\2>@\3\2\2\2?\64\3\2\2\2?\65\3\2\2\2?8\3\2\2\2?;\3\2\2\2"+
		"?<\3\2\2\2@\t\3\2\2\2AB\7\5\2\2BC\5\b\5\2CD\7\6\2\2DE\5\4\3\2ET\3\2\2"+
		"\2FG\7\7\2\2GH\5\b\5\2HI\7\b\2\2IJ\5\4\3\2JT\3\2\2\2KL\7\t\2\2LM\7(\2"+
		"\2MN\7\n\2\2NO\5\24\13\2OP\7\13\2\2PQ\5\24\13\2QR\5\4\3\2RT\3\2\2\2SA"+
		"\3\2\2\2SF\3\2\2\2SK\3\2\2\2T\13\3\2\2\2UW\7\f\2\2VX\7\r\2\2WV\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\7(\2\2Z[\7\16\2\2[\\\5\4\3\2\\\r\3\2\2\2]^\7(\2"+
		"\2^_\7\17\2\2_o\5\4\3\2`a\7(\2\2ab\7\20\2\2bc\7(\2\2ci\7(\2\2de\7\21\2"+
		"\2ef\7(\2\2fh\7(\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2"+
		"ki\3\2\2\2lm\7\17\2\2mo\5\4\3\2n]\3\2\2\2n`\3\2\2\2o\17\3\2\2\2pq\7(\2"+
		"\2qs\t\2\2\2rt\t\3\2\2sr\3\2\2\2st\3\2\2\2tx\3\2\2\2uy\7(\2\2vy\7*\2\2"+
		"wy\5\24\13\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\u0081\3\2\2\2z{\7(\2\2{}\t"+
		"\2\2\2|~\t\3\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\5\30\r\2\u0080"+
		"p\3\2\2\2\u0080z\3\2\2\2\u0081\21\3\2\2\2\u0082\u0084\7\26\2\2\u0083\u0085"+
		"\7\r\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0098\7(\2\2\u0087\u0089\7\26\2\2\u0088\u008a\7\r\2\2\u0089\u0088\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7(\2\2\u008c"+
		"\u008d\7\27\2\2\u008d\u0098\7(\2\2\u008e\u008f\7(\2\2\u008f\u0090\7\22"+
		"\2\2\u0090\u0092\7\25\2\2\u0091\u0093\7\r\2\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7\27"+
		"\2\2\u0096\u0098\7(\2\2\u0097\u0082\3\2\2\2\u0097\u0087\3\2\2\2\u0097"+
		"\u008e\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a\b\13\1\2\u009a\u009b\7\30"+
		"\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\31\2\2\u009d\u00a1\3\2\2\2\u009e"+
		"\u00a1\7(\2\2\u009f\u00a1\7*\2\2\u00a0\u0099\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\f\7\2\2\u00a3\u00a4"+
		"\7\32\2\2\u00a4\u00ac\5\24\13\b\u00a5\u00a6\f\6\2\2\u00a6\u00a7\7\33\2"+
		"\2\u00a7\u00ac\5\24\13\7\u00a8\u00a9\f\5\2\2\u00a9\u00aa\t\4\2\2\u00aa"+
		"\u00ac\5\24\13\6\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\25\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\f\1\2\u00b1\u00b2\7\30\2"+
		"\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\7\31\2\2\u00b4\u00bb\3\2\2\2\u00b5"+
		"\u00b6\7%\2\2\u00b6\u00bb\5\26\f\6\u00b7\u00bb\7(\2\2\u00b8\u00bb\7*\2"+
		"\2\u00b9\u00bb\5\24\13\2\u00ba\u00b0\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00d6\3\2"+
		"\2\2\u00bc\u00bd\f\16\2\2\u00bd\u00be\7\36\2\2\u00be\u00d5\5\26\f\17\u00bf"+
		"\u00c0\f\r\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00d5\5\26\f\16\u00c2\u00c3"+
		"\f\f\2\2\u00c3\u00c4\7 \2\2\u00c4\u00d5\5\26\f\r\u00c5\u00c6\f\13\2\2"+
		"\u00c6\u00c7\7!\2\2\u00c7\u00d5\5\26\f\f\u00c8\u00c9\f\n\2\2\u00c9\u00ca"+
		"\7\"\2\2\u00ca\u00d5\5\26\f\13\u00cb\u00cc\f\t\2\2\u00cc\u00cd\7#\2\2"+
		"\u00cd\u00d5\5\26\f\n\u00ce\u00cf\f\b\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00d5"+
		"\5\26\f\t\u00d1\u00d2\f\7\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d5\5\26\f\b"+
		"\u00d4\u00bc\3\2\2\2\u00d4\u00bf\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c5"+
		"\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\27\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\7)\2\2\u00da\u00db"+
		"\7)\2\2\u00db\u00dc\7\21\2\2\u00dc\u00de\5\30\r\2\u00dd\u00d9\3\2\2\2"+
		"\u00dd\u00da\3\2\2\2\u00de\31\3\2\2\2\u00df\u00e0\7&\2\2\u00e0\u00ed\7"+
		"(\2\2\u00e1\u00e2\7&\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e4\7\20\2\2\u00e4"+
		"\u00e9\7(\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e8\7(\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ed"+
		"\33\3\2\2\2\32#\62?SWinsx}\u0080\u0084\u0089\u0092\u0097\u00a0\u00ab\u00ad"+
		"\u00ba\u00d4\u00d6\u00dd\u00e9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}