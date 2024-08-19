package ast;

import Util.ToString;

import java.util.List;

public class Continue extends SpecialLine {
    String label;
    public Continue(int lineDefined) {
        super(lineDefined);
    }
    public Continue(String label, int lineDefined) {
        super(lineDefined);
        this.label = label;
    }

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
