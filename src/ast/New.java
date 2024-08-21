package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class New extends Expression {
    Expression expression;
    Param param;

    public New(Expression expression, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.expression = expression;
    }
    public New(Expression expression, Param param, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
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
    public ErrorMessage errorMessage() {
        if(expression.errorCheck()) return expression.errorMessage();
        return param.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return expression.errorCheck() || param.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Keyword:" + type();
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(param, expression).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        return "new " + expression.generate() + param.generate();
    }
}
