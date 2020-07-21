package maki

import maki.phases.parser.kotlin.KotlinParser

object Maki extends App {
  println(KotlinParser.parseLisp(args(0)))
}