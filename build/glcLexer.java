// Generated from glc.g by ANTLR 4.13.1

	// imports
	import java.util.HashMap;
	import java.util.Map;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class glcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, DO=11, RELATIONAL_OP=12, ASSIGNMENT_OP=13, SEMICOLON=14, CONST=15, 
		VAR=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "RELATIONAL_OP", "ASSIGNMENT_OP", "SEMICOLON", "CONST", 
			"VAR", "WS"
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


		Map<String, Double> vars = new HashMap<>(); // armazena as variáveis e seus valores
		String simbol = ""; // variável do simbolo atual
		String simbolTemp = "";	// variável temporária para a manipulação do simbolo atual
		String rel_op = "";	// operador relacional
		Double res_ae = 1.0; // resultado expressão aritmética


	public glcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "glc.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"N\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"V\b\u000e\u000b\u000e\f\u000eW\u0001\u000f\u0004\u000f[\b\u000f\u000b"+
		"\u000f\f\u000f\\\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0003\u0002\u0000<<>>\u0002"+
		"\u0000AZaz\u0003\u0000\t\n\r\r  f\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000"+
		"\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b"+
		"-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f2\u0001\u0000"+
		"\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000"+
		"\u0015B\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019O"+
		"\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000\u0000\u001dU\u0001\u0000"+
		"\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000"+
		"#$\u0005*\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005/\u0000\u0000"+
		"&\u0004\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\u0006\u0001\u0000"+
		"\u0000\u0000)*\u0005-\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005("+
		"\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\f\u0001"+
		"\u0000\u0000\u0000/0\u0005i\u0000\u000001\u0005f\u0000\u00001\u000e\u0001"+
		"\u0000\u0000\u000023\u0005t\u0000\u000034\u0005h\u0000\u000045\u0005e"+
		"\u0000\u000056\u0005n\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005"+
		"e\u0000\u000089\u0005l\u0000\u00009:\u0005s\u0000\u0000:;\u0005e\u0000"+
		"\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005w\u0000\u0000=>\u0005h\u0000"+
		"\u0000>?\u0005i\u0000\u0000?@\u0005l\u0000\u0000@A\u0005e\u0000\u0000"+
		"A\u0014\u0001\u0000\u0000\u0000BC\u0005d\u0000\u0000CD\u0005o\u0000\u0000"+
		"D\u0016\u0001\u0000\u0000\u0000EN\u0005=\u0000\u0000FG\u0005<\u0000\u0000"+
		"GN\u0005>\u0000\u0000HN\u0007\u0000\u0000\u0000IJ\u0005<\u0000\u0000J"+
		"N\u0005=\u0000\u0000KL\u0005>\u0000\u0000LN\u0005=\u0000\u0000ME\u0001"+
		"\u0000\u0000\u0000MF\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"MI\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000N\u0018\u0001\u0000"+
		"\u0000\u0000OP\u0005:\u0000\u0000PQ\u0005=\u0000\u0000Q\u001a\u0001\u0000"+
		"\u0000\u0000RS\u0005;\u0000\u0000S\u001c\u0001\u0000\u0000\u0000TV\u0002"+
		"09\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\u001e\u0001\u0000\u0000\u0000"+
		"Y[\u0007\u0001\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000] \u0001\u0000"+
		"\u0000\u0000^_\u0007\u0002\u0000\u0000_`\u0006\u0010\u0000\u0000`\"\u0001"+
		"\u0000\u0000\u0000\u0004\u0000MW\\\u0001\u0001\u0010\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}