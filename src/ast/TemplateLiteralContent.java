package ast;

import java.util.List;
import java.util.stream.Stream;

public class TemplateLiteralContent extends Node {
    String content;
    Expression variable;

    TemplateLiteralContent(String content) { this.content = content; }
    TemplateLiteralContent(Expression variable) { this.variable = variable; }

    @Override
    public String toString() {
        return content == null ? variable.toString() : content;
    }

    @Override
    public String nodeName() {
        return "Template Literal Content";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(variable).map(item -> (Node) item).toList();
    }
}