//
//addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % "0.2.3")
//
//addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.5.7")
//
//addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")

val BindgenVersion =
  sys.env.getOrElse("SN_BINDGEN_VERSION", "0.2.3")

val VcpkgVersion =
  sys.env.getOrElse("SBT_VCPKG_VERSION", "0.0.21")

val ScalaNativeVersion =
  sys.env.getOrElse("SCALA_NATIVE_VERSION", "0.5.7")

resolvers ++= Resolver.sonatypeOssRepos("snapshots")
resolvers ++= Resolver.sonatypeOssRepos("releases")

addSbtPlugin("com.indoorvivants" % "bindgen-sbt-plugin" % BindgenVersion)
addSbtPlugin("org.scala-native" % "sbt-scala-native" % ScalaNativeVersion)
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("com.indoorvivants.vcpkg" % "sbt-vcpkg-native" % VcpkgVersion)
