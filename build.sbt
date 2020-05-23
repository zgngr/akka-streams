name := "akka-streams"

version := "0.1"

scalaVersion := "2.13.2"

lazy val akkaVersion = "2.6.5"
lazy val scalaTestVersion = "3.1.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion
)

