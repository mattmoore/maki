package maki.phases

import maki.languages.kotlin.ast.{ASTNode, KtProperty}
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TypeInferenceSpec extends AnyFunSpec with Matchers {
  describe("type inference") {
    val ast = Parsing("val x = 5")
    it("infers integer") {
      node(ast) shouldBe KtProperty("x", "5", "Int")
    }
  }

  private def node(ast: ASTNode): ASTNode =
    ast.children.head.children.head.children.head
}
