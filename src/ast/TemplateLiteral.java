package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class TemplateLiteral extends JsString {
    List<TemplateLiteralContent> contents;

    public TemplateLiteral() {
        super("");
        contents = new ArrayList<>();
    }

    public void addContent(String content) {
        contents.add(new TemplateLiteralContent(content));
    }
    public void addContent(Expression exp) {
        contents.add(new TemplateLiteralContent(exp));
    }

    @Override
    public String toString() {
        return ToString.self(
            "TemplateLiteral",
            ToString.list(contents),
            "[",
            "]"
        );
    }

    @Override
    public String nodeName() {
        return "Template Literal";
    }

    @Override
    public List<Node> childNodes() {
        return contents.stream().map(item -> (Node) item).toList();
    }
}
