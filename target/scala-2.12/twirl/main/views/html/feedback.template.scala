
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
/*6.2*/import models.Books

object feedback extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Feedback],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(feedbackList: List[Feedback]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Feedback")/*9.18*/ {_display_(Seq[Any](format.raw/*9.20*/("""
"""),format.raw/*10.1*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
<div class="row">

    <div class="col-sm-auto">


        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
        """),format.raw/*17.9*/("""<div class="alert alert-success">
            """),_display_(/*18.14*/flash/*18.19*/.get("success")),format.raw/*18.34*/("""
        """),format.raw/*19.9*/("""</div>
        """)))}),format.raw/*20.10*/("""

        """),format.raw/*22.9*/("""<!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
        <table class="table table-hover">
            <thead>
            <th scope="col">Email</th>
            <th scope="col">Name</th>
            <th scope="col">Country</th>
            <th scope="col">Message</th>

            </thead>
            <tbody>

            """),_display_(/*33.14*/for(feedback <- feedbackList) yield /*33.43*/ {_display_(Seq[Any](format.raw/*33.45*/("""
            """),format.raw/*34.13*/("""<tr scope="row">
                <td>"""),_display_(/*35.22*/feedback/*35.30*/.getEmail),format.raw/*35.39*/("""</td>
                <td>"""),_display_(/*36.22*/feedback/*36.30*/.getName),format.raw/*36.38*/("""</td>
                <td>"""),_display_(/*37.22*/feedback/*37.30*/.getCountry),format.raw/*37.41*/("""</td>
                <td>"""),_display_(/*38.22*/feedback/*38.30*/.getMessage),format.raw/*38.41*/("""</td>


            </tr>
            """)))}),format.raw/*42.14*/(""" """),format.raw/*42.32*/("""
            """),format.raw/*43.13*/("""</tbody>
            <tfoot>
            <tr scope="row">

            </tr>
            </tfoot>
        </table>


    </div>
    """)))}))
      }
    }
  }

  def render(feedbackList:List[Feedback]): play.twirl.api.HtmlFormat.Appendable = apply(feedbackList)

  def f:((List[Feedback]) => play.twirl.api.HtmlFormat.Appendable) = (feedbackList) => apply(feedbackList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 13:55:21 IST 2019
                  SOURCE: /home/wdd/Semester4_Project/app/views/feedback.scala.html
                  HASH: 26b7e93a69e9dbfdf61eade3b60b4259a8c581d0
                  MATRIX: 651->93|986->114|1110->145|1137->147|1161->163|1200->165|1228->166|1371->282|1412->314|1452->316|1488->325|1562->372|1576->377|1612->392|1648->401|1695->417|1732->427|2095->763|2140->792|2180->794|2221->807|2286->845|2303->853|2333->862|2387->889|2404->897|2433->905|2487->932|2504->940|2536->951|2590->978|2607->986|2639->997|2709->1036|2738->1054|2779->1067
                  LINES: 24->6|29->7|34->8|35->9|35->9|35->9|36->10|42->16|42->16|42->16|43->17|44->18|44->18|44->18|45->19|46->20|48->22|59->33|59->33|59->33|60->34|61->35|61->35|61->35|62->36|62->36|62->36|63->37|63->37|63->37|64->38|64->38|64->38|68->42|68->42|69->43
                  -- GENERATED --
              */
          