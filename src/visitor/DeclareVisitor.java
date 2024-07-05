package visitor;

import antlr.ReactParser;

import ast.Declare;
import ast.Declarement;
import ast.ValidName;

import symbolTable.SymbolProperties;
import symbolTable.SymbolTable;
import symbolTable.property.SymbolDefineMethod;
import symbolTable.property.SymbolDefinitionLine;

public class DeclareVisitor extends GeneralVisitor<Declare> {
    public DeclareVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Declare visitDeclare(ReactParser.DeclareContext ctx) {
        var declare = new Declare(ctx.declarers().getText());

        for(var syntax : ctx.declareSyntax()){
            var newVar = new DeclareablesVisitor(symbolTable).visit(syntax.declarable());

            Declarement declarement;
            if(syntax.assignmentRightHand() == null) declarement = new Declarement();
            else {
                var exp = new ExpressionVisitor(symbolTable).visit(syntax.assignmentRightHand().expression());
                declarement = new Declarement(exp);
            }

            declarement.addAssignment(newVar);
            if(syntax.assignmentRightHand() != null) {
                for (var newVarCtx : syntax.assignmentRightHand().assignmentDeclarable()) {
                    var newSign = newVarCtx.ASSIGNMENT_OP().getText();
                    var varNew = new DeclareablesVisitor(symbolTable).visit(newVarCtx.declarable());
                    declarement.addAssignment(varNew, newSign);
                }
                declarement.addAssignment(syntax.assignmentRightHand().ASSIGNMENT_OP().getText());
            }

            declare.addDeclarement(declarement);
        }

        for(var dMent : declare.getDeclarements()) {
            for(var d : dMent.getDeclarables()) {
                var symbolProps = new SymbolProperties();
                symbolProps.addProperty(new SymbolDefineMethod(declare.getDeclarer()));
                symbolProps.addProperty(new SymbolDefinitionLine(d.getLineNumber()));

                if(d.getVarName() != null) {
                    symbolTable.insert(d.getVarName(), symbolProps);
                } else if(d.getObj() != null) {
                    for (var objVar : d.getObj().getVars()) {
                        symbolTable.insert(objVar.getVar().getIdentifier(), symbolProps.clone());
                    }
                } else {
                    for(var arrVar : d.getArr().getVarWithDefault().entrySet()) {
                        var name = ((ValidName) (arrVar.getKey())).getIdentifier();
                        symbolTable.insert(name, symbolProps.clone());
                    }
                }
            }
        }

        return declare;
    }
}
