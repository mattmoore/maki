package maki.languages.kotlin.ast

case class KtProperty(
  var name: String,
  var expression: String,
  var dataType: String
) extends AST {
}
