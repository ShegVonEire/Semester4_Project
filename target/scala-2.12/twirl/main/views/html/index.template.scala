
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* Param List */
  def apply/*7.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Home Page")/*9.19*/ {_display_(Seq[Any](format.raw/*9.21*/("""
      """),format.raw/*10.7*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
      <div class="starter-template">
            <h1>Welcome to the Isle Of Books</h1>
           
          </div>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 13:55:21 IST 2019
                  SOURCE: /home/wdd/Semester4_Project/app/views/index.scala.html
                  HASH: f9a39f297c83326f6d88fe7695c13f6db7571fac
                  MATRIX: 960->114|1071->132|1098->134|1123->151|1162->153|1196->160
                  LINES: 28->7|33->8|34->9|34->9|34->9|35->10
                  -- GENERATED --
              */
          