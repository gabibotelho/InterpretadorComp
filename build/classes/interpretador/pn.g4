grammar pn;
@header{
package parser;
import java.util.Scanner;
}
@members {
    Scanner tec = new Scanner(System.in);      
          
    void readInt(String str) {}
    void readStr(String str) {}
    void readFloat(String str){}
    void readBool(String str){}
    
    void printAll(String str){}
    void print(String str){}
    void add(String var, Object value){} 
    
    Integer getInt(String str){return null;}
    
    
}

programa         :BEGIN A_COL (linha)+F_COL END;
                catch [RecognitionException exc] {}
linha            : imprime END_CMD | leia END_CMD | atribuir END_CMD| se;

atribuir        : FLOAT ID '=' VAL {add($ID.text, Float.parseFloat($VAL.text));}
                | FLOAT ID {add($ID.text, Float.parseFloat("0"));}
                | INTEIRO ID '=' expressao {add($ID.text, $expressao.v);}
                | INTEIRO ID {add($ID.text, Integer.parseInt("0"));}
                | BOOLEANO ID '=' VALBOOL {add($ID.text, new Boolean($VALBOOL.text));}
                | BOOLEANO ID {add($ID.text, new Boolean(null));} 
                | STRING ID '=' VALSTRING {add($ID.text, $VALSTRING.text);}
                | STRING ID {add($ID.text, new String());};
                catch [RecognitionException exc] {}

expressao       returns [Integer v ]
                :    e=multExpr { $v = $e.v; } ( 
                 '+' e=multExpr { $v += $e.v; }
                | '-' e=multExpr { $v -= $e.v; }  
                )*;
                catch [RecognitionException exc] {}

multExpr        returns [Integer v ]
                :    e=atom { $v = $e.v; } ('*' e=atom { $v *= $e.v; } | '/' e=atom { $v /= $e.v; })*;
                catch [RecognitionException exc] { }

atom            returns [Integer v ]
                :   valorint {$v = $valorint.value;}
                |    '(' expressao ')' {$v = $expressao.v;};
                catch [RecognitionException exc] { }


valorint        returns [Integer value]
                : ID {$value = getInt($ID.text);}
                | VAL {$value = Integer.parseInt($VAL.text);};
                catch [RecognitionException exc] { }

imprime         : OUT ID {printAll($ID.text);} 
                | OUT  VALSTRING {print($VALSTRING.text);}
                | OUT expressao {System.out.print($expressao.v.toString());};
                catch [RecognitionException exc] { }

leia            : IN A_PAR ID VIR FLOAT F_PAR{readFloat($ID.text);} 
                | IN A_PAR ID VIR INTEIRO F_PAR{readInt($ID.text);}
                | IN A_PAR ID VIR STRING F_PAR{readStr($ID.text);};
                catch [RecognitionException exc] { }
se              : IF A_PAR c=condicao F_PAR A_COL {System.out.println($c.retorno);
                                                   if($c.retorno){linha();}} F_COL;

condicao        returns [boolean retorno]
                : v1 =valorint OP_COMP v2 =valorint {if($v1.value == $v2.value){$retorno = true;}else{$retorno = false;}};
             

BEGIN           : 'PROGRAM';
END             : 'ENDPROGRAM';
A_COL           : '{';
F_COL           : '}';

IF              : 'se';
OP_COMP         : '==';
FLOAT           : 'float'; 
INTEIRO         : 'int';
BOOLEANO        : 'bool';
STRING          : 'string';
OUT             : 'out' ;
IN              : 'in';
VAL             : [0-9]+ 
                | [0-9]+('.'[0-9]+)?;
VALSTRING       : '"'.*?'"';
VALBOOL         : 'true' |'false';
ID              : [a-zA-Z][a-zA-Z0-9_]*;
END_CMD         : ';'; 
EQUALS          : '=';
ASPAS           : '"';
A_PAR           : '(';
F_PAR           : ')';
MORE            : '+';
MIN             : '-';
MULT            : '*';
VIR             : ',';
DIV             : '/';
COMENTARIO      : '//'.*?.'\n' -> skip;
BRANCO          : [ \t\n\r]+ -> skip;