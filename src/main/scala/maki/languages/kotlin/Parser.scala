package maki.languages.kotlin

import maki.AST
import maki.languages.antlr.kotlin.{KotlinLexer, KotlinParser}
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object Parser {
  def apply(source: String): AST = (
    charStream
      andThen lexer
      andThen tokenStream
      andThen parser
      andThen visitor
    ) (source).ast

  def parseLisp(source: String): String = (
    charStream
      andThen lexer
      andThen tokenStream
      andThen parser
    ) (source)
    .kotlinFile
    .toStringTree

  private val charStream =
    (source: String) => CharStreams.fromString(source)

  private val lexer =
    (stream: CodePointCharStream) => new KotlinLexer(stream)

  private val tokenStream =
    (lexer: KotlinLexer) => new CommonTokenStream(lexer)

  private val parser =
    (tokenStream: CommonTokenStream) => new KotlinParser(tokenStream)

  private val visitor =
    (parser: KotlinParser) => Visitor(parser.kotlinFile)
}
