// Generated from /Users/mattmoore/source/maki/src/main/antlr4/MakiParser.g4 by ANTLR 4.8
package maki;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MakiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MakiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MakiParser#kotlinFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKotlinFile(MakiParser.KotlinFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(MakiParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#shebangLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShebangLine(MakiParser.ShebangLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#fileAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAnnotation(MakiParser.FileAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(MakiParser.PackageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(MakiParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(MakiParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(MakiParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#topLevelObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelObject(MakiParser.TopLevelObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(MakiParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MakiParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MakiParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(MakiParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MakiParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameters(MakiParser.ClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameter(MakiParser.ClassParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(MakiParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(MakiParser.DelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#constructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInvocation(MakiParser.ConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedDelegationSpecifier(MakiParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#explicitDelegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitDelegation(MakiParser.ExplicitDelegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(MakiParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(MakiParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraints(MakiParser.TypeConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraint(MakiParser.TypeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclarations(MakiParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(MakiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInitializer(MakiParser.AnonymousInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(MakiParser.CompanionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionValueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameters(MakiParser.FunctionValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameter(MakiParser.FunctionValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MakiParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MakiParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MakiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVariableDeclaration(MakiParser.MultiVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(MakiParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#propertyDelegate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDelegate(MakiParser.PropertyDelegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(MakiParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(MakiParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersWithOptionalType(MakiParser.ParametersWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterWithOptionalType(MakiParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MakiParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(MakiParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(MakiParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(MakiParser.ConstructorDelegationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(MakiParser.EnumClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(MakiParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(MakiParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MakiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(MakiParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(MakiParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#quest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuest(MakiParser.QuestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(MakiParser.UserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#simpleUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType(MakiParser.SimpleUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjection(MakiParser.TypeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifiers(MakiParser.TypeProjectionModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifier(MakiParser.TypeProjectionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(MakiParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameters(MakiParser.FunctionTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(MakiParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#receiverType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverType(MakiParser.ReceiverTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedUserType(MakiParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MakiParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MakiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(MakiParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#controlStructureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStructureBody(MakiParser.ControlStructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MakiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MakiParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MakiParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MakiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(MakiParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MakiParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(MakiParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#semis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemis(MakiParser.SemisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MakiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(MakiParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(MakiParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(MakiParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MakiParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericCallLikeComparison(MakiParser.GenericCallLikeComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(MakiParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(MakiParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#elvis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvis(MakiParser.ElvisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(MakiParser.InfixFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(MakiParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MakiParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MakiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(MakiParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(MakiParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#unaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefix(MakiParser.UnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(MakiParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnarySuffix(MakiParser.PostfixUnarySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectlyAssignableExpression(MakiParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedDirectlyAssignableExpression(MakiParser.ParenthesizedDirectlyAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(MakiParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedAssignableExpression(MakiParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#assignableSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableSuffix(MakiParser.AssignableSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#indexingSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSuffix(MakiParser.IndexingSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#navigationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationSuffix(MakiParser.NavigationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(MakiParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(MakiParser.AnnotatedLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(MakiParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(MakiParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(MakiParser.ValueArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MakiParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(MakiParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(MakiParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(MakiParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MakiParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(MakiParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(MakiParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(MakiParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(MakiParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(MakiParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(MakiParser.MultiLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLiteral(MakiParser.LambdaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(MakiParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(MakiParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(MakiParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(MakiParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(MakiParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(MakiParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#superExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(MakiParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(MakiParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#whenSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenSubject(MakiParser.WhenSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(MakiParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(MakiParser.WhenEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(MakiParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#rangeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeTest(MakiParser.RangeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(MakiParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(MakiParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(MakiParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(MakiParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#jumpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpExpression(MakiParser.JumpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(MakiParser.CallableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAndOperator(MakiParser.AssignmentAndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(MakiParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MakiParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(MakiParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(MakiParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(MakiParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(MakiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(MakiParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperator(MakiParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(MakiParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#excl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcl(MakiParser.ExclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperator(MakiParser.MemberAccessOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#safeNav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeNav(MakiParser.SafeNavContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(MakiParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parameterModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifiers(MakiParser.ParameterModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(MakiParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifiers(MakiParser.TypeModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifier(MakiParser.TypeModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(MakiParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(MakiParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(MakiParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#varianceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceModifier(MakiParser.VarianceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifiers(MakiParser.TypeParameterModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(MakiParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#functionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifier(MakiParser.FunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(MakiParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceModifier(MakiParser.InheritanceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#parameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifier(MakiParser.ParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#reificationModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReificationModifier(MakiParser.ReificationModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#platformModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatformModifier(MakiParser.PlatformModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(MakiParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#singleAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAnnotation(MakiParser.SingleAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#multiAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAnnotation(MakiParser.MultiAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseSiteTarget(MakiParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(MakiParser.UnescapedAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(MakiParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MakiParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MakiParser.IdentifierContext ctx);
}