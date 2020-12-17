package maki.phases.parser.kotlin

import maki.kotlin.{KotlinLexer, KotlinParser}
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object KotlinParser {
  private val charStream =
    (source: String) => CharStreams.fromString(source)

  private val lexer =
    (stream: CodePointCharStream) => new KotlinLexer(stream)

  private val tokenStream =
    (lexer: KotlinLexer) => new CommonTokenStream(lexer)

  private val parser =
    (tokenStream: CommonTokenStream) => new KotlinParser(tokenStream)

  private val visitor =
    (source: String) => KotlinVisitor(KotlinParser(source).kotlinFile)

  def apply(source: String) = (
    charStream
      andThen lexer
      andThen tokenStream
      andThen parser
    ) (source)

  def parse(source: String) =
    visitor(source).ast

  def parseLisp(source: String) =
    KotlinParser(source)
      .kotlinFile
      .toStringTree(KotlinParser(source))
}
