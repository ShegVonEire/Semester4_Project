
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*6.3*/main("About Us")/*6.19*/ {_display_(Seq[Any](format.raw/*6.21*/("""
      """),format.raw/*7.7*/("""<!-- this css class is not part of bootstrap but is defined in /css/style.css -->
      <div class="starter-template">
        <h2>About us</h2>
        <p>Hi, our names are: Seán Dieter Eggert, Taylor McGrath and Seán EJ Guerrero, and we are the ones behind the Isle of Books website.</p><br>
        <p>This website was created for our year 2 project in our Computer Science course in the Tallaght Branch TU Dublin.</p><br>
        <p> Need more INFO</p>
          </div>
 """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 18:53:48 IST 2019
                  SOURCE: /home/wdd/Isle-of-books/app/views/about.scala.html
                  HASH: ffa06f006668818d5d4b53f76879b8aea1a238e6
                  MATRIX: 1119->97|1143->113|1182->115|1215->122
                  LINES: 36->6|36->6|36->6|37->7
                  -- GENERATED --
              */
          