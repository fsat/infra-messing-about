val Versions = new {
  val ScalaTest = "3.0.1"
}

organization := "au.id.fsat"
name := "infra-messing-about"

version := "0.1.0"

scalaVersion := "2.12.14"

libraryDependencies ++= List(
  "org.scalatest"     %% "scalatest"                   % Versions.ScalaTest % "test"
)

scalacOptions ++= Seq(
  "-Xfatal-warnings"
)

parallelExecution in Test := false
