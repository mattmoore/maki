package maki

import org.antlr.v4.runtime.tree.TerminalNode

import scala.util.Try

class MakiListenerApp extends MakiParserBaseListener {
  override def enterAdditiveExpression(ctx: MakiParser.AdditiveExpressionContext): Unit = {
    val exprText = ctx.getText
    println(s"Expression after tokenization = $exprText")

    println(s"context: ${ctx}")
//    val operands = ctx.NUMBER().toArray.map(_.asInstanceOf[TerminalNode].getText)
//    val operand1 = parseDouble(operands.lift(0).getOrElse("0.0")).getOrElse(0.0)
//    val operand2 = parseDouble(operands.lift(1).getOrElse("0.0")).getOrElse(0.0)
//
//    val operation = ctx.operation().getText
//
//    calculate(operand1, operand2, operation) match {
//      case Some(result) =>
//        println(s"Result of $operand1 $operation $operand2 = $result")
//      case None =>
//        println(s"Failed to evaluate expression. Tokenized expr = $exprText")
//    }
  }

  def parseDouble(s: String): Option[Double] = Try(s.toDouble).toOption

  def calculate(op1: Double, op2: Double, operation: String): Option[Double] = {
    operation match {
      case "+" => Some(op1 + op2)
      case "-" => Some(op1 - op2)
      case "*" => Some(op1 * op2)
      case "/" => Try(op1 / op2).toOption
      case "^" => Some(scala.math.pow(op1, op2))

      case _ =>
        println(s"Unsupported operation")
        None
    }
  }
}