package maki.languages.kotlin.ast

case class KtFunctionBody(
  var block: Vector[String] = null,
  var expression: KtExpression = null
) extends ASTNode
