package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.TemplateLiteral;

public class TemplateLiteralVisitor extends ReactParserBaseVisitor<TemplateLiteral> {
    @Override
    public TemplateLiteral visitTemplateLiteral(ReactParser.TemplateLiteralContext ctx) {
        var template = new TemplateLiteral();
        var templateContent = ctx.templateLiteralContent();

        for (var content : templateContent) {
            template.addContent(content.getText());
        }

        return template;
    }
}
