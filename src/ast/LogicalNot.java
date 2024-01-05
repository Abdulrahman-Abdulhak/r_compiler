package ast;

public class LogicalNot extends Expression {
    Expression expression;

    public LogicalNot(Expression exp) { expression = exp; }

    @Override
    String type() { return "LogicalNot"; }

    @Override
    Object[] members() {
        return new Object[]{};
    }
}
