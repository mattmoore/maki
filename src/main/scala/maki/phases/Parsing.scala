package maki.phases

import maki.languages.kotlin.Parser
import maki.languages.kotlin.ast.AST

object Parsing extends Phase {
  def apply(source: String): AST =
    Parser(source)
}
