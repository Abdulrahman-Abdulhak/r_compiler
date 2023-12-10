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
	 * Enter a parse tree produced by {@link Js_Parser#specialLine}.
	 * @param ctx the parse tree
	 */
	void enterSpecialLine(Js_Parser.SpecialLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#specialLine}.
	 * @param ctx the parse tree
	 */
	void exitSpecialLine(Js_Parser.SpecialLineContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Js_Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Js_Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(Js_Parser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(Js_Parser.RestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Js_Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Js_Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExp(Js_Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExp(Js_Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noUse}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNoUse(Js_Parser.NoUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noUse}
	 * labeled alternative in {@link Js_Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNoUse(Js_Parser.NoUseContext ctx);
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
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(Js_Parser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(Js_Parser.NewContext ctx);
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
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(Js_Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(Js_Parser.UnaryContext ctx);
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
	 * Enter a parse tree produced by the {@code newNoParam}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewNoParam(Js_Parser.NewNoParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newNoParam}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewNoParam(Js_Parser.NewNoParamContext ctx);
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
	 * Enter a parse tree produced by the {@code memberGet}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberGet(Js_Parser.MemberGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberGet}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberGet(Js_Parser.MemberGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary(Js_Parser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Js_Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary(Js_Parser.TernaryContext ctx);
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
	 * Enter a parse tree produced by the {@code fromMemory}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFromMemory(Js_Parser.FromMemoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromMemory}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFromMemory(Js_Parser.FromMemoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asIIFE}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAsIIFE(Js_Parser.AsIIFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asIIFE}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAsIIFE(Js_Parser.AsIIFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code taggedTemplate}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterTaggedTemplate(Js_Parser.TaggedTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code taggedTemplate}
	 * labeled alternative in {@link Js_Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitTaggedTemplate(Js_Parser.TaggedTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#callables}.
	 * @param ctx the parse tree
	 */
	void enterCallables(Js_Parser.CallablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#callables}.
	 * @param ctx the parse tree
	 */
	void exitCallables(Js_Parser.CallablesContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#unarysOp}.
	 * @param ctx the parse tree
	 */
	void enterUnarysOp(Js_Parser.UnarysOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#unarysOp}.
	 * @param ctx the parse tree
	 */
	void exitUnarysOp(Js_Parser.UnarysOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#memberGetter}.
	 * @param ctx the parse tree
	 */
	void enterMemberGetter(Js_Parser.MemberGetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#memberGetter}.
	 * @param ctx the parse tree
	 */
	void exitMemberGetter(Js_Parser.MemberGetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(Js_Parser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(Js_Parser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void enterDotNotation(Js_Parser.DotNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void exitDotNotation(Js_Parser.DotNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#bracketNotation}.
	 * @param ctx the parse tree
	 */
	void enterBracketNotation(Js_Parser.BracketNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#bracketNotation}.
	 * @param ctx the parse tree
	 */
	void exitBracketNotation(Js_Parser.BracketNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#indexers}.
	 * @param ctx the parse tree
	 */
	void enterIndexers(Js_Parser.IndexersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#indexers}.
	 * @param ctx the parse tree
	 */
	void exitIndexers(Js_Parser.IndexersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#objectable}.
	 * @param ctx the parse tree
	 */
	void enterObjectable(Js_Parser.ObjectableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#objectable}.
	 * @param ctx the parse tree
	 */
	void exitObjectable(Js_Parser.ObjectableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#objectableWithBrackets}.
	 * @param ctx the parse tree
	 */
	void enterObjectableWithBrackets(Js_Parser.ObjectableWithBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#objectableWithBrackets}.
	 * @param ctx the parse tree
	 */
	void exitObjectableWithBrackets(Js_Parser.ObjectableWithBracketsContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(Js_Parser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(Js_Parser.AssignableContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Js_Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Js_Parser.ExpressionListContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#objPropDefine}.
	 * @param ctx the parse tree
	 */
	void enterObjPropDefine(Js_Parser.ObjPropDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#objPropDefine}.
	 * @param ctx the parse tree
	 */
	void exitObjPropDefine(Js_Parser.ObjPropDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Js_Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Js_Parser.MethodContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#arrayInput}.
	 * @param ctx the parse tree
	 */
	void enterArrayInput(Js_Parser.ArrayInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#arrayInput}.
	 * @param ctx the parse tree
	 */
	void exitArrayInput(Js_Parser.ArrayInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#arraySpread}.
	 * @param ctx the parse tree
	 */
	void enterArraySpread(Js_Parser.ArraySpreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#arraySpread}.
	 * @param ctx the parse tree
	 */
	void exitArraySpread(Js_Parser.ArraySpreadContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#paramInput}.
	 * @param ctx the parse tree
	 */
	void enterParamInput(Js_Parser.ParamInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#paramInput}.
	 * @param ctx the parse tree
	 */
	void exitParamInput(Js_Parser.ParamInputContext ctx);
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
	 * Enter a parse tree produced by {@link Js_Parser#primeType}.
	 * @param ctx the parse tree
	 */
	void enterPrimeType(Js_Parser.PrimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#primeType}.
	 * @param ctx the parse tree
	 */
	void exitPrimeType(Js_Parser.PrimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(Js_Parser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(Js_Parser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(Js_Parser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(Js_Parser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(Js_Parser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(Js_Parser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#templateLiteralContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteralContent(Js_Parser.TemplateLiteralContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#templateLiteralContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteralContent(Js_Parser.TemplateLiteralContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(Js_Parser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(Js_Parser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#setableKeywords}.
	 * @param ctx the parse tree
	 */
	void enterSetableKeywords(Js_Parser.SetableKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#setableKeywords}.
	 * @param ctx the parse tree
	 */
	void exitSetableKeywords(Js_Parser.SetableKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#validName}.
	 * @param ctx the parse tree
	 */
	void enterValidName(Js_Parser.ValidNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#validName}.
	 * @param ctx the parse tree
	 */
	void exitValidName(Js_Parser.ValidNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Js_Parser#noUseStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoUseStatement(Js_Parser.NoUseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Js_Parser#noUseStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoUseStatement(Js_Parser.NoUseStatementContext ctx);
}