// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/X00148076/Downloads/Semester4_Project/conf/routes
// @DATE:Tue Apr 09 15:44:25 BST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
