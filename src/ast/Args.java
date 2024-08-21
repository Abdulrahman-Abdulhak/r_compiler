package ast;

import Util.ToString;
import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Args extends Node {
    List<Arg> args;
    ValidName rest;

    public Args(int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        args = new ArrayList<>();
    }
    public Args(ValidName arg, int lineDefined, SymbolTable symbolTable) {
        super(lineDefined, symbolTable);
        args = new ArrayList<>();
        this.addArgument(arg, lineDefined, symbolTable);
    }

    public void addArgument(ValidName arg, int lineDefined, SymbolTable symbolTable) {
        args.add(new Arg(arg, lineDefined, symbolTable));
    }
    public void addArgument(Arg arg) { args.add(arg); }

    public void setRest(ValidName rest) { this.rest = rest; }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

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

    private String argsGenerate() {
        if(args == null || args.isEmpty()) return "";

        var str = new StringBuilder();
        for (var arg : args) {
            str.append(arg.generate());
            str.append(",");
        }
        str.replace(str.length() - 1, str.length(), "");

        return str.toString();
    }
    @Override
    public String generate() {
        var rest = this.rest == null ? "" : "..." + this.rest.generate();
        var args = argsGenerate();
        var separator = rest.isEmpty() || args.isEmpty() ? "" : ",";

        return "(" + args + separator + rest + ")";
    }
}
