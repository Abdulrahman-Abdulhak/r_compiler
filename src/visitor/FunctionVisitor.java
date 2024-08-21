package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import Util.VisitorUtil;

import errors.Error;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

public class FunctionVisitor extends GeneralVisitor<Function> {
    public FunctionVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
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
    public ArrowFunction visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        var functionScope = symbolTable.addTable(".function");

        var nameCtx = ctx.validName();
        ValidName name = null;
        if(nameCtx != null) {
            name = VisitorUtil.create(nameCtx, functionScope);
            SymbolTableUtil.initSymbol(functionScope, name.getIdentifier(), nameCtx, SymbolDefineMethod.argument());
        }

        Args args = null;
        if (name == null) args = VisitorUtil.create(ctx.args(), functionScope, errors);

        var expCtx = ctx.expression();
        Expression exp;
        if (expCtx != null) {
            exp = new ExpressionVisitor(functionScope, errors).visit(expCtx);

            if(name != null) return new ArrowFunction(name, exp, SymbolTableUtil.getLine(ctx), functionScope);
            return new ArrowFunction(args, exp, SymbolTableUtil.getLine(ctx), functionScope);
        }

        var body = new BlockVisitor(functionScope, errors).visitFunctionBody(ctx.functionBody());

        if(name != null) return new ArrowFunction(name, body, SymbolTableUtil.getLine(ctx), functionScope);
        return new ArrowFunction(args, body, SymbolTableUtil.getLine(ctx), functionScope);
    }

    @Override
    public NormalFunction visitNormalFunction(ReactParser.NormalFunctionContext ctx) {
        var functionNameCtx = ctx.validName();
        ValidName functionName = VisitorUtil.create(functionNameCtx, symbolTable);
        var functionScope = symbolTable.addTable(".function:" + functionName.getIdentifier());

        var args = new ArgsVisitor(functionScope, errors).visitArgs(ctx.args());
        var block = new BlockVisitor(functionScope, errors).visitFunctionBody(ctx.functionBody());

        var func = new NormalFunction(functionName, args, block, SymbolTableUtil.getLine(ctx), functionScope);

        SymbolTableUtil.initSymbol(
            symbolTable,
            functionName.getIdentifier(),
            functionNameCtx,
            SymbolDefineMethod.function()
        );

        return func;
    }

    @Override
    public AnonymousFunction visitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx) {
        var functionScope = symbolTable.addTable(".function");

        var args = new ArgsVisitor(functionScope, errors).visitArgs(ctx.args());
        var block = new BlockVisitor(functionScope, errors).visitFunctionBody(ctx.functionBody());

        return new AnonymousFunction(args, block, SymbolTableUtil.getLine(ctx), functionScope);
    }
}
