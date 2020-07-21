package maki.phases.parser.kotlin

import maki.kotlin.{KotlinLexer, KotlinParser}
import maki.phases.parser.kotlin.ast.KtFile
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object KotlinParserImpl {
  val charStream = (source: String) => CharStreams.fromString(source)
  val lexer = (stream: CodePointCharStream) => new KotlinLexer(stream)
  val tokenStream = (lexer: KotlinLexer) => new CommonTokenStream(lexer)
  val parser = (tokenStream: CommonTokenStream) => new KotlinParser(tokenStream)

  def createParser = parser compose tokenStream compose lexer compose charStream

  def apply(source: String): KotlinParser = createParser(source)

  def parse(source: String): KtFile = visitor(source).ast

  def parseLisp(source: String): String = KotlinParserImpl(source).kotlinFile.toStringTree(KotlinParserImpl(source))

  def visitor(source: String): KotlinVisitor = KotlinVisitor(KotlinParserImpl(source).kotlinFile)
}
