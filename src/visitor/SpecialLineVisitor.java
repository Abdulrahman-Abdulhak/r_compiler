package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Break;
import ast.Continue;
import ast.Return;
import ast.SpecialLine;

public class SpecialLineVisitor extends ReactParserBaseVisitor<SpecialLine> {
    @Override
    public SpecialLine visitSpecialLine(ReactParser.SpecialLineContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Break visitBreak(ReactParser.BreakContext ctx) {
        var label = ctx.STRING();
        if(label != null) return new Break(label.getText());
        return new Break();
    }

    @Override
    public Continue visitContinue(ReactParser.ContinueContext ctx) {
        var label = ctx.STRING();
        if(label != null) return new Continue(label.getText());
        return new Continue();
    }

    @Override
    public Return visitReturn(ReactParser.ReturnContext ctx) {
        return new Return(new ExpressionVisitor().visit(ctx.expression()));
    }
}
