package maki.languages.kotlin.ast

import maki.AST

case class KtProperty(
  var name: String,
  var expression: String,
  var dataType: String
) extends AST {
}
