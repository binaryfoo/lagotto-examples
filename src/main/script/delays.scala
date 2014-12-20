#!/usr/bin/env scalas

/***
scalaVersion := "2.11.4"
 
resolvers += Resolver.url("typesafe-ivy-repo", url("http://typesafe.artifactoryonline.com/typesafe/releases"))(Resolver.ivyStylePatterns)
 
libraryDependencies += "org.scala-sbt" % "io" % "0.13.6"

libraryDependencies += "io.github.binaryfoo" %% "lagotto" % "0.1-SNAPSHOT" % "compile"
*/

import java.io.File
import io.github.binaryfoo.lagotto._
import io.github.binaryfoo.lagotto.DelayTimer.RichLogLikeStream
import sbt._, Path._

def file(s: String): File = new File(s)

val files = (file("../..") ** "*.xml").get
println(s"Searching ${files.mkString}")

LogReader().read(files)
  .withDelays()
  .map(_.toTsv("time", "link", "48.1", "delay"))
  .foreach(println)