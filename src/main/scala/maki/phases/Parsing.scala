package maki.phases

import maki.AST
import maki.languages.kotlin.Parser

object Parsing extends Phase {
  def apply(source: String): AST =
    Parser(source)
}
