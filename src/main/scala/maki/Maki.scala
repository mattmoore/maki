package maki

import maki.ast.KtFile
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object Maki extends App {
  def parser(source: String): MakiParser = {
    val charStream = CharStreams.fromString(source)
    val lexer = new MakiLexer(charStream)
    val tokens = new CommonTokenStream(lexer)
    new MakiParser(tokens)
  }

  def visitor(source: String): MakiVisitor = {
    val visitor = new MakiVisitor
    visitor.visit(parser(source).kotlinFile)
    visitor
  }

  def parse(source: String): KtFile = {
    visitor(source).ast
  }

  def parseLisp(source: String): String = {
    parser(source).kotlinFile.toStringTree(parser(source))
  }

  println(parseLisp(args(0)))
}