package maki.phases.parser.kotlin

import maki.kotlin.{KotlinLexer, KotlinParser}
import maki.phases.parser.kotlin.ast.KtFile
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object KotlinParser {
  def parser(source: String): KotlinParser = {
    val charStream = CharStreams.fromString(source)
    val lexer = new KotlinLexer(charStream)
    val tokens = new CommonTokenStream(lexer)
    new KotlinParser(tokens)
  }

  def visitor(source: String): KotlinVisitor = {
    val visitor = new KotlinVisitor
    visitor.visit(parser(source).kotlinFile)
    visitor
  }

  def parse(source: String): KtFile = {
    visitor(source).ast
  }

  def parseLisp(source: String): String = {
    parser(source).kotlinFile.toStringTree(parser(source))
  }

}
