package maki.phases

import maki.AST
import maki.languages.kotlin.ast.KtProperty
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class TypeInferenceSpec extends AnyFunSpec with Matchers {
  describe("type inference") {
    val ast = Parsing("val x = 5")
    val analysis = TypeInference(ast)
    it("infers integer") {
      node(ast) shouldBe KtProperty("x", "5", "Int")
    }
  }

  private def node(ast: AST): AST =
    ast.children.head.children.head.children.head
}
