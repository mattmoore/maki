package maki.kotlin

import maki.phases.parser.kotlin.KotlinParserImpl
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FunctionSpec extends AnyFunSpec with Matchers {
  describe("parse") {
    describe("function without parameters") {
      val source = """fun hello() = "Hello Maki!""""

      it("constructs an AST") {
        KotlinParserImpl.parse(source).nodes(0) should have(
          Symbol("name")("hello"),
          Symbol("type")(""),
          Symbol("functionBody")("""="Hello Maki!""""),
        )
      }
    }

    describe("function with parameters") {
      val source = """fun hello(name: String) = "Hello ${name}""""

      it("constructs an AST") {
        KotlinParserImpl.parse(source).nodes(0) should have(
          Symbol("name")("hello"),
          Symbol("type")(""),
          Symbol("functionBody")("""="Hello ${name}""""),
        )
      }
    }
  }
}
