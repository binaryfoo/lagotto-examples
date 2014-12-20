name := "lagotto-examples"

version := "1.0"

scalaVersion := "2.11.4"

resolvers += Resolver.url("typesafe-ivy-repo", url("http://typesafe.artifactoryonline.com/typesafe/releases"))(Resolver.ivyStylePatterns)

libraryDependencies += "io.github.binaryfoo" %% "lagotto" % "0.1-SNAPSHOT" % "compile"

libraryDependencies += "org.scala-sbt" % "io" % "0.13.6"
    