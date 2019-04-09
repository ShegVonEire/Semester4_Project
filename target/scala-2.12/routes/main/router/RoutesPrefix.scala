// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Isle-of-books/conf/routes
// @DATE:Tue Apr 09 14:08:07 IST 2019


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
