package $orgId$

class App extends xsbti.AppMain {
  def run(config: xsbti.AppConfiguration) = {
    println("Hello World")
    Exit(0)
  }
}
case class Exit(val code: Int) extends xsbti.Exit
