package visitor;

import antlr.ReactParser;

import ast.Arg;
import ast.Args;

import Util.VisitorUtil;
import Util.SymbolTableUtil;

import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

public class ArgsVisitor extends GeneralVisitor<Args> {
    public ArgsVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Args visitArgs(ReactParser.ArgsContext ctx) {
        var args = new Args();

        var defineMethod = SymbolDefineMethod.argument();
        for (var arg : ctx.arg()) {
            if(arg.validName() != null) {
                var nameCtx = arg.validName();
                var argName = VisitorUtil.create(nameCtx);
                args.addArgument(argName);

                var name = argName.getIdentifier();
                SymbolTableUtil.initSymbol(symbolTable, name, nameCtx, defineMethod);
            }
            if(arg.objectDestructuring() != null) {
                var wholeDestruct = VisitorUtil.create(arg.objectDestructuring(), symbolTable, defineMethod);
                args.addArgument(new Arg(wholeDestruct));
            }
            if(arg.arrayDestructuring() != null) {
                var destructuredVars = VisitorUtil.create(arg.arrayDestructuring(), symbolTable, defineMethod);
                args.addArgument(new Arg(destructuredVars));
            }
        }

        return args;
    }
}
