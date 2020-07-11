import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.maki-compiler"
ThisBuild / organizationName := "maki"

lazy val root = (project in file("."))
  .settings(
    name := "maki",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

libraryDependencies ++= Seq(
  "org.antlr" % "antlr4-runtime" % "4.6",
  "org.antlr" % "stringtemplate" % "3.2"
)