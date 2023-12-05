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
	 * Enter a parse tree produced by {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Js_Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Js_Parser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterReturnable(Js_Parser.ReturnableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitReturnable(Js_Parser.ReturnableContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Js_Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Js_Parser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Js_Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Js_Parser.ParamContext ctx);
}