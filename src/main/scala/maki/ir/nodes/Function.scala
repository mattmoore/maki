package maki.ir.nodes

case class Function(
                     val name: String,
                     val `type`: String,
                     val functionBody: FunctionBody
                   ) extends IrElement

case class FunctionBody(
                         val expression: String
                       )