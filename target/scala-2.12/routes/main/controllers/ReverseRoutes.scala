// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Isle-of-books/conf/routes
// @DATE:Tue Apr 09 14:08:07 IST 2019

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

  
    // @LINE:21
    def addBooksSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addBooksSubmit")
    }
  
    // @LINE:24
    def updateBooks(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateBooks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def sendfeedback(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sendfeedback")
    }
  
    // @LINE:27
    def deleteBooks(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delBooks/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def contactus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactus")
    }
  
    // @LINE:16
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:18
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
  
    // @LINE:14
    def addBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addBooks")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
