package maki.languages.kotlin.ast

import org.antlr.v4.runtime.ParserRuleContext

import scala.collection.mutable.ListBuffer

abstract class ASTNode(
  var parent: ASTNode = null,
  var prevSibling: ASTNode = null,
  var nextSibling: ASTNode = null,
  var children: ListBuffer[ASTNode] = ListBuffer.empty,
  var context: ParserRuleContext = null
)
