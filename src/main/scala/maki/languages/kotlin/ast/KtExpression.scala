package maki.languages.kotlin.ast

case class KtExpression(
  var disjunction: KtDisjunction = null
) extends AST
