import antlr.ReactLexer;
import antlr.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.ProgramVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String []args) throws IOException {

        String source = "C:\\Files\\Java\\r_compiler\\src\\testFiles\\test0.txt";
        CharStream charStream = fromFileName(source);

        ReactLexer lexer = new ReactLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ReactParser parser = new ReactParser(tokens);
        ParseTree ast =  parser.program();

        ProgramVisitor reactVisitor = new ProgramVisitor();
        var tree = reactVisitor.visit(ast);

        System.out.println(tree);
    }
}