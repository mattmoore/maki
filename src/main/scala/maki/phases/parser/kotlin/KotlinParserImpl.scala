package maki.phases.parser.kotlin

import maki.kotlin.{KotlinLexer, KotlinParser}
import maki.phases.parser.kotlin.ast.KtFile
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object KotlinParserImpl {
  private val charStream = (source: String) => CharStreams.fromString(source)
  private val lexer = (stream: CodePointCharStream) => new KotlinLexer(stream)
  private val tokenStream = (lexer: KotlinLexer) => new CommonTokenStream(lexer)
  private val parser = (tokenStream: CommonTokenStream) => new KotlinParser(tokenStream)
  private val visitor = (source: String) => KotlinVisitor(KotlinParserImpl(source).kotlinFile)

  private def initParser = parser compose tokenStream compose lexer compose charStream

  def apply(source: String): KotlinParser = initParser(source)

  def parse(source: String): KtFile = visitor(source).ast

  def parseLisp(source: String): String = KotlinParserImpl(source).kotlinFile.toStringTree(KotlinParserImpl(source))
}
