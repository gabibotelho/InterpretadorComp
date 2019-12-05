// Generated from C:\Users\Carlos\Downloads\interpretadorPN\src\parser\pn.g4 by ANTLR 4.1

package interpretador;
import java.util.Scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pnLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, A_COL=3, F_COL=4, IF=5, OP_COMP=6, FLOAT=7, INTEIRO=8, 
		BOOLEANO=9, STRING=10, OUT=11, IN=12, VAL=13, VALSTRING=14, VALBOOL=15, 
		ID=16, END_CMD=17, EQUALS=18, ASPAS=19, A_PAR=20, F_PAR=21, MORE=22, MIN=23, 
		MULT=24, VIR=25, DIV=26, COMENTARIO=27, BRANCO=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'PROGRAM'", "'ENDPROGRAM'", "'{'", "'}'", "'se'", "'=='", "'float'", 
		"'int'", "'bool'", "'string'", "'out'", "'in'", "VAL", "VALSTRING", "VALBOOL", 
		"ID", "';'", "'='", "'\"'", "'('", "')'", "'+'", "'-'", "'*'", "','", 
		"'/'", "COMENTARIO", "BRANCO"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "A_COL", "F_COL", "IF", "OP_COMP", "FLOAT", "INTEIRO", 
		"BOOLEANO", "STRING", "OUT", "IN", "VAL", "VALSTRING", "VALBOOL", "ID", 
		"END_CMD", "EQUALS", "ASPAS", "A_PAR", "F_PAR", "MORE", "MIN", "MULT", 
		"VIR", "DIV", "COMENTARIO", "BRANCO"
	};


	    Scanner tec = new Scanner(System.in);      
	          
	    void readInt(String str) {}
	    void readStr(String str) {}
	    void readFloat(String str){}
	    void readBool(String str){}
	    
	    void printAll(String str){}
	    void print(String str){}
	    void add(String var, Object value){} 
	    
	    Integer getInt(String str){return null;}
	    
	    


	public pnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 27: BRANCO_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void BRANCO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\36\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\6\16w\n\16\r\16\16\16x\3\16\6\16|\n\16\r\16\16\16}\3\16\3"+
		"\16\6\16\u0082\n\16\r\16\16\16\u0083\5\16\u0086\n\16\5\16\u0088\n\16\3"+
		"\17\3\17\7\17\u008c\n\17\f\17\16\17\u008f\13\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20\3\21\3\21\7\21\u00a0"+
		"\n\21\f\21\16\21\u00a3\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\7\34\u00bd\n\34\f\34\16\34\u00c0\13\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\6\35\u00c8\n\35\r\35\16\35\u00c9\3\35\3\35\4\u008d\u00be\36\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\29\36\3\3\2\6\3\2\62;\4\2"+
		"C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00d6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5C\3\2\2\2\7N\3\2"+
		"\2\2\tP\3\2\2\2\13R\3\2\2\2\rU\3\2\2\2\17X\3\2\2\2\21^\3\2\2\2\23b\3\2"+
		"\2\2\25g\3\2\2\2\27n\3\2\2\2\31r\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2"+
		"\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a8"+
		"\3\2\2\2)\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61"+
		"\u00b2\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2\2\2\67\u00b8\3\2\2\29\u00c7"+
		"\3\2\2\2;<\7R\2\2<=\7T\2\2=>\7Q\2\2>?\7I\2\2?@\7T\2\2@A\7C\2\2AB\7O\2"+
		"\2B\4\3\2\2\2CD\7G\2\2DE\7P\2\2EF\7F\2\2FG\7R\2\2GH\7T\2\2HI\7Q\2\2IJ"+
		"\7I\2\2JK\7T\2\2KL\7C\2\2LM\7O\2\2M\6\3\2\2\2NO\7}\2\2O\b\3\2\2\2PQ\7"+
		"\177\2\2Q\n\3\2\2\2RS\7u\2\2ST\7g\2\2T\f\3\2\2\2UV\7?\2\2VW\7?\2\2W\16"+
		"\3\2\2\2XY\7h\2\2YZ\7n\2\2Z[\7q\2\2[\\\7c\2\2\\]\7v\2\2]\20\3\2\2\2^_"+
		"\7k\2\2_`\7p\2\2`a\7v\2\2a\22\3\2\2\2bc\7d\2\2cd\7q\2\2de\7q\2\2ef\7n"+
		"\2\2f\24\3\2\2\2gh\7u\2\2hi\7v\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7i\2\2"+
		"m\26\3\2\2\2no\7q\2\2op\7w\2\2pq\7v\2\2q\30\3\2\2\2rs\7k\2\2st\7p\2\2"+
		"t\32\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0088"+
		"\3\2\2\2z|\t\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0085\3\2"+
		"\2\2\177\u0081\7\60\2\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\177\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087v"+
		"\3\2\2\2\u0087{\3\2\2\2\u0088\34\3\2\2\2\u0089\u008d\7$\2\2\u008a\u008c"+
		"\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7$\2\2\u0091\36\3\2\2\2\u0092\u0093\7v\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7w\2\2\u0095\u009c\7g\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009c\7g\2\2\u009b\u0092\3\2\2"+
		"\2\u009b\u0096\3\2\2\2\u009c \3\2\2\2\u009d\u00a1\t\3\2\2\u009e\u00a0"+
		"\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7=\2\2"+
		"\u00a5$\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9"+
		"(\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad,"+
		"\3\2\2\2\u00ae\u00af\7-\2\2\u00af.\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\60"+
		"\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5"+
		"\64\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7\61\2\2"+
		"\u00b9\u00ba\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\13\2\2\2\u00c2\u00c3\7"+
		"\f\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\34\2\2\u00c58\3\2\2\2\u00c6\u00c8"+
		"\t\5\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\35\3\2\u00cc:\3\2\2\2"+
		"\r\2x}\u0083\u0085\u0087\u008d\u009b\u00a1\u00be\u00c9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}