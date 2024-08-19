package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import symbolTable.SymbolTable;

public class StatementVisitor extends GeneralVisitor<Statement> {
    public StatementVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public ImportStatement visitImporting(ReactParser.ImportingContext ctx) {
        var from = ctx.importStatement().STRING().getText();

        var formCtx = ctx.importStatement().form();
        if(formCtx == null) return new ImportStatement(from, SymbolTableUtil.getLine(ctx));

        return new ImportStatement(
            new ImportFormVisitor(symbolTable).visit(formCtx.importForm()),
            from,
            SymbolTableUtil.getLine(ctx)
        );
    }

    @Override
    public Statement visitExporting(ReactParser.ExportingContext ctx) {
        return super.visitExporting(ctx);
    }

    @Override
    public Declare visitDeclaration(ReactParser.DeclarationContext ctx) {
        return new DeclareVisitor(symbolTable).visit(ctx.declare());
    }

    @Override
    public Expression visitExp(ReactParser.ExpContext ctx) {
        return new ExpressionVisitor(symbolTable).visit(ctx.expression());
    }

    @Override
    public NoUse visitNoUseStatement(ReactParser.NoUseStatementContext ctx) {
        return new NoUse(SymbolTableUtil.getLine(ctx));
    }
}
