
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


Seq[Any](format.raw/*7.19*/("""

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
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/index.scala.html
                  HASH: 88d43837e39ea1eba0f7a4d06dfbe64253b189d5
                  MATRIX: 960->120|1072->137|1102->142|1127->159|1166->161|1201->169
                  LINES: 28->7|33->7|35->9|35->9|35->9|36->10
                  -- GENERATED --
              */
          