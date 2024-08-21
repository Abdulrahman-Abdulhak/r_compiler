package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.*;
import Util.VisitorUtil;
import errors.Error;
import symbolTable.SymbolTable;

public class ObjectPropVisitor extends GeneralVisitor<ObjectPropDefine> {
    public ObjectPropVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public ObjectPropDefine visitNormalPropDefine(ReactParser.NormalPropDefineContext ctx) {
        var propName = ctx.objPropName();
        var exp = new ExpressionVisitor(symbolTable, errors).visit(ctx.expression());

        var str = propName.STRING();
        if(str != null) return new ObjectPropDefine(str.getText(), exp, SymbolTableUtil.getLine(str), symbolTable);

        var num = propName.num();
        if(num != null) return new ObjectPropDefine(Integer.parseInt(num.getText()), exp, SymbolTableUtil.getLine(num), symbolTable);

        var validNameContext = propName.validName();
        var validName = new ValidName(validNameContext.getText(), SymbolTableUtil.getLine(validNameContext), symbolTable);
        return new ObjectPropDefine(validName, exp, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ObjectPropDefine visitVarPropDefine(ReactParser.VarPropDefineContext ctx) {
        var validNameCtx = ctx.validName();

        return new ObjectPropDefine(
            new ValidName(validNameCtx.getText(), SymbolTableUtil.getLine(validNameCtx), symbolTable),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public ObjectPropDefine visitMethodPropDefine(ReactParser.MethodPropDefineContext ctx) {
        var methodCtx = ctx.method();

        var methodName = methodCtx.validName().getText();
        var methodScope = new SymbolTable("method " + methodName);
        var method = new Method(
            new ValidName(methodName, SymbolTableUtil.getLine(methodCtx.validName()), symbolTable),
            new ArgsVisitor(methodScope, errors).visitArgs(methodCtx.args()),
            new BlockVisitor(methodScope, errors).visitFunctionBody(methodCtx.functionBody()),
            SymbolTableUtil.getLine(methodCtx),
            symbolTable
        );

        return new ObjectPropDefine(method, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ObjectPropDefine visitComputedPropDefine(ReactParser.ComputedPropDefineContext ctx) {
        var exp1 = ctx.expression(0);
        var exp2 = ctx.expression(0);
        var expVisitor = new ExpressionVisitor(symbolTable, errors);

        return new ObjectPropDefine(
            expVisitor.visit(exp1),
            expVisitor.visit(exp2),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }

    @Override
    public ObjectPropDefine visitObjecPropsPropDefine(ReactParser.ObjecPropsPropDefineContext ctx) {
        var exp = ctx.expression();
        return new ObjectPropDefine(
            new ExpressionVisitor(symbolTable, errors).visit(exp),
            SymbolTableUtil.getLine(ctx),
            symbolTable
        );
    }
}
