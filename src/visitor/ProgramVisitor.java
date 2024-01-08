package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Program;
import symbolTable.SymbolTable;

public class ProgramVisitor extends ReactParserBaseVisitor<Program> {

    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        var program = new Program();

        var lineVisitor = new LineVisitor();
        for (var lineCtx : ctx.line()) program.addLine(lineVisitor.visit(lineCtx));

        return program;
    }
}
