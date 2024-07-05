package visitor;

import antlr.ReactParser;

import ast.ImportForm;
import ast.NamedImport;
import ast.ValidName;

import Util.VisitorUtil;
import symbolTable.SymbolProperties;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;
import symbolTable.property.SymbolDefinitionLine;

public class ImportFormVisitor extends GeneralVisitor<ImportForm> {
    public ImportFormVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public ImportForm visitDefaultImport(ReactParser.DefaultImportContext ctx) {
        var form = new ImportForm(new ValidName(ctx.validName().getText()));

        var tableProps = new SymbolProperties();
        tableProps.addProperty(SymbolDefineMethod.imported());
        tableProps.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));
        symbolTable.insert(form.getTheDefault().getIdentifier(), tableProps);

        return form;
    }

    @Override
    public ImportForm visitNamedImportForm(ReactParser.NamedImportFormContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        VisitorUtil.forNamedImport(named, namedItemsCtx);

        var form = new ImportForm(named);

        var tableProps = new SymbolProperties();
        tableProps.addProperty(SymbolDefineMethod.imported());
        tableProps.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));

        for(var name : named.finalNames())
            symbolTable.insert(name, tableProps.clone());

        return form;
    }

    @Override
    public ImportForm visitFullImportForm(ReactParser.FullImportFormContext ctx) {
        var form = new ImportForm(new ValidName(ctx.fullImport().validName().getText()), true);

        var tableProps = new SymbolProperties();
        tableProps.addProperty(SymbolDefineMethod.imported());
        tableProps.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));
        symbolTable.insert(form.getFullImportAlias().getIdentifier(), tableProps);

        return form;
    }

    @Override
    public ImportForm visitDefaultAndNamedImport(ReactParser.DefaultAndNamedImportContext ctx) {
        var named = new NamedImport();

        var namedItemsCtx = ctx.namedImport().namedImportItem();
        VisitorUtil.forNamedImport(named, namedItemsCtx);

        var form = new ImportForm(new ValidName(ctx.validName().getText()), named);

        var tableProps = new SymbolProperties();
        tableProps.addProperty(SymbolDefineMethod.imported());
        tableProps.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));

        symbolTable.insert(form.getTheDefault().getIdentifier(), tableProps);
        for(var name : named.finalNames())
            symbolTable.insert(name, tableProps.clone());

        return form;
    }

    @Override
    public ImportForm visitDefaultAndFullImport(ReactParser.DefaultAndFullImportContext ctx) {
        var form = new ImportForm(
                new ValidName(ctx.validName().getText()),
                new ValidName(ctx.fullImport().validName().getText())
        );

        var tableProps = new SymbolProperties();
        tableProps.addProperty(SymbolDefineMethod.imported());
        tableProps.addProperty(new SymbolDefinitionLine(VisitorUtil.getLine(ctx)));

        symbolTable.insert(form.getTheDefault().getIdentifier(), tableProps);
        symbolTable.insert(form.getFullImportAlias().getIdentifier(), tableProps.clone());

        return form;
    }
}
