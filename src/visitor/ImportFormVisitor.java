package visitor;

import Util.VisitorUtil;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.ImportForm;
import ast.NamedImport;
import ast.ValidName;
import symbolTable.Row;
import symbolTable.SymbolTable;

public class ImportFormVisitor extends ReactParserBaseVisitor<ImportForm> {
    @Override
    public ImportForm visitDefaultImport(ReactParser.DefaultImportContext ctx) {
        var form = new ImportForm(new ValidName(ctx.validName().getText()));
        SymbolTable.main.addRow(new Row("Import", form.getTheDefault().getIdentifier()));
        return form;
    }

    @Override
    public ImportForm visitNamedImportForm(ReactParser.NamedImportFormContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        VisitorUtil.forNamedImport(named, namedItemsCtx);

        var form = new ImportForm(named);

        for(var name : named.finalNames()) {
            SymbolTable.main.addRow(new Row("Import", name));
        }

        return form;
    }

    @Override
    public ImportForm visitFullImportForm(ReactParser.FullImportFormContext ctx) {
        var form = new ImportForm(new ValidName(ctx.fullImport().validName().getText()), true);
        SymbolTable.main.addRow(new Row("Import", form.getFullImportAlias().getIdentifier()));
        return form;
    }

    @Override
    public ImportForm visitDefaultAndNamedImport(ReactParser.DefaultAndNamedImportContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        VisitorUtil.forNamedImport(named, namedItemsCtx);

        var form = new ImportForm(new ValidName(ctx.validName().getText()), named);
        SymbolTable.main.addRow(new Row("Import", form.getTheDefault().getIdentifier()));
        for(var name : named.finalNames()) {
            SymbolTable.main.addRow(new Row("Import", name));
        }

        return form;
    }

    @Override
    public ImportForm visitDefaultAndFullImport(ReactParser.DefaultAndFullImportContext ctx) {
        var form = new ImportForm(
                new ValidName(ctx.validName().getText()),
                new ValidName(ctx.fullImport().validName().getText())
        );

        SymbolTable.main.addRow(new Row("Import", form.getTheDefault().getIdentifier()));
        SymbolTable.main.addRow(new Row("Import", form.getFullImportAlias().getIdentifier()));

        return form;
    }
}
