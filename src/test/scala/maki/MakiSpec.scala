package maki

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MakiSpec extends AnyFlatSpec with Matchers {
  "parse()" should "parse integer declaration" in {
    val source =
      """
      val x = 5
      """

    Maki.parse(source).nodes(0) should have(
      Symbol("name")("x"),
      Symbol("expression")("5"),
      Symbol("dataType")("Int")
    )
  }

  "parse()" should "parse string declaration" in {
    val source =
      """
      val firstName = "Matt"
      """

    Maki.parse(source).nodes(0) should have(
      Symbol("name")("firstName"),
      Symbol("expression")(""""Matt""""),
      Symbol("dataType")("String")
    )
  }

  "parse()" should "parse empty string declaration" in {
    val source =
      """
      val firstName = ""
      """

    Maki.parse(source).nodes(0) should have(
      Symbol("name")("firstName"),
      Symbol("expression")(""""""""),
      Symbol("dataType")("String")
    )
  }
}
