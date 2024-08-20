package ast;

import java.util.List;
import java.util.stream.Stream;

public class Comma extends Expression {
    Expression expression1, expression2;

    public Comma(Expression expression1, Expression expression2, int defineLine) {
        super(defineLine);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public Expression getExpression1() {
        return expression1;
    }
    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }
    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    @Override
    String type() {
        return "CommaOperator";
    }

    @Override
    Object[] members() {
        return new Object[]{"expression1", expression1, "expression2", expression2};
    }

    @Override
    public String nodeName() {
        return "Comma Operator";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression1, expression2).map(item -> (Node) item).toList();
    }
}
