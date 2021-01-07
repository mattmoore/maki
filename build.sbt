import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.maki-compiler"
ThisBuild / organizationName := "maki"

lazy val root = (project in file("."))
  .settings(
    name := "maki",
    libraryDependencies ++= Seq(
      antlr4,
      asm,
      Cats.core,
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

mainClass in assembly := Some("maki.Maki")