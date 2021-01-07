package maki.languages.kotlin

import maki.languages.kotlin.ast.ASTNode
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeProperty

class SymbolTable {
  private val symbols = new ParseTreeProperty[ASTNode]

  def define(ctx: ParserRuleContext, ast: ASTNode) = symbols.put(ctx, ast)

  def resolve(ctx: ParserRuleContext) = symbols.get(ctx)
}
