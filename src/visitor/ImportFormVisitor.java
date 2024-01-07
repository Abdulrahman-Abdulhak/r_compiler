package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.ImportForm;
import ast.NamedImport;
import ast.ValidName;

public class ImportFormVisitor extends ReactParserBaseVisitor<ImportForm> {
    @Override
    public ImportForm visitDefaultImport(ReactParser.DefaultImportContext ctx) {
        return new ImportForm(new ValidName(ctx.validName().getText()));
    }

    @Override
    public ImportForm visitNamedImportForm(ReactParser.NamedImportFormContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        Util.forNamedImport(named, namedItemsCtx);

        return new ImportForm(named);
    }

    @Override
    public ImportForm visitFullImportForm(ReactParser.FullImportFormContext ctx) {
        return new ImportForm(new ValidName(ctx.fullImport().validName().getText()), true);
    }

    @Override
    public ImportForm visitDefaultAndNamedImport(ReactParser.DefaultAndNamedImportContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        Util.forNamedImport(named, namedItemsCtx);

        return new ImportForm(new ValidName(ctx.validName().getText()), named);
    }

    @Override
    public ImportForm visitDefaultAndFullImport(ReactParser.DefaultAndFullImportContext ctx) {
        return new ImportForm(
                new ValidName(ctx.validName().getText()),
                new ValidName(ctx.fullImport().validName().getText())
        );
    }
}
