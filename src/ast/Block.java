package ast;

import java.util.ArrayList;
import java.util.List;

public class Block {
    List<Line> lines;
    public Block() { lines = new ArrayList<>(); }

    public void addLine(Line line) { lines.add(line); }

    @Override
    public String toString() {
        return ToString.self(
                "Block",
                ToString.var("lines", lines)
        );
    }
}
