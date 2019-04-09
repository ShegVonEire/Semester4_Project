
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

object sendfeedback extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Send Feedback")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
  """),format.raw/*3.3*/("""<html>
  <head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
  body """),format.raw/*7.8*/("""{"""),format.raw/*7.9*/("""font-family: Arial, Helvetica, sans-serif;"""),format.raw/*7.51*/("""}"""),format.raw/*7.52*/("""
  """),format.raw/*8.3*/("""* """),format.raw/*8.5*/("""{"""),format.raw/*8.6*/("""box-sizing: border-box;"""),format.raw/*8.29*/("""}"""),format.raw/*8.30*/("""
  
  """),format.raw/*10.3*/("""input[type=text], select, textarea """),format.raw/*10.38*/("""{"""),format.raw/*10.39*/("""
    """),format.raw/*11.5*/("""width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
  """),format.raw/*19.3*/("""}"""),format.raw/*19.4*/("""
  
  """),format.raw/*21.3*/("""input[type=submit] """),format.raw/*21.22*/("""{"""),format.raw/*21.23*/("""
    """),format.raw/*22.5*/("""background-color: #42c8f4;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  """),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""
  
  """),format.raw/*30.3*/("""input[type=submit]:hover """),format.raw/*30.28*/("""{"""),format.raw/*30.29*/("""
    """),format.raw/*31.5*/("""background-color: #42c8f4;
  """),format.raw/*32.3*/("""}"""),format.raw/*32.4*/("""
  
  """),format.raw/*34.3*/(""".container """),format.raw/*34.14*/("""{"""),format.raw/*34.15*/("""
    """),format.raw/*35.5*/("""border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""
  """),format.raw/*39.3*/("""</style>
  </head>
  <body>
  
  <h3>Contact Form</h3>
  
  <div class="container">
    <form action="/action_page.php">
      <label for="fname">First Name</label>
      <input type="text" id="fname" name="firstname" placeholder="First name">
      <label for="lname">Last Name</label>
      <input type="text" id="lname" name="lastname" placeholder="Last name">
      <label for="email">Email</label>
      <input type="text" id="email" name="email" placeholder="email@example.com">
      <input type="text" id="country" name="country" placeholder="Country">
      <label for="Country">Country</label>
  
      <label for="subject">Subject</label>
      <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
  
      <input type="submit" value="Submit">
    </form>
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
                  DATE: Wed Apr 03 19:29:57 IST 2019
                  SOURCE: /home/wdd/Isle-of-books/app/views/sendfeedback.scala.html
                  HASH: 782e65baeade777eae8ce5af170caa569bec7c5f
                  MATRIX: 1037->2|1066->23|1105->25|1134->28|1264->132|1291->133|1360->175|1388->176|1417->179|1445->181|1472->182|1522->205|1550->206|1583->212|1646->247|1675->248|1707->253|1916->435|1944->436|1977->442|2024->461|2053->462|2085->467|2246->601|2274->602|2307->608|2360->633|2389->634|2421->639|2477->668|2505->669|2538->675|2577->686|2606->687|2638->692|2737->764|2765->765|2795->768
                  LINES: 33->2|33->2|33->2|34->3|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|41->10|41->10|41->10|42->11|50->19|50->19|52->21|52->21|52->21|53->22|59->28|59->28|61->30|61->30|61->30|62->31|63->32|63->32|65->34|65->34|65->34|66->35|69->38|69->38|70->39
                  -- GENERATED --
              */
          