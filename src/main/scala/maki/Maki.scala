package maki

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object Maki extends App {
  def parse(source: String): Unit = {
    val charStream = CharStreams.fromString(source)
    val lexer = new MakiLexer(charStream)
    val tokenStream = new CommonTokenStream(lexer)
    val parser = new MakiParser(tokenStream)
    val makiListener = new MakiListenerApp
    parser.expr.enterRule(makiListener)
  }

  val expressions = List(
    "127.1 + 2717",
    "2674 - 4735",
    "47 * 74.1",
    "271 / 281",
    "12 ^ 3" // unsupported expression
  )
  expressions.foreach(parse)
}