package visitor;

import antlr.ReactParser;

import ast.Declarable;
import Util.VisitorUtil;
import symbolTable.SymbolTable;

public class DeclareablesVisitor extends GeneralVisitor<Declarable> {
    public DeclareablesVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Declarable visitDeclarable(ReactParser.DeclarableContext ctx) {
        if(ctx.validName() != null) return visitValidName(ctx.validName());
        if(ctx.objectDestructuring() != null) return visitObjectDestructuring(ctx.objectDestructuring());
        return visitArrayDestructuring(ctx.arrayDestructuring());
    }

    @Override
    public Declarable visitValidName(ReactParser.ValidNameContext ctx) {
        var line = VisitorUtil.getLine(ctx);
        return new Declarable(ctx.getText(), line);
    }

    @Override
    public Declarable visitObjectDestructuring(ReactParser.ObjectDestructuringContext ctx) {
        var line = VisitorUtil.getLine(ctx);
        return new Declarable(VisitorUtil.fromObjDestructuringCtx(ctx, symbolTable), line);
    }

    @Override
    public Declarable visitArrayDestructuring(ReactParser.ArrayDestructuringContext ctx) {
        var line = VisitorUtil.getLine(ctx);
        return new Declarable(VisitorUtil.fromArrayDestructCtx(ctx, symbolTable), line);
    }
}
