package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.*;
import symbolTable.Row;
import symbolTable.SymbolTable;

public class FunctionVisitor extends ReactParserBaseVisitor<Function> {
    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        var arrow = ctx.arrowFunction();
        if(arrow != null) return visitArrowFunction(arrow);

        var normal = ctx.normalFunction();
        if(normal != null) return visitNormalFunction(normal);

        var anonymous = ctx.anonymousFunction();
        return visitAnonymousFunction(anonymous);
    }

    @Override
    public Function visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        var nameCtx = ctx.validName();
        ValidName name = null;
        if(nameCtx != null) {
            name = new ValidName(nameCtx.getText());
        }
        var args = nameCtx == null ? Util.fromArgList(ctx.args().arg()) : null;

        var expCtx = ctx.expression();
        Expression exp;
        if (expCtx != null) {
            exp = new ExpressionVisitor().visit(expCtx);
            if(nameCtx != null) return new ArrowFunction(name, exp);

            return new ArrowFunction(args, exp);
        }
        var blockCtx = ctx.block();
        var block = Util.fromBlock(blockCtx);

        if(nameCtx != null) return new ArrowFunction(name, block);
        return new ArrowFunction(args, block);
    }

    @Override
    public Function visitNormalFunction(ReactParser.NormalFunctionContext ctx) {
        var nameCtx = ctx.validName();
        ValidName name = new ValidName(nameCtx.getText());

        var args = Util.fromArgList(ctx.args().arg());

        var blockCtx = ctx.block();
        var block = Util.fromBlock(blockCtx);

        var func = new NormalFunction(name, args, block);
        SymbolTable.main.addRow(new Row("function", name.getIdentifier()));
        return func;
    }

    @Override
    public Function visitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx) {
        var args = Util.fromArgList(ctx.args().arg());

        var blockCtx = ctx.block();
        var block = Util.fromBlock(blockCtx);

        return new AnonymousFunction(args, block);
    }
}
