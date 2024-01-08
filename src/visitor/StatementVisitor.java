package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.*;

public class StatementVisitor extends ReactParserBaseVisitor<Statement> {
    @Override
    public ImportStatement visitImporting(ReactParser.ImportingContext ctx) {
        var from = ctx.importStatement().STRING().getText();

        var formCtx = ctx.importStatement().form();
        if(formCtx == null) return new ImportStatement(from);

        return new ImportStatement(
                new ImportFormVisitor().visit(formCtx.importForm()),
                from
        );
    }

    @Override
    public Statement visitExporting(ReactParser.ExportingContext ctx) {
        return super.visitExporting(ctx);
    }

    @Override
    public Declare visitDeclaration(ReactParser.DeclarationContext ctx) {
        return new DeclareVisitor().visit(ctx.declare());
    }

    @Override
    public Expression visitExp(ReactParser.ExpContext ctx) {
        return new ExpressionVisitor().visit(ctx.expression());
    }

    @Override
    public NoUse visitNoUseStatement(ReactParser.NoUseStatementContext ctx) {
        return new NoUse();
    }
}
