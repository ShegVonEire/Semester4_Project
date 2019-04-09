// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Isle-of-books/conf/routes
// @DATE:Tue Apr 09 14:08:07 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:31
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:31
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.HomeController.books(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBooks""", """controllers.HomeController.addBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendfeedback""", """controllers.HomeController.sendfeedback()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactus""", """controllers.HomeController.contactus()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.HomeController.payment()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBooksSubmit""", """controllers.HomeController.addBooksSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateBooks/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateBooks(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delBooks/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteBooks(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_0.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_books2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_HomeController_books2_invoker = createInvoker(
    HomeController_0.books(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "books",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """books""",
      """ bookss accepts a parameter default to 0 (Long)""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_addBooks3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBooks")))
  )
  private[this] lazy val controllers_HomeController_addBooks3_invoker = createInvoker(
    HomeController_0.addBooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addBooks",
      Nil,
      "GET",
      this.prefix + """addBooks""",
      """ Display the add books page""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_sendfeedback4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendfeedback")))
  )
  private[this] lazy val controllers_HomeController_sendfeedback4_invoker = createInvoker(
    HomeController_0.sendfeedback(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sendfeedback",
      Nil,
      "GET",
      this.prefix + """sendfeedback""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_signup5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup5_invoker = createInvoker(
    HomeController_0.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_contactus6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactus")))
  )
  private[this] lazy val controllers_HomeController_contactus6_invoker = createInvoker(
    HomeController_0.contactus(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contactus",
      Nil,
      "GET",
      this.prefix + """contactus""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_payment7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_HomeController_payment7_invoker = createInvoker(
    HomeController_0.payment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_addBooksSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBooksSubmit")))
  )
  private[this] lazy val controllers_HomeController_addBooksSubmit8_invoker = createInvoker(
    HomeController_0.addBooksSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addBooksSubmit",
      Nil,
      "POST",
      this.prefix + """addBooksSubmit""",
      """ Process the add books form after it is submitted using the POST method """,
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_updateBooks9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateBooks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateBooks9_invoker = createInvoker(
    HomeController_0.updateBooks(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateBooks",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateBooks/""" + "$" + """id<[^/]+>""",
      """ Update books (by id)""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_deleteBooks10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delBooks/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteBooks10_invoker = createInvoker(
    HomeController_0.deleteBooks(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteBooks",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delBooks/""" + "$" + """id<[^/]+>""",
      """ Delete a books by an id passed as a parameter""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_about1_route(params@_) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_0.about)
      }
  
    // @LINE:11
    case controllers_HomeController_books2_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_books2_invoker.call(HomeController_0.books(cat))
      }
  
    // @LINE:14
    case controllers_HomeController_addBooks3_route(params@_) =>
      call { 
        controllers_HomeController_addBooks3_invoker.call(HomeController_0.addBooks())
      }
  
    // @LINE:15
    case controllers_HomeController_sendfeedback4_route(params@_) =>
      call { 
        controllers_HomeController_sendfeedback4_invoker.call(HomeController_0.sendfeedback())
      }
  
    // @LINE:16
    case controllers_HomeController_signup5_route(params@_) =>
      call { 
        controllers_HomeController_signup5_invoker.call(HomeController_0.signup())
      }
  
    // @LINE:17
    case controllers_HomeController_contactus6_route(params@_) =>
      call { 
        controllers_HomeController_contactus6_invoker.call(HomeController_0.contactus())
      }
  
    // @LINE:18
    case controllers_HomeController_payment7_route(params@_) =>
      call { 
        controllers_HomeController_payment7_invoker.call(HomeController_0.payment())
      }
  
    // @LINE:21
    case controllers_HomeController_addBooksSubmit8_route(params@_) =>
      call { 
        controllers_HomeController_addBooksSubmit8_invoker.call(HomeController_0.addBooksSubmit())
      }
  
    // @LINE:24
    case controllers_HomeController_updateBooks9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateBooks9_invoker.call(HomeController_0.updateBooks(id))
      }
  
    // @LINE:27
    case controllers_HomeController_deleteBooks10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteBooks10_invoker.call(HomeController_0.deleteBooks(id))
      }
  
    // @LINE:31
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}