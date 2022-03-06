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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, CHAR_CONSTANT=40, ID=41, COMMENT=42, TRASH=43;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefList = 2, RULE_paramsList = 3, 
		RULE_type = 4, RULE_structFields = 5, RULE_primitiveType = 6, RULE_statement = 7, 
		RULE_expressionList = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefList", "paramsList", "type", "structFields", 
			"primitiveType", "statement", "expressionList", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "';'", "'}'", "','", 
			"'['", "']'", "'struct {'", "'int'", "'double'", "'char'", "'while'", 
			"'if'", "'else'", "'='", "'print'", "'input'", "'return'", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "ID", "COMMENT", 
			"TRASH"
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
		public Program ast;
		public List<Definition> def = new ArrayList<Definition>();
		public List<Statement> funcDefBody = new ArrayList<Statement>();
		public List<String> varDefNames = new ArrayList<String>();;
		public DefinitionContext d;
		public Token a;
		public Token m;
		public VarDefListContext v1;
		public StatementContext st;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<VarDefListContext> varDefList() {
			return getRuleContexts(VarDefListContext.class);
		}
		public VarDefListContext varDefList(int i) {
			return getRuleContext(VarDefListContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					((ProgramContext)_localctx).d = definition();
					_localctx.def.addAll(((ProgramContext)_localctx).d.ast);
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			((ProgramContext)_localctx).a = match(T__0);
			setState(29);
			((ProgramContext)_localctx).m = match(T__1);
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
			setState(32);
			match(T__4);
			setState(33);
			match(T__5);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					((ProgramContext)_localctx).v1 = varDefList();
					_localctx.funcDefBody.addAll(((ProgramContext)_localctx).v1.ast);
					setState(36);
					match(T__6);
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(43);
				((ProgramContext)_localctx).st = statement();
				_localctx.funcDefBody.addAll(((ProgramContext)_localctx).st.ast);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__7);
			_localctx.def.add(
			            new FuncDefinition(
			                _localctx.funcDefBody,
			                (((ProgramContext)_localctx).m!=null?((ProgramContext)_localctx).m.getText():null),
			                new FunctionType(
			                    VoidType.getInstance(),
			                    new ArrayList<VarDefinition>(),
			                    ((ProgramContext)_localctx).a.getLine(),
			                    ((ProgramContext)_localctx).a.getCharPositionInLine()
			                ),
			                ((ProgramContext)_localctx).a.getLine(),
			                ((ProgramContext)_localctx).a.getCharPositionInLine()));
			        
			((ProgramContext)_localctx).ast =  new Program(_localctx.def, ((ProgramContext)_localctx).a.getLine(), ((ProgramContext)_localctx).a.getCharPositionInLine());
			setState(54);
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
		public List<Definition> ast = new ArrayList<Definition>();
		public List<Statement> funcDefinitionBody = new ArrayList<Statement>();
		public List<VarDefinition> functionTypeParams = new ArrayList<VarDefinition>();
		public Token a;
		public Token ID;
		public ParamsListContext v;
		public PrimitiveTypeContext pt;
		public VarDefListContext v1;
		public StatementContext st;
		public VarDefListContext vD;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParamsListContext paramsList() {
			return getRuleContext(ParamsListContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<VarDefListContext> varDefList() {
			return getRuleContexts(VarDefListContext.class);
		}
		public VarDefListContext varDefList(int i) {
			return getRuleContext(VarDefListContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((DefinitionContext)_localctx).a = match(T__0);
				setState(57);
				((DefinitionContext)_localctx).ID = match(ID);
				setState(58);
				match(T__2);
				setState(59);
				((DefinitionContext)_localctx).v = paramsList();
				_localctx.functionTypeParams.addAll(((DefinitionContext)_localctx).v.ast);
				setState(61);
				match(T__3);
				setState(62);
				match(T__4);
				Type ty = VoidType.getInstance(); 
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
					{
					setState(64);
					((DefinitionContext)_localctx).pt = primitiveType();
					ty = ((DefinitionContext)_localctx).pt.ast;
					}
				}

				setState(69);
				match(T__5);
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						((DefinitionContext)_localctx).v1 = varDefList();
						_localctx.funcDefinitionBody.addAll(((DefinitionContext)_localctx).v1.ast);
						setState(72);
						match(T__6);
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(79);
					((DefinitionContext)_localctx).st = statement();
					_localctx.funcDefinitionBody.addAll(((DefinitionContext)_localctx).st.ast);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(T__7);

				            _localctx.ast.add(
				                new FuncDefinition(
				                    _localctx.funcDefinitionBody,
				                    (((DefinitionContext)_localctx).ID!=null?((DefinitionContext)_localctx).ID.getText():null),
				                    new FunctionType(
				                        ty,
				                        _localctx.functionTypeParams,
				                        ((DefinitionContext)_localctx).ID.getLine(),
				                        ((DefinitionContext)_localctx).ID.getCharPositionInLine()
				                    ),
				                    ((DefinitionContext)_localctx).ID.getLine(),
				                    ((DefinitionContext)_localctx).ID.getCharPositionInLine()
				                )
				            );
				            
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((DefinitionContext)_localctx).vD = varDefList();
				_localctx.ast.addAll(((DefinitionContext)_localctx).vD.ast);
				setState(92);
				match(T__6);
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

	public static class VarDefListContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public List<String> variableDefNames = new ArrayList<String>();
		public Token ID1;
		public Token ID2;
		public TypeContext ty;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefListContext varDefList() throws RecognitionException {
		VarDefListContext _localctx = new VarDefListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((VarDefListContext)_localctx).ID1 = match(ID);
			_localctx.variableDefNames.add((((VarDefListContext)_localctx).ID1!=null?((VarDefListContext)_localctx).ID1.getText():null));
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(98);
				match(T__8);
				setState(99);
				((VarDefListContext)_localctx).ID2 = match(ID);
				_localctx.variableDefNames.add((((VarDefListContext)_localctx).ID2!=null?((VarDefListContext)_localctx).ID2.getText():null));
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__4);
			setState(107);
			((VarDefListContext)_localctx).ty = type();

			            for (String v :_localctx.variableDefNames)
			                _localctx.ast.add(
			                    new VarDefinition(
			                        v,
			                        ((VarDefListContext)_localctx).ty.ast,
			                        ((VarDefListContext)_localctx).ID1.getLine(),
			                        ((VarDefListContext)_localctx).ID1.getCharPositionInLine()
			                    )
			                );
			        
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

	public static class ParamsListContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID1;
		public PrimitiveTypeContext ty1;
		public Token ID2;
		public PrimitiveTypeContext ty2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<PrimitiveTypeContext> primitiveType() {
			return getRuleContexts(PrimitiveTypeContext.class);
		}
		public PrimitiveTypeContext primitiveType(int i) {
			return getRuleContext(PrimitiveTypeContext.class,i);
		}
		public ParamsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParamsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsListContext paramsList() throws RecognitionException {
		ParamsListContext _localctx = new ParamsListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(110);
				((ParamsListContext)_localctx).ID1 = match(ID);
				setState(111);
				match(T__4);
				setState(112);
				((ParamsListContext)_localctx).ty1 = primitiveType();

				        _localctx.ast.add(
				            new VarDefinition(
				                (((ParamsListContext)_localctx).ID1!=null?((ParamsListContext)_localctx).ID1.getText():null),
				                ((ParamsListContext)_localctx).ty1.ast,
				                ((ParamsListContext)_localctx).ID1.getLine(),
				                ((ParamsListContext)_localctx).ID1.getCharPositionInLine()
				            )
				        );
				    
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(114);
					match(T__8);
					setState(115);
					((ParamsListContext)_localctx).ID2 = match(ID);
					setState(116);
					match(T__4);
					setState(117);
					((ParamsListContext)_localctx).ty2 = primitiveType();

					        _localctx.ast.add(
					            new VarDefinition(
					                (((ParamsListContext)_localctx).ID2!=null?((ParamsListContext)_localctx).ID2.getText():null),
					                ((ParamsListContext)_localctx).ty2.ast,
					                ((ParamsListContext)_localctx).ID2.getLine(),
					                ((ParamsListContext)_localctx).ID2.getCharPositionInLine()
					            )
					        );
					    
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext p;
		public Token INT_CONSTANT;
		public TypeContext t;
		public Token s;
		public StructFieldsContext fields;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
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
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((TypeContext)_localctx).p = primitiveType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).p.ast; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__9);
				setState(131);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(132);
				match(T__10);
				setState(133);
				((TypeContext)_localctx).t = type();

				            ((TypeContext)_localctx).ast =  new ArrayType(
				                LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),
				                ((TypeContext)_localctx).t.ast,
				                ((TypeContext)_localctx).INT_CONSTANT.getLine(),
				                ((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine()
				            );
				        
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				((TypeContext)_localctx).s = match(T__11);
				setState(137);
				((TypeContext)_localctx).fields = structFields();
				setState(138);
				match(T__7);

				            ((TypeContext)_localctx).ast =  new RecordType(
				                ((TypeContext)_localctx).fields.struct,
				                ((TypeContext)_localctx).s.getLine(),
				                ((TypeContext)_localctx).s.getCharPositionInLine()
				            );
				        
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

	public static class StructFieldsContext extends ParserRuleContext {
		public List<RecordField> struct = new ArrayList<RecordField>();
		public List<String> names = new ArrayList<String>();
		public Token ID1;
		public Token ID2;
		public TypeContext t;
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
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(143);
				((StructFieldsContext)_localctx).ID1 = match(ID);
				_localctx.names.add((((StructFieldsContext)_localctx).ID1!=null?((StructFieldsContext)_localctx).ID1.getText():null));
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(145);
					match(T__8);
					setState(146);
					((StructFieldsContext)_localctx).ID2 = match(ID);
					_localctx.names.add((((StructFieldsContext)_localctx).ID2!=null?((StructFieldsContext)_localctx).ID2.getText():null));
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__4);
				setState(154);
				((StructFieldsContext)_localctx).t = type();

				            for(String v: _localctx.names)
				                _localctx.struct.add(
				                    new RecordField(
				                        v,
				                        ((StructFieldsContext)_localctx).t.ast,
				                        ((StructFieldsContext)_localctx).ID1.getLine(),
				                        ((StructFieldsContext)_localctx).ID1.getCharPositionInLine()
				                    )
				                );
				            ((StructFieldsContext)_localctx).names =  new ArrayList<String>();
				        
				setState(156);
				match(T__6);
				}
				}
				setState(162);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type ast;
		public Token i;
		public Token d;
		public Token c;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primitiveType);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((PrimitiveTypeContext)_localctx).i = match(T__12);
				 ((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((PrimitiveTypeContext)_localctx).d = match(T__13);
				 ((PrimitiveTypeContext)_localctx).ast =  DoubleType.getInstance();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((PrimitiveTypeContext)_localctx).c = match(T__14);
				 ((PrimitiveTypeContext)_localctx).ast =  CharType.getInstance();
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
		public List<Statement> ast = new ArrayList<Statement>();
		public List<Statement> whileBody = new ArrayList<Statement>();
		public List<Statement> ifBody = new ArrayList<Statement>();
		public List<Statement> elseBody = new ArrayList<Statement>();
		public List<Expression> functionParams = new ArrayList<Expression>();
		public ExpressionContext exp;
		public StatementContext st;
		public StatementContext st1;
		public StatementContext st2;
		public StatementContext st3;
		public StatementContext st4;
		public Token ID;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__15);
				setState(172);
				((StatementContext)_localctx).exp = expression(0);
				setState(173);
				match(T__4);
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(174);
					match(T__5);
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(175);
						((StatementContext)_localctx).st = statement();
						_localctx.whileBody.addAll(((StatementContext)_localctx).st.ast);
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(183);
					match(T__7);
					}
					break;
				case T__2:
				case T__15:
				case T__16:
				case T__19:
				case T__20:
				case T__21:
				case T__23:
				case T__24:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					{
					setState(184);
					((StatementContext)_localctx).st1 = statement();
					_localctx.whileBody.addAll(((StatementContext)_localctx).st1.ast);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

				                _localctx.ast.add(
				                    new WhileLoop(
				                        _localctx.whileBody,
				                        ((StatementContext)_localctx).exp.ast,
				                        ((StatementContext)_localctx).exp.ast.getLine(),
				                        ((StatementContext)_localctx).exp.ast.getColumn()
				                    )
				                );
				            
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__16);
				setState(192);
				((StatementContext)_localctx).exp = expression(0);
				setState(193);
				match(T__4);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(194);
					match(T__5);
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(195);
						((StatementContext)_localctx).st1 = statement();
						_localctx.ifBody.addAll(((StatementContext)_localctx).st1.ast);
						}
						}
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(203);
					match(T__7);
					}
					break;
				case T__2:
				case T__15:
				case T__16:
				case T__19:
				case T__20:
				case T__21:
				case T__23:
				case T__24:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					setState(204);
					((StatementContext)_localctx).st2 = statement();
					_localctx.ifBody.addAll(((StatementContext)_localctx).st2.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(209);
					match(T__17);
					setState(223);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(210);
						match(T__5);
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
							{
							{
							setState(211);
							((StatementContext)_localctx).st3 = statement();
							_localctx.elseBody.addAll(((StatementContext)_localctx).st3.ast);
							}
							}
							setState(218);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(219);
						match(T__7);
						}
						break;
					case T__2:
					case T__15:
					case T__16:
					case T__19:
					case T__20:
					case T__21:
					case T__23:
					case T__24:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case ID:
						{
						setState(220);
						((StatementContext)_localctx).st4 = statement();
						_localctx.elseBody.addAll(((StatementContext)_localctx).st4.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				_localctx.ast.add(
				                new If_Else(
				                    _localctx.ifBody,
				                    _localctx.elseBody,
				                    ((StatementContext)_localctx).exp.ast,
				                    ((StatementContext)_localctx).exp.ast.getLine(),
				                    ((StatementContext)_localctx).exp.ast.getColumn()
				                )
				            );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				((StatementContext)_localctx).ID = match(ID);
				setState(230);
				match(T__2);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(231);
					((StatementContext)_localctx).exp1 = expression(0);
					_localctx.functionParams.add(((StatementContext)_localctx).exp1.ast);
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(233);
						match(T__8);
						{
						setState(234);
						((StatementContext)_localctx).exp2 = expression(0);
						_localctx.functionParams.add(((StatementContext)_localctx).exp2.ast);
						}
						}
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(244);
				match(T__3);
				setState(245);
				match(T__6);
				_localctx.ast.add(
				            new FunctionInvocation(
				                (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null),
				                _localctx.functionParams,
				                ((StatementContext)_localctx).ID.getLine(),
				                ((StatementContext)_localctx).ID.getCharPositionInLine()+1)
				            );
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				((StatementContext)_localctx).exp1 = expression(0);
				setState(248);
				match(T__18);
				setState(249);
				((StatementContext)_localctx).exp2 = expression(0);
				setState(250);
				match(T__6);

				            _localctx.ast.add(new Assignment(
				                ((StatementContext)_localctx).exp1.ast,
				                ((StatementContext)_localctx).exp2.ast,
				                ((StatementContext)_localctx).exp1.ast.getLine(),
				                ((StatementContext)_localctx).exp1.ast.getColumn()
				            ));
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(T__19);
				setState(254);
				((StatementContext)_localctx).exp1 = expression(0);

				            _localctx.ast.add(new Print(
				                ((StatementContext)_localctx).exp1.ast,
				                ((StatementContext)_localctx).exp1.ast.getLine(),
				                ((StatementContext)_localctx).exp1.ast.getColumn()
				            ));
				        
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(256);
					match(T__8);
					setState(257);
					((StatementContext)_localctx).exp2 = expression(0);

					                _localctx.ast.add(new Print(
					                    ((StatementContext)_localctx).exp2.ast,
					                    ((StatementContext)_localctx).exp2.ast.getLine(),
					                    ((StatementContext)_localctx).exp2.ast.getColumn()
					                ));
					            
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(T__20);
				setState(268);
				((StatementContext)_localctx).exp1 = expression(0);
				setState(269);
				match(T__6);

				            _localctx.ast.add(new Input(
				                ((StatementContext)_localctx).exp1.ast,
				                ((StatementContext)_localctx).exp1.ast.getLine(),
				                ((StatementContext)_localctx).exp1.ast.getColumn()
				            ));
				        
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(271);
					match(T__8);
					setState(272);
					((StatementContext)_localctx).exp2 = expression(0);
					setState(273);
					match(T__6);

					                _localctx.ast.add(new Input(
					                    ((StatementContext)_localctx).exp2.ast,
					                    ((StatementContext)_localctx).exp2.ast.getLine(),
					                    ((StatementContext)_localctx).exp2.ast.getColumn()
					                ));
					            
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				match(T__21);
				setState(282);
				((StatementContext)_localctx).e = expression(0);
				setState(283);
				match(T__6);

				            _localctx.ast.add(new Return(
				                ((StatementContext)_localctx).e.ast, ((StatementContext)_localctx).e.ast.getLine(),((StatementContext)_localctx).e.ast.getColumn()
				            ));
				        
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ExpressionListContext)_localctx).exp1 = expression(0);
			 _localctx.ast.add(((ExpressionListContext)_localctx).exp1.ast); 
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(290);
				match(T__8);
				setState(291);
				((ExpressionListContext)_localctx).exp2 = expression(0);
				 _localctx.ast.add(((ExpressionListContext)_localctx).exp2.ast); 
				}
				}
				setState(298);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> params = new ArrayList<Expression>();
		public ExpressionContext exp1;
		public ExpressionContext exp;
		public Token ID;
		public ExpressionContext exp2;
		public Token a;
		public PrimitiveTypeContext t;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(300);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(301);
				match(T__2);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(302);
					((ExpressionContext)_localctx).exp1 = expression(0);
					_localctx.params.add(((ExpressionContext)_localctx).exp1.ast);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(304);
						match(T__8);
						setState(305);
						((ExpressionContext)_localctx).exp2 = expression(0);
						_localctx.params.add(((ExpressionContext)_localctx).exp2.ast);
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(315);
				match(T__3);

				            ((ExpressionContext)_localctx).ast =  new FunctionInvocation(
				                (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                _localctx.params,
				                ((ExpressionContext)_localctx).ID.getLine(),
				                ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1
				            );
				        
				}
				break;
			case 2:
				{
				setState(317);
				match(T__2);
				setState(318);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(319);
				match(T__3);

				            ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast;
				        
				}
				break;
			case 3:
				{
				setState(322);
				((ExpressionContext)_localctx).a = match(T__2);
				setState(323);
				((ExpressionContext)_localctx).t = primitiveType();
				setState(324);
				match(T__3);
				setState(325);
				((ExpressionContext)_localctx).exp = expression(11);

				            ((ExpressionContext)_localctx).ast =  new Cast(
				                ((ExpressionContext)_localctx).exp.ast,
				                ((ExpressionContext)_localctx).t.ast,
				                ((ExpressionContext)_localctx).a.getLine(),
				                ((ExpressionContext)_localctx).a.getCharPositionInLine()
				            );
				        
				}
				break;
			case 4:
				{
				setState(328);
				match(T__23);
				setState(329);
				((ExpressionContext)_localctx).exp = expression(10);

				            ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				                ((ExpressionContext)_localctx).exp.ast,
				                ((ExpressionContext)_localctx).exp.ast.getLine(),
				                ((ExpressionContext)_localctx).exp.ast.getColumn()
				            );
				        
				}
				break;
			case 5:
				{
				setState(332);
				match(T__24);
				setState(333);
				((ExpressionContext)_localctx).exp = expression(9);

				            ((ExpressionContext)_localctx).ast =  new Not(
				                ((ExpressionContext)_localctx).exp.ast,
				                ((ExpressionContext)_localctx).exp.ast.getLine(),
				                ((ExpressionContext)_localctx).exp.ast.getColumn()
				            );
				        
				}
				break;
			case 6:
				{
				setState(336);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new IntLiteral(
				                LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1
				            );
				        
				}
				break;
			case 7:
				{
				setState(338);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new RealLiteral(
				                LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1
				            );

				        
				}
				break;
			case 8:
				{
				setState(340);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);

				            ((ExpressionContext)_localctx).ast =  new CharLiteral(
				                LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1
				            );
				        
				}
				break;
			case 9:
				{
				setState(342);
				((ExpressionContext)_localctx).ID = match(ID);

				            ((ExpressionContext)_localctx).ast =  new Variable(
				                (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				                ((ExpressionContext)_localctx).ID.getLine(),
				                ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1
				            );
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(346);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(347);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(348);
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
						setState(351);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(352);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(353);
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
						setState(356);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(357);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
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
						setState(361);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(362);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
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
						setState(366);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(367);
						match(T__9);
						setState(368);
						((ExpressionContext)_localctx).exp2 = expression(0);
						setState(369);
						match(T__10);

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
						setState(372);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(373);
						match(T__22);
						setState(374);
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
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\2\7\2\61\n\2\f\2\16\2"+
		"\64\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3\3\3\3\3\7"+
		"\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\5\5\u0080\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1"+
		"\n\7\f\7\16\7\u00a4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00be\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c9\n\t\f\t\16"+
		"\t\u00cc\13\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d9"+
		"\n\t\f\t\16\t\u00dc\13\t\3\t\3\t\3\t\3\t\5\t\u00e2\n\t\5\t\u00e4\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f0\n\t\f\t\16\t\u00f3\13"+
		"\t\5\t\u00f5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u0107\n\t\f\t\16\t\u010a\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0117\n\t\f\t\16\t\u011a\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0121\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0129\n\n\f\n\16\n\u012c"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0137\n\13\f\13"+
		"\16\13\u013a\13\13\5\13\u013c\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u015b\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u017b\n\13\f\13\16\13\u017e\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&\'\2\u01a7\2\33\3\2\2\2\4"+
		"`\3\2\2\2\6b\3\2\2\2\b\177\3\2\2\2\n\u008f\3\2\2\2\f\u00a2\3\2\2\2\16"+
		"\u00ab\3\2\2\2\20\u0120\3\2\2\2\22\u0122\3\2\2\2\24\u015a\3\2\2\2\26\27"+
		"\5\4\3\2\27\30\b\2\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\3\2\2\37 \7"+
		"\4\2\2 !\7\5\2\2!\"\7\6\2\2\"#\7\7\2\2#*\7\b\2\2$%\5\6\4\2%&\b\2\1\2&"+
		"\'\7\t\2\2\')\3\2\2\2($\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62\3\2"+
		"\2\2,*\3\2\2\2-.\5\20\t\2./\b\2\1\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\n"+
		"\2\2\66\67\b\2\1\2\678\b\2\1\289\7\2\2\39\3\3\2\2\2:;\7\3\2\2;<\7+\2\2"+
		"<=\7\5\2\2=>\5\b\5\2>?\b\3\1\2?@\7\6\2\2@A\7\7\2\2AE\b\3\1\2BC\5\16\b"+
		"\2CD\b\3\1\2DF\3\2\2\2EB\3\2\2\2EF\3\2\2\2FG\3\2\2\2GN\7\b\2\2HI\5\6\4"+
		"\2IJ\b\3\1\2JK\7\t\2\2KM\3\2\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OV\3\2\2\2PN\3\2\2\2QR\5\20\t\2RS\b\3\1\2SU\3\2\2\2TQ\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\n\2\2Z[\b\3\1\2[a\3\2"+
		"\2\2\\]\5\6\4\2]^\b\3\1\2^_\7\t\2\2_a\3\2\2\2`:\3\2\2\2`\\\3\2\2\2a\5"+
		"\3\2\2\2bc\7+\2\2ci\b\4\1\2de\7\13\2\2ef\7+\2\2fh\b\4\1\2gd\3\2\2\2hk"+
		"\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\7\2\2mn\5\n\6\2n"+
		"o\b\4\1\2o\7\3\2\2\2pq\7+\2\2qr\7\7\2\2rs\5\16\b\2s|\b\5\1\2tu\7\13\2"+
		"\2uv\7+\2\2vw\7\7\2\2wx\5\16\b\2xy\b\5\1\2y{\3\2\2\2zt\3\2\2\2{~\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177p\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\b\6\1\2\u0083"+
		"\u0090\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\7(\2\2\u0086\u0087\7\r"+
		"\2\2\u0087\u0088\5\n\6\2\u0088\u0089\b\6\1\2\u0089\u0090\3\2\2\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\n\2\2\u008d\u008e\b"+
		"\6\1\2\u008e\u0090\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0084\3\2\2\2\u008f"+
		"\u008a\3\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7+\2\2\u0092\u0098\b\7\1\2"+
		"\u0093\u0094\7\13\2\2\u0094\u0095\7+\2\2\u0095\u0097\b\7\1\2\u0096\u0093"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\7\2\2\u009c\u009d\5\n"+
		"\6\2\u009d\u009e\b\7\1\2\u009e\u009f\7\t\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u0091\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\r\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00ac"+
		"\b\b\1\2\u00a7\u00a8\7\20\2\2\u00a8\u00ac\b\b\1\2\u00a9\u00aa\7\21\2\2"+
		"\u00aa\u00ac\b\b\1\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\5\24\13\2\u00af"+
		"\u00bd\7\7\2\2\u00b0\u00b6\7\b\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\b"+
		"\t\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00be\7\n\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\b\t\1\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b0\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\b\t\1\2\u00c0\u0121\3\2\2\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\u00c3\5\24\13\2\u00c3\u00d1\7\7\2\2\u00c4\u00ca\7\b\2\2\u00c5\u00c6\5"+
		"\20\t\2\u00c6\u00c7\b\t\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d2\7\n\2\2\u00ce\u00cf\5\20\t\2\u00cf"+
		"\u00d0\b\t\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00ce\3\2"+
		"\2\2\u00d2\u00e3\3\2\2\2\u00d3\u00e1\7\24\2\2\u00d4\u00da\7\b\2\2\u00d5"+
		"\u00d6\5\20\t\2\u00d6\u00d7\b\t\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3"+
		"\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e2\7\n\2\2\u00de\u00df\5\20"+
		"\t\2\u00df\u00e0\b\t\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00d3\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\t\1\2\u00e6\u0121\3\2\2\2\u00e7"+
		"\u00e8\7+\2\2\u00e8\u00f4\7\5\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00f1\b"+
		"\t\1\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\b\t\1\2"+
		"\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00e9\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\6"+
		"\2\2\u00f7\u00f8\7\t\2\2\u00f8\u0121\b\t\1\2\u00f9\u00fa\5\24\13\2\u00fa"+
		"\u00fb\7\25\2\2\u00fb\u00fc\5\24\13\2\u00fc\u00fd\7\t\2\2\u00fd\u00fe"+
		"\b\t\1\2\u00fe\u0121\3\2\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\24\13"+
		"\2\u0101\u0108\b\t\1\2\u0102\u0103\7\13\2\2\u0103\u0104\5\24\13\2\u0104"+
		"\u0105\b\t\1\2\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0107\u010a\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010c\7\t\2\2\u010c\u0121\3\2\2\2\u010d\u010e\7\27"+
		"\2\2\u010e\u010f\5\24\13\2\u010f\u0110\7\t\2\2\u0110\u0118\b\t\1\2\u0111"+
		"\u0112\7\13\2\2\u0112\u0113\5\24\13\2\u0113\u0114\7\t\2\2\u0114\u0115"+
		"\b\t\1\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0121\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011c\7\30\2\2\u011c\u011d\5\24\13\2\u011d\u011e\7\t\2\2\u011e"+
		"\u011f\b\t\1\2\u011f\u0121\3\2\2\2\u0120\u00ad\3\2\2\2\u0120\u00c1\3\2"+
		"\2\2\u0120\u00e7\3\2\2\2\u0120\u00f9\3\2\2\2\u0120\u00ff\3\2\2\2\u0120"+
		"\u010d\3\2\2\2\u0120\u011b\3\2\2\2\u0121\21\3\2\2\2\u0122\u0123\5\24\13"+
		"\2\u0123\u012a\b\n\1\2\u0124\u0125\7\13\2\2\u0125\u0126\5\24\13\2\u0126"+
		"\u0127\b\n\1\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\23\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\b\13\1\2\u012e\u012f\7+\2\2\u012f\u013b\7\5\2\2\u0130"+
		"\u0131\5\24\13\2\u0131\u0138\b\13\1\2\u0132\u0133\7\13\2\2\u0133\u0134"+
		"\5\24\13\2\u0134\u0135\b\13\1\2\u0135\u0137\3\2\2\2\u0136\u0132\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0130\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7\6\2\2\u013e\u015b\b\13\1\2\u013f\u0140\7"+
		"\5\2\2\u0140\u0141\5\24\13\2\u0141\u0142\7\6\2\2\u0142\u0143\b\13\1\2"+
		"\u0143\u015b\3\2\2\2\u0144\u0145\7\5\2\2\u0145\u0146\5\16\b\2\u0146\u0147"+
		"\7\6\2\2\u0147\u0148\5\24\13\r\u0148\u0149\b\13\1\2\u0149\u015b\3\2\2"+
		"\2\u014a\u014b\7\32\2\2\u014b\u014c\5\24\13\f\u014c\u014d\b\13\1\2\u014d"+
		"\u015b\3\2\2\2\u014e\u014f\7\33\2\2\u014f\u0150\5\24\13\13\u0150\u0151"+
		"\b\13\1\2\u0151\u015b\3\2\2\2\u0152\u0153\7(\2\2\u0153\u015b\b\13\1\2"+
		"\u0154\u0155\7)\2\2\u0155\u015b\b\13\1\2\u0156\u0157\7*\2\2\u0157\u015b"+
		"\b\13\1\2\u0158\u0159\7+\2\2\u0159\u015b\b\13\1\2\u015a\u012d\3\2\2\2"+
		"\u015a\u013f\3\2\2\2\u015a\u0144\3\2\2\2\u015a\u014a\3\2\2\2\u015a\u014e"+
		"\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0156\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015b\u017c\3\2\2\2\u015c\u015d\f\n\2\2\u015d\u015e\t\2"+
		"\2\2\u015e\u015f\5\24\13\13\u015f\u0160\b\13\1\2\u0160\u017b\3\2\2\2\u0161"+
		"\u0162\f\t\2\2\u0162\u0163\t\3\2\2\u0163\u0164\5\24\13\n\u0164\u0165\b"+
		"\13\1\2\u0165\u017b\3\2\2\2\u0166\u0167\f\b\2\2\u0167\u0168\t\4\2\2\u0168"+
		"\u0169\5\24\13\t\u0169\u016a\b\13\1\2\u016a\u017b\3\2\2\2\u016b\u016c"+
		"\f\7\2\2\u016c\u016d\t\5\2\2\u016d\u016e\5\24\13\b\u016e\u016f\b\13\1"+
		"\2\u016f\u017b\3\2\2\2\u0170\u0171\f\17\2\2\u0171\u0172\7\f\2\2\u0172"+
		"\u0173\5\24\13\2\u0173\u0174\7\r\2\2\u0174\u0175\b\13\1\2\u0175\u017b"+
		"\3\2\2\2\u0176\u0177\f\16\2\2\u0177\u0178\7\31\2\2\u0178\u0179\7+\2\2"+
		"\u0179\u017b\b\13\1\2\u017a\u015c\3\2\2\2\u017a\u0161\3\2\2\2\u017a\u0166"+
		"\3\2\2\2\u017a\u016b\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0176\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\25\3\2\2"+
		"\2\u017e\u017c\3\2\2\2\"\33*\62ENV`i|\177\u008f\u0098\u00a2\u00ab\u00b6"+
		"\u00bd\u00ca\u00d1\u00da\u00e1\u00e3\u00f1\u00f4\u0108\u0118\u0120\u012a"+
		"\u0138\u013b\u015a\u017a\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}