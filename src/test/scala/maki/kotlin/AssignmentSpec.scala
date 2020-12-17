package maki.kotlin

import maki.phases.parser.kotlin.KotlinParser
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AssignmentSpec extends AnyFunSpec with Matchers {
  describe("parse") {
    describe("when integer declaration") {
      val source = """val x = 5"""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("x"),
          Symbol("expression")("5"),
          Symbol("dataType")("Int")
        )
        KotlinParser(source)
      }
    }

    describe("with string declaration") {
      val source = """val firstName = "Matt""""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("firstName"),
          Symbol("expression")(""""Matt""""),
          Symbol("dataType")("String")
        )
      }
    }

    describe("with empty string declaration") {
      val source = """val firstName = """""

      it("constructs an AST") {
        val ast = KotlinParser.parse(source)
        ast.children(0) should have(
          Symbol("name")("firstName"),
          Symbol("expression")("\"\""),
          Symbol("dataType")("String")
        )
      }
    }
  }
}
