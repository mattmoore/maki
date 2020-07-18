package maki

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MakiSpec extends AnyFlatSpec with Matchers {
  "parse()" should "parse source code" in {
    val source =
      """
      val x = 5
      """

    val result = Maki.parse(source)
    result shouldBe
      """(kotlinFile \n packageHeader importList (topLevelObject (declaration (propertyDeclaration val (variableDeclaration (simpleIdentifier x)) = (expression (disjunction (conjunction (equality (comparison (genericCallLikeComparison (infixOperation (elvisExpression (infixFunctionCall (rangeExpression (additiveExpression (multiplicativeExpression (asExpression (prefixUnaryExpression (postfixUnaryExpression (primaryExpression (literalConstant 5))))))))))))))))) \n)) (semis <EOF>)) <EOF>)"""
  }
}
