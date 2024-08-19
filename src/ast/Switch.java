package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Line {
    Expression test;
    List<Case> cases;

    public Switch(Expression test) {
        this(test, new ArrayList<>());
    }
    public Switch(Expression test, List<Case> cases) {
        this.test = test;
        this.cases = cases;
    }

    @Override
    String lineContent() {
        return ToString.self(
            "switch",
            ToString.allNotNull("expression", test, "cases", cases)
        );
    }

    @Override
    public String nodeName() {
        return "Switch";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>();
        children.add(test);
        children.addAll(cases);

        return children;
    }
}
