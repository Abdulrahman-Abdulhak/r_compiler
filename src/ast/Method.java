package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

public class Method extends Function {
    public Method(ValidName name, Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(name, args, body, lineDefined, symbolTable);
    }

    @Override
    public ErrorMessage errorMessage() {
        return null;
    }

    @Override
    public boolean errorCheck() {
        return false;
    }

    @Override
    String subType() { return "Method"; }

    @Override
    public String nodeName() {
        return "Method";
    }

    @Override
    public String generate() {
        return name.generate() + args.generate() + " " + body.generate();
    }
}
