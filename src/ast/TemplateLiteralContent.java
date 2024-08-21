package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.List;
import java.util.stream.Stream;

public class TemplateLiteralContent extends Node {
    String content;
    Expression variable;

    TemplateLiteralContent(String content, int lineDefined) {
        super(lineDefined, null);
        this.content = content;
    }
    TemplateLiteralContent(Expression variable, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        this.variable = variable;
    }

    @Override
    public String toString() {
        return content == null ? variable.toString() : content;
    }

    @Override
    public ErrorMessage errorMessage() {
        if(variable != null) return variable.errorMessage();
        return null;
    }

    @Override
    public boolean errorCheck() {
        return variable.errorCheck();
    }

    @Override
    public String nodeName() {
        return "Template Literal Content";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(variable).map(item -> (Node) item).toList();
    }

    @Override
    public String generate() {
        if(content != null) return content;
        return "${" + variable.generate() + "}";
    }
}