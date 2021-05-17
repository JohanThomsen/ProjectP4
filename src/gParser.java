// Generated from C:/Git/P4/Project\g.g4 by ANTLR 4.9.1
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, Id=47, String=48, Number=49, Break=50, LineComment=51, BlockComment=52, 
		WS=53;
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
			null, "'then'", "'Then'", "'continue'", "'.'", "'if'", "'If'", "'then do'", 
			"'as'", "'As'", "'long as'", "'is true, do'", "'repeat'", "'Repeat'", 
			"'from'", "'to'", "'there'", "'There'", "'can exist a'", "'n'", "'for which:'", 
			"'does'", "'with'", "'and'", "'has'", "'is'", "'an'", "'a'", "'There is a'", 
			"'called'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'is equal to'", 
			"'is less than'", "'is greater than'", "'is less or equal to'", "'is greater or equal to'", 
			"'contains'", "'or'", "'not'", "'do'", "'Do'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "Id", 
			"String", "Number", "Break", "LineComment", "BlockComment", "WS"
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
		public TerminalNode Break() { return getToken(gParser.Break, 0); }
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
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				methoddcl();
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				assign();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(45);
					match(T__3);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				init();
				setState(49);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(Break);
				setState(52);
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
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				methodcall();
				setState(57);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				math(0);
				setState(60);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				bool(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				ctrlstruc();
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(T__2);
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
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				_localctx = new CtrlifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				expression();
				setState(71);
				match(T__6);
				setState(72);
				statements();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new CtrlwhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				match(T__9);
				setState(76);
				expression();
				setState(77);
				match(T__10);
				setState(78);
				statements();
				}
				break;
			case T__11:
			case T__12:
				_localctx = new CtrlforContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				match(Id);
				setState(82);
				match(T__13);
				setState(83);
				math(0);
				setState(84);
				match(T__14);
				setState(85);
				math(0);
				setState(86);
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
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(91);
			match(T__17);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(92);
				match(T__18);
				}
			}

			}
			setState(95);
			match(Id);
			setState(96);
			match(T__19);
			setState(97);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(Id);
				setState(100);
				match(T__20);
				setState(101);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(Id);
				setState(103);
				match(T__21);
				setState(104);
				match(Id);
				setState(105);
				match(Id);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(106);
					match(T__22);
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(107);
						match(Id);
						setState(108);
						match(Id);
						}
						}
						setState(111); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Id );
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__20);
				setState(119);
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
		public TerminalNode String() { return getToken(gParser.String, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(Id);
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==T__26) {
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(127);
					match(Id);
					}
					break;
				case 2:
					{
					setState(128);
					match(Number);
					}
					break;
				case 3:
					{
					setState(129);
					match(String);
					}
					break;
				case 4:
					{
					setState(130);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(Id);
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25 || _la==T__26) {
					{
					setState(135);
					_la = _input.LA(1);
					if ( !(_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(138);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__27);
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(142);
					match(T__18);
					}
				}

				}
				setState(145);
				match(Id);
				setState(146);
				match(T__28);
				setState(147);
				match(Id);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(Id);
				setState(149);
				match(T__23);
				setState(150);
				match(T__26);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(151);
					match(T__18);
					}
				}

				}
				setState(154);
				match(Id);
				setState(155);
				match(T__28);
				setState(156);
				match(Id);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				{
				_localctx = new MathParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(T__29);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(161);
					math(0);
					}
					break;
				case 2:
					{
					setState(162);
					bool(0);
					}
					break;
				}
				setState(165);
				match(T__30);
				}
				break;
			case Id:
				{
				_localctx = new MathIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Id);
				}
				break;
			case Number:
				{
				_localctx = new MathNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MathMultContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
						match(T__31);
						setState(173);
						math(6);
						}
						break;
					case 2:
						{
						_localctx = new MathDivContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						match(T__32);
						setState(176);
						math(5);
						}
						break;
					case 3:
						{
						_localctx = new MathAddContext(new MathContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						math(4);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class StringEqualsContext extends BoolContext {
		public List<TerminalNode> Id() { return getTokens(gParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(gParser.Id, i);
		}
		public List<TerminalNode> String() { return getTokens(gParser.String); }
		public TerminalNode String(int i) {
			return getToken(gParser.String, i);
		}
		public StringEqualsContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStringEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStringEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStringEquals(this);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				match(T__29);
				setState(187);
				bool(0);
				setState(188);
				match(T__30);
				}
				break;
			case 2:
				{
				_localctx = new StringEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==Id || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				match(T__35);
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==Id || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__42);
				setState(194);
				bool(4);
				}
				break;
			case 4:
				{
				_localctx = new BoolMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				math(0);
				}
				break;
			case 5:
				{
				_localctx = new BoolIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(Id);
				}
				break;
			case 6:
				{
				_localctx = new BoolNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(Number);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BoolEqualsContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(200);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(201);
						match(T__35);
						setState(202);
						bool(14);
						}
						break;
					case 2:
						{
						_localctx = new BoolLessContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(203);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(204);
						match(T__36);
						setState(205);
						bool(12);
						}
						break;
					case 3:
						{
						_localctx = new BoolGreaterContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(206);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(207);
						match(T__37);
						setState(208);
						bool(11);
						}
						break;
					case 4:
						{
						_localctx = new BoolLEContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						match(T__38);
						setState(211);
						bool(10);
						}
						break;
					case 5:
						{
						_localctx = new BoolGEContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(212);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(213);
						match(T__39);
						setState(214);
						bool(9);
						}
						break;
					case 6:
						{
						_localctx = new BoolContainsContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(215);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(216);
						match(T__40);
						setState(217);
						bool(8);
						}
						break;
					case 7:
						{
						_localctx = new BoolAndContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(218);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(219);
						match(T__22);
						setState(220);
						bool(7);
						}
						break;
					case 8:
						{
						_localctx = new BoolOrContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(221);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(222);
						match(T__41);
						setState(223);
						bool(6);
						}
						break;
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(String);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(String);
				setState(231);
				match(T__22);
				setState(232);
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
		public List<TerminalNode> String() { return getTokens(gParser.String); }
		public TerminalNode String(int i) {
			return getToken(gParser.String, i);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(Id);
				setState(239);
				match(T__21);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(240);
					match(Id);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45) {
						{
						{
						setState(241);
						match(T__45);
						setState(242);
						match(Id);
						}
						}
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(248);
					match(String);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45) {
						{
						{
						setState(249);
						match(T__45);
						setState(250);
						match(String);
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(256);
					math(0);
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45) {
						{
						{
						setState(257);
						match(T__45);
						setState(258);
						math(0);
						}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
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
			return precpred(_ctx, 13);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3$\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6[\n\6\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\6\bp\n\b\r\b\16\bq\7\bt\n\b\f\b\16\bw\13\b\3\b"+
		"\3\b\5\b{\n\b\3\t\3\t\3\t\5\t\u0080\n\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t"+
		"\3\t\3\t\3\t\5\t\u008b\n\t\3\t\5\t\u008e\n\t\3\n\3\n\5\n\u0092\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13"+
		"\3\13\3\13\3\13\5\13\u00a6\n\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b7\n\13\f\13\16\13"+
		"\u00ba\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c9"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\r\3"+
		"\r\3\r\3\r\5\r\u00ec\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00f6\n\16\f\16\16\16\u00f9\13\16\3\16\3\16\3\16\7\16\u00fe\n\16\f\16"+
		"\16\16\u0101\13\16\3\16\3\16\3\16\7\16\u0106\n\16\f\16\16\16\u0109\13"+
		"\16\5\16\u010b\n\16\5\16\u010d\n\16\3\16\2\4\24\26\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\f\3\2\3\4\3\2\7\b\3\2\n\13\3\2\16\17\3\2\22\23\3\2\32"+
		"\33\3\2\34\35\3\2$%\3\2\61\62\3\2./\2\u0135\2\34\3\2\2\2\4#\3\2\2\2\6"+
		"\67\3\2\2\2\bE\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16z\3\2\2\2\20\u008d\3\2"+
		"\2\2\22\u009f\3\2\2\2\24\u00ab\3\2\2\2\26\u00c8\3\2\2\2\30\u00eb\3\2\2"+
		"\2\32\u010c\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4"+
		"\2 !\5\4\3\2!$\3\2\2\2\"$\5\6\4\2#\37\3\2\2\2#\"\3\2\2\2$\5\3\2\2\2%8"+
		"\5\b\5\2&\'\5\f\7\2\'(\t\2\2\2()\7\5\2\2)8\3\2\2\2*+\5\16\b\2+,\t\2\2"+
		"\2,-\7\5\2\2-8\3\2\2\2.\60\5\20\t\2/\61\7\6\2\2\60/\3\2\2\2\60\61\3\2"+
		"\2\2\618\3\2\2\2\62\63\5\22\n\2\63\64\7\6\2\2\648\3\2\2\2\65\66\7\64\2"+
		"\2\668\7\6\2\2\67%\3\2\2\2\67&\3\2\2\2\67*\3\2\2\2\67.\3\2\2\2\67\62\3"+
		"\2\2\2\67\65\3\2\2\28\7\3\2\2\29F\7\61\2\2:;\5\32\16\2;<\7\6\2\2<F\3\2"+
		"\2\2=>\5\24\13\2>?\7\6\2\2?F\3\2\2\2@F\5\26\f\2AB\5\n\6\2BC\t\2\2\2CD"+
		"\7\5\2\2DF\3\2\2\2E9\3\2\2\2E:\3\2\2\2E=\3\2\2\2E@\3\2\2\2EA\3\2\2\2F"+
		"\t\3\2\2\2GH\t\3\2\2HI\5\b\5\2IJ\7\t\2\2JK\5\4\3\2K[\3\2\2\2LM\t\4\2\2"+
		"MN\7\f\2\2NO\5\b\5\2OP\7\r\2\2PQ\5\4\3\2Q[\3\2\2\2RS\t\5\2\2ST\7\61\2"+
		"\2TU\7\20\2\2UV\5\24\13\2VW\7\21\2\2WX\5\24\13\2XY\5\4\3\2Y[\3\2\2\2Z"+
		"G\3\2\2\2ZL\3\2\2\2ZR\3\2\2\2[\13\3\2\2\2\\]\t\6\2\2]_\7\24\2\2^`\7\25"+
		"\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\61\2\2bc\7\26\2\2cd\5\4\3\2d\r"+
		"\3\2\2\2ef\7\61\2\2fg\7\27\2\2g{\5\4\3\2hi\7\61\2\2ij\7\30\2\2jk\7\61"+
		"\2\2ku\7\61\2\2lo\7\31\2\2mn\7\61\2\2np\7\61\2\2om\3\2\2\2pq\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2rt\3\2\2\2sl\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"vx\3\2\2\2wu\3\2\2\2xy\7\27\2\2y{\5\4\3\2ze\3\2\2\2zh\3\2\2\2{\17\3\2"+
		"\2\2|}\7\61\2\2}\177\t\7\2\2~\u0080\t\b\2\2\177~\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0085\3\2\2\2\u0081\u0086\7\61\2\2\u0082\u0086\7\63\2\2\u0083"+
		"\u0086\7\62\2\2\u0084\u0086\5\b\5\2\u0085\u0081\3\2\2\2\u0085\u0082\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u008e\3\2\2\2\u0087"+
		"\u0088\7\61\2\2\u0088\u008a\t\7\2\2\u0089\u008b\t\b\2\2\u008a\u0089\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\5\30\r\2\u008d"+
		"|\3\2\2\2\u008d\u0087\3\2\2\2\u008e\21\3\2\2\2\u008f\u0091\7\36\2\2\u0090"+
		"\u0092\7\25\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\7\37\2\2\u0095\u00a0\7\61\2\2"+
		"\u0096\u0097\7\61\2\2\u0097\u0098\7\32\2\2\u0098\u009a\7\35\2\2\u0099"+
		"\u009b\7\25\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7\37\2\2\u009e\u00a0\7\61\2\2"+
		"\u009f\u008f\3\2\2\2\u009f\u0096\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2"+
		"\b\13\1\2\u00a2\u00a5\7 \2\2\u00a3\u00a6\5\24\13\2\u00a4\u00a6\5\26\f"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\7!\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ac\7\61\2\2\u00aa\u00ac\7\63\2\2"+
		"\u00ab\u00a1\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b8"+
		"\3\2\2\2\u00ad\u00ae\f\7\2\2\u00ae\u00af\7\"\2\2\u00af\u00b7\5\24\13\b"+
		"\u00b0\u00b1\f\6\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b7\5\24\13\7\u00b3\u00b4"+
		"\f\5\2\2\u00b4\u00b5\t\t\2\2\u00b5\u00b7\5\24\13\6\u00b6\u00ad\3\2\2\2"+
		"\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\b\f\1\2\u00bc\u00bd\7 \2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7!"+
		"\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c1\t\n\2\2\u00c1\u00c2\7&\2\2\u00c2"+
		"\u00c9\t\n\2\2\u00c3\u00c4\7-\2\2\u00c4\u00c9\5\26\f\6\u00c5\u00c9\5\24"+
		"\13\2\u00c6\u00c9\7\61\2\2\u00c7\u00c9\7\63\2\2\u00c8\u00bb\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00e4\3\2\2\2\u00ca\u00cb\f\17\2\2\u00cb"+
		"\u00cc\7&\2\2\u00cc\u00e3\5\26\f\20\u00cd\u00ce\f\r\2\2\u00ce\u00cf\7"+
		"\'\2\2\u00cf\u00e3\5\26\f\16\u00d0\u00d1\f\f\2\2\u00d1\u00d2\7(\2\2\u00d2"+
		"\u00e3\5\26\f\r\u00d3\u00d4\f\13\2\2\u00d4\u00d5\7)\2\2\u00d5\u00e3\5"+
		"\26\f\f\u00d6\u00d7\f\n\2\2\u00d7\u00d8\7*\2\2\u00d8\u00e3\5\26\f\13\u00d9"+
		"\u00da\f\t\2\2\u00da\u00db\7+\2\2\u00db\u00e3\5\26\f\n\u00dc\u00dd\f\b"+
		"\2\2\u00dd\u00de\7\31\2\2\u00de\u00e3\5\26\f\t\u00df\u00e0\f\7\2\2\u00e0"+
		"\u00e1\7,\2\2\u00e1\u00e3\5\26\f\b\u00e2\u00ca\3\2\2\2\u00e2\u00cd\3\2"+
		"\2\2\u00e2\u00d0\3\2\2\2\u00e2\u00d3\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2"+
		"\u00d9\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00ec\7\62\2\2\u00e8\u00e9\7\62\2\2\u00e9\u00ea\7\31\2"+
		"\2\u00ea\u00ec\5\30\r\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"\31\3\2\2\2\u00ed\u00ee\t\13\2\2\u00ee\u010d\7\61\2\2\u00ef\u00f0\t\13"+
		"\2\2\u00f0\u00f1\7\61\2\2\u00f1\u010a\7\30\2\2\u00f2\u00f7\7\61\2\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\u00f6\7\61\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u010b\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00ff\7\62\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fe\7"+
		"\62\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u010b\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0107\5\24"+
		"\13\2\u0103\u0104\7\60\2\2\u0104\u0106\5\24\13\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u00f2\3\2\2\2\u010a\u00fa\3\2\2\2\u010a"+
		"\u0102\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u00ed\3\2\2\2\u010c\u00ef\3\2"+
		"\2\2\u010d\33\3\2\2\2\37#\60\67EZ_quz\177\u0085\u008a\u008d\u0091\u009a"+
		"\u009f\u00a5\u00ab\u00b6\u00b8\u00c8\u00e2\u00e4\u00eb\u00f7\u00ff\u0107"+
		"\u010a\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}