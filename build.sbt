ThisBuild / scalaVersion := "2.13.10"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """swaggerPlay""",
    libraryDependencies ++= Seq(
      guice,
      "org.webjars" % "swagger-ui" % "2.2.10",
      "com.github.dwickern" %% "swagger-play2.8" % "3.0.0",
      "com.typesafe.play" %% "play-json" % "2.9.3",
    )
  )
