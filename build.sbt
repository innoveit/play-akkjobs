name := "play-akkajobs"

version := "1.1.0"

organization := "it.innove.jobs"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.4", "2.11.7")

libraryDependencies ++= Seq(
   "com.typesafe.play" %% "play" % "2.5.12",
   "com.typesafe.play" %% "play-java" % "2.5.12"
)

publishTo :=  {
  if (isSnapshot.value)
    Some("Innove Repo" at "http://dev.in9.eu:8081/content/repositories/snp-innove")
  else
    Some("Innove Repo" at "http://dev.in9.eu:8081/content/repositories/rel-innove")
}

credentials += Credentials(Path.userHome / ".ivy2/ivysettings.prop")