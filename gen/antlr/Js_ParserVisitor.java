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
	 * Visit a parse tree produced by {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Js_Parser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link Js_Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnable(Js_Parser.ReturnableContext ctx);
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
	 * Visit a parse tree produced by {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Js_Parser.FunctionCallContext ctx);
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
	 * Visit a parse tree produced by {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Js_Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Js_Parser#scopeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBody(Js_Parser.ScopeBodyContext ctx);
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
	 * Visit a parse tree produced by {@link Js_Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Js_Parser.ParamContext ctx);
}