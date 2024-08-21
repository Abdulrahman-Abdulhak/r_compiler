package ast;

import errors.messages.ErrorMessage;
import symbolTable.SymbolTable;

public class ArrowFunction extends Function {
    public ArrowFunction(Args args, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(args, body, lineDefined, symbolTable);
    }
    public ArrowFunction(Args args, Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(args, exp, lineDefined, symbolTable);
    }
    public ArrowFunction(ValidName arg, FunctionBody body, int lineDefined, SymbolTable symbolTable) {
        super(new Args(arg, lineDefined, symbolTable), body, lineDefined, symbolTable);
    }
    public ArrowFunction(ValidName arg, Expression exp, int lineDefined, SymbolTable symbolTable) {
        super(new Args(arg, lineDefined, symbolTable), exp, lineDefined, symbolTable);
    }

    @Override
    String subType() { return "ArrowFunction"; }

    @Override
    public String nodeName() {
        return "Arrow Function";
    }

    @Override
    public String generate() {
        return args.generate() + " => " + (returnExp != null ? returnExp.generate() : body.generate());
    }
}
