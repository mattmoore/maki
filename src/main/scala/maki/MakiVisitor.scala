package maki

import maki.ast.{KtFile, KtProperty}
import maki.phases.analysis.TypeResolver

class MakiVisitor extends MakiParserBaseVisitor[Unit] {
  var ast: KtFile = new KtFile

  override def visitPropertyDeclaration(ctx: MakiParser.PropertyDeclarationContext): Unit = {
    ast.nodes.addOne(
      new KtProperty(
        name = ctx.variableDeclaration.getText,
        expression = ctx.expression.getText,
        dataType = TypeResolver.inferType(ctx.expression.getText)
      )
    )
  }
}