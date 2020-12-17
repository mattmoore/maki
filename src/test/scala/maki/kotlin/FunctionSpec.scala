package maki.kotlin

import maki.phases.parser.kotlin.KotlinParser
import maki.phases.parser.kotlin.ast.KtFunctionBody
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FunctionSpec extends AnyFunSpec with Matchers {
  describe("parse") {
    describe("expression function without parameters") {
      val source = """fun hello() = "Hello Maki!""""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("hello"),
          Symbol("type")(""),
          Symbol("functionBody")(KtFunctionBody("", """"Hello Maki!""""))
        )
      }
    }

    describe("expression function with parameters") {
      val source = """fun hello(name: String) = "Hello ${name}""""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("hello"),
          Symbol("type")(""),
          Symbol("functionBody")(KtFunctionBody("", """"Hello ${name}""""))
        )
      }
    }

    describe("expression function with parameter and return type") {
      val source = """fun hello(name: String): String = "Hello ${name}""""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("hello"),
          Symbol("type")("String"),
          Symbol("functionBody")(KtFunctionBody("", """"Hello ${name}""""))
        )
      }
    }
  }
}
