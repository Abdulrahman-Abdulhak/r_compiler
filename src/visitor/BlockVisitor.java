package visitor;

import antlr.ReactParser;
import ast.Block;
import symbolTable.SymbolTable;

public class BlockVisitor extends GeneralVisitor<Block> {

    public BlockVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Block visitBlock(ReactParser.BlockContext ctx) {
        var block = new Block();
        var lineVisitor = new LineVisitor(symbolTable);

        for (var line : ctx.line())
            block.addLine(lineVisitor.visit(line));

        return block;
    }
}
