package Util;

import antlr.ReactParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import ast.*;
import symbolTable.SymbolTable;

import visitor.ExpressionVisitor;
import visitor.LineVisitor;

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

    public static Integer getLine(ParserRuleContext ctx) {
        var symbol = VisitorUtil.getFirstToken(ctx);
        return symbol == null ? null : symbol.getLine();
    }

    public static ObjectDestructuring fromObjDestructuringCtx(ReactParser.ObjectDestructuringContext obj, SymbolTable symbolTable) {
        var wholeDestruct = new ObjectDestructuring();

        for(var d : obj.destructuredObjVar()) {
            DestructuredObjVar destructuredVar;
            boolean haveOriginalName = d.objPropName() != null;
            boolean haveDefaultVal = d.expression() != null;

            var name = new ValidName(d.validName().getText());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor(symbolTable).visit(d.expression());
                if(haveOriginalName) {
                    destructuredVar = new DestructuredObjVar(d.objPropName().getText(), name, exp);
                } else {
                    destructuredVar = new DestructuredObjVar(name, exp);
                }
            } else if (haveOriginalName) {
                destructuredVar = new DestructuredObjVar(d.objPropName().getText(), name);
            } else {
                destructuredVar = new DestructuredObjVar(name);
            }

            wholeDestruct.addVar(destructuredVar);
        }

        return wholeDestruct;
    }

    public static ArrayDestructuring fromArrayDestructCtx(ReactParser.ArrayDestructuringContext arr, SymbolTable symbolTable) {
        var destructuredVars = new ArrayDestructuring();

        for(var d : arr.destructuredArrVar()) {
            boolean haveDefaultVal = d.expression() != null;

            var name = new ValidName(d.validName().getText());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor(symbolTable).visit(d.expression());
                destructuredVars.addVar(name, exp);
            } else {
                destructuredVars.addVar(name);
            }
        }

        return destructuredVars;
    }

    public static Args fromArgList(List<ReactParser.ArgContext> argList, SymbolTable symbolTable) {
        var args = new Args();

        for (var arg : argList) {
            if(arg.validName() != null) args.addArgument(new ValidName(arg.validName().getText()));
            if(arg.objectDestructuring() != null) {
                var wholeDestruct = fromObjDestructuringCtx(arg.objectDestructuring(), symbolTable);
                args.addArgument(new Arg(wholeDestruct));
            }
            if(arg.arrayDestructuring() != null) {
                var destructuredVars = fromArrayDestructCtx(arg.arrayDestructuring(), symbolTable);
                args.addArgument(new Arg(destructuredVars));
            }
        }

        return args;
    }

    public static Block fromBlock(ReactParser.BlockContext blockCtx, SymbolTable symbolTable) {
        var block = new Block();
        var lineVisitor = new LineVisitor(symbolTable);

        for (var line : blockCtx.line()) {
            block.addLine(lineVisitor.visit(line));
        }

        return block;
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

    public static void forNamedImport(NamedImport named, List<ReactParser.NamedImportItemContext> namedItemsCtx) {
        for(var itemCtx : namedItemsCtx) {
            if(itemCtx.validName() != null) named.addOriginalName(itemCtx.validName().getText());
            var aliasCtx = itemCtx.aliasImporting();
            if(aliasCtx != null) {
                var alias = aliasCtx.getChild(2).getText();
                String item = aliasCtx.getChild(0).getText();
                if(aliasCtx.DEFAULT() != null) {
                    // for more than one default in one import
                }

                named.addNameWithConverted(item, new ValidName(alias));
            }
        }
    }
}