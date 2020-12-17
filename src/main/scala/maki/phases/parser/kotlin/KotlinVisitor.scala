package maki.phases.parser.kotlin

import maki.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.phases.analysis.TypeResolver
import maki.phases.parser.kotlin.ast._
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}

import java.util.Optional

object KotlinVisitor {
  def apply(tree: ParseTree): KotlinVisitor = {
    new KotlinVisitor {
      visit(tree)
    }
  }
}

class KotlinVisitor extends KotlinParserBaseVisitor[ASTNode] {
  var ast: AST = new AST
  var values = new ParseTreeProperty[ASTNode]

  override def visitPropertyDeclaration(ctx: KotlinParser.PropertyDeclarationContext): ASTNode = {
    val property = new KtProperty(
      name = ctx.variableDeclaration.getText,
      expression = ctx.expression.getText,
      dataType = TypeResolver.inferType(ctx.expression.getText)
    )
    values.put(ctx, property)
    ast.children.addOne(property)
    property
  }

  override def visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): ASTNode = {
    val function = KtFunction(
      name = ctx.simpleIdentifier.getText,
      `type` = Optional.ofNullable(ctx.`type`).map(_.getText).orElse(""),
      functionBody = null
    )
    values.put(ctx, function)
    visitFunctionBody(ctx.functionBody)
    ast.children.addOne(values.get(ctx))
    values.get(ctx)
  }

  override def visitFunctionBody(ctx: KotlinParser.FunctionBodyContext): ASTNode = {
    val functionBody = KtFunctionBody(
      block = Optional.ofNullable(ctx.block).map(_.getText).orElse(""),
      expression = Optional.ofNullable(ctx.expression).map(_.getText).orElse("")
    )
    val function: KtFunction = values.get(ctx.parent).asInstanceOf[KtFunction]
    values.put(ctx.parent, function.copy(functionBody = functionBody))
    functionBody
  }
}
