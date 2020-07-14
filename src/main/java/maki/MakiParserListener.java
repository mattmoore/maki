// Generated from /Users/mattmoore/source/maki/src/main/antlr4/MakiParser.g4 by ANTLR 4.8
package maki;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MakiParser}.
 */
public interface MakiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MakiParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void enterKotlinFile(MakiParser.KotlinFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void exitKotlinFile(MakiParser.KotlinFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(MakiParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(MakiParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void enterShebangLine(MakiParser.ShebangLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#shebangLine}.
	 * @param ctx the parse tree
	 */
	void exitShebangLine(MakiParser.ShebangLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(MakiParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(MakiParser.FileAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(MakiParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(MakiParser.PackageHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(MakiParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(MakiParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(MakiParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(MakiParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(MakiParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(MakiParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(MakiParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(MakiParser.TopLevelObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(MakiParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(MakiParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MakiParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MakiParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MakiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MakiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(MakiParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(MakiParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MakiParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MakiParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(MakiParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(MakiParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(MakiParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(MakiParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(MakiParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(MakiParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(MakiParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(MakiParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(MakiParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(MakiParser.ConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedDelegationSpecifier(MakiParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#annotatedDelegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedDelegationSpecifier(MakiParser.AnnotatedDelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(MakiParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(MakiParser.ExplicitDelegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(MakiParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(MakiParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(MakiParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(MakiParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(MakiParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(MakiParser.TypeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(MakiParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(MakiParser.TypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclarations(MakiParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classMemberDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclarations(MakiParser.ClassMemberDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(MakiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(MakiParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(MakiParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(MakiParser.AnonymousInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(MakiParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(MakiParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(MakiParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(MakiParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(MakiParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(MakiParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MakiParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MakiParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MakiParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MakiParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MakiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MakiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(MakiParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(MakiParser.MultiVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(MakiParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(MakiParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDelegate(MakiParser.PropertyDelegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#propertyDelegate}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDelegate(MakiParser.PropertyDelegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(MakiParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(MakiParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(MakiParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(MakiParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterParametersWithOptionalType(MakiParser.ParametersWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parametersWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitParametersWithOptionalType(MakiParser.ParametersWithOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterParameterWithOptionalType(MakiParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parameterWithOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitParameterWithOptionalType(MakiParser.ParameterWithOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MakiParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MakiParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(MakiParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(MakiParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(MakiParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(MakiParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(MakiParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(MakiParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(MakiParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(MakiParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(MakiParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(MakiParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(MakiParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(MakiParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MakiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MakiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(MakiParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(MakiParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(MakiParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(MakiParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#quest}.
	 * @param ctx the parse tree
	 */
	void enterQuest(MakiParser.QuestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#quest}.
	 * @param ctx the parse tree
	 */
	void exitQuest(MakiParser.QuestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(MakiParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(MakiParser.UserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(MakiParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(MakiParser.SimpleUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(MakiParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(MakiParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifiers(MakiParser.TypeProjectionModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeProjectionModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifiers(MakiParser.TypeProjectionModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifier(MakiParser.TypeProjectionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeProjectionModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifier(MakiParser.TypeProjectionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(MakiParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(MakiParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(MakiParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(MakiParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(MakiParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(MakiParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(MakiParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(MakiParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedUserType(MakiParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parenthesizedUserType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedUserType(MakiParser.ParenthesizedUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MakiParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MakiParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MakiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MakiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MakiParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MakiParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(MakiParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(MakiParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MakiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MakiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MakiParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MakiParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MakiParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MakiParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MakiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MakiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(MakiParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(MakiParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MakiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MakiParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(MakiParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(MakiParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#semis}.
	 * @param ctx the parse tree
	 */
	void enterSemis(MakiParser.SemisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#semis}.
	 * @param ctx the parse tree
	 */
	void exitSemis(MakiParser.SemisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MakiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MakiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(MakiParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(MakiParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(MakiParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(MakiParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(MakiParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(MakiParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MakiParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MakiParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 */
	void enterGenericCallLikeComparison(MakiParser.GenericCallLikeComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#genericCallLikeComparison}.
	 * @param ctx the parse tree
	 */
	void exitGenericCallLikeComparison(MakiParser.GenericCallLikeComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(MakiParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(MakiParser.InfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(MakiParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(MakiParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#elvis}.
	 * @param ctx the parse tree
	 */
	void enterElvis(MakiParser.ElvisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#elvis}.
	 * @param ctx the parse tree
	 */
	void exitElvis(MakiParser.ElvisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(MakiParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(MakiParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(MakiParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(MakiParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MakiParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MakiParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MakiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MakiParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(MakiParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(MakiParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(MakiParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(MakiParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefix(MakiParser.UnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#unaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefix(MakiParser.UnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(MakiParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(MakiParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnarySuffix(MakiParser.PostfixUnarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnarySuffix(MakiParser.PostfixUnarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterDirectlyAssignableExpression(MakiParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#directlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitDirectlyAssignableExpression(MakiParser.DirectlyAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedDirectlyAssignableExpression(MakiParser.ParenthesizedDirectlyAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parenthesizedDirectlyAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedDirectlyAssignableExpression(MakiParser.ParenthesizedDirectlyAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(MakiParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(MakiParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedAssignableExpression(MakiParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parenthesizedAssignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedAssignableExpression(MakiParser.ParenthesizedAssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void enterAssignableSuffix(MakiParser.AssignableSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#assignableSuffix}.
	 * @param ctx the parse tree
	 */
	void exitAssignableSuffix(MakiParser.AssignableSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIndexingSuffix(MakiParser.IndexingSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#indexingSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIndexingSuffix(MakiParser.IndexingSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterNavigationSuffix(MakiParser.NavigationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#navigationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitNavigationSuffix(MakiParser.NavigationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(MakiParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(MakiParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(MakiParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(MakiParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(MakiParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(MakiParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(MakiParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(MakiParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(MakiParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(MakiParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MakiParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MakiParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(MakiParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(MakiParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(MakiParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(MakiParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(MakiParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(MakiParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MakiParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MakiParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(MakiParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(MakiParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(MakiParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(MakiParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(MakiParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(MakiParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(MakiParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(MakiParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(MakiParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(MakiParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(MakiParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(MakiParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLiteral(MakiParser.LambdaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLiteral(MakiParser.LambdaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(MakiParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(MakiParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(MakiParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(MakiParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(MakiParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(MakiParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(MakiParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(MakiParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(MakiParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(MakiParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MakiParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MakiParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(MakiParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(MakiParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(MakiParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(MakiParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#whenSubject}.
	 * @param ctx the parse tree
	 */
	void enterWhenSubject(MakiParser.WhenSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#whenSubject}.
	 * @param ctx the parse tree
	 */
	void exitWhenSubject(MakiParser.WhenSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(MakiParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(MakiParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(MakiParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(MakiParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(MakiParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(MakiParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(MakiParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(MakiParser.RangeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(MakiParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(MakiParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(MakiParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(MakiParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(MakiParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(MakiParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(MakiParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(MakiParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(MakiParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(MakiParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(MakiParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(MakiParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAndOperator(MakiParser.AssignmentAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#assignmentAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAndOperator(MakiParser.AssignmentAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(MakiParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(MakiParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MakiParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MakiParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(MakiParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(MakiParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(MakiParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(MakiParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(MakiParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(MakiParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(MakiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(MakiParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(MakiParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(MakiParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(MakiParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(MakiParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(MakiParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(MakiParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#excl}.
	 * @param ctx the parse tree
	 */
	void enterExcl(MakiParser.ExclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#excl}.
	 * @param ctx the parse tree
	 */
	void exitExcl(MakiParser.ExclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(MakiParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(MakiParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void enterSafeNav(MakiParser.SafeNavContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#safeNav}.
	 * @param ctx the parse tree
	 */
	void exitSafeNav(MakiParser.SafeNavContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(MakiParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(MakiParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifiers(MakiParser.ParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifiers(MakiParser.ParameterModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(MakiParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(MakiParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifiers(MakiParser.TypeModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifiers(MakiParser.TypeModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifier(MakiParser.TypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifier(MakiParser.TypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(MakiParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(MakiParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(MakiParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(MakiParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(MakiParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(MakiParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void enterVarianceModifier(MakiParser.VarianceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#varianceModifier}.
	 * @param ctx the parse tree
	 */
	void exitVarianceModifier(MakiParser.VarianceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifiers(MakiParser.TypeParameterModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeParameterModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifiers(MakiParser.TypeParameterModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(MakiParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(MakiParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(MakiParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(MakiParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(MakiParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(MakiParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(MakiParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(MakiParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(MakiParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(MakiParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void enterReificationModifier(MakiParser.ReificationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#reificationModifier}.
	 * @param ctx the parse tree
	 */
	void exitReificationModifier(MakiParser.ReificationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void enterPlatformModifier(MakiParser.PlatformModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#platformModifier}.
	 * @param ctx the parse tree
	 */
	void exitPlatformModifier(MakiParser.PlatformModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(MakiParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(MakiParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleAnnotation(MakiParser.SingleAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#singleAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleAnnotation(MakiParser.SingleAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMultiAnnotation(MakiParser.MultiAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#multiAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMultiAnnotation(MakiParser.MultiAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(MakiParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(MakiParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(MakiParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(MakiParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(MakiParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(MakiParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MakiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MakiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MakiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MakiParser.IdentifierContext ctx);
}