package ast;

import Util.ToString;

import java.util.List;
import java.util.stream.Stream;

public class Arg extends Node {
    ValidName name;
    ObjectDestructuring obj;
    ArrayDestructuring arr;

    public Arg(ValidName name) { this.name = name; }
    public Arg(ObjectDestructuring obj) { this.obj = obj; }
    public Arg(ArrayDestructuring arr) { this.arr = arr; }

    @Override
    public String toString() {
        return ToString.self(
            "arg",
            ToString.allNotNull("var", name, "vars", obj, "vars", arr)
        );
    }

    @Override
    public String nodeName() {
        return "Argument";
    }

    @Override
    public List<Node> childNodes() {
        return Stream.of(name, obj, arr).toList();
    }
}
