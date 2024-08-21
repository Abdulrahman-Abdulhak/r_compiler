package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import errors.Error;
import symbolTable.SymbolTable;

public class StatementVisitor extends GeneralVisitor<Statement> {
    public StatementVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public ImportStatement visitImporting(ReactParser.ImportingContext ctx) {
        var from = ctx.importStatement().STRING().getText();

        var formCtx = ctx.importStatement().form();
        if(formCtx == null) return new ImportStatement(from, SymbolTableUtil.getLine(ctx), symbolTable);

        return new ImportStatement(
            new ImportFormVisitor(symbolTable, errors).visit(formCtx.importForm()),
            from,
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public Statement visitExporting(ReactParser.ExportingContext ctx) {
        return super.visitExporting(ctx);
    }

    @Override
    public Declare visitDeclaration(ReactParser.DeclarationContext ctx) {
        return new DeclareVisitor(symbolTable, errors).visit(ctx.declare());
    }

    @Override
    public Expression visitExp(ReactParser.ExpContext ctx) {
        return new ExpressionVisitor(symbolTable, errors).visit(ctx.expression());
    }

    @Override
    public NoUse visitNoUseStatement(ReactParser.NoUseStatementContext ctx) {
        return new NoUse(SymbolTableUtil.getLine(ctx));
    }
}
