// Generated from C:/Users/Vinicius/Desktop/asvgg\asvgg.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asvggLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SE=1, SENAO=2, INTEIRO=3, REAL=4, CARACTERE=5, RETORNE=6, VAZIA=7, ENQUANTO=8, 
		PARA=9, NAO=10, E=11, OU=12, OPA=13, OPL=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SE", "SENAO", "INTEIRO", "REAL", "CARACTERE", "RETORNE", "VAZIA", "ENQUANTO", 
			"PARA", "NAO", "E", "OU", "OPA", "OPL", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'se'", "'senao'", "'intr'", "'real'", "'crtr'", "'retorne'", "'vazia'", 
			"'enquanto'", "'para'", null, "'e'", "'ou'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SE", "SENAO", "INTEIRO", "REAL", "CARACTERE", "RETORNE", "VAZIA", 
			"ENQUANTO", "PARA", "NAO", "E", "OU", "OPA", "OPL", "ID", "WS"
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


	public asvggLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "asvgg.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17m\n\17\3\20\6\20p\n\20\r\20\16\20q\3\20"+
		"\7\20u\n\20\f\20\16\20x\13\20\3\21\6\21{\n\21\r\21\16\21|\3\21\3\21\2"+
		"\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22\3\2\7\7\2\'\',-//\61\61``\4\2>>@@\3\2c|\3\2\62;\4\2\13\f"+
		"\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\3#\3\2\2\2\5&\3\2\2\2\7,\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r;\3"+
		"\2\2\2\17C\3\2\2\2\21I\3\2\2\2\23R\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31"+
		"_\3\2\2\2\33b\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!z\3\2\2\2#$\7u\2\2$%\7g"+
		"\2\2%\4\3\2\2\2&\'\7u\2\2\'(\7g\2\2()\7p\2\2)*\7c\2\2*+\7q\2\2+\6\3\2"+
		"\2\2,-\7k\2\2-.\7p\2\2./\7v\2\2/\60\7t\2\2\60\b\3\2\2\2\61\62\7t\2\2\62"+
		"\63\7g\2\2\63\64\7c\2\2\64\65\7n\2\2\65\n\3\2\2\2\66\67\7e\2\2\678\7t"+
		"\2\289\7v\2\29:\7t\2\2:\f\3\2\2\2;<\7t\2\2<=\7g\2\2=>\7v\2\2>?\7q\2\2"+
		"?@\7t\2\2@A\7p\2\2AB\7g\2\2B\16\3\2\2\2CD\7x\2\2DE\7c\2\2EF\7|\2\2FG\7"+
		"k\2\2GH\7c\2\2H\20\3\2\2\2IJ\7g\2\2JK\7p\2\2KL\7s\2\2LM\7w\2\2MN\7c\2"+
		"\2NO\7p\2\2OP\7v\2\2PQ\7q\2\2Q\22\3\2\2\2RS\7r\2\2ST\7c\2\2TU\7t\2\2U"+
		"V\7c\2\2V\24\3\2\2\2WX\7p\2\2XY\7c\2\2Y\\\7q\2\2Z\\\7#\2\2[W\3\2\2\2["+
		"Z\3\2\2\2\\\26\3\2\2\2]^\7g\2\2^\30\3\2\2\2_`\7q\2\2`a\7w\2\2a\32\3\2"+
		"\2\2bc\t\2\2\2c\34\3\2\2\2dm\t\3\2\2ef\7>\2\2fm\7?\2\2gm\7?\2\2hi\7#\2"+
		"\2im\7?\2\2jk\7@\2\2km\7?\2\2ld\3\2\2\2le\3\2\2\2lg\3\2\2\2lh\3\2\2\2"+
		"lj\3\2\2\2m\36\3\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2rv\3\2\2\2su\t\5\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w \3\2\2"+
		"\2xv\3\2\2\2y{\t\6\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\177\b\21\2\2\177\"\3\2\2\2\b\2[lqv|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}