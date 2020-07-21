package maki.phases.parser.kotlin

import maki.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.phases.analysis.TypeResolver
import maki.phases.parser.kotlin.ast.{KtFile, KtProperty}

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
}