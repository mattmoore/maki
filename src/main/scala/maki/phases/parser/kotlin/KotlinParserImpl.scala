package maki.phases.parser.kotlin

import maki.kotlin.{KotlinLexer, KotlinParser}
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object KotlinParserImpl {
  private val charStream = (source: String) => CharStreams.fromString(source)
  private val lexer = (stream: CodePointCharStream) => new KotlinLexer(stream)
  private val tokenStream = (lexer: KotlinLexer) => new CommonTokenStream(lexer)
  private val parser = (tokenStream: CommonTokenStream) => new KotlinParser(tokenStream)
  private val visitor = (source: String) => KotlinVisitor(KotlinParserImpl(source).kotlinFile)

  private def initParser = (
    charStream
      andThen lexer
      andThen tokenStream
      andThen parser
    )

  def apply(source: String) = initParser(source)

  def parse(source: String) = visitor(source).ast

  def parseLisp(source: String) = KotlinParserImpl(source).kotlinFile.toStringTree(KotlinParserImpl(source))
}
