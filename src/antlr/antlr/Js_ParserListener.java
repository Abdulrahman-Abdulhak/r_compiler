// Generated from C:/Files/Java/r_compiler/src/antlr/Js_Parser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Js_Parser}.
 */
public interface Js_ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Js_Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Js_Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Js_Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(Js_Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(Js_Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#lineStart}.
	 * @param ctx the parse tree
	 */
	void enterLineStart(Js_Parser.LineStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#lineStart}.
	 * @param ctx the parse tree
	 */
	void exitLineStart(Js_Parser.LineStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Js_Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Js_Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Js_Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Js_Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalExpression}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNormalExpression(Js_Parser.NormalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalExpression}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNormalExpression(Js_Parser.NormalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(Js_Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(Js_Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Js_Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Js_Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(Js_Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(Js_Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#forin}.
	 * @param ctx the parse tree
	 */
	void enterForin(Js_Parser.ForinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#forin}.
	 * @param ctx the parse tree
	 */
	void exitForin(Js_Parser.ForinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#forof}.
	 * @param ctx the parse tree
	 */
	void enterForof(Js_Parser.ForofContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#forof}.
	 * @param ctx the parse tree
	 */
	void exitForof(Js_Parser.ForofContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(Js_Parser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(Js_Parser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(Js_Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(Js_Parser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(Js_Parser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(Js_Parser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentRightHand(Js_Parser.AssignmentRightHandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentRightHand(Js_Parser.AssignmentRightHandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(Js_Parser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(Js_Parser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(Js_Parser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(Js_Parser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Js_Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Js_Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Js_Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Js_Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(Js_Parser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(Js_Parser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNOT(Js_Parser.LogicalNOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNOT(Js_Parser.LogicalNOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(Js_Parser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(Js_Parser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(Js_Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(Js_Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAND(Js_Parser.LogicalANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAND(Js_Parser.LogicalANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR_logicalNull(Js_Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR_logicalNull(Js_Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreInc(Js_Parser.PreIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreInc(Js_Parser.PreIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterByVal(Js_Parser.ByValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitByVal(Js_Parser.ByValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(Js_Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(Js_Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(Js_Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(Js_Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncre(Js_Parser.PostIncreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncre(Js_Parser.PostIncreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareWithEqual(Js_Parser.CompareWithEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareWithEqual(Js_Parser.CompareWithEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Js_Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Js_Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Js_Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Js_Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#scopeHead}.
	 * @param ctx the parse tree
	 */
	void enterScopeHead(Js_Parser.ScopeHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#scopeHead}.
	 * @param ctx the parse tree
	 */
	void exitScopeHead(Js_Parser.ScopeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#scopeBody}.
	 * @param ctx the parse tree
	 */
	void enterScopeBody(Js_Parser.ScopeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#scopeBody}.
	 * @param ctx the parse tree
	 */
	void exitScopeBody(Js_Parser.ScopeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Js_Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Js_Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#forExpression1}.
	 * @param ctx the parse tree
	 */
	void enterForExpression1(Js_Parser.ForExpression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#forExpression1}.
	 * @param ctx the parse tree
	 */
	void exitForExpression1(Js_Parser.ForExpression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(Js_Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(Js_Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Js_Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Js_Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Js_Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Js_Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Js_Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Js_Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(Js_Parser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(Js_Parser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterObjectVal(Js_Parser.ObjectValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitObjectVal(Js_Parser.ObjectValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVal(Js_Parser.ArrayValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVal(Js_Parser.ArrayValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVal(Js_Parser.FunctionValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVal(Js_Parser.FunctionValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Js_Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Js_Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#incrementsOp}.
	 * @param ctx the parse tree
	 */
	void enterIncrementsOp(Js_Parser.IncrementsOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#incrementsOp}.
	 * @param ctx the parse tree
	 */
	void exitIncrementsOp(Js_Parser.IncrementsOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(Js_Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(Js_Parser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(Js_Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(Js_Parser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#assinmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssinmentOp(Js_Parser.AssinmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#assinmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssinmentOp(Js_Parser.AssinmentOpContext ctx);
}