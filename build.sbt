ThisBuild / scalaVersion := "2.13.10"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, SwaggerPlugin)
  .settings(
    name := """swaggerPlay""",
    libraryDependencies ++= Seq(
      guice,
      "org.webjars" % "swagger-ui" % "4.1.2",
      "com.typesafe.play" %% "play-json" % "2.9.3",
    ),
    swaggerDomainNameSpaces := Seq("models")
  )
