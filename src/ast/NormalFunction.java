package ast;

import symbolTable.SymbolTable;

public class NormalFunction extends Function {
    public NormalFunction(ValidName name, Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(name, args, body, lineDefined, symbolTable);
    }

    @Override
    String subType() { return null; }

    @Override
    public String nodeName() {
        return "Function";
    }

    @Override
    public String generate() {
        return "function " + name.generate() + args.generate() + " " + body.generate();
    }
}
