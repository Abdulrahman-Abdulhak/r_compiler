package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Param extends Node {
    List<Expression> parameters;

    public Param(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        parameters = new ArrayList<>();
    }

    public void addNewParameter(Expression exp) { parameters.add(exp); }

    @Override
    public ErrorMessage errorMessage() {
        var errorParameters = parameters.stream().filter(Node::errorCheck).toList();
        var errorParam = errorParameters.isEmpty() ? null : errorParameters.getFirst();

        if(errorParam != null) return errorParam.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return parameters.stream().anyMatch(Node::errorCheck);
    }

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

    private String parametersGenerate() {
        if(parameters == null || parameters.isEmpty()) return "";

        var str = new StringBuilder();

        for (var param : parameters) {
            str.append(param.generate());
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }

    @Override
    public String generate() {
        return "(" + parametersGenerate() + ")";
    }
}
