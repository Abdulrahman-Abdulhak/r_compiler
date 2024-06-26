package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

class TemplateLiteralContent {
    String content;
    Expression variable;

    TemplateLiteralContent(String content) { this.content = content; }
    TemplateLiteralContent(Expression variable) { this.variable = variable; }

    @Override
    public String toString() {
        return content == null ? variable.toString() : content;
    }
}

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
}
