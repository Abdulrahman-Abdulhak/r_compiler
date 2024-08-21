package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.Declarable;
import Util.VisitorUtil;

import errors.Error;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;
import symbolTable.property.SymbolDefineMethod;

public class DeclareablesVisitor extends GeneralVisitor<Declarable> {
    SymbolDefineMethod defineMethod;

    public DeclareablesVisitor(SymbolTable symbolTable, Error errors, VariableDefineMethod varMethod) {
        this(symbolTable, errors, new SymbolDefineMethod(varMethod));
    }
    public DeclareablesVisitor(SymbolTable symbolTable, Error errors, SymbolDefineMethod defineMethod) {
        super(symbolTable, errors);
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
        return new Declarable(ctx.getText(), SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Declarable visitObjectDestructuring(ReactParser.ObjectDestructuringContext ctx) {
        return new Declarable(VisitorUtil.create(ctx, symbolTable, errors, defineMethod), SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public Declarable visitArrayDestructuring(ReactParser.ArrayDestructuringContext ctx) {
        return new Declarable(VisitorUtil.create(ctx, symbolTable, errors, defineMethod), SymbolTableUtil.getLine(ctx), symbolTable);
    }
}
