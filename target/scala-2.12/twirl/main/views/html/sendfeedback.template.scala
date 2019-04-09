
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

object sendFeedback extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Feedback],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(submitFeedbackForm: Form[models.Feedback]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models._
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.50*/("""
"""),_display_(/*6.2*/main("Submit Feedback")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""

"""),format.raw/*8.1*/("""<h3>Give us Feedback</h3>

"""),format.raw/*10.60*/("""
"""),_display_(/*11.2*/form(action = routes.HomeController.sendFeedbackSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.138*/ {_display_(Seq[Any](format.raw/*11.140*/("""
"""),_display_(/*12.2*/CSRF/*12.6*/.formField),format.raw/*12.16*/("""

"""),format.raw/*16.3*/("""
"""),format.raw/*17.52*/("""
"""),_display_(/*18.2*/inputText(submitFeedbackForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.73*/("""
"""),_display_(/*19.2*/inputText(submitFeedbackForm("email"), '_label -> "Email",'class -> "form-control")),format.raw/*19.85*/("""
"""),_display_(/*20.2*/inputText(submitFeedbackForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*20.83*/("""
"""),_display_(/*21.2*/inputText(submitFeedbackForm("country"), '_label -> "Country",'class -> "form-control")),format.raw/*21.89*/("""
"""),_display_(/*22.2*/inputText(submitFeedbackForm("message"), '_label -> "Message",'class -> "form-control")),format.raw/*22.89*/("""
"""),format.raw/*23.1*/("""<br><br>

<!-- Add a submit button -->
<div class="actions">
  <input type="submit" value="Submit feedback" class="btn btn-primary">
  <a href=""""),_display_(/*28.13*/routes/*28.19*/.HomeController.index()),format.raw/*28.42*/("""">
    <button class="btn btn-warning">Cancel</button>
  </a>
</div>
""")))}),format.raw/*32.2*/(""" """),format.raw/*32.3*/("""<!-- End Form definition -->
""")))}),format.raw/*33.2*/("""


"""))
      }
    }
  }

  def render(submitFeedbackForm:Form[models.Feedback]): play.twirl.api.HtmlFormat.Appendable = apply(submitFeedbackForm)

  def f:((Form[models.Feedback]) => play.twirl.api.HtmlFormat.Appendable) = (submitFeedbackForm) => apply(submitFeedbackForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/sendFeedback.scala.html
                  HASH: 66fd1d2eafe8acd5b03f1ab4585820670e517c45
                  MATRIX: 970->1|1086->46|1109->63|1153->79|1181->129|1208->131|1239->154|1278->156|1306->158|1361->244|1389->246|1535->382|1576->384|1604->386|1616->390|1647->400|1676->480|1705->532|1733->534|1825->605|1853->607|1957->690|1985->692|2087->773|2115->775|2223->862|2251->864|2359->951|2387->952|2559->1097|2574->1103|2618->1126|2718->1196|2746->1197|2806->1227
                  LINES: 28->1|31->2|32->3|35->4|36->5|37->6|37->6|37->6|39->8|41->10|42->11|42->11|42->11|43->12|43->12|43->12|45->16|46->17|47->18|47->18|48->19|48->19|49->20|49->20|50->21|50->21|51->22|51->22|52->23|57->28|57->28|57->28|61->32|61->32|62->33
                  -- GENERATED --
              */
          