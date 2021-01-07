package maki.languages.kotlin

import maki.languages.antlr.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.languages.kotlin.ast.{ASTNode, _}
import maki.phases.TypeInference

import java.util.Optional
import scala.jdk.CollectionConverters._

class Visitor extends KotlinParserBaseVisitor[ASTNode] {
  override def visitKotlinFile(ctx: KotlinParser.KotlinFileContext): ASTNode =
    new KotlinFile {
      context = ctx
      topLevelObjects = ctx.topLevelObject.asScala.toVector.map { topLevelObject =>
        val tlo = visitTopLevelObject(topLevelObject)
        tlo.parent = this
        tlo
      }
    }

  override def visitTopLevelObject(
    ctx: KotlinParser.TopLevelObjectContext
  ): KtTopLevelObject =
    new KtTopLevelObject(
      declaration = visitDeclaration(ctx.declaration)
    ) {
      context = ctx
      declaration.parent = this
    }

  override def visitDeclaration(
    ctx: KotlinParser.DeclarationContext
  ): KtDeclaration =
    new KtDeclaration {
      context = ctx
      propertyDeclaration =
        if (ctx.propertyDeclaration == null) null
        else {
          val property = visitPropertyDeclaration(ctx.propertyDeclaration)
          property.parent = this
          property
        }
      functionDeclaration =
        if (ctx.functionDeclaration == null) null
        else {
          val function = visitFunctionDeclaration(ctx.functionDeclaration)
          function.parent = this
          function
        }
    }

  override def visitPropertyDeclaration(
    ctx: KotlinParser.PropertyDeclarationContext
  ): KtProperty =
    TypeInference(
      new KtProperty(
        name = ctx.variableDeclaration.simpleIdentifier.getText,
        expression = ctx.expression.getText,
        dataType =
          Option(ctx.variableDeclaration.`type`).map(_.getText).getOrElse(null)
      ) {
        context = ctx
      }
    )

  override def visitFunctionDeclaration(
    ctx: KotlinParser.FunctionDeclarationContext
  ): KtFunction =
    new KtFunction(
      name = ctx.simpleIdentifier.getText,
      `type` = Optional.ofNullable(ctx.`type`).map(_.getText).orElse(""),
      functionBody = visitFunctionBody(ctx.functionBody)
    ) {
      context = ctx
    }

  override def visitFunctionBody(
    ctx: KotlinParser.FunctionBodyContext
  ): KtFunctionBody =
    new KtFunctionBody(
      block = null,
      expression = visitExpression(ctx.expression)
    ) {
      context = ctx
      expression.parent = this
    }

  override def visitExpression(
    ctx: KotlinParser.ExpressionContext
  ): KtExpression =
    new KtExpression {
      context = ctx
      disjunction = visitDisjunction(ctx.disjunction)
      disjunction.parent = this
    }

  override def visitDisjunction(ctx: KotlinParser.DisjunctionContext): KtDisjunction =
    new KtDisjunction {
      context = ctx
      conjunctions = ctx.conjunction.asScala.map { conjunctionContext =>
        val conjunction = visitConjunction(conjunctionContext)
        conjunction.parent = this
        conjunction
      }.toVector
    }

  override def visitConjunction(ctx: KotlinParser.ConjunctionContext): KtConjunction =
    new KtConjunction {
      context = ctx
      equalities = ctx.equality.asScala.map { item =>
        val equality = visitEquality(item)
        equality.parent = this
        equality
      }.toVector
    }

  override def visitEquality(ctx: KotlinParser.EqualityContext): KtEquality =
    new KtEquality() {
      context = ctx
    }

  override def visitBlock(ctx: KotlinParser.BlockContext): ASTNode =
    super.visitBlock(ctx)

  override def visitStatement(ctx: KotlinParser.StatementContext): ASTNode =
    super.visitStatement(ctx)
}
