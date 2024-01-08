package visitor;

import antlr.ReactParser;
import ast.*;

import java.util.List;

public class Util {
    static ObjectDestructuring fromObjDestructuringCtx(ReactParser.ObjectDestructuringContext obj) {
        var wholeDestruct = new ObjectDestructuring();

        for(var d : obj.destructuredObjVar()) {
            DestructuredObjVar destructuredVar;
            boolean haveOriginalName = d.objPropName() != null;
            boolean haveDefaultVal = d.expression() != null;

            var name = new ValidName(d.validName().getText());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor().visit(d.expression());
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

    static ArrayDestructuring fromArrayDestructCtx(ReactParser.ArrayDestructuringContext arr) {
        var destructuredVars = new ArrayDestructuring();

        for(var d : arr.destructuredArrVar()) {
            boolean haveDefaultVal = d.expression() != null;

            var name = new ValidName(d.validName().getText());

            if(haveDefaultVal) {
                var exp = new ExpressionVisitor().visit(d.expression());
                destructuredVars.addVar(name, exp);
            } else {
                destructuredVars.addVar(name);
            }
        }

        return destructuredVars;
    }

    static Args fromArgList(List<ReactParser.ArgContext> argList) {
        var args = new Args();

        for (var arg : argList) {
            if(arg.validName() != null) args.addArgument(new ValidName(arg.validName().getText()));
            if(arg.objectDestructuring() != null) {
                var wholeDestruct = fromObjDestructuringCtx(arg.objectDestructuring());
                args.addArgument(new Arg(wholeDestruct));
            }
            if(arg.arrayDestructuring() != null) {
                var destructuredVars = fromArrayDestructCtx(arg.arrayDestructuring());
                args.addArgument(new Arg(destructuredVars));
            }
        }

        return args;
    }

    static Block fromBlock(ReactParser.BlockContext blockCtx) {
        var block = new Block();
        var lineVisitor = new LineVisitor();

        for (var line : blockCtx.line()) {
            block.addLine(lineVisitor.visit(line));
        }

        return block;
    }

    static void fromAttrList(JSX jsx, List<ReactParser.AttibuteValueContext> attrs) {
        for (var attrCtx : attrs) {
            var name = attrCtx.tagAttribute().getText();
            var js = attrCtx.jsInJsx();

            if(js != null) jsx.addProp(name, new ExpressionVisitor().visit(js.expression()));
            else if (attrCtx.STRING() != null) jsx.addProp(name, attrCtx.STRING().getText());
            else jsx.addProp(name);
        }
    }

    static void forNamedImport(NamedImport named, List<ReactParser.NamedImportItemContext> namedItemsCtx) {
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
