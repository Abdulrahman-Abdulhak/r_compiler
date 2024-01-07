package ast;

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

    @Override
    public String toString() {
        return ToString.self(
                "Block",
                ToString.var("lines", lines)
        );
    }
}
