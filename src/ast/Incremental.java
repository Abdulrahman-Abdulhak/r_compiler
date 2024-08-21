package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class Incremental extends Expression {
    boolean increase, post;
    Expression expression;

    public Incremental(Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        expression = exp;
    }

    public void setIncrease(boolean increase) { this.increase = increase; }

    public void setPost(boolean post) { this.post = post; }

    private String subType() {
        var str = ":";

        str += increase ? "inc" : "dec";
        str += post ? ":post" : ":pre";

        return str;
    }

    @Override
    String type() { return "Incremental" + subType(); }

    @Override
    Object[] members() {
        return new Object[]{"expression", expression};
    }

    @Override
    public ErrorMessage errorMessage() {
        return expression.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return expression.errorCheck();
    }

    @Override
    public String nodeName() {
        return type();
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(expression).map(item -> (Node) item).toList();
    }

    public String sign() {
        return increase ? "++" : "--";
    }

    @Override
    public String generate() {
        var exp = expression.generate();
        return post ? exp + sign() : sign() + exp;
    }
}
