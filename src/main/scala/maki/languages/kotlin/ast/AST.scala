package maki.languages.kotlin.ast

import org.antlr.v4.runtime.ParserRuleContext

import scala.collection.mutable.ListBuffer

abstract class AST(
  var parent: AST = null,
  var prevSibling: AST = null,
  var nextSibling: AST = null,
  var children: ListBuffer[AST] = ListBuffer.empty,
  var context: ParserRuleContext = null
)
