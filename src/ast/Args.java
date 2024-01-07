package ast;

import java.util.ArrayList;
import java.util.List;

public class Args {
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
                "Arguments",
                ToString.var("args", args)
        );
    }
}
