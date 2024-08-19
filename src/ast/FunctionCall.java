package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

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

    @Override
    public String nodeName() {
        return "Function Call";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(nameSpace, param, templateLiteral).toList();
    }
}
