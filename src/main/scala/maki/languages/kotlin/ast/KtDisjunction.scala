package maki.languages.kotlin.ast

case class KtDisjunction(
  var conjunctions: Vector[KtConjunction] = Vector.empty
) extends AST
