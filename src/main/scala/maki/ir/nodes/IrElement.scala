package maki.ir.nodes

import scala.collection.mutable.ListBuffer

trait IrElement {
  var children: ListBuffer[IrElement] = ListBuffer()
}
