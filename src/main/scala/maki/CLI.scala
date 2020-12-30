package maki

import maki.languages.kotlin.Parser

object CLI extends App {
  println(Parser.parseLisp(args(0)))
  println(Compiler.compile(args(0)))
}