package maki.phases.parser.kotlin.ast

case class KtFunctionBody(
                           val block: String,
                           val expression: String
                         ) extends ASTNode