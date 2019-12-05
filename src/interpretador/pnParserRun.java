package interpretador;

import java.util.ArrayList;
import org.antlr.v4.runtime.TokenStream;

public class pnParserRun extends pnParser {

    private final ArrayList<Symbol> table_symbol;

    public pnParserRun(TokenStream input) {
        super(input);
        table_symbol = new ArrayList<>();
    }

    @Override
    void add(String var, Object value) {
        if (verificarVar(var, value)) {
            Symbol symbol = new Symbol();
            symbol.setValue(value);
            symbol.setVar(var);
            table_symbol.add(symbol);
        }
    }

    boolean verificarVar(String var, Object value) {
        for (Symbol s : table_symbol) {
            if (s.getVar().equals(var)) {
                s.setValue(value);
                return false;
            }
        }
        return true;
    }

    Symbol buscarVar(String str) {
        for (Symbol aux : table_symbol) {
            if (aux.getVar().equals(str)) {
                return aux;
            }
        }
        return null;
    }

    @Override
    void print(String str) {
        String val = str.replace("\"","");
        for(int i=0;i<val.length()-1;i++){
            if(val.charAt(i) == '\\' && val.charAt(i+1) == 'n' ){
                System.out.println();
            }else{
                System.out.print(val.charAt(i));
            }
        }
        if(val.charAt(val.length()-2) !='\\'  && val.charAt(val.length()-1) !='n' ){
            System.out.print(val.charAt(val.length()-1));
        }
    }

    @Override
    void printAll(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof String) {
                System.out.println((String) s.getValue());
            } else if (s.getValue() instanceof Float) {
                System.out.println((Float) s.getValue());
            } else if (s.getValue() instanceof Integer) {
                System.out.println((Integer) s.getValue());
            } else if (s.getValue() instanceof Boolean) {
                System.out.println((Boolean) s.getValue());
            }
        } else {
            System.out.println("Variável " + str + " não declarada.");
        }
    }

    @Override
    void readInt(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof Integer) {
                s.setValue(tec.nextInt());
            } else {
                System.out.println("Não é possível converter " + str + " para inteiro.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readStr(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof String) {
                s.setValue(tec.nextLine());
            } else {
                System.out.println("Não é possível converter " + str + " para string.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readFloat(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof Float) {
                s.setValue(tec.nextFloat());
            } else {
                System.out.println("Não é possível converter " + str + " para float.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    void readBool(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof Boolean) {
                s.setValue(tec.nextBoolean());
            } else {
                System.out.println("Não é possível converter " + str + " para boolean.");
            }
        } else {
            System.out.println("Variável " + str + " não foi declarada.");
        }
    }

    @Override
    Integer getInt(String str) {
        Symbol s = buscarVar(str);
        if (s != null) {
            if (s.getValue() instanceof Integer) {
                return (Integer) s.getValue();
            } else {
                System.out.println("Não é possível converter " + str + " para boolean.");
                return null;
            }
        } else {
            System.out.println("Variavel " + str + " não foi declarada.");
            return null;
        }
    }

}
