// Generated from C:/Files/Java/r_compiler/src/Parser.g4 by ANTLR 4.13.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#specialLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialLine(Parser.SpecialLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(Parser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(Parser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(Parser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(Parser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest(Parser.RestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importing}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporting(Parser.ImportingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exporting}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExporting(Parser.ExportingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noUse}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoUse(Parser.NoUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(Parser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#importForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportForm(Parser.ImportFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#defaultImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImport(Parser.DefaultImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#namedImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedImport(Parser.NamedImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#aliasImporting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasImporting(Parser.AliasImportingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fullImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullImport(Parser.FullImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(Parser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#exportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDeclaration(Parser.ExportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#exportList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportList(Parser.ExportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#aliasExporting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasExporting(Parser.AliasExportingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#exportDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefault(Parser.ExportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#exportModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportModule(Parser.ExportModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(Parser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRightHand(Parser.AssignmentRightHandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declarable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarable(Parser.DeclarableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(Parser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(Parser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNOT(Parser.LogicalNOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(Parser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(Parser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAND(Parser.LogicalANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(Parser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOR_logicalNull(Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreInc(Parser.PreIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newNoParam}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewNoParam(Parser.NewNoParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByVal(Parser.ByValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(Parser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncre(Parser.PostIncreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberGet}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberGet(Parser.MemberGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(Parser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareWithEqual(Parser.CompareWithEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromMemory}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromMemory(Parser.FromMemoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asIIFE}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsIIFE(Parser.AsIIFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code taggedTemplate}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaggedTemplate(Parser.TaggedTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#callables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallables(Parser.CallablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#incrementsOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementsOp(Parser.IncrementsOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#unarysOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarysOp(Parser.UnarysOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#memberGetter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberGetter(Parser.MemberGetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(Parser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#dotNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotation(Parser.DotNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#bracketNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketNotation(Parser.BracketNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#indexers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexers(Parser.IndexersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectable(Parser.ObjectableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectableWithBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectableWithBrackets(Parser.ObjectableWithBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(Parser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assinmentOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssinmentOp(Parser.AssinmentOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Parser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(Parser.DoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Parser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression1(Parser.ForExpression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForin(Parser.ForinContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#forof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForof(Parser.ForofContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#scopeHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeHead(Parser.ScopeHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#scopeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBody(Parser.ScopeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(Parser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objPropDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjPropDefine(Parser.ObjPropDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objPropName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjPropName(Parser.ObjPropNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(Parser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInput(Parser.ArrayInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arraySpread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySpread(Parser.ArraySpreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#objectDestructuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDestructuring(Parser.ObjectDestructuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#destructuredObjVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuredObjVar(Parser.DestructuredObjVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#arrayDestructuring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDestructuring(Parser.ArrayDestructuringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#destructuredArrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestructuredArrVar(Parser.DestructuredArrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#paramInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamInput(Parser.ParamInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(Parser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVal(Parser.ObjectValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVal(Parser.ArrayValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionVal(Parser.FunctionValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#primeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimeType(Parser.PrimeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(Parser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrings(Parser.StringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#templateLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(Parser.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#templateLiteralContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteralContent(Parser.TemplateLiteralContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(Parser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#setableKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetableKeywords(Parser.SetableKeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#validName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidName(Parser.ValidNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#declarers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarers(Parser.DeclarersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#noUseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoUseStatement(Parser.NoUseStatementContext ctx);
}