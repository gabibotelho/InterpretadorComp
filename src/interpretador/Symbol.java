package interpretador;

public class Symbol {

    private String var;
    private Object value;

    public Symbol() {
        
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
