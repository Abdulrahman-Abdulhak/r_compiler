package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    List<Line> lines;

    public Program(SymbolTable symbolTable) {
        super(0, symbolTable);
        lines = new ArrayList<>();
    }

    public void addLine(Line line) { lines.add(line); }

    @Override
    public String toString() {
        return ToString.self(
            "The Program",
            ToString.list(lines),
            "[",
            "]"
        );
    }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    public String nodeName() {
        return "Program";
    }

    @Override
    public List<Node> childNodes() {
        return lines.stream().map(line -> (Node) line).toList();
    }

    @Override
    public String generate() {
        if(lines == null || lines.isEmpty()) return "";

        var str = new StringBuilder();

        for (var line : lines) {
            if(line == null) continue;

            var generatedLine = line.generate();
            str.append(generatedLine);

            if(lines instanceof  Function) continue;
            str.append(generatedLine.endsWith(";") ? "" : ";");
        }

        return str.toString();
    }
}
