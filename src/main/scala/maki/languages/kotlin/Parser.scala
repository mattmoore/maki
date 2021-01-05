package maki.languages.kotlin

import maki.languages.antlr.kotlin.{KotlinLexer, KotlinParser}
import maki.languages.kotlin.ast.AST
import org.antlr.v4.runtime.{CharStreams, CodePointCharStream, CommonTokenStream}

object Parser {
  def apply(source: String): AST = {
    val lexer = new KotlinLexer(CharStreams.fromString(source))
    val parser = new KotlinParser(new CommonTokenStream(lexer))
    val parseTree = parser.kotlinFile
    val visitor = new Visitor
    visitor.visit(parseTree)
  }

  def parseLisp(source: String): String = {
    val lexer = new KotlinLexer(CharStreams.fromString(source))
    val parser = new KotlinParser(new CommonTokenStream(lexer))
    parser.kotlinFile.toStringTree
  }
}
