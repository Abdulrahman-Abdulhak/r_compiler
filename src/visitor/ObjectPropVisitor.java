package visitor;

import antlr.ReactParser;

import ast.*;
import Util.VisitorUtil;
import symbolTable.SymbolTable;

public class ObjectPropVisitor extends GeneralVisitor<ObjectPropDefine> {
    public ObjectPropVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public ObjectPropDefine visitNormalPropDefine(ReactParser.NormalPropDefineContext ctx) {
        var propName = ctx.objPropName();
        var exp = new ExpressionVisitor(symbolTable).visit(propName.getChild(2));

        var str = propName.STRING();
        if(str != null) return new ObjectPropDefine(str.getText(), exp);

        var num = propName.num();
        if(num != null) return new ObjectPropDefine(Integer.parseInt(num.getText()), exp);

        var validNameContext = propName.validName();
        var validName = new ValidName(validNameContext.getText());
        return new ObjectPropDefine(validName, exp);
    }

    @Override
    public ObjectPropDefine visitVarPropDefine(ReactParser.VarPropDefineContext ctx) {
        var validNameCtx = ctx.validName();
        return new ObjectPropDefine(new ValidName(validNameCtx.getText()));
    }

    @Override
    public ObjectPropDefine visitMethodPropDefine(ReactParser.MethodPropDefineContext ctx) {
        var methodCtx = ctx.method();
        var method = new Method(
                VisitorUtil.create(methodCtx.validName()),
                VisitorUtil.create(methodCtx.args(), symbolTable),
                VisitorUtil.create(methodCtx.block(), symbolTable)
        );

        return new ObjectPropDefine(method);
    }

    @Override
    public ObjectPropDefine visitComputedPropDefine(ReactParser.ComputedPropDefineContext ctx) {
        var exp1 = ctx.expression(0);
        var exp2 = ctx.expression(0);
        var expVisitor = new ExpressionVisitor(symbolTable);

        return new ObjectPropDefine(
                expVisitor.visit(exp1),
                expVisitor.visit(exp2)
        );
    }

    @Override
    public ObjectPropDefine visitObjecPropsPropDefine(ReactParser.ObjecPropsPropDefineContext ctx) {
        var exp = ctx.expression();
        return new ObjectPropDefine(new ExpressionVisitor(symbolTable).visit(exp));
    }
}
