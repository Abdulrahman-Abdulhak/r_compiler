package ast;

import Util.ToString;

import java.util.List;

public class Continue extends SpecialLine {
    String label;
    public Continue() {}
    public Continue(String label) { this.label = label; }

    @Override
    String lineContent() {
        return ToString.var("continue", label);
    }


    @Override
    public String nodeName() {
        return "Line:Continue " + label;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
