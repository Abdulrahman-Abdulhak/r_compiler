package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;
import ast.Block;
import ast.FunctionBody;
import errors.Error;
import symbolTable.SymbolTable;

public class BlockVisitor extends GeneralVisitor<Block> {

    public BlockVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public Block visitBlock(ReactParser.BlockContext ctx) {
        var block = new Block(SymbolTableUtil.getLine(ctx), symbolTable);

        var lineVisitor = new LineVisitor(symbolTable, errors);

        for (var line : ctx.allLines())
            block.addLine(lineVisitor.visit(line));

        return block;
    }

    @Override
    public FunctionBody visitFunctionBody(ReactParser.FunctionBodyContext ctx) {
        var body = new FunctionBody(SymbolTableUtil.getLine(ctx), symbolTable);

        var lineVisitor = new LineVisitor(symbolTable, errors);

        for (var line : ctx.functionLines())
            body.addLine(lineVisitor.visit(line));

        return body;
    }
}
