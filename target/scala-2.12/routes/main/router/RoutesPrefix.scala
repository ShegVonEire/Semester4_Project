// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Semester4_Project/conf/routes
// @DATE:Wed Apr 10 13:55:20 IST 2019


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
