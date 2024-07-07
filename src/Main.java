import antlr.ReactLexer;
import antlr.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTable;
import visitor.ProgramVisitor;

import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Files\\Java\\r_compiler\\src\\testFiles\\test1.txt";
        CharStream charStream = fromFileName(source);

        ReactLexer lexer = new ReactLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ReactParser parser = new ReactParser(tokens);
        ParseTree ast =  parser.program();

        var globalSymbolTable = new SymbolTable("Global Table");

        ProgramVisitor reactVisitor = new ProgramVisitor(globalSymbolTable);
        var tree = reactVisitor.visit(ast);

//        System.out.println(tree);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
        System.out.println(globalSymbolTable);
        System.out.println(globalSymbolTable.getChildren().get(0));
    }
}