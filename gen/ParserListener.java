// Generated from C:/Files/Java/r_compiler/src/Parser.g4 by ANTLR 4.13.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#specialLine}.
	 * @param ctx the parse tree
	 */
	void enterSpecialLine(Parser.SpecialLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#specialLine}.
	 * @param ctx the parse tree
	 */
	void exitSpecialLine(Parser.SpecialLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(Parser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(Parser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(Parser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(Parser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(Parser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(Parser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(Parser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(Parser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(Parser.RestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importing}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImporting(Parser.ImportingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importing}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImporting(Parser.ImportingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exporting}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExporting(Parser.ExportingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exporting}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExporting(Parser.ExportingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExp(Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExp(Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noUse}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNoUse(Parser.NoUseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noUse}
	 * labeled alternative in {@link Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNoUse(Parser.NoUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Parser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(Parser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(Parser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#importForm}.
	 * @param ctx the parse tree
	 */
	void enterImportForm(Parser.ImportFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#importForm}.
	 * @param ctx the parse tree
	 */
	void exitImportForm(Parser.ImportFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImport(Parser.DefaultImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#defaultImport}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImport(Parser.DefaultImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#namedImport}.
	 * @param ctx the parse tree
	 */
	void enterNamedImport(Parser.NamedImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#namedImport}.
	 * @param ctx the parse tree
	 */
	void exitNamedImport(Parser.NamedImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#aliasImporting}.
	 * @param ctx the parse tree
	 */
	void enterAliasImporting(Parser.AliasImportingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#aliasImporting}.
	 * @param ctx the parse tree
	 */
	void exitAliasImporting(Parser.AliasImportingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fullImport}.
	 * @param ctx the parse tree
	 */
	void enterFullImport(Parser.FullImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fullImport}.
	 * @param ctx the parse tree
	 */
	void exitFullImport(Parser.FullImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(Parser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(Parser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#exportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExportDeclaration(Parser.ExportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#exportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExportDeclaration(Parser.ExportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#exportList}.
	 * @param ctx the parse tree
	 */
	void enterExportList(Parser.ExportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#exportList}.
	 * @param ctx the parse tree
	 */
	void exitExportList(Parser.ExportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#aliasExporting}.
	 * @param ctx the parse tree
	 */
	void enterAliasExporting(Parser.AliasExportingContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#aliasExporting}.
	 * @param ctx the parse tree
	 */
	void exitAliasExporting(Parser.AliasExportingContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void enterExportDefault(Parser.ExportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void exitExportDefault(Parser.ExportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#exportModule}.
	 * @param ctx the parse tree
	 */
	void enterExportModule(Parser.ExportModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#exportModule}.
	 * @param ctx the parse tree
	 */
	void exitExportModule(Parser.ExportModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(Parser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(Parser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentRightHand(Parser.AssignmentRightHandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignmentRightHand}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentRightHand(Parser.AssignmentRightHandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declarable}.
	 * @param ctx the parse tree
	 */
	void enterDeclarable(Parser.DeclarableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declarable}.
	 * @param ctx the parse tree
	 */
	void exitDeclarable(Parser.DeclarableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(Parser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(Parser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(Parser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(Parser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNOT(Parser.LogicalNOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNOT}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNOT(Parser.LogicalNOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(Parser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(Parser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAND(Parser.LogicalANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAND}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAND(Parser.LogicalANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR_logicalNull(Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOR_logicalNull}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR_logicalNull(Parser.LogicalOR_logicalNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreInc(Parser.PreIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreInc(Parser.PreIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newNoParam}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewNoParam(Parser.NewNoParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newNoParam}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewNoParam(Parser.NewNoParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterByVal(Parser.ByValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code byVal}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitByVal(Parser.ByValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncre(Parser.PostIncreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncre}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncre(Parser.PostIncreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberGet}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberGet(Parser.MemberGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberGet}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberGet(Parser.MemberGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary(Parser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternary}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary(Parser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareWithEqual(Parser.CompareWithEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareWithEqual}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareWithEqual(Parser.CompareWithEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromMemory}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFromMemory(Parser.FromMemoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromMemory}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFromMemory(Parser.FromMemoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asIIFE}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAsIIFE(Parser.AsIIFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asIIFE}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAsIIFE(Parser.AsIIFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code taggedTemplate}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterTaggedTemplate(Parser.TaggedTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code taggedTemplate}
	 * labeled alternative in {@link Parser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitTaggedTemplate(Parser.TaggedTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#callables}.
	 * @param ctx the parse tree
	 */
	void enterCallables(Parser.CallablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#callables}.
	 * @param ctx the parse tree
	 */
	void exitCallables(Parser.CallablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#incrementsOp}.
	 * @param ctx the parse tree
	 */
	void enterIncrementsOp(Parser.IncrementsOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#incrementsOp}.
	 * @param ctx the parse tree
	 */
	void exitIncrementsOp(Parser.IncrementsOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#unarysOp}.
	 * @param ctx the parse tree
	 */
	void enterUnarysOp(Parser.UnarysOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#unarysOp}.
	 * @param ctx the parse tree
	 */
	void exitUnarysOp(Parser.UnarysOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#memberGetter}.
	 * @param ctx the parse tree
	 */
	void enterMemberGetter(Parser.MemberGetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#memberGetter}.
	 * @param ctx the parse tree
	 */
	void exitMemberGetter(Parser.MemberGetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(Parser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(Parser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void enterDotNotation(Parser.DotNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#dotNotation}.
	 * @param ctx the parse tree
	 */
	void exitDotNotation(Parser.DotNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#bracketNotation}.
	 * @param ctx the parse tree
	 */
	void enterBracketNotation(Parser.BracketNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#bracketNotation}.
	 * @param ctx the parse tree
	 */
	void exitBracketNotation(Parser.BracketNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#indexers}.
	 * @param ctx the parse tree
	 */
	void enterIndexers(Parser.IndexersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#indexers}.
	 * @param ctx the parse tree
	 */
	void exitIndexers(Parser.IndexersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectable}.
	 * @param ctx the parse tree
	 */
	void enterObjectable(Parser.ObjectableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectable}.
	 * @param ctx the parse tree
	 */
	void exitObjectable(Parser.ObjectableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectableWithBrackets}.
	 * @param ctx the parse tree
	 */
	void enterObjectableWithBrackets(Parser.ObjectableWithBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectableWithBrackets}.
	 * @param ctx the parse tree
	 */
	void exitObjectableWithBrackets(Parser.ObjectableWithBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(Parser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(Parser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(Parser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(Parser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assinmentOp}.
	 * @param ctx the parse tree
	 */
	void enterAssinmentOp(Parser.AssinmentOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assinmentOp}.
	 * @param ctx the parse tree
	 */
	void exitAssinmentOp(Parser.AssinmentOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(Parser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(Parser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(Parser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(Parser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(Parser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(Parser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forExpression1}.
	 * @param ctx the parse tree
	 */
	void enterForExpression1(Parser.ForExpression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forExpression1}.
	 * @param ctx the parse tree
	 */
	void exitForExpression1(Parser.ForExpression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forin}.
	 * @param ctx the parse tree
	 */
	void enterForin(Parser.ForinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forin}.
	 * @param ctx the parse tree
	 */
	void exitForin(Parser.ForinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#forof}.
	 * @param ctx the parse tree
	 */
	void enterForof(Parser.ForofContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#forof}.
	 * @param ctx the parse tree
	 */
	void exitForof(Parser.ForofContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#scopeHead}.
	 * @param ctx the parse tree
	 */
	void enterScopeHead(Parser.ScopeHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#scopeHead}.
	 * @param ctx the parse tree
	 */
	void exitScopeHead(Parser.ScopeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#scopeBody}.
	 * @param ctx the parse tree
	 */
	void enterScopeBody(Parser.ScopeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#scopeBody}.
	 * @param ctx the parse tree
	 */
	void exitScopeBody(Parser.ScopeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objPropDefine}.
	 * @param ctx the parse tree
	 */
	void enterObjPropDefine(Parser.ObjPropDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objPropDefine}.
	 * @param ctx the parse tree
	 */
	void exitObjPropDefine(Parser.ObjPropDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objPropName}.
	 * @param ctx the parse tree
	 */
	void enterObjPropName(Parser.ObjPropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objPropName}.
	 * @param ctx the parse tree
	 */
	void exitObjPropName(Parser.ObjPropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(Parser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayInput}.
	 * @param ctx the parse tree
	 */
	void enterArrayInput(Parser.ArrayInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayInput}.
	 * @param ctx the parse tree
	 */
	void exitArrayInput(Parser.ArrayInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arraySpread}.
	 * @param ctx the parse tree
	 */
	void enterArraySpread(Parser.ArraySpreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arraySpread}.
	 * @param ctx the parse tree
	 */
	void exitArraySpread(Parser.ArraySpreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#objectDestructuring}.
	 * @param ctx the parse tree
	 */
	void enterObjectDestructuring(Parser.ObjectDestructuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#objectDestructuring}.
	 * @param ctx the parse tree
	 */
	void exitObjectDestructuring(Parser.ObjectDestructuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#destructuredObjVar}.
	 * @param ctx the parse tree
	 */
	void enterDestructuredObjVar(Parser.DestructuredObjVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#destructuredObjVar}.
	 * @param ctx the parse tree
	 */
	void exitDestructuredObjVar(Parser.DestructuredObjVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrayDestructuring}.
	 * @param ctx the parse tree
	 */
	void enterArrayDestructuring(Parser.ArrayDestructuringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrayDestructuring}.
	 * @param ctx the parse tree
	 */
	void exitArrayDestructuring(Parser.ArrayDestructuringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#destructuredArrVar}.
	 * @param ctx the parse tree
	 */
	void enterDestructuredArrVar(Parser.DestructuredArrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#destructuredArrVar}.
	 * @param ctx the parse tree
	 */
	void exitDestructuredArrVar(Parser.DestructuredArrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#paramInput}.
	 * @param ctx the parse tree
	 */
	void enterParamInput(Parser.ParamInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#paramInput}.
	 * @param ctx the parse tree
	 */
	void exitParamInput(Parser.ParamInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(Parser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitive}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(Parser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterObjectVal(Parser.ObjectValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitObjectVal(Parser.ObjectValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterArrayVal(Parser.ArrayValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitArrayVal(Parser.ArrayValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionVal(Parser.FunctionValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionVal}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionVal(Parser.FunctionValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link Parser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#primeType}.
	 * @param ctx the parse tree
	 */
	void enterPrimeType(Parser.PrimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#primeType}.
	 * @param ctx the parse tree
	 */
	void exitPrimeType(Parser.PrimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(Parser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(Parser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#strings}.
	 * @param ctx the parse tree
	 */
	void enterStrings(Parser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#strings}.
	 * @param ctx the parse tree
	 */
	void exitStrings(Parser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(Parser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#templateLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(Parser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#templateLiteralContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteralContent(Parser.TemplateLiteralContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#templateLiteralContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteralContent(Parser.TemplateLiteralContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(Parser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(Parser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#setableKeywords}.
	 * @param ctx the parse tree
	 */
	void enterSetableKeywords(Parser.SetableKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#setableKeywords}.
	 * @param ctx the parse tree
	 */
	void exitSetableKeywords(Parser.SetableKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#validName}.
	 * @param ctx the parse tree
	 */
	void enterValidName(Parser.ValidNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#validName}.
	 * @param ctx the parse tree
	 */
	void exitValidName(Parser.ValidNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#declarers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarers(Parser.DeclarersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#declarers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarers(Parser.DeclarersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#noUseStatement}.
	 * @param ctx the parse tree
	 */
	void enterNoUseStatement(Parser.NoUseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#noUseStatement}.
	 * @param ctx the parse tree
	 */
	void exitNoUseStatement(Parser.NoUseStatementContext ctx);
}