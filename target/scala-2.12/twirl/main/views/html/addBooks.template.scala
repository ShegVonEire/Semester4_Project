
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

object addBooks extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Books],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addBooksForm: Form[models.Books]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models._
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),format.raw/*5.50*/("""
"""),_display_(/*6.2*/main("New books")/*6.19*/ {_display_(Seq[Any](format.raw/*6.21*/("""

	"""),format.raw/*8.2*/("""<h3>Add a new Book</h3>
	
	"""),format.raw/*10.61*/("""
	"""),_display_(/*11.3*/form(action = routes.HomeController.addBooksSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.135*/ {_display_(Seq[Any](format.raw/*11.137*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        
		"""),format.raw/*16.11*/("""
        """),format.raw/*17.60*/("""
        """),_display_(/*18.10*/inputText(addBooksForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.75*/("""

		"""),_display_(/*20.4*/inputText(addBooksForm("title"), '_label -> "Name",'class -> "form-control")),format.raw/*20.80*/("""
        """),_display_(/*21.10*/inputText(addBooksForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*21.99*/("""
        """),_display_(/*22.10*/inputText(addBooksForm("publisher"), '_label -> "Publisher",'class -> "form-control")),format.raw/*22.95*/("""
        """),format.raw/*23.37*/("""
        """),format.raw/*24.89*/("""
        """),_display_(/*25.10*/select(
            addBooksForm("genre.id"),
            options(Genre.options),
            '_label -> "Choose a genre", '_default -> "-- Choose a genre --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*30.10*/("""
        """),_display_(/*31.10*/inputText(addBooksForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*31.87*/("""
        """),_display_(/*32.10*/inputText(addBooksForm("ISBN13"), '_label -> "ISBN",'class -> "form-control")),format.raw/*32.87*/("""
		"""),_display_(/*33.4*/inputText(addBooksForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*33.81*/("""
        """),_display_(/*34.10*/inputText(addBooksForm("pages"), '_label -> "Pages",'class -> "form-control")),format.raw/*34.87*/("""

		"""),format.raw/*36.3*/("""<br><br>

	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add/ Update books" class="btn btn-primary">
	  <a href=""""),_display_(/*41.14*/routes/*41.20*/.HomeController.books(0)),format.raw/*41.44*/("""">
			<button class="btn btn-warning">Cancel</button>
	  </a>
  </div>
	""")))}),format.raw/*45.3*/(""" """),format.raw/*45.4*/("""<!-- End Form definition -->
""")))}),format.raw/*46.2*/("""


"""))
      }
    }
  }

  def render(addBooksForm:Form[models.Books]): play.twirl.api.HtmlFormat.Appendable = apply(addBooksForm)

  def f:((Form[models.Books]) => play.twirl.api.HtmlFormat.Appendable) = (addBooksForm) => apply(addBooksForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 18:53:48 IST 2019
                  SOURCE: /home/wdd/Isle-of-books/app/views/addBooks.scala.html
                  HASH: cddee278810071c9781f752d637311fc88dbeb20
                  MATRIX: 963->1|1070->37|1093->54|1137->70|1165->120|1192->122|1217->139|1256->141|1285->144|1340->230|1369->233|1511->365|1552->367|1589->377|1602->381|1633->391|1673->501|1710->561|1747->571|1833->636|1864->641|1961->717|1998->727|2108->816|2145->826|2251->911|2288->948|2325->1037|2362->1047|2617->1281|2654->1291|2752->1368|2789->1378|2887->1455|2917->1459|3015->1536|3052->1546|3150->1623|3181->1627|3363->1782|3378->1788|3423->1812|3526->1885|3554->1886|3614->1916
                  LINES: 28->1|31->2|32->3|35->4|36->5|37->6|37->6|37->6|39->8|41->10|42->11|42->11|42->11|43->12|43->12|43->12|45->16|46->17|47->18|47->18|49->20|49->20|50->21|50->21|51->22|51->22|52->23|53->24|54->25|59->30|60->31|60->31|61->32|61->32|62->33|62->33|63->34|63->34|65->36|70->41|70->41|70->41|74->45|74->45|75->46
                  -- GENERATED --
              */
          