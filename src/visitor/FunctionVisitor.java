package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import Util.VisitorUtil;

import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

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
        var functionScope = symbolTable.addTable();

        var nameCtx = ctx.validName();
        ValidName name = null;
        if(nameCtx != null) {
            name = VisitorUtil.create(nameCtx);
            SymbolTableUtil.initSymbol(functionScope, name.getIdentifier(), nameCtx, SymbolDefineMethod.argument());
        }

        Args args = null;
        if (name == null) args = VisitorUtil.create(ctx.args(), functionScope);

        var expCtx = ctx.expression();
        Expression exp;
        if (expCtx != null) {
            exp = new ExpressionVisitor(functionScope).visit(expCtx);

            if(name != null) return new ArrowFunction(name, exp);
            return new ArrowFunction(args, exp);
        }

        var block = VisitorUtil.create(ctx.block(), functionScope);

        if(name != null) return new ArrowFunction(name, block);
        return new ArrowFunction(args, block);
    }

    @Override
    public Function visitNormalFunction(ReactParser.NormalFunctionContext ctx) {
        var functionNameCtx = ctx.validName();
        ValidName functionName = VisitorUtil.create(functionNameCtx);
        var functionScope = symbolTable.addTable(functionName);

        var args = VisitorUtil.create(ctx.args(), functionScope);
        var block = VisitorUtil.create(ctx.block(), functionScope);

        var func = new NormalFunction(functionName, args, block);

        SymbolTableUtil.initSymbol(
                symbolTable,
                functionName.getIdentifier(),
                functionNameCtx,
                SymbolDefineMethod.function()
        );

        return func;
    }

    @Override
    public Function visitAnonymousFunction(ReactParser.AnonymousFunctionContext ctx) {
        var functionScope = symbolTable.addTable();

        var args = VisitorUtil.create(ctx.args(), functionScope);
        var block = VisitorUtil.create(ctx.block(), functionScope);

        return new AnonymousFunction(args, block);
    }
}
