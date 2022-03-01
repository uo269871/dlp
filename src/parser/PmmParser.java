// Generated from C:/Users/Miguel/IdeaProjects/dlp/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, CHAR_CONSTANT=41, ID=42, COMMENT=43, 
		TRASH=44;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefinition = 2, RULE_funcDefinition = 3, 
		RULE_type = 4, RULE_statement = 5, RULE_body = 6, RULE_expressions = 7, 
		RULE_expression = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefinition", "funcDefinition", "type", "statement", 
			"body", "expressions", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'def'", "'main():'", "'('", "'):'", "'{'", 
			"'}'", "'int'", "'double'", "'char'", "'['", "']'", "'struct {'", "'if'", 
			"'else'", "'while'", "')'", "'='", "'print'", "'input'", "'return'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", 
			"COMMENT", "TRASH"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionsContext exps;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((ProgramContext)_localctx).exps = expressions();
			 _localctx.ast.addAll(((ProgramContext)_localctx).exps.ast); 
			setState(20);
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

	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				varDefinition();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				funcDefinition();
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ID);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(27);
				match(T__0);
				setState(28);
				match(ID);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(T__1);
			setState(35);
			type();
			setState(36);
			match(T__2);
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

	public static class FuncDefinitionContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(39);
				match(T__4);
				}
				break;
			case ID:
				{
				{
				setState(40);
				match(ID);
				setState(41);
				match(T__5);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(42);
					match(ID);
					setState(43);
					match(T__1);
					setState(44);
					type();
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(45);
						match(T__0);
						setState(46);
						match(ID);
						setState(47);
						match(T__1);
						setState(48);
						type();
						}
						}
						setState(53);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(56);
				match(T__6);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14))) != 0)) {
					{
					setState(57);
					type();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62);
			match(T__7);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					varDefinition();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__8);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__12);
				setState(81);
				match(INT_CONSTANT);
				setState(82);
				match(T__13);
				setState(83);
				type();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__14);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					varDefinition();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(90);
				match(T__8);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__15);
				setState(95);
				expression(0);
				setState(96);
				match(T__1);
				setState(97);
				body();
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(98);
					match(T__16);
					setState(99);
					body();
					}
					break;
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__17);
				setState(103);
				expression(0);
				setState(104);
				match(T__1);
				setState(105);
				body();
				}
				break;
			case T__5:
			case T__20:
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(107);
					match(ID);
					setState(108);
					match(T__5);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						setState(109);
						expression(0);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__0) {
							{
							{
							setState(110);
							match(T__0);
							setState(111);
							expression(0);
							}
							}
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(119);
					match(T__18);
					}
					break;
				case 2:
					{
					setState(120);
					expression(0);
					setState(121);
					match(T__19);
					setState(122);
					expression(0);
					}
					break;
				case 3:
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(125);
					expression(0);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(126);
						match(T__0);
						setState(127);
						expression(0);
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 4:
					{
					setState(133);
					match(T__22);
					setState(134);
					expression(0);
					}
					break;
				}
				setState(137);
				match(T__2);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__15:
			case T__17:
			case T__20:
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__7);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					statement();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );
				setState(147);
				match(T__8);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ArrayList<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext exp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				((ExpressionsContext)_localctx).exp = expression(0);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0) );

			        _localctx.ast.add(((ExpressionsContext)_localctx).exp.ast);
			        System.out.println(((ExpressionsContext)_localctx).exp.ast.toString());
			    
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
		public Expression ast;
		public ExpressionContext exp1;
		public ExpressionContext exp;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public Token OP;
		public ExpressionContext exp2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(159);
				match(T__5);
				setState(160);
				type();
				setState(161);
				match(T__18);
				setState(162);
				((ExpressionContext)_localctx).exp = expression(11);
				}
				break;
			case T__24:
				{
				setState(164);
				match(T__24);
				setState(165);
				((ExpressionContext)_localctx).exp = expression(10);

				            ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				                ((ExpressionContext)_localctx).exp.ast,
				                ((ExpressionContext)_localctx).exp.ast.getLine(),
				                ((ExpressionContext)_localctx).exp.ast.getColumn()
				            );
				        
				}
				break;
			case T__25:
				{
				setState(168);
				match(T__25);
				setState(169);
				((ExpressionContext)_localctx).exp = expression(9);

				            ((ExpressionContext)_localctx).ast =  new Not(
				                ((ExpressionContext)_localctx).exp.ast,
				                ((ExpressionContext)_localctx).exp.ast.getLine(),
				                ((ExpressionContext)_localctx).exp.ast.getColumn()
				            );
				        
				}
				break;
			case INT_CONSTANT:
				{
				setState(172);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new IntLiteral(
				                LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1
				            );
				        
				}
				break;
			case REAL_CONSTANT:
				{
				setState(174);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new RealLiteral(
				                LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1
				            );

				        
				}
				break;
			case CHAR_CONSTANT:
				{
				setState(176);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new CharLiteral(
				                LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1
				            );
				        
				}
				break;
			case ID:
				{
				setState(178);
				((ExpressionContext)_localctx).ID = match(ID);

				            ((ExpressionContext)_localctx).ast =  new Variable(
				                (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                ((ExpressionContext)_localctx).ID.getLine(),
				                ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1
				            );
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						((ExpressionContext)_localctx).exp2 = expression(9);

						                      ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                          ((ExpressionContext)_localctx).exp1.ast,
						                          ((ExpressionContext)_localctx).exp2.ast,
						                          (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                          ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp1.ast.getColumn()
						                      );
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__29) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((ExpressionContext)_localctx).exp2 = expression(8);

						                      ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                          ((ExpressionContext)_localctx).exp1.ast,
						                          ((ExpressionContext)_localctx).exp2.ast,
						                          (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                          ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp1.ast.getColumn()
						                      );
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((ExpressionContext)_localctx).exp2 = expression(7);

						                      ((ExpressionContext)_localctx).ast =  new Comparison(
						                          ((ExpressionContext)_localctx).exp1.ast,
						                          ((ExpressionContext)_localctx).exp2.ast,
						                          (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                          ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp1.ast.getColumn()
						                      );
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						((ExpressionContext)_localctx).exp2 = expression(6);

						                      ((ExpressionContext)_localctx).ast =  new And_Or(
						                          ((ExpressionContext)_localctx).exp1.ast,
						                          ((ExpressionContext)_localctx).exp2.ast,
						                          (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                          ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp1.ast.getColumn()
						                      );
						                  
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(203);
						match(T__12);
						setState(204);
						((ExpressionContext)_localctx).exp2 = expression(0);
						setState(205);
						match(T__13);

						                      ((ExpressionContext)_localctx).ast =  new ArrayAccess(
						                          ((ExpressionContext)_localctx).exp1.ast,
						                          ((ExpressionContext)_localctx).exp2.ast,
						                          ((ExpressionContext)_localctx).exp1.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp1.ast.getColumn()
						                      );
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(209);
						match(T__23);
						setState(210);
						((ExpressionContext)_localctx).ID = match(ID);

						                      ((ExpressionContext)_localctx).ast =  new FieldAccess(
						                          ((ExpressionContext)_localctx).exp.ast,
						                          (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
						                          ((ExpressionContext)_localctx).exp.ast.getLine(),
						                          ((ExpressionContext)_localctx).exp.ast.getColumn()
						                      );
						                  
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5\f\5"+
		"\16\5\67\13\5\5\59\n\5\3\5\3\5\5\5=\n\5\5\5?\n\5\3\5\3\5\7\5C\n\5\f\5"+
		"\16\5F\13\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f\7\16"+
		"\7v\13\7\5\7x\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f"+
		"\7\16\7\u0086\13\7\3\7\3\7\5\7\u008a\n\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b"+
		"\6\b\u0092\n\b\r\b\16\b\u0093\3\b\3\b\5\b\u0098\n\b\3\t\6\t\u009b\n\t"+
		"\r\t\16\t\u009c\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b7\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d7\n\n\f\n\16\n\u00da\13\n"+
		"\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2\7\3\2\27\30\3\2\35\37\4\2\33\33"+
		"  \3\2!&\3\2\'(\2\u00f7\2\24\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b(\3\2"+
		"\2\2\n^\3\2\2\2\f\u008c\3\2\2\2\16\u0097\3\2\2\2\20\u009a\3\2\2\2\22\u00b6"+
		"\3\2\2\2\24\25\5\20\t\2\25\26\b\2\1\2\26\27\7\2\2\3\27\3\3\2\2\2\30\33"+
		"\5\6\4\2\31\33\5\b\5\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34!\7"+
		",\2\2\35\36\7\3\2\2\36 \7,\2\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\4\2\2%&\5\n\6\2&\'\7\5\2\2\'\7\3\2\2"+
		"\2(>\7\6\2\2)?\7\7\2\2*+\7,\2\2+8\7\b\2\2,-\7,\2\2-.\7\4\2\2.\65\5\n\6"+
		"\2/\60\7\3\2\2\60\61\7,\2\2\61\62\7\4\2\2\62\64\5\n\6\2\63/\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28,\3"+
		"\2\2\289\3\2\2\29:\3\2\2\2:<\7\t\2\2;=\5\n\6\2<;\3\2\2\2<=\3\2\2\2=?\3"+
		"\2\2\2>)\3\2\2\2>*\3\2\2\2?@\3\2\2\2@D\7\n\2\2AC\5\6\4\2BA\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\f\7\2HG\3\2\2\2IL\3"+
		"\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\13\2\2N\t\3\2\2\2O"+
		"_\7\f\2\2P_\7\r\2\2Q_\7\16\2\2RS\7\17\2\2ST\7)\2\2TU\7\20\2\2U_\5\n\6"+
		"\2VX\7\21\2\2WY\5\6\4\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\]\7\13\2\2]_\3\2\2\2^O\3\2\2\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^V\3"+
		"\2\2\2_\13\3\2\2\2`a\7\22\2\2ab\5\22\n\2bc\7\4\2\2cf\5\16\b\2de\7\23\2"+
		"\2eg\5\16\b\2fd\3\2\2\2fg\3\2\2\2g\u008d\3\2\2\2hi\7\24\2\2ij\5\22\n\2"+
		"jk\7\4\2\2kl\5\16\b\2l\u008d\3\2\2\2mn\7,\2\2nw\7\b\2\2ot\5\22\n\2pq\7"+
		"\3\2\2qs\5\22\n\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt"+
		"\3\2\2\2wo\3\2\2\2wx\3\2\2\2xy\3\2\2\2y\u008a\7\25\2\2z{\5\22\n\2{|\7"+
		"\26\2\2|}\5\22\n\2}\u008a\3\2\2\2~\177\t\2\2\2\177\u0084\5\22\n\2\u0080"+
		"\u0081\7\3\2\2\u0081\u0083\5\22\n\2\u0082\u0080\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008a\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u008a\5\22\n\2\u0089m\3\2\2"+
		"\2\u0089z\3\2\2\2\u0089~\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u008d\7\5\2\2\u008c`\3\2\2\2\u008ch\3\2\2\2\u008c\u0089\3\2\2"+
		"\2\u008d\r\3\2\2\2\u008e\u0098\5\f\7\2\u008f\u0091\7\n\2\2\u0090\u0092"+
		"\5\f\7\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u0098\3"+
		"\2\2\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0098\17\3\2\2\2\u0099"+
		"\u009b\5\22\n\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\t\1\2\u009f"+
		"\21\3\2\2\2\u00a0\u00a1\b\n\1\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\n\6"+
		"\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5\22\n\r\u00a5\u00b7\3\2\2\2\u00a6"+
		"\u00a7\7\33\2\2\u00a7\u00a8\5\22\n\f\u00a8\u00a9\b\n\1\2\u00a9\u00b7\3"+
		"\2\2\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5\22\n\13\u00ac\u00ad\b\n\1\2"+
		"\u00ad\u00b7\3\2\2\2\u00ae\u00af\7)\2\2\u00af\u00b7\b\n\1\2\u00b0\u00b1"+
		"\7*\2\2\u00b1\u00b7\b\n\1\2\u00b2\u00b3\7+\2\2\u00b3\u00b7\b\n\1\2\u00b4"+
		"\u00b5\7,\2\2\u00b5\u00b7\b\n\1\2\u00b6\u00a0\3\2\2\2\u00b6\u00a6\3\2"+
		"\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00d8\3\2\2\2\u00b8\u00b9\f\n"+
		"\2\2\u00b9\u00ba\t\3\2\2\u00ba\u00bb\5\22\n\13\u00bb\u00bc\b\n\1\2\u00bc"+
		"\u00d7\3\2\2\2\u00bd\u00be\f\t\2\2\u00be\u00bf\t\4\2\2\u00bf\u00c0\5\22"+
		"\n\n\u00c0\u00c1\b\n\1\2\u00c1\u00d7\3\2\2\2\u00c2\u00c3\f\b\2\2\u00c3"+
		"\u00c4\t\5\2\2\u00c4\u00c5\5\22\n\t\u00c5\u00c6\b\n\1\2\u00c6\u00d7\3"+
		"\2\2\2\u00c7\u00c8\f\7\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\5\22\n\b\u00ca"+
		"\u00cb\b\n\1\2\u00cb\u00d7\3\2\2\2\u00cc\u00cd\f\17\2\2\u00cd\u00ce\7"+
		"\17\2\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\b\n\1\2"+
		"\u00d1\u00d7\3\2\2\2\u00d2\u00d3\f\16\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5"+
		"\7,\2\2\u00d5\u00d7\b\n\1\2\u00d6\u00b8\3\2\2\2\u00d6\u00bd\3\2\2\2\u00d6"+
		"\u00c2\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00d2\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\23\3\2\2\2\u00da\u00d8\3\2\2\2\30\32!\658<>DJZ^ftw\u0084\u0089\u008c"+
		"\u0093\u0097\u009c\u00b6\u00d6\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}