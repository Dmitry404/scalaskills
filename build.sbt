name := "dbutakov-scalaskills"
scalaVersion := "2.12.1"

lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.12.1",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

lazy val phase1 = (project in file("phase1")).
  settings(
    commonSettings,
    name := "dbutakov-phase1"
  )