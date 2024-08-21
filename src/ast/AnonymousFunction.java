package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

public class AnonymousFunction extends Function {
    public AnonymousFunction(Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(args, body, lineDefined, symbolTable);
    }

    @Override
    String subType() { return "Anonymous"; }

    @Override
    public String nodeName() {
        return "Anonymous Function";
    }

    @Override
    public String generate() {
        return "function " + args.generate() + " " + body.generate();
    }
}
