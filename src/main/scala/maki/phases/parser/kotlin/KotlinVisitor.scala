package maki.phases.parser.kotlin

import maki.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.phases.analysis.TypeResolver
import maki.phases.parser.kotlin.ast.{KtFile, KtFunction, KtProperty}

class KotlinVisitor extends KotlinParserBaseVisitor[Unit] {
  var ast: KtFile = new KtFile

  override def visitPropertyDeclaration(ctx: KotlinParser.PropertyDeclarationContext): Unit = {
    ast.nodes.addOne(
      new KtProperty(
        name = ctx.variableDeclaration.getText,
        expression = ctx.expression.getText,
        dataType = TypeResolver.inferType(ctx.expression.getText)
      )
    )
  }

  override def visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): Unit = {
    ast.nodes.addOne(
      new KtFunction(
        name = ctx.simpleIdentifier.getText,
        `type` = if (ctx.`type` != null) ctx.`type`.getText else "",
        functionBody = ctx.functionBody.getText
      )
    )
  }
}
