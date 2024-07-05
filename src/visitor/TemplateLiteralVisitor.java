package visitor;

import antlr.ReactParser;

import ast.TemplateLiteral;
import symbolTable.SymbolTable;

public class TemplateLiteralVisitor extends GeneralVisitor<TemplateLiteral> {
    public TemplateLiteralVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public TemplateLiteral visitTemplateLiteral(ReactParser.TemplateLiteralContext ctx) {
        var template = new TemplateLiteral();

        for (var content : ctx.templateLiteralContent())
            template.addContent(content.getText());

        return template;
    }
}
