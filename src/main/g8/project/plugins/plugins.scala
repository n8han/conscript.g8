import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val cs = "net.databinder" % "conscript-plugin" % "0.2.1"
}
