package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Line> lines;

    public Program() { lines = new ArrayList<>(); }

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
}
