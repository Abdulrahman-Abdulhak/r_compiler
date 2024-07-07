package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.Declarable;
import Util.VisitorUtil;

import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;
import symbolTable.property.SymbolDefineMethod;

public class DeclareablesVisitor extends GeneralVisitor<Declarable> {
    SymbolDefineMethod defineMethod;

    public DeclareablesVisitor(SymbolTable symbolTable, VariableDefineMethod varMethod) {
        this(symbolTable, new SymbolDefineMethod(varMethod));
    }
    public DeclareablesVisitor(SymbolTable symbolTable, SymbolDefineMethod defineMethod) {
        super(symbolTable);
        this.defineMethod = defineMethod;
    }

    @Override
    public Declarable visitDeclarable(ReactParser.DeclarableContext ctx) {
        if(ctx.validName() != null) return visitValidName(ctx.validName());
        if(ctx.objectDestructuring() != null) return visitObjectDestructuring(ctx.objectDestructuring());
        return visitArrayDestructuring(ctx.arrayDestructuring());
    }

    @Override
    public Declarable visitValidName(ReactParser.ValidNameContext ctx) {
        SymbolTableUtil.initSymbol(symbolTable, ctx.getText(), ctx, defineMethod);
        return new Declarable(ctx.getText());
    }

    @Override
    public Declarable visitObjectDestructuring(ReactParser.ObjectDestructuringContext ctx) {
        return new Declarable(VisitorUtil.create(ctx, symbolTable, defineMethod));
    }

    @Override
    public Declarable visitArrayDestructuring(ReactParser.ArrayDestructuringContext ctx) {
        return new Declarable(VisitorUtil.create(ctx, symbolTable, defineMethod));
    }
}
