package ast;

public class FunctionCall extends Expression {
    Param param;
    TemplateLiteral templateLiteral;
    Expression nameSpace;

    public FunctionCall(Expression functionNameSpace, Param param) {
        nameSpace = functionNameSpace;
        this.param = param;
    }
    public FunctionCall(Expression functionNameSpace, TemplateLiteral param) {
        nameSpace = functionNameSpace;
        templateLiteral = param;
    }

    private String subType() {
        if(templateLiteral != null) return ":TaggedTemplateLiteral";

        return "";
    }

    @Override
    String type() { return "FunctionCall" + subType(); }

    @Override
    Object[] members() {
        return new Object[]{
            "nameSpace", nameSpace,
            "param", param,
            "param", templateLiteral
        };
    }
}
