package visitor;

import antlr.ReactParser;

import ast.ImportForm;

import Util.VisitorUtil;
import Util.SymbolTableUtil;

import errors.Error;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;

public class ImportFormVisitor extends GeneralVisitor<ImportForm> {
    public ImportFormVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public ImportForm visitDefaultImport(ReactParser.DefaultImportContext ctx) {
        var name = VisitorUtil.create(ctx.validName(), symbolTable);

        SymbolTableUtil.initSymbol(symbolTable, name.getIdentifier(), ctx.validName(), SymbolDefineMethod.imported());

        return new ImportForm(name, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ImportForm visitNamedImportForm(ReactParser.NamedImportFormContext ctx) {
        var named = VisitorUtil.create(ctx.namedImport(), symbolTable);
        return new ImportForm(named, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ImportForm visitFullImportForm(ReactParser.FullImportFormContext ctx) {
        var fullCtx = ctx.fullImport().validName();
        var fullName = VisitorUtil.create(fullCtx, symbolTable);

        SymbolTableUtil.initSymbol(symbolTable, fullName.getIdentifier(), fullCtx, SymbolDefineMethod.imported());

        return new ImportForm(fullName, true, SymbolTableUtil.getLine(ctx), symbolTable);
    }

    @Override
    public ImportForm visitDefaultAndNamedImport(ReactParser.DefaultAndNamedImportContext ctx) {
        var namedItemsCtx = ctx.namedImport();
        var named = VisitorUtil.create(namedItemsCtx, symbolTable);

        var defaultImport = VisitorUtil.create(ctx.validName(), symbolTable);
        var form = new ImportForm(defaultImport, named, SymbolTableUtil.getLine(ctx), symbolTable);
        SymbolTableUtil.initSymbol(
            symbolTable,
            defaultImport.getIdentifier(),
            ctx.validName(),
            SymbolDefineMethod.imported()
        );

        return form;
    }

    @Override
    public ImportForm visitDefaultAndFullImport(ReactParser.DefaultAndFullImportContext ctx) {
        var defaultCtx = ctx.validName();
        var defaultName = VisitorUtil.create(defaultCtx, symbolTable);

        var fullCtx = ctx.fullImport().validName();
        var fullName = VisitorUtil.create(fullCtx, symbolTable);

        SymbolTableUtil.initSymbol(symbolTable, defaultName.getIdentifier(), defaultCtx, SymbolDefineMethod.imported());
        SymbolTableUtil.initSymbol(symbolTable, fullName.getIdentifier(), fullCtx, SymbolDefineMethod.imported());

        return new ImportForm(defaultName, fullName, SymbolTableUtil.getLine(ctx), symbolTable);
    }
}
