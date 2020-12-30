package maki.languages.kotlin.ast

import maki.AST
import maki.languages.kotlin.Parser
import maki.phases.Parsing
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class KtFunctionSpec extends AnyFunSpec with Matchers {
  describe("parse") {
    describe("expression function without parameters") {
      val source = """fun hello() = "Hello Maki!""""

      it("constructs an AST") {
        val ast = Parsing(source)
        node(ast) shouldBe KtFunction(
          name = "hello",
          `type` = "String",
          functionBody = KtFunctionBody()
        )
      }
    }

    describe("expression function with parameters") {
      val source = """fun hello(name: String) = "Hello ${name}""""

      it("constructs an AST") {
        val ast = Parser(source)
        ast.children.head should have(
          Symbol("name")("hello"),
          Symbol("type")(""),
//          Symbol("functionBody")(KtFunctionBody("", """"Hello ${name}""""))
        )
      }
    }

    describe("expression function with parameter and return type") {
      val source = """fun hello(name: String): String = "Hello ${name}""""

      it("constructs an AST") {
        val ast = Parser(source)
        ast.children.head should have(
          Symbol("name")("hello"),
          Symbol("type")("String"),
//          Symbol("functionBody")(KtFunctionBody("", """"Hello ${name}""""))
        )
      }
    }

//    describe("block body function with no params and assignment in body") {
//      val source =
//        """fun f(): Int {
//          |  val x = 5
//          |  return x
//          |}
//          |""".stripMargin
//      val ast = Parser(source)
//
//      it("parses the function") {
//        ast.children.head should have(
//          Symbol("name")("f"),
//          Symbol("type")("Int")
//        )
//      }
//
//      it("parses the block body") {
//        ast.children.head should have(
//          Symbol("x")("5")
//        )
//      }
//    }
  }

  private def node(ast: AST): AST =
    ast.children.head.children.head.children.head
}
