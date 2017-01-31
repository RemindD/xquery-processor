// Generated from XQuery.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, StringLiteral=24, 
		StringConstant=25, Var=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "Letter", "LetterOrDigit", 
		"StringLiteral", "StringConstant", "Var", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc('", "'document('", "')/'", "')//'", "'*'", "'.'", "'..'", 
		"'text()'", "'@'", "'('", "')'", "'/'", "'//'", "'['", "']'", "','", "'='", 
		"'eq'", "'=='", "'is'", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"StringLiteral", "StringConstant", "Var", "WS"
	};
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\6\33\u008f\n\33\r\33\16\33\u0090\3\33\3\33\3\34\3\34\7\34\u0097\n\34"+
		"\f\34\16\34\u009a\13\34\3\35\3\35\3\35\3\36\6\36\u00a0\n\36\r\36\16\36"+
		"\u00a1\3\36\3\36\3\u0090\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\2\63\2\65\32\67\339\34;\35\3\2\6\5\2C\\aac|\7\2//\62;C\\aac|\5\2$$BB"+
		"^^\5\2\13\f\17\17\"\"\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5B\3\2\2\2\7L\3\2\2\2\tO\3\2\2\2\13S\3\2\2\2\rU\3\2"+
		"\2\2\17W\3\2\2\2\21Z\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3"+
		"\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2"+
		"\2\'w\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\u0081\3\2\2\2/\u0084\3\2\2\2\61\u0088"+
		"\3\2\2\2\63\u008a\3\2\2\2\65\u008c\3\2\2\2\67\u0094\3\2\2\29\u009b\3\2"+
		"\2\2;\u009f\3\2\2\2=>\7f\2\2>?\7q\2\2?@\7e\2\2@A\7*\2\2A\4\3\2\2\2BC\7"+
		"f\2\2CD\7q\2\2DE\7e\2\2EF\7w\2\2FG\7o\2\2GH\7g\2\2HI\7p\2\2IJ\7v\2\2J"+
		"K\7*\2\2K\6\3\2\2\2LM\7+\2\2MN\7\61\2\2N\b\3\2\2\2OP\7+\2\2PQ\7\61\2\2"+
		"QR\7\61\2\2R\n\3\2\2\2ST\7,\2\2T\f\3\2\2\2UV\7\60\2\2V\16\3\2\2\2WX\7"+
		"\60\2\2XY\7\60\2\2Y\20\3\2\2\2Z[\7v\2\2[\\\7g\2\2\\]\7z\2\2]^\7v\2\2^"+
		"_\7*\2\2_`\7+\2\2`\22\3\2\2\2ab\7B\2\2b\24\3\2\2\2cd\7*\2\2d\26\3\2\2"+
		"\2ef\7+\2\2f\30\3\2\2\2gh\7\61\2\2h\32\3\2\2\2ij\7\61\2\2jk\7\61\2\2k"+
		"\34\3\2\2\2lm\7]\2\2m\36\3\2\2\2no\7_\2\2o \3\2\2\2pq\7.\2\2q\"\3\2\2"+
		"\2rs\7?\2\2s$\3\2\2\2tu\7g\2\2uv\7s\2\2v&\3\2\2\2wx\7?\2\2xy\7?\2\2y("+
		"\3\2\2\2z{\7k\2\2{|\7u\2\2|*\3\2\2\2}~\7c\2\2~\177\7p\2\2\177\u0080\7"+
		"f\2\2\u0080,\3\2\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083.\3\2"+
		"\2\2\u0084\u0085\7p\2\2\u0085\u0086\7q\2\2\u0086\u0087\7v\2\2\u0087\60"+
		"\3\2\2\2\u0088\u0089\t\2\2\2\u0089\62\3\2\2\2\u008a\u008b\t\3\2\2\u008b"+
		"\64\3\2\2\2\u008c\u008e\7$\2\2\u008d\u008f\n\4\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\7$\2\2\u0093\66\3\2\2\2\u0094\u0098\5\61\31\2\u0095"+
		"\u0097\5\63\32\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u00998\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c"+
		"\7&\2\2\u009c\u009d\5\67\34\2\u009d:\3\2\2\2\u009e\u00a0\t\5\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\36\2\2\u00a4<\3\2\2\2\6\2\u0090"+
		"\u0098\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}