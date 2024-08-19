package ast;

import Util.ToString;

import java.util.List;

public class Break extends SpecialLine {
    String label;
    public Break() {}
    public Break(String label) { this.label = label; }

    @Override
    String lineContent() {
        return ToString.var("break", label);
    }

    @Override
    public String nodeName() {
        return "Line:Break " + label;
    }

    @Override
    public List<Node> childNodes() {
        return null;
    }
}
