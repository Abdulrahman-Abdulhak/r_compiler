package visitor;

import Util.VisitorUtil;

import antlr.ReactParser;
import ast.*;

import symbolTable.SymbolProperties;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;
import symbolTable.property.SymbolDefinitionLine;

public class FunctionVisitor extends GeneralVisitor<Function> {
    public FunctionVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

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
        var args = nameCtx == null ? VisitorUtil.fromArgList(ctx.args().arg(), symbolTable) : null;

        var expCtx = ctx.expression();
        Expression exp;
        if (expCtx != null) {
            exp = new ExpressionVisitor(symbolTable).visit(expCtx);
            if(nameCtx != null) return new ArrowFunction(name, exp);

            return new ArrowFunction(args, exp);
        }
        var blockCtx = ctx.block();
        var block = VisitorUtil.fromBlock(blockCtx, symbolTable);

        if(nameCtx != null) return new ArrowFunction(name, block);
        return new ArrowFunction(args, block);
    }

    @Override
    public Function visitNormalFunction(ReactParser.NormalFunctionContext ctx) {
        var nameCtx = ctx.validName();
        ValidName name = new ValidName(nameCtx.getText());

        var args = VisitorUtil.fromArgList(ctx.args().arg(), symbolTable);

        var blockCtx = ctx.block();
        var block = VisitorUtil.fromBlock(blockCtx, symbolTable);

        var func = new NormalFunction(name, args, block);

        var tableProperties = new SymbolProperties();

        tableProperties.addProperty(SymbolDefineMethod.function());
        tableProperties.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));
        symbolTable.insert(name.getIdentifier(), tableProperties);

        return func;
    }

    @Override
    public Function visitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx) {
        var args = VisitorUtil.fromArgList(ctx.args().arg(), symbolTable);

        var blockCtx = ctx.block();
        var block = VisitorUtil.fromBlock(blockCtx, symbolTable);

        return new AnonymousFunction(args, block);
    }
}
