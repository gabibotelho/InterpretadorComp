package interpretador;

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;

public class InterpretadorPN {

    public static void main(String[] args) {
        try {

            ANTLRInputStream stream = new ANTLRFileStream("C:\\Users\\gabri\\Downloads\\InterpretadorPN-master\\InterpretadorPN-master\\src\\parser\\entrada");
            pnLexer lexer = new pnLexer(stream);
            TokenStream ts = new BufferedTokenStream(lexer);
            pnParserRun parser = new pnParserRun(ts);
            parser.programa();
        } catch (IOException | RecognitionException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
