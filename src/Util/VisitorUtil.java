package Util;

import antlr.ReactParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import ast.*;
import visitor.*;

import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

import java.util.List;

public class VisitorUtil {
    public static Token getFirstToken(ParserRuleContext ctx) {
        var tree = ctx.getChild(0);

        while(!(tree instanceof TerminalNode)) {
            if(tree.getChildCount() == 0) return null;
            tree = tree.getChild(0);
        }

        return ((TerminalNode) tree).getSymbol();
    }

    public static ValidName create(ReactParser.ValidNameContext ctx) {
        return new ValidName(ctx.getText());
    }

    public static ObjectDestructuring create(
            ReactParser.ObjectDestructuringContext ctx,
            SymbolTable symbolTable,
            SymbolDefineMethod defineMethod
    ) {
        var visitor = new ObjectDestructuringVisitor(symbolTable, defineMethod);
        return visitor.visitObjectDestructuring(ctx);
    }

    public static ArrayDestructuring create(
            ReactParser.ArrayDestructuringContext ctx,
            SymbolTable symbolTable,
            SymbolDefineMethod defineMethod
    ) {
        var visitor = new ArrayDestructuringVisitor(symbolTable, defineMethod);
        return visitor.visitArrayDestructuring(ctx);
    }

    public static Args create(ReactParser.ArgsContext ctx, SymbolTable symbolTable) {
        return new ArgsVisitor(symbolTable).visitArgs(ctx);
    }

    public static Block create(ReactParser.BlockContext ctx, SymbolTable symbolTable) {
        return new BlockVisitor(symbolTable).visitBlock(ctx);
    }

    public static void fromAttrList(JSX jsx, List<ReactParser.AttibuteValueContext> attrs, SymbolTable symbolTable) {
        for (var attrCtx : attrs) {
            var name = attrCtx.tagAttribute().getText();
            var js = attrCtx.jsInJsx();

            if(js != null) jsx.addProp(name, new ExpressionVisitor(symbolTable).visit(js.expression()));
            else if (attrCtx.STRING() != null) jsx.addProp(name, attrCtx.STRING().getText());
            else jsx.addProp(name, "\"true\"");
        }
    }

    public static NamedImport create(ReactParser.NamedImportContext ctx, SymbolTable symbolTable) {
        final var named = new NamedImport();
        for(var itemCtx : ctx.namedImportItem())
            forNamedImport(named, itemCtx, symbolTable);

        return named;
    }
    private static void forNamedImport(NamedImport named, ReactParser.NamedImportItemContext ctx, SymbolTable symbolTable) {
        var defineMethod = SymbolDefineMethod.imported();

        var aliasCtx = ctx.aliasImporting();
        if(aliasCtx != null) {
            var alias = aliasCtx.validName().getLast();
            var item = aliasCtx.getChild(0);
            if(aliasCtx.DEFAULT() != null) {
                // for more than one default in one import
            }

            var name = create(alias);
            named.addNameWithConverted(item.getText(), name);
            SymbolTableUtil.initSymbol(symbolTable, name.getIdentifier(), alias, defineMethod);
            return;
        }

        var validName = create(ctx.validName());
        named.addOriginalName(ctx.validName().getText());
        SymbolTableUtil.initSymbol(symbolTable, validName.getIdentifier(), ctx.validName(), defineMethod);
    }
}