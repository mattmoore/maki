package maki.phases.parser.kotlin.ast

case class KtFunction(
                       val name: String,
                       val `type`: String,
                       val functionBody: KtFunctionBody
                     ) extends ASTNode