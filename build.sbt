import SonatypeKeys._

sonatypeSettings

name := "textnormalizer"

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"