import scala.scalanative.build.SourceLevelDebuggingConfig
import scala.scalanative.build.OptimizerConfig
import bindgen.plugin.BindgenMode
import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel

import java.nio.file.Paths
import scala.collection.immutable.Seq
lazy val Versions = new {
  val Scala = "3.6.2" // "3.3.4"
}

enablePlugins(ScalaNativePlugin, BindgenPlugin)
//
//bindgenBindings := Seq(
//  Binding(
//    baseDirectory.value / "src" / "main" / "resources" / "scala-native" / "header.h",
//    "lib_check"
//  ).withCImports(List("header.h"))
//)
//
//
val bindgenSettings = Seq(
  bindgenMode := BindgenMode.Manual(
    scalaDir = (Compile / sourceDirectory).value / "scala" / "generated",
    cDir = (Compile / resourceDirectory).value / "scala-native" / "generated"
  ),
  bindgenBindings := {
    bindgenBindings.value.map(_.withNoLocation(true))
  }
)

def configurePlatform(rename: String => String = identity) = Seq(
  nativeConfig := {
    val conf = nativeConfig.value
    val arch64 =
      if (
        Platform.arch == Platform.Arch.Arm && Platform.bits == Platform.Bits.x64
      )
        List("-arch", "arm64")
      else Nil

    conf
      .withLinkingOptions(
        conf.linkingOptions ++ arch64
      )
      .withCompileOptions(
        conf.compileOptions ++ arch64
      )
  }
)

lazy val mpi = project
  .in(file("example-mpi"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    vcpkgDependencies := VcpkgDependencies("mpi"),
    scalaVersion := Versions.Scala,
    nativeConfig ~= {
      (_).withSourceLevelDebuggingConfig(SourceLevelDebuggingConfig.enabled)
    },
    bindgenBindings := {
      Seq(

        Binding(
          (Compile / baseDirectory).value / "mpi.h",
          "mpi"
        )
          .withCImports(
            List("mpif.h","mpifptr.h","mpio.h","mspms.h")
          )
          .withClangFlags(
            List("-I" + vcpkgConfigurator.value.includes("mpi"))
          )
      )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())

lazy val curl = project
  .in(file("example-curl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    scalaVersion := Versions.Scala,
    vcpkgDependencies := VcpkgDependencies("curl"),
    vcpkgNativeConfig ~= { _.addRenamedLibrary("curl", "libcurl") },
    bindgenBindings += {
      Binding(
        vcpkgConfigurator.value.includes("curl") / "curl" / "curl.h",
        "curl"
      )
        .withCImports(
          List("curl/curl.h")
        )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())
lazy val openssl = project
  .in(file("example-openssl"))
  .enablePlugins(ScalaNativePlugin, BindgenPlugin, VcpkgNativePlugin)
  .settings(
    vcpkgDependencies := VcpkgDependencies("openssl"),
    scalaVersion := Versions.Scala,
    nativeConfig ~= {
      (_).withSourceLevelDebuggingConfig(SourceLevelDebuggingConfig.enabled)
    },
    bindgenBindings := {
      Seq(
        Binding(
          (Compile / baseDirectory).value / "openssl-amalgam.h",
          "openssl"
        )
          .withCImports(
            List("openssl/sha.h", "openssl/evp.h")
          )
          .withClangFlags(
            List("-I" + vcpkgConfigurator.value.includes("openssl"))
          )
      )
    }
  )
  .settings(bindgenSettings)
  .settings(configurePlatform())


val detectedJavaHome = settingKey[File]("")
ThisBuild / detectedJavaHome := {
  val fromEnv = sys.env.get("JAVA_HOME").map(new File(_))
  val log = sLog.value
  lazy val fromDiscovery = {
    val disc = (ThisBuild / discoveredJavaHomes).value
    disc
      .flatMap { case (v, loc) =>
        scala.util.Try(v.toInt).toOption.map(_ -> loc)
      }
      .toSeq
      .sortBy(_._1)
      .reverse
      .headOption
      .map(_._2)
      .map { loc =>
        log.warn(
          s"Selecting $loc by choosing the highest available version from discoveredJavaHomes (no othe options worked)"
        )
        loc
      }
  }

  (ThisBuild / javaHome).value
    .orElse(fromEnv)
    .orElse(fromDiscovery)
    .getOrElse(
      sys.error("No Java home detected!")
    )
}

//lazy val jni = project
//  .in(file("example-jni"))
//  .enablePlugins(ScalaNativePlugin, BindgenPlugin)
//  .settings(
//    scalaVersion := Versions.Scala,
//    bindgenBindings += {
//      import Platform.OS.*
//      val jni_md = Platform.target.os match {
//        case Linux   => "linux"
//        case MacOS   => "darwin"
//        case Windows => "windows"
//      }
//      Binding(
//        detectedJavaHome.value / "include/jni.h",
//        "jni"
//      ).withNoConstructor(Set("JNINativeInterface_"))
//        .addClangFlag(
//          "-I" + (detectedJavaHome.value / s"include/$jni_md").toString
//        )
//    },
//    nativeConfig := {
//      val conf = nativeConfig.value
//      conf.withLinkingOptions(
//        _ ++ Seq(
//          "-L" + (detectedJavaHome.value / "lib").toString,
//          "-ljli",
//          "-L" + (detectedJavaHome.value / "lib/server").toString,
//          "-ljvm",
//          // Note that adding rpath like this makes the binary non portable,
//          // but I don't know how else to fix the @rpath problem this creates
//          "-Wl,-rpath",
//          (detectedJavaHome.value / "lib").toString,
//          "-Wl,-rpath",
//          (detectedJavaHome.value / "lib/server").toString
//        )
//      )
//    }
//  )
//  .settings(bindgenSettings)

//vcpkg install openssl:x64-windows
//vcpkg install mpi:x64-windows
//sbt -mem 1400  bindgenGenerateScalaSources

