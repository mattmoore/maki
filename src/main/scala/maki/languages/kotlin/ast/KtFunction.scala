package maki.languages.kotlin.ast

case class KtFunction(
  var name: String,
  var `type`: String,
  var functionBody: KtFunctionBody
) extends AST
