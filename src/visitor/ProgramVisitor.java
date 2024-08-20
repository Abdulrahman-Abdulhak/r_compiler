package visitor;

import antlr.ReactParser;

import ast.Program;
import errors.Error;
import symbolTable.SymbolTable;

public class ProgramVisitor extends GeneralVisitor<Program> {
    public ProgramVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        var program = new Program();

        var lineVisitor = new LineVisitor(symbolTable, errors);
        for (var lineCtx : ctx.line()) program.addLine(lineVisitor.visit(lineCtx));

        return program;
    }
}
