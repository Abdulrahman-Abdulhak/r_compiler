package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class Param extends Node {
    List<Expression> parameters;

    public Param(int lineDefined) {
        super(lineDefined);
        parameters = new ArrayList<>();
    }

    public void addNewParameter(Expression exp) { parameters.add(exp); }

    @Override
    public String toString() {
        return ToString.self(
            "",
            ToString.list(parameters),
            "[",
            "]"
        );
    }

    @Override
    public String nodeName() {
        return "Parameters";
    }

    @Override
    public List<Node> childNodes() {
        return parameters.stream().map(item -> (Node) item).toList();
    }
}
