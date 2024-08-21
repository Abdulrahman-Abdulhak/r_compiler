package visitor;

import Util.SymbolTableUtil;
import antlr.ReactParser;

import ast.Declare;
import ast.Declarement;

import errors.Error;
import symbolTable.SymbolTable;
import symbolTable.VariableDefineMethod;

public class DeclareVisitor extends GeneralVisitor<Declare> {
    public DeclareVisitor(SymbolTable symbolTable, Error errors) {
        super(symbolTable, errors);
    }

    @Override
    public Declare visitDeclare(ReactParser.DeclareContext ctx) {
        var declare = new Declare(ctx.declarers().getText(), SymbolTableUtil.getLine(ctx.declarers()), symbolTable);

        var declarers = declare.getDeclarer();
        var declareablesVisitor = new DeclareablesVisitor(symbolTable, errors, declarers);

        for(var syntax : ctx.declareSyntax()){
            var newVar = declareablesVisitor.visit(syntax.declarable());

            Declarement declarement;
            if(syntax.assignmentRightHand() == null) declarement = new Declarement(SymbolTableUtil.getLine(syntax.declarable()), symbolTable);
            else {
                var exp = new ExpressionVisitor(symbolTable, errors).visit(syntax.assignmentRightHand().expression());
                declarement = new Declarement(exp, SymbolTableUtil.getLine(syntax.assignmentRightHand()), symbolTable);
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
