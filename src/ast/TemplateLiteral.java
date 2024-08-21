package ast;

import Util.ToString;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class TemplateLiteral extends JsString {
    List<TemplateLiteralContent> contents;

    public TemplateLiteral(int lineDefined, SymbolTable symbolTable) {
        super("", lineDefined, symbolTable);
        contents = new ArrayList<>();
    }

    public void addContent(String content, int lineDefined) {
        contents.add(new TemplateLiteralContent(content, lineDefined));
    }
    public void addContent(Expression exp, int lineDefined) {
        contents.add(new TemplateLiteralContent(exp, lineDefined, symbolTable));
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

    private String contentGenerate() {
        if(contents == null || contents.isEmpty()) return "";

        var str = new StringBuilder();

        for (var content : contents)
            str.append(content.generate());

        return str.toString();
    }
    @Override
    public String generate() {
        return "`" + contentGenerate() + "`";
    }
}
