// Generated from glc.g by ANTLR 4.13.1

	// imports
	import java.util.HashMap;
	import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class glcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, DO=11, RELATIONAL_OP=12, ASSIGNMENT_OP=13, SEMICOLON=14, CONST=15, 
		VAR=16, WS=17;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_attribution = 2, RULE_aritmetic_expression = 3, 
		RULE_condition = 4, RULE_iteration = 5, RULE_relational_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "attribution", "aritmetic_expression", "condition", 
			"iteration", "relational_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'if'", "'then'", "'else'", 
			"'while'", "'do'", null, "':='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IF", "THEN", "ELSE", "WHILE", 
			"DO", "RELATIONAL_OP", "ASSIGNMENT_OP", "SEMICOLON", "CONST", "VAR", 
			"WS"
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
	public String getGrammarFileName() { return "glc.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Double> vars = new HashMap<>(); // armazena as variáveis e seus valores
		String simbol = ""; // variável do simbolo atual
		String simbolTemp = "";	// variável temporária para a manipulação do simbolo atual
		String rel_op = "";	// operador relacional
		Double res_ae = 1.0; // resultado expressão aritmética

	public glcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(14);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(17); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class StatementContext extends ParserRuleContext {
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(glcParser.SEMICOLON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				attribution();
				setState(20);
				match(SEMICOLON);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				condition();

							res_ae = 1.0;
						
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				iteration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionContext extends ParserRuleContext {
		public double v;
		public Token VAR;
		public Aritmetic_expressionContext e;
		public TerminalNode VAR() { return getToken(glcParser.VAR, 0); }
		public TerminalNode ASSIGNMENT_OP() { return getToken(glcParser.ASSIGNMENT_OP, 0); }
		public Aritmetic_expressionContext aritmetic_expression() {
			return getRuleContext(Aritmetic_expressionContext.class,0);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((AttributionContext)_localctx).VAR = match(VAR);

					simbol = (((AttributionContext)_localctx).VAR!=null?((AttributionContext)_localctx).VAR.getText():null);
				
			setState(30);
			match(ASSIGNMENT_OP);
			setState(31);
			((AttributionContext)_localctx).e = aritmetic_expression();

					((AttributionContext)_localctx).v =  ((AttributionContext)_localctx).e.v; 
					if(res_ae == 1) { 
						System.out.println(simbol + " = "  + _localctx.v); 
						vars.put(simbol, _localctx.v);
						//System.out.println(vars.toString());
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
	public static class Aritmetic_expressionContext extends ParserRuleContext {
		public double v;
		public Token CONST;
		public Token VAR;
		public Aritmetic_expressionContext e;
		public TerminalNode CONST() { return getToken(glcParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(glcParser.VAR, 0); }
		public Aritmetic_expressionContext aritmetic_expression() {
			return getRuleContext(Aritmetic_expressionContext.class,0);
		}
		public Aritmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterAritmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitAritmetic_expression(this);
		}
	}

	public final Aritmetic_expressionContext aritmetic_expression() throws RecognitionException {
		Aritmetic_expressionContext _localctx = new Aritmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aritmetic_expression);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(34);
					((Aritmetic_expressionContext)_localctx).CONST = match(CONST);

								((Aritmetic_expressionContext)_localctx).v =  Double.parseDouble((((Aritmetic_expressionContext)_localctx).CONST!=null?((Aritmetic_expressionContext)_localctx).CONST.getText():null));
							
					}
					break;
				case VAR:
					{
					setState(36);
					((Aritmetic_expressionContext)_localctx).VAR = match(VAR);

								simbolTemp = (((Aritmetic_expressionContext)_localctx).VAR!=null?((Aritmetic_expressionContext)_localctx).VAR.getText():null);
								
								if(vars.get(simbolTemp) != null) {
									((Aritmetic_expressionContext)_localctx).v =  vars.get(simbolTemp);
								} else {
									System.out.println("ERRO: Vari�vel " + simbolTemp + " n�o existe.");
								}
							
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(40);
					match(T__0);
					setState(41);
					((Aritmetic_expressionContext)_localctx).e = aritmetic_expression();

								_localctx.v *= ((Aritmetic_expressionContext)_localctx).e.v;
							
					}
					break;
				case T__1:
					{
					setState(44);
					match(T__1);
					setState(45);
					((Aritmetic_expressionContext)_localctx).e = aritmetic_expression();

								if(((Aritmetic_expressionContext)_localctx).e.v == 0) {
									System.out.println("ERRO: Divis�o por 0.");
								} else {
									_localctx.v /= ((Aritmetic_expressionContext)_localctx).e.v;
								}
							
					}
					break;
				case T__2:
					{
					setState(48);
					match(T__2);
					setState(49);
					((Aritmetic_expressionContext)_localctx).e = aritmetic_expression();

								_localctx.v += ((Aritmetic_expressionContext)_localctx).e.v;
							
					}
					break;
				case T__3:
					{
					setState(52);
					match(T__3);
					setState(53);
					((Aritmetic_expressionContext)_localctx).e = aritmetic_expression();

								_localctx.v -= ((Aritmetic_expressionContext)_localctx).e.v;
							
					}
					break;
				case T__5:
				case THEN:
				case DO:
				case RELATIONAL_OP:
				case SEMICOLON:
					break;
				default:
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__4);
				setState(59);
				((Aritmetic_expressionContext)_localctx).e = aritmetic_expression();
				((Aritmetic_expressionContext)_localctx).v =  ((Aritmetic_expressionContext)_localctx).e.v;
				setState(61);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Relational_expressionContext e;
		public TerminalNode IF() { return getToken(glcParser.IF, 0); }
		public TerminalNode THEN() { return getToken(glcParser.THEN, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(glcParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			((ConditionContext)_localctx).e = relational_expression();

					res_ae = ((ConditionContext)_localctx).e.v;
				
			setState(68);
			match(THEN);
			setState(69);
			program();

					if(res_ae == 1) {
						res_ae = 0.0;
					} else {
						res_ae = 1.0;
					}
				
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(71);
				match(ELSE);
				setState(72);
				program();
				}
				break;
			}

					res_ae = 1.0;
				
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
	public static class IterationContext extends ParserRuleContext {
		public Relational_expressionContext e;
		public TerminalNode WHILE() { return getToken(glcParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(glcParser.DO, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitIteration(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(WHILE);
			setState(78);
			((IterationContext)_localctx).e = relational_expression();

					res_ae = ((IterationContext)_localctx).e.v;
				
			setState(80);
			match(DO);
			setState(81);
			program();

					res_ae = 1.0;
				
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
	public static class Relational_expressionContext extends ParserRuleContext {
		public double v;
		public Aritmetic_expressionContext e;
		public TerminalNode RELATIONAL_OP() { return getToken(glcParser.RELATIONAL_OP, 0); }
		public List<Aritmetic_expressionContext> aritmetic_expression() {
			return getRuleContexts(Aritmetic_expressionContext.class);
		}
		public Aritmetic_expressionContext aritmetic_expression(int i) {
			return getRuleContext(Aritmetic_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof glcListener ) ((glcListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((Relational_expressionContext)_localctx).e = aritmetic_expression();

					res_ae = ((Relational_expressionContext)_localctx).e.v;
				
			setState(86);
			match(RELATIONAL_OP);
			setState(87);
			((Relational_expressionContext)_localctx).e = aritmetic_expression();

					((Relational_expressionContext)_localctx).v =  ((Relational_expressionContext)_localctx).e.v; 
					
					if(rel_op.equals("=") && res_ae == _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else if(rel_op.equals("<>") && res_ae != _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else if(rel_op.equals("<") && res_ae < _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else if(rel_op.equals(">") && res_ae > _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else if(rel_op.equals("<") && res_ae <= _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else if(rel_op.equals(">=") && res_ae >= _localctx.v) {
						((Relational_expressionContext)_localctx).v =  1;
					} else {
						((Relational_expressionContext)_localctx).v =  0;
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00039\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"@\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004"+
		"\u0006\b\n\f\u0000\u0000]\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u001a"+
		"\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u0006?\u0001"+
		"\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000"+
		"\fT\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f"+
		"\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002\u0000\u0014"+
		"\u0015\u0005\u000e\u0000\u0000\u0015\u001b\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0003\b\u0004\u0000\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u001b\u0003\n\u0005\u0000\u001a\u0013"+
		"\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0010\u0000\u0000\u001d\u001e\u0006\u0002\uffff\uffff\u0000\u001e"+
		"\u001f\u0005\r\u0000\u0000\u001f \u0003\u0006\u0003\u0000 !\u0006\u0002"+
		"\uffff\uffff\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0005\u000f\u0000"+
		"\u0000#\'\u0006\u0003\uffff\uffff\u0000$%\u0005\u0010\u0000\u0000%\'\u0006"+
		"\u0003\uffff\uffff\u0000&\"\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\'8\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003\u0006"+
		"\u0003\u0000*+\u0006\u0003\uffff\uffff\u0000+9\u0001\u0000\u0000\u0000"+
		",-\u0005\u0002\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0006\u0003\uffff"+
		"\uffff\u0000/9\u0001\u0000\u0000\u000001\u0005\u0003\u0000\u000012\u0003"+
		"\u0006\u0003\u000023\u0006\u0003\uffff\uffff\u000039\u0001\u0000\u0000"+
		"\u000045\u0005\u0004\u0000\u000056\u0003\u0006\u0003\u000067\u0006\u0003"+
		"\uffff\uffff\u000079\u0001\u0000\u0000\u00008(\u0001\u0000\u0000\u0000"+
		"8,\u0001\u0000\u0000\u000080\u0001\u0000\u0000\u000084\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009@\u0001\u0000\u0000\u0000:;\u0005\u0005"+
		"\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0006\u0003\uffff\uffff\u0000"+
		"=>\u0005\u0006\u0000\u0000>@\u0001\u0000\u0000\u0000?&\u0001\u0000\u0000"+
		"\u0000?:\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0007\u0000\u0000BC\u0003\f\u0006\u0000CD\u0006\u0004\uffff\uffff\u0000"+
		"DE\u0005\b\u0000\u0000EF\u0003\u0000\u0000\u0000FI\u0006\u0004\uffff\uffff"+
		"\u0000GH\u0005\t\u0000\u0000HJ\u0003\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0006\u0004"+
		"\uffff\uffff\u0000L\t\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO"+
		"\u0003\f\u0006\u0000OP\u0006\u0005\uffff\uffff\u0000PQ\u0005\u000b\u0000"+
		"\u0000QR\u0003\u0000\u0000\u0000RS\u0006\u0005\uffff\uffff\u0000S\u000b"+
		"\u0001\u0000\u0000\u0000TU\u0003\u0006\u0003\u0000UV\u0006\u0006\uffff"+
		"\uffff\u0000VW\u0005\f\u0000\u0000WX\u0003\u0006\u0003\u0000XY\u0006\u0006"+
		"\uffff\uffff\u0000Y\r\u0001\u0000\u0000\u0000\u0006\u0011\u001a&8?I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}