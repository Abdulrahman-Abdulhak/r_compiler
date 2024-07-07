package visitor;

import antlr.ReactParser;

import ast.ArrayDestructuring;
import ast.ValidName;

import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;
import symbolTable.property.SymbolDefineMethod;

import Util.SymbolTableUtil;

public class ArrayDestructuringVisitor extends GeneralVisitor<ArrayDestructuring> {
    SymbolDefineMethod defineMethod;

    public ArrayDestructuringVisitor(SymbolTable symbolTable, VariableDefineMethod varMethod) {
        this(symbolTable, new SymbolDefineMethod(varMethod));
    }
    public ArrayDestructuringVisitor(SymbolTable symbolTable, SymbolDefineMethod defineMethod) {
        super(symbolTable);
        this.defineMethod = defineMethod;
    }

    @Override
    public ArrayDestructuring visitArrayDestructuring(ReactParser.ArrayDestructuringContext ctx) {
        var destructuredVars = new ArrayDestructuring();

        for(var arrVarCtx : ctx.destructuredArrVar()) {
            boolean haveDefaultVal = arrVarCtx.expression() != null;

            var validName = new ValidName(arrVarCtx.validName().getText());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor(symbolTable).visit(arrVarCtx.expression());
                destructuredVars.addVar(validName, exp);
            } else {
                destructuredVars.addVar(validName);
            }

            var name = validName.getIdentifier();
            SymbolTableUtil.initSymbol(symbolTable, name, arrVarCtx, defineMethod);
        }

        return destructuredVars;
    }
}
