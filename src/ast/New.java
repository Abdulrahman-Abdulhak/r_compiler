package ast;

import java.util.List;
import java.util.stream.Stream;

public class New extends Expression {
    Expression expression;
    Param param;

    public New(Expression expression) { this.expression = expression; }
    public New(Expression expression, Param param) {
        this.expression = expression;
        this.param = param;
    }

    public void setParam(Param param) {
        this.param = param;
    }

    private String subType() {
        if(param == null) return ":NoParam";
        return "";
    }

    @Override
    String type() { return "New" + subType(); }

    @Override
    Object[] members() {
        return new Object[]{"expression", expression, "param", param};
    }

    @Override
    public String nodeName() {
        return "Keyword:" + type();
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(param, expression).map(item -> (Node) item).toList();
    }
}
