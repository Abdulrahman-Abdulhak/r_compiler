package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Declarable;

public class DeclareablesVisitor extends ReactParserBaseVisitor<Declarable> {
    @Override
    public Declarable visitDeclarable(ReactParser.DeclarableContext ctx) {
        if(ctx.validName() != null) return visitValidName(ctx.validName());
        if(ctx.objectDestructuring() != null) return visitObjectDestructuring(ctx.objectDestructuring());
        return visitArrayDestructuring(ctx.arrayDestructuring());
    }

    @Override
    public Declarable visitValidName(ReactParser.ValidNameContext ctx) {
        return new Declarable(ctx.getText());
    }

    @Override
    public Declarable visitObjectDestructuring(ReactParser.ObjectDestructuringContext ctx) {
        return new Declarable(Util.fromObjDestructuringCtx(ctx));
    }

    @Override
    public Declarable visitArrayDestructuring(ReactParser.ArrayDestructuringContext ctx) {
        return new Declarable(Util.fromArrayDestructCtx(ctx));
    }
}
