package maki

import maki.phases.{Parsing, TypeInference}
import cats.implicits._

object Compiler {
  def compile(source: String): CompilationResult = {
    val ast = Parsing(source)
    val typeInferred = TypeInference(ast)
    CompilationResult()
  }
}

case class CompilationResult()
