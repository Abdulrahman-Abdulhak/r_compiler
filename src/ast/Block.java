package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class Block extends Line {
    List<Line> lines;
    public Block() { lines = new ArrayList<>(); }

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
}
