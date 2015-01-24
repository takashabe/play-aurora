name := """play-aurora"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots Repository" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.20"

libraryDependencies += "net.gree.aurora" %% "aurora-scala" % "0.0.3" excludeAll(
  ExclusionRule("org.clapper", "grizzled-slf4j_2.10"),
  ExclusionRule("org.sisioh", "scala-dddbase-core_2.10")
)
