package maki

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MakiSpec extends AnyFlatSpec with Matchers {
  "parse()" should "parse source code" in {
    val source =
      """
      val x = 5
      val y = 1
      val z = x + y

      fun hello() = "Hello Maki!"
      """

    val result = Maki.parse(source)
    result shouldBe
      """(kotlinFile \n packageHeader importList (topLevelObject (declaration (propertyDeclaration val (variableDeclaration (simpleIdentifier x)) = (expression (disjunction (conjunction (equality (comparison (genericCallLikeComparison (infixOperation (elvisExpression (infixFunctionCall (rangeExpression (additiveExpression (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (literalConstant 5))))))))))))))))) \n))) (topLevelObject (declaration (propertyDeclaration val (variableDeclaration (simpleIdentifier y)) = (expression (disjunction (conjunction (equality (comparison (genericCallLikeComparison (infixOperation (elvisExpression (infixFunctionCall (rangeExpression (additiveExpression (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (literalConstant 1))))))))))))))))) \n))) (topLevelObject (declaration (propertyDeclaration val (variableDeclaration (simpleIdentifier z)) = (expression (disjunction (conjunction (equality (comparison (genericCallLikeComparison (infixOperation (elvisExpression (infixFunctionCall (rangeExpression (additiveExpression (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (simpleIdentifier x)))))) (additiveOperator +) (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (simpleIdentifier y))))))))))))))))) \n \n))) (topLevelObject (declaration (functionDeclaration fun (simpleIdentifier hello) (functionValueParameters ( )) (functionBody = (expression (disjunction (conjunction (equality (comparison (genericCallLikeComparison (infixOperation (elvisExpression (infixFunctionCall (rangeExpression (additiveExpression (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (stringLiteral (lineStringLiteral " (lineStringContent Hello Maki!) "))))))))))))))))))))) (semis \n)) <EOF>)"""
  }
}
