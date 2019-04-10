// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Semester4_Project/conf/routes
// @DATE:Wed Apr 10 13:55:20 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def feedback(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedback")
    }
  
    // @LINE:23
    def sendFeedbackSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sendFeedbackSubmit")
    }
  
    // @LINE:22
    def addBooksSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addBooksSubmit")
    }
  
    // @LINE:26
    def updateBooks(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateBooks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def deleteBooks(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delBooks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def contactus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactus")
    }
  
    // @LINE:17
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:19
    def payment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:11
    def books(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books" + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:15
    def addBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addBooks")
    }
  
    // @LINE:16
    def sendFeedback(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendFeedback")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:33
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
