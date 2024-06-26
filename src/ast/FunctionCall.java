package ast;

import Util.ToString;

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

    private String subType() { return templateLiteral == null ? "" : "TaggedTemplateLiteral"; }

    @Override
    String type() { return ToString.subType("FunctionCall", subType()); }

    @Override
    Object[] members() {
        return new Object[]{
            "nameSpace", nameSpace,
            "parameters", param,
            "parameters", templateLiteral
        };
    }
}
