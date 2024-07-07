package Util;

import org.antlr.v4.runtime.ParserRuleContext;

import symbolTable.SymbolProperties;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefinitionLine;
import symbolTable.property.SymbolProperty;

public class SymbolTableUtil {
    public static Integer getLine(ParserRuleContext ctx) {
        var symbol = VisitorUtil.getFirstToken(ctx);
        return symbol == null ? null : symbol.getLine();
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
}
