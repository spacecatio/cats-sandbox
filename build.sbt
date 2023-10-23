name := "sandbox"
version := "0.0.1-SNAPSHOT"

scalaVersion := "3.3.1"

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8", // source files are in UTF-8
  "-deprecation", // warn about use of deprecated APIs
  "-unchecked", // warn about unchecked type parameters
  "-feature", // warn about misused language features
  "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
  "-Xfatal-warnings", // turn compiler warnings into errors
)

val catsVersion = "2.10.0"
val catsEffectVersion = "3.5.2"
val circeVersion = "0.14.6"
val http4sVersion = "0.23.23"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core"           % catsVersion,
  "org.typelevel" %% "cats-effect"         % catsEffectVersion,
  "io.circe"      %% "circe-core"          % circeVersion,
  "io.circe"      %% "circe-generic"       % circeVersion,
  "io.circe"      %% "circe-parser"        % circeVersion,
  "org.http4s"    %% "http4s-dsl"          % http4sVersion,
  "org.http4s"    %% "http4s-ember-server" % http4sVersion,
  "org.http4s"    %% "http4s-ember-client" % http4sVersion
)
