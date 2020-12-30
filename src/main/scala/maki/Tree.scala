package maki

import scala.collection.mutable.ListBuffer

trait Tree[T] {
  var children: ListBuffer[T] = ListBuffer()
}
