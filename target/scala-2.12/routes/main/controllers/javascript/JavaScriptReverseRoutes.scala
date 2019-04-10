// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Semester4_Project/conf/routes
// @DATE:Wed Apr 10 13:55:20 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def feedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.feedback",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
        }
      """
    )
  
    // @LINE:23
    def sendFeedbackSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sendFeedbackSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendFeedbackSubmit"})
        }
      """
    )
  
    // @LINE:22
    def addBooksSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addBooksSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addBooksSubmit"})
        }
      """
    )
  
    // @LINE:26
    def updateBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateBooks",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateBooks/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def deleteBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteBooks",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delBooks/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:18
    def contactus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contactus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactus"})
        }
      """
    )
  
    // @LINE:17
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:19
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.payment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
    // @LINE:7
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:11
    def books: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.books",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:15
    def addBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addBooks"})
        }
      """
    )
  
    // @LINE:16
    def sendFeedback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.sendFeedback",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendFeedback"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
