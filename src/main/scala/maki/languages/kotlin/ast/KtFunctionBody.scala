package maki.languages.kotlin.ast

case class KtFunctionBody(
  var block: Vector[String],
  var expression: KtExpression
) extends AST
