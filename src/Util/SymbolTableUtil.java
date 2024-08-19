package Util;

import org.antlr.v4.runtime.ParserRuleContext;

import org.antlr.v4.runtime.tree.TerminalNode;
import symbolTable.SymbolProperties;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefinitionLine;
import symbolTable.property.SymbolProperty;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableUtil {
    public static int getLine(ParserRuleContext ctx) {
        var symbol = VisitorUtil.getFirstToken(ctx);
        return symbol == null ? 0 : symbol.getLine();
    }
    public static int getLine(TerminalNode node) {
        var symbol = node.getSymbol();
        return symbol == null ? 0 : symbol.getLine();
    }

    public static void initSymbol(
            SymbolTable table,
            String symbol,
            ParserRuleContext symbolCtx,
            SymbolProperty... initialProperties
    ) {
        if(table == null) return;

        var line = getLine(symbolCtx);
        var properties = new SymbolProperties();

        for (var prop : initialProperties)
            properties.addProperty(prop);

        properties.addProperty(new SymbolDefinitionLine(line));
        table.insert(symbol, properties);
    }

    public static void print(SymbolTable table) {
        var tables = new ArrayList<SymbolTable>();
        tables.add(table);
        print(tables);
    }
    public static void print(List<SymbolTable> tables) {
        while (!tables.isEmpty()) {
            var table = tables.removeFirst();
            System.out.println(table.toString());

            tables.addAll(table.getChildren());
        }
    }
}
