package visitor;

import antlr.ReactParser;

import ast.Declare;
import ast.Declarement;

import symbolTable.SymbolTable;

public class DeclareVisitor extends GeneralVisitor<Declare> {
    public DeclareVisitor(SymbolTable symbolTable) {
        super(symbolTable);
    }

    @Override
    public Declare visitDeclare(ReactParser.DeclareContext ctx) {
        var declare = new Declare(ctx.declarers().getText());
        var declareablesVisitor = new DeclareablesVisitor(symbolTable, declare.getDeclarer());

        for(var syntax : ctx.declareSyntax()){
            var newVar = declareablesVisitor.visit(syntax.declarable());

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
                    var varNew = declareablesVisitor.visit(newVarCtx.declarable());
                    declarement.addAssignment(varNew, newSign);
                }
                declarement.addAssignment(syntax.assignmentRightHand().ASSIGNMENT_OP().getText());
            }

            declare.addDeclarement(declarement);
        }

        return declare;
    }
}
