package ast;

import java.util.ArrayList;
import java.util.List;

public class Args {
    public static Args fromValidName(ValidName arg) {
        Args args = new Args();
        args.addArgument(arg);
        return args;
    }

    List<ValidName> args;
    ValidName rest;
    public Args() { args = new ArrayList<>(); }

    public void addArgument(ValidName arg) { args.add(arg); }

    public void setRest(ValidName rest) { this.rest = rest; }

    @Override
    public String toString() {
        return ToString.self(
                "Arguments",
                ToString.var("args", args)
        );
    }
}
