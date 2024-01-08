package visitor;

import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import ast.Declare;
import ast.Declarement;
import ast.ValidName;
import symbolTable.Row;
import symbolTable.SymbolTable;

public class DeclareVisitor extends ReactParserBaseVisitor<Declare> {
    @Override
    public Declare visitDeclare(ReactParser.DeclareContext ctx) {
        var decalre = new Declare(ctx.declarers().getText());

        for(var syntax : ctx.declareSyntax()){
            var newVar = new DeclareablesVisitor().visit(syntax.declarable());

            Declarement declarement;
            if(syntax.assignmentRightHand() == null) declarement = new Declarement();
            else {
                var exp = new ExpressionVisitor().visit(syntax.assignmentRightHand().expression());
                declarement = new Declarement(exp);
            }

            declarement.addAssignment(newVar);
            if(syntax.assignmentRightHand() != null) {
                for (var newVarCtx : syntax.assignmentRightHand().assignmentDeclarable()) {
                    var newSign = newVarCtx.ASSIGNMENT_OP().getText();
                    var varNew = new DeclareablesVisitor().visit(newVarCtx.declarable());
                    declarement.addAssignment(varNew, newSign);
                }
                declarement.addAssignment(syntax.assignmentRightHand().ASSIGNMENT_OP().getText());
            }

            decalre.addDeclarement(declarement);
        }

        for(var dMent : decalre.getDeclarements()) {
            for(var d : dMent.getDeclarables()) {
                if(d.getVarName() != null) {
                    SymbolTable.main.addRow(new Row(decalre.getDeclarer(), d.getVarName()));
                } else if(d.getObj() != null) {
                    for (var objVar : d.getObj().getVars()) {
                        SymbolTable.main.addRow(new Row(decalre.getDeclarer(), objVar.getVar().getIdentifier()));
                    }
                } else {
                    for(var arrVar : d.getArr().getVarWithDefault().entrySet()) {
                        var name = (ValidName) (arrVar.getKey());
                        SymbolTable.main.addRow(new Row(decalre.getDeclarer(), name.getIdentifier()));
                    }
                }
            }
        }

        return decalre;
    }
}
