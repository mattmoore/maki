package maki.phases.parser.kotlin

import maki.kotlin.{KotlinParser, KotlinParserBaseVisitor}
import maki.phases.analysis.TypeResolver
import maki.phases.parser.kotlin.ast.{ASTNode, KtFile, KtFunction, KtFunctionBody, KtProperty}
import org.antlr.v4.runtime.tree.{ParseTree, ParseTreeProperty}

object KotlinVisitor {
  def apply(tree: ParseTree): KotlinVisitor = {
    val visitor = new KotlinVisitor()
    visitor.visit(tree)
    visitor
  }
}

class KotlinVisitor extends KotlinParserBaseVisitor[Unit] {
  var ast: KtFile = new KtFile
  var values = new ParseTreeProperty[ASTNode]

  override def visitPropertyDeclaration(ctx: KotlinParser.PropertyDeclarationContext): Unit = {
    val property = new KtProperty(
      name = ctx.variableDeclaration.getText,
      expression = ctx.expression.getText,
      dataType = TypeResolver.inferType(ctx.expression.getText)
    )
    values.put(ctx, property)
    ast.nodes.addOne(property)
  }

  override def visitFunctionDeclaration(ctx: KotlinParser.FunctionDeclarationContext): Unit = {
    val function = new KtFunction(
      name = ctx.simpleIdentifier.getText,
      `type` = if (ctx.`type` != null) ctx.`type`.getText else "",
      functionBody = ctx.functionBody.getText
    )
    ast.nodes.addOne(function)
    values.put(ctx, function)
    this.visitFunctionBody(ctx.functionBody)
  }

  override def visitFunctionBody(ctx: KotlinParser.FunctionBodyContext): Unit = {
    val functionBody = new KtFunctionBody(
      block = if (ctx.block != null) ctx.block.getText else "",
      expression = if(ctx.expression != null) ctx.expression.getText else ""
    )
    values.put(ctx, functionBody)
  }
}
