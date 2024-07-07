package visitor;

import antlr.ReactParser;

import ast.DestructuredObjVar;
import ast.ObjectDestructuring;

import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;
import symbolTable.property.SymbolDefineMethod;

import Util.VisitorUtil;
import Util.SymbolTableUtil;

public class ObjectDestructuringVisitor extends GeneralVisitor<ObjectDestructuring> {
    final SymbolDefineMethod defineMethod;

    public ObjectDestructuringVisitor(SymbolTable symbolTable, VariableDefineMethod varMethod) {
        this(symbolTable, new SymbolDefineMethod(varMethod));
    }
    public ObjectDestructuringVisitor(SymbolTable symbolTable, SymbolDefineMethod defineMethod) {
        super(symbolTable);
        this.defineMethod = defineMethod;
    }

    @Override
    public ObjectDestructuring visitObjectDestructuring(ReactParser.ObjectDestructuringContext ctx) {
        var wholeDestruct = new ObjectDestructuring();

        for(var objVarCtx : ctx.destructuredObjVar()) {
            DestructuredObjVar destructuredVar;
            boolean haveOriginalName = objVarCtx.objPropName() != null;
            boolean haveDefaultVal = objVarCtx.expression() != null;

            var validName = VisitorUtil.create(objVarCtx.validName());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor(symbolTable).visit(objVarCtx.expression());
                if(haveOriginalName)
                    destructuredVar = new DestructuredObjVar(objVarCtx.objPropName().getText(), validName, exp);
                else
                    destructuredVar = new DestructuredObjVar(validName, exp);
            } else if (haveOriginalName)
                destructuredVar = new DestructuredObjVar(objVarCtx.objPropName().getText(), validName);
            else
                destructuredVar = new DestructuredObjVar(validName);

            wholeDestruct.addVar(destructuredVar);

            var name = destructuredVar.getVar().getIdentifier();
            SymbolTableUtil.initSymbol(symbolTable, name, objVarCtx, defineMethod);
        }

        return wholeDestruct;
    }
}
