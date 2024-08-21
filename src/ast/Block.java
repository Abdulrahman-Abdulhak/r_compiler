package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Block extends Line {
    List<Line> lines;
    public Block(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        lines = new ArrayList<>();
    }

    @Override
    public ErrorMessage errorMessage() {
        var errorLines = lines.stream().filter(Node::errorCheck).toList();
        var errorLine = errorLines.isEmpty() ? null : errorLines.getFirst();

        if(errorLine == null) return null;
        return errorLine.errorMessage();
    }

    @Override
    public boolean errorCheck() {
        return lines.stream().anyMatch(Node::errorCheck);
    }

    public void addLine(Line line) { lines.add(line); }

    @Override
    String lineContent() {
        return null;
    }

    String type() {
        return "Block";
    }

    @Override
    public String toString() {
        return ToString.self(
            type(),
            ToString.var("lines", lines)
        );
    }

    @Override
    public String nodeName() {
        return "Block";
    }

    @Override
    public List<Node> childNodes() {
        return lines.stream().map(line -> (Node) line).toList();
    }

    @Override
    public String generate() {
        if(lines.isEmpty()) return "{}";

        var str = new StringBuilder("{");

        for (var line : lines) {
            var lineGenerated = line.generate();
            str.append(lineGenerated);
            str.append(lineGenerated.endsWith(";") ? "" : ";");
        }
        str.append("}");

        return str.toString();
    }
}
