
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

object contactus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("contactus")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="main.css">
		<h1>Contact Us</h1>
		
	</head>

	<body>
		<div class="test">
			<p></p>
				<br>
			<p>If you have any questions or issues please give us a call on <a class="phone-link" href="tel:00353850000000">+353 85 0000000</a>.</p>
				<br>
			<p>You can also contact us on our email if at <a href="mailto: isleofbooksITP@gmail.com">isleofbooksITP@gmail.com</a>.</p>
				<br>
			<p>If you would like to make any returns please contact the seller who you make your purchase from.</p>
				<br>
			<p>You can also<a href = "mailto:abc@example.com?subject = Feedback&body = Message"> Send us Feedback </a>.</p>
		</div>
		
		<div class="logo">
			<a href="homepage.isleofbooks.com">
				<img src="logo.png" alt="Logo of Isle of Books" height="150" width="150" >
			</a>
		</div>
	</body>
</html>
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
                  DATE: Tue Apr 09 13:56:43 IST 2019
                  SOURCE: /home/wdd/Isle-of-books/app/views/contactus.scala.html
                  HASH: 91d99523667a10fed4ed17c8abae9784b74ad27a
                  MATRIX: 1034->1|1059->18|1098->20|1125->21
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          