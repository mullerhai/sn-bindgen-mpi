import scala.scalanative.build.SourceLevelDebuggingConfig
import scala.scalanative.build.OptimizerConfig
import bindgen.plugin.BindgenMode
import com.indoorvivants.detective.Platform.OS.*
import com.indoorvivants.detective.Platform
import bindgen.interface.Binding
import bindgen.interface.LogLevel
import java.nio.file.Paths
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
          (Compile / baseDirectory).value / "mpi-amalgam.h",
          "mpi"
        )
//          .withCImports(
//            List("openssl/sha.h", "openssl/evp.h")
//          )
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

//vcpkg install openssl:x64-windows
//vcpkg install mpi:x64-windows
//sbt -mem 1400  bindgenGenerateScalaSources

