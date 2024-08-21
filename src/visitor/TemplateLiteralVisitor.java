package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.TemplateLiteral;
import errors.Error;
import symbolTable.SymbolTable;

public class TemplateLiteralVisitor extends GeneralVisitor<TemplateLiteral> {
    public TemplateLiteralVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public TemplateLiteral visitTemplateLiteral(ReactParser.TemplateLiteralContext ctx) {
        var template = new TemplateLiteral(SymbolTableUtil.getLine(ctx), symbolTable);

        for (var content : ctx.templateLiteralContent())
            template.addContent(content.getText(), SymbolTableUtil.getLine(content));

        return template;
    }
}
