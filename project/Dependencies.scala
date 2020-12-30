import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
  lazy val asm = "org.ow2.asm" % "asm" % "9.0"
  lazy val antlr4 = "org.antlr" % "antlr4" % "4.9"

  object Cats {
    lazy val core = "org.typelevel" %% "cats-core" % "2.1.1"
  }
}
