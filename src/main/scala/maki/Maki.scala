package maki

import maki.phases.parser.kotlin.KotlinParserImpl

object Maki extends App {
  println(KotlinParserImpl.parseLisp(args(0)))
}