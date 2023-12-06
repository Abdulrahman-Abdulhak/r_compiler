// Generated from C:/Files/Java/r_compiler/src/antlr/Js_Parser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Js_Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Js_ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Js_Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Js_Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(Js_Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Js_Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigning}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigning(Js_Parser.AssigningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code p}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(Js_Parser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Js_Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Js_Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Js_Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Js_Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#forin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForin(Js_Parser.ForinContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#forof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForof(Js_Parser.ForofContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(Js_Parser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(Js_Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(Js_Parser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Js_Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRightHand(Js_Parser.AssignmentRightHandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#assignmentsRightHand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentsRightHand(Js_Parser.AssignmentsRightHandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(Js_Parser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(Js_Parser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Js_Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Js_Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(Js_Parser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNOT(Js_Parser.LogicalNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(Js_Parser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(Js_Parser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAND(Js_Parser.LogicalANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOR_logicalNull(Js_Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreInc(Js_Parser.PreIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByVal(Js_Parser.ByValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(Js_Parser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Js_Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncre(Js_Parser.PostIncreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareWithEqual(Js_Parser.CompareWithEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#scopeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBody(Js_Parser.ScopeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#postInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostInc(Js_Parser.PostIncContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Js_Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#forExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression1(Js_Parser.ForExpression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(Js_Parser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Js_Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Js_Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Js_Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(Js_Parser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVal(Js_Parser.ObjectValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVal(Js_Parser.ArrayValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVal(Js_Parser.FunctionValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Js_Parser.VariableContext ctx);
}