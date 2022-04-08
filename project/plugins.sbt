addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "1.1.0")
addSbtPlugin("com.lightbend.sbt" % "sbt-aspectj" % "0.11.0")
dependencyOverrides += "org.aspectj" % "aspectjrt" % "1.9.6"
dependencyOverrides += "org.aspectj" % "aspectjtools" % "1.9.6"
