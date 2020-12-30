package maki.languages.kotlin.ast

import maki.AST

case class KtFunction(
  var name: String,
  var `type`: String,
  var functionBody: KtFunctionBody
) extends AST
