package maki.languages.kotlin

import maki.languages.kotlin.ast.AST
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeProperty

class SymbolTable {
  private val symbols = new ParseTreeProperty[AST]

  def define(ctx: ParserRuleContext, ast: AST) = symbols.put(ctx, ast)

  def resolve(ctx: ParserRuleContext) = symbols.get(ctx)
}
