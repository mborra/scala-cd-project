
  import Versions._
  import Dependencies._

  name := """scala-cd-project"""

  version       in ThisBuild := "1.0.0-SNAPSHOT"
  organization  in ThisBuild := "org.skala"

  scalaVersion  in ThisBuild := VScala

  lazy val ScalaCDProject = ( project in file( "." ) )
    .aggregate( `skala-foundation` )

  lazy val `skala-foundation` = ( project in file( "skala-foundation" ) )
    .enablePlugins( JavaAppPackaging, DockerContainerPlugin )
    .settings( commonSettings: _* )
    .settings(
      libraryDependencies ++= Seq(),
      packageName in Docker := name.value + ".ms"
    )

  lazy val commonSettings = Seq(
    scalaVersion := VScala,
    javacOptions in Compile ++= Seq( "-source", "1.8", "-target", "1.8" )
  )