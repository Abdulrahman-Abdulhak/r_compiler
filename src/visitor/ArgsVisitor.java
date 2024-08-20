package visitor;

import antlr.ReactParser;

import ast.Arg;
import ast.Args;

import Util.VisitorUtil;
import Util.SymbolTableUtil;

import errors.Error;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

public class ArgsVisitor extends GeneralVisitor<Args> {
    public ArgsVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public Args visitArgs(ReactParser.ArgsContext ctx) {
        var args = new Args(SymbolTableUtil.getLine(ctx));

        var defineMethod = SymbolDefineMethod.argument();
        for (var arg : ctx.arg()) {
            if(arg.validName() != null) {
                var nameCtx = arg.validName();
                var argName = VisitorUtil.create(nameCtx);
                args.addArgument(argName, SymbolTableUtil.getLine(nameCtx));

                var name = argName.getIdentifier();
                SymbolTableUtil.initSymbol(symbolTable, name, nameCtx, defineMethod);
            }
            if(arg.objectDestructuring() != null) {
                var wholeDestruct = VisitorUtil.create(arg.objectDestructuring(), symbolTable, errors, defineMethod);
                args.addArgument(new Arg(wholeDestruct, SymbolTableUtil.getLine(arg.objectDestructuring())));
            }
            if(arg.arrayDestructuring() != null) {
                var destructuredVars = VisitorUtil.create(arg.arrayDestructuring(), symbolTable, errors, defineMethod);
                args.addArgument(new Arg(destructuredVars, SymbolTableUtil.getLine(arg.arrayDestructuring())));
            }
        }

        return args;
    }
}
