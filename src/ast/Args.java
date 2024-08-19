package ast;

import Util.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Args extends Node {
    List<Arg> args;
    ValidName rest;

    public Args() { args = new ArrayList<>(); }
    public Args(ValidName arg) {
        args = new ArrayList<>();
        this.addArgument(arg);
    }

    public void addArgument(ValidName arg) { args.add(new Arg(arg)); }
    public void addArgument(Arg arg) { args.add(arg); }

    public void setRest(ValidName rest) { this.rest = rest; }

    @Override
    public String toString() {
        return ToString.self(
            "",
            ToString.list(args),
            "[",
            "]"
        );
    }

    @Override
    public String nodeName() {
        return "Arguments";
    }

    @Override
    public List<Node> childNodes() {
        var children = new ArrayList<Node>(args);
        children.add(rest);

        return children;
    }
}
