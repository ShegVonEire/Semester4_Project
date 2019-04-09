
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


Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*4.1*/("""
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
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/addBooks.scala.html
                  HASH: afaab03e16456b195b923e5ad414eaa5c94c46e6
                  MATRIX: 963->1|1070->38|1093->56|1138->35|1166->73|1195->124|1223->127|1248->144|1287->146|1318->151|1375->239|1405->243|1547->375|1588->377|1626->388|1639->392|1670->402|1712->516|1750->577|1788->588|1874->653|1907->660|2004->736|2042->747|2152->836|2190->847|2296->932|2334->970|2372->1060|2410->1071|2670->1310|2708->1321|2806->1398|2844->1409|2942->1486|2973->1491|3071->1568|3109->1579|3207->1656|3240->1662|3427->1822|3442->1828|3487->1852|3594->1929|3622->1930|3683->1961
                  LINES: 28->1|31->2|32->3|35->1|36->4|37->5|38->6|38->6|38->6|40->8|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->16|47->17|48->18|48->18|50->20|50->20|51->21|51->21|52->22|52->22|53->23|54->24|55->25|60->30|61->31|61->31|62->32|62->32|63->33|63->33|64->34|64->34|66->36|71->41|71->41|71->41|75->45|75->45|76->46
                  -- GENERATED --
              */
          