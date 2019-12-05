// Generated from C:\Users\Carlos\Downloads\interpretadorPN\src\parser\pn.g4 by ANTLR 4.1

package interpretador;
import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pnParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, A_COL=3, F_COL=4, IF=5, OP_COMP=6, FLOAT=7, INTEIRO=8, 
		BOOLEANO=9, STRING=10, OUT=11, IN=12, VAL=13, VALSTRING=14, VALBOOL=15, 
		ID=16, END_CMD=17, EQUALS=18, ASPAS=19, A_PAR=20, F_PAR=21, MORE=22, MIN=23, 
		MULT=24, VIR=25, DIV=26, COMENTARIO=27, BRANCO=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'PROGRAM'", "'ENDPROGRAM'", "'{'", "'}'", "'se'", "'=='", 
		"'float'", "'int'", "'bool'", "'string'", "'out'", "'in'", "VAL", "VALSTRING", 
		"VALBOOL", "ID", "';'", "'='", "'\"'", "'('", "')'", "'+'", "'-'", "'*'", 
		"','", "'/'", "COMENTARIO", "BRANCO"
	};
	public static final int
		RULE_programa = 0, RULE_linha = 1, RULE_atribuir = 2, RULE_expressao = 3, 
		RULE_multExpr = 4, RULE_atom = 5, RULE_valorint = 6, RULE_imprime = 7, 
		RULE_leia = 8, RULE_se = 9, RULE_condicao = 10;
	public static final String[] ruleNames = {
		"programa", "linha", "atribuir", "expressao", "multExpr", "atom", "valorint", 
		"imprime", "leia", "se", "condicao"
	};

	@Override
	public String getGrammarFileName() { return "pn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    Scanner tec = new Scanner(System.in);      
	          
	    void readInt(String str) {}
	    void readStr(String str) {}
	    void readFloat(String str){}
	    void readBool(String str){}
	    
	    void printAll(String str){}
	    void print(String str){}
	    void add(String var, Object value){} 
	    
	    Integer getInt(String str){return null;}
	    
	    

	public pnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public TerminalNode A_COL() { return getToken(pnParser.A_COL, 0); }
		public TerminalNode BEGIN() { return getToken(pnParser.BEGIN, 0); }
		public TerminalNode F_COL() { return getToken(pnParser.F_COL, 0); }
		public TerminalNode END() { return getToken(pnParser.END, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(BEGIN);
			setState(23); match(A_COL);
			setState(25); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(24); linha();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(27); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(29); match(F_COL);
			setState(30); match(END);
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinhaContext extends ParserRuleContext {
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public TerminalNode END_CMD() { return getToken(pnParser.END_CMD, 0); }
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); imprime();
				setState(33); match(END_CMD);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); leia();
				setState(36); match(END_CMD);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); atribuir();
				setState(39); match(END_CMD);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); se();
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

	public static class AtribuirContext extends ParserRuleContext {
		public Token ID;
		public Token VAL;
		public ExpressaoContext expressao;
		public Token VALBOOL;
		public Token VALSTRING;
		public TerminalNode ID() { return getToken(pnParser.ID, 0); }
		public TerminalNode BOOLEANO() { return getToken(pnParser.BOOLEANO, 0); }
		public TerminalNode INTEIRO() { return getToken(pnParser.INTEIRO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode VALBOOL() { return getToken(pnParser.VALBOOL, 0); }
		public TerminalNode VAL() { return getToken(pnParser.VAL, 0); }
		public TerminalNode VALSTRING() { return getToken(pnParser.VALSTRING, 0); }
		public TerminalNode STRING() { return getToken(pnParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(pnParser.FLOAT, 0); }
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuir);
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); match(FLOAT);
				setState(45); ((AtribuirContext)_localctx).ID = match(ID);
				setState(46); match(EQUALS);
				setState(47); ((AtribuirContext)_localctx).VAL = match(VAL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Float.parseFloat((((AtribuirContext)_localctx).VAL!=null?((AtribuirContext)_localctx).VAL.getText():null)));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(FLOAT);
				setState(50); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Float.parseFloat("0"));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); match(INTEIRO);
				setState(53); ((AtribuirContext)_localctx).ID = match(ID);
				setState(54); match(EQUALS);
				setState(55); ((AtribuirContext)_localctx).expressao = expressao();
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), ((AtribuirContext)_localctx).expressao.v);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); match(INTEIRO);
				setState(59); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Integer.parseInt("0"));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(BOOLEANO);
				setState(62); ((AtribuirContext)_localctx).ID = match(ID);
				setState(63); match(EQUALS);
				setState(64); ((AtribuirContext)_localctx).VALBOOL = match(VALBOOL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean((((AtribuirContext)_localctx).VALBOOL!=null?((AtribuirContext)_localctx).VALBOOL.getText():null)));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66); match(BOOLEANO);
				setState(67); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean(null));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69); match(STRING);
				setState(70); ((AtribuirContext)_localctx).ID = match(ID);
				setState(71); match(EQUALS);
				setState(72); ((AtribuirContext)_localctx).VALSTRING = match(VALSTRING);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), (((AtribuirContext)_localctx).VALSTRING!=null?((AtribuirContext)_localctx).VALSTRING.getText():null));
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74); match(STRING);
				setState(75); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new String());
				}
				break;
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public Integer v;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79); ((ExpressaoContext)_localctx).e = multExpr();
			 ((ExpressaoContext)_localctx).v =  ((ExpressaoContext)_localctx).e.v; 
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(89);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(81); match(MORE);
						setState(82); ((ExpressaoContext)_localctx).e = multExpr();
						 _localctx.v += ((ExpressaoContext)_localctx).e.v; 
						}
						break;

					case 2:
						{
						setState(85); match(MIN);
						setState(86); ((ExpressaoContext)_localctx).e = multExpr();
						 _localctx.v -= ((ExpressaoContext)_localctx).e.v; 
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public Integer v;
		public AtomContext e;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); ((MultExprContext)_localctx).e = atom();
			 ((MultExprContext)_localctx).v =  ((MultExprContext)_localctx).e.v; 
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(104);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(96); match(MULT);
						setState(97); ((MultExprContext)_localctx).e = atom();
						 _localctx.v *= ((MultExprContext)_localctx).e.v; 
						}
						break;

					case 2:
						{
						setState(100); match(DIV);
						setState(101); ((MultExprContext)_localctx).e = atom();
						 _localctx.v /= ((MultExprContext)_localctx).e.v; 
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Integer v;
		public ValorintContext valorint;
		public ExpressaoContext expressao;
		public ValorintContext valorint() {
			return getRuleContext(ValorintContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); ((AtomContext)_localctx).valorint = valorint();
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).valorint.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(A_PAR);
				setState(113); ((AtomContext)_localctx).expressao = expressao();
				setState(114); match(F_PAR);
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).expressao.v;
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorintContext extends ParserRuleContext {
		public Integer value;
		public Token ID;
		public Token VAL;
		public TerminalNode ID() { return getToken(pnParser.ID, 0); }
		public TerminalNode VAL() { return getToken(pnParser.VAL, 0); }
		public ValorintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorint; }
	}

	public final ValorintContext valorint() throws RecognitionException {
		ValorintContext _localctx = new ValorintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valorint);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); ((ValorintContext)_localctx).ID = match(ID);
				((ValorintContext)_localctx).value =  getInt((((ValorintContext)_localctx).ID!=null?((ValorintContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); ((ValorintContext)_localctx).VAL = match(VAL);
				((ValorintContext)_localctx).value =  Integer.parseInt((((ValorintContext)_localctx).VAL!=null?((ValorintContext)_localctx).VAL.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimeContext extends ParserRuleContext {
		public Token ID;
		public Token VALSTRING;
		public ExpressaoContext expressao;
		public TerminalNode ID() { return getToken(pnParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode VALSTRING() { return getToken(pnParser.VALSTRING, 0); }
		public TerminalNode OUT() { return getToken(pnParser.OUT, 0); }
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprime);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(OUT);
				setState(126); ((ImprimeContext)_localctx).ID = match(ID);
				printAll((((ImprimeContext)_localctx).ID!=null?((ImprimeContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(OUT);
				setState(129); ((ImprimeContext)_localctx).VALSTRING = match(VALSTRING);
				print((((ImprimeContext)_localctx).VALSTRING!=null?((ImprimeContext)_localctx).VALSTRING.getText():null));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); match(OUT);
				setState(132); ((ImprimeContext)_localctx).expressao = expressao();
				System.out.print(((ImprimeContext)_localctx).expressao.v.toString());
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeiaContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(pnParser.ID, 0); }
		public TerminalNode VIR() { return getToken(pnParser.VIR, 0); }
		public TerminalNode INTEIRO() { return getToken(pnParser.INTEIRO, 0); }
		public TerminalNode STRING() { return getToken(pnParser.STRING, 0); }
		public TerminalNode F_PAR() { return getToken(pnParser.F_PAR, 0); }
		public TerminalNode IN() { return getToken(pnParser.IN, 0); }
		public TerminalNode FLOAT() { return getToken(pnParser.FLOAT, 0); }
		public TerminalNode A_PAR() { return getToken(pnParser.A_PAR, 0); }
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leia);
		try {
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(IN);
				setState(138); match(A_PAR);
				setState(139); ((LeiaContext)_localctx).ID = match(ID);
				setState(140); match(VIR);
				setState(141); match(FLOAT);
				setState(142); match(F_PAR);
				readFloat((((LeiaContext)_localctx).ID!=null?((LeiaContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(IN);
				setState(145); match(A_PAR);
				setState(146); ((LeiaContext)_localctx).ID = match(ID);
				setState(147); match(VIR);
				setState(148); match(INTEIRO);
				setState(149); match(F_PAR);
				readInt((((LeiaContext)_localctx).ID!=null?((LeiaContext)_localctx).ID.getText():null));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151); match(IN);
				setState(152); match(A_PAR);
				setState(153); ((LeiaContext)_localctx).ID = match(ID);
				setState(154); match(VIR);
				setState(155); match(STRING);
				setState(156); match(F_PAR);
				readStr((((LeiaContext)_localctx).ID!=null?((LeiaContext)_localctx).ID.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeContext extends ParserRuleContext {
		public CondicaoContext c;
		public TerminalNode IF() { return getToken(pnParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode A_COL() { return getToken(pnParser.A_COL, 0); }
		public TerminalNode F_COL() { return getToken(pnParser.F_COL, 0); }
		public TerminalNode F_PAR() { return getToken(pnParser.F_PAR, 0); }
		public TerminalNode A_PAR() { return getToken(pnParser.A_PAR, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(IF);
			setState(161); match(A_PAR);
			setState(162); ((SeContext)_localctx).c = condicao();
			setState(163); match(F_PAR);
			setState(164); match(A_COL);
			System.out.println(((SeContext)_localctx).c.retorno);
			                                                   if(((SeContext)_localctx).c.retorno){linha();}
			setState(166); match(F_COL);
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

	public static class CondicaoContext extends ParserRuleContext {
		public boolean retorno;
		public ValorintContext v1;
		public ValorintContext v2;
		public TerminalNode OP_COMP() { return getToken(pnParser.OP_COMP, 0); }
		public ValorintContext valorint(int i) {
			return getRuleContext(ValorintContext.class,i);
		}
		public List<ValorintContext> valorint() {
			return getRuleContexts(ValorintContext.class);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); ((CondicaoContext)_localctx).v1 = valorint();
			setState(169); match(OP_COMP);
			setState(170); ((CondicaoContext)_localctx).v2 = valorint();
			if(((CondicaoContext)_localctx).v1.value == ((CondicaoContext)_localctx).v2.value){((CondicaoContext)_localctx).retorno =  true;}else{((CondicaoContext)_localctx).retorno =  false;}
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\36\u00b0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7x"+
		"\n\7\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\2\u00b9\2\30\3\2\2\2\4,\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\n`\3\2\2\2\fw\3"+
		"\2\2\2\16}\3\2\2\2\20\u0089\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2\2"+
		"\26\u00aa\3\2\2\2\30\31\7\3\2\2\31\33\7\5\2\2\32\34\5\4\3\2\33\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\6\2"+
		"\2 !\7\4\2\2!\3\3\2\2\2\"#\5\20\t\2#$\7\23\2\2$-\3\2\2\2%&\5\22\n\2&\'"+
		"\7\23\2\2\'-\3\2\2\2()\5\6\4\2)*\7\23\2\2*-\3\2\2\2+-\5\24\13\2,\"\3\2"+
		"\2\2,%\3\2\2\2,(\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\t\2\2/\60\7\22\2\2\60"+
		"\61\7\24\2\2\61\62\7\17\2\2\62P\b\4\1\2\63\64\7\t\2\2\64\65\7\22\2\2\65"+
		"P\b\4\1\2\66\67\7\n\2\2\678\7\22\2\289\7\24\2\29:\5\b\5\2:;\b\4\1\2;P"+
		"\3\2\2\2<=\7\n\2\2=>\7\22\2\2>P\b\4\1\2?@\7\13\2\2@A\7\22\2\2AB\7\24\2"+
		"\2BC\7\21\2\2CP\b\4\1\2DE\7\13\2\2EF\7\22\2\2FP\b\4\1\2GH\7\f\2\2HI\7"+
		"\22\2\2IJ\7\24\2\2JK\7\20\2\2KP\b\4\1\2LM\7\f\2\2MN\7\22\2\2NP\b\4\1\2"+
		"O.\3\2\2\2O\63\3\2\2\2O\66\3\2\2\2O<\3\2\2\2O?\3\2\2\2OD\3\2\2\2OG\3\2"+
		"\2\2OL\3\2\2\2P\7\3\2\2\2QR\5\n\6\2R]\b\5\1\2ST\7\30\2\2TU\5\n\6\2UV\b"+
		"\5\1\2V\\\3\2\2\2WX\7\31\2\2XY\5\n\6\2YZ\b\5\1\2Z\\\3\2\2\2[S\3\2\2\2"+
		"[W\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\5\f\7"+
		"\2al\b\6\1\2bc\7\32\2\2cd\5\f\7\2de\b\6\1\2ek\3\2\2\2fg\7\34\2\2gh\5\f"+
		"\7\2hi\b\6\1\2ik\3\2\2\2jb\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\13\3\2\2\2nl\3\2\2\2op\5\16\b\2pq\b\7\1\2qx\3\2\2\2rs\7\26\2\2s"+
		"t\5\b\5\2tu\7\27\2\2uv\b\7\1\2vx\3\2\2\2wo\3\2\2\2wr\3\2\2\2x\r\3\2\2"+
		"\2yz\7\22\2\2z~\b\b\1\2{|\7\17\2\2|~\b\b\1\2}y\3\2\2\2}{\3\2\2\2~\17\3"+
		"\2\2\2\177\u0080\7\r\2\2\u0080\u0081\7\22\2\2\u0081\u008a\b\t\1\2\u0082"+
		"\u0083\7\r\2\2\u0083\u0084\7\20\2\2\u0084\u008a\b\t\1\2\u0085\u0086\7"+
		"\r\2\2\u0086\u0087\5\b\5\2\u0087\u0088\b\t\1\2\u0088\u008a\3\2\2\2\u0089"+
		"\177\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0085\3\2\2\2\u008a\21\3\2\2\2"+
		"\u008b\u008c\7\16\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\22\2\2\u008e"+
		"\u008f\7\33\2\2\u008f\u0090\7\t\2\2\u0090\u0091\7\27\2\2\u0091\u00a1\b"+
		"\n\1\2\u0092\u0093\7\16\2\2\u0093\u0094\7\26\2\2\u0094\u0095\7\22\2\2"+
		"\u0095\u0096\7\33\2\2\u0096\u0097\7\n\2\2\u0097\u0098\7\27\2\2\u0098\u00a1"+
		"\b\n\1\2\u0099\u009a\7\16\2\2\u009a\u009b\7\26\2\2\u009b\u009c\7\22\2"+
		"\2\u009c\u009d\7\33\2\2\u009d\u009e\7\f\2\2\u009e\u009f\7\27\2\2\u009f"+
		"\u00a1\b\n\1\2\u00a0\u008b\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0099\3\2"+
		"\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5"+
		"\5\26\f\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\b\13\1"+
		"\2\u00a8\u00a9\7\6\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac"+
		"\7\b\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae\b\f\1\2\u00ae\27\3\2\2\2\r\35"+
		",O[]jlw}\u0089\u00a0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}