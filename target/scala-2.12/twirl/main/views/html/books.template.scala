
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
/*6.3*/import models.Books

object books extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Books],List[Genre],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.3*/(booksList: List[Books], genreList: List[Genre]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.51*/("""

 """),_display_(/*9.3*/main("Books")/*9.16*/ {_display_(Seq[Any](format.raw/*9.18*/("""
      """),format.raw/*10.7*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
      <div class="row">
        <div class="col-sm-auto">
          <h4>Genres</h4>
          <!-- https://getbootstrap.com/docs/4.0/components/list-group/ -->
          <div class="list-group text-right">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.books(0)),format.raw/*16.53*/("""" class="list-group-item  list-group-item-action">All Genres
              <span class="badge badge-secondary">"""),_display_(/*17.52*/booksList/*17.61*/.size()),format.raw/*17.68*/("""</span>
            </a>

            """),format.raw/*20.72*/("""
            """),format.raw/*21.68*/("""
            
            """),_display_(/*23.14*/for(genre <- genreList) yield /*23.37*/ {_display_(Seq[Any](format.raw/*23.39*/("""
              """),format.raw/*24.15*/("""<a href=""""),_display_(/*24.25*/routes/*24.31*/.HomeController.books(genre.getId)),format.raw/*24.65*/("""" class="list-group-item  list-group-item-action">"""),_display_(/*24.116*/genre/*24.121*/.getName),format.raw/*24.129*/("""
                """),format.raw/*25.17*/("""<span class="badge badge-secondary">"""),_display_(/*25.54*/genre/*25.59*/.getBooks.size()),format.raw/*25.75*/("""</span>
              </a>
            """)))}),format.raw/*27.14*/(""" """),format.raw/*27.38*/("""

          """),format.raw/*29.11*/("""</div>

        </div>

        <div class="col-sm-auto">

            """),format.raw/*35.63*/("""
            """),_display_(/*36.14*/if(flash.containsKey("success"))/*36.46*/ {_display_(Seq[Any](format.raw/*36.48*/("""
              """),format.raw/*37.15*/("""<div class="alert alert-success">
                  """),_display_(/*38.20*/flash/*38.25*/.get("success")),format.raw/*38.40*/("""
              """),format.raw/*39.15*/("""</div>
            """)))}),format.raw/*40.14*/(""" 

          """),format.raw/*42.11*/("""<!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
          <table class="table table-hover">
            <thead>
              <th scope="col">ID</th>
              <th scope="col">Title</th>
              <th scope="col">ISBN13 number</th>
              <th scope="col">Publisher</th>
              <th scope="col">Description</th>
              <th scope="col">Genre</th>
              <th scope="col">stock</th>
              <th scope="col">Price</th>
              <th scope="col">Pages</th>
            </thead>
            <tbody>
            """),format.raw/*56.79*/("""
            """),format.raw/*57.51*/("""
            """),_display_(/*58.14*/for(books <- booksList) yield /*58.37*/ {_display_(Seq[Any](format.raw/*58.39*/("""
              """),format.raw/*59.15*/("""<tr scope="row">
                <td>"""),_display_(/*60.22*/books/*60.27*/.getId),format.raw/*60.33*/("""</td>
                <td>"""),_display_(/*61.22*/books/*61.27*/.getTitle),format.raw/*61.36*/("""</td>
                <td>"""),_display_(/*62.22*/books/*62.27*/.getISBN13),format.raw/*62.37*/("""</td>
               
                <td>"""),_display_(/*64.22*/books/*64.27*/.getPublisher),format.raw/*64.40*/("""</td>
                <td>"""),_display_(/*65.22*/books/*65.27*/.getDescription),format.raw/*65.42*/("""</td>
                <td>"""),_display_(/*66.22*/books/*66.27*/.getGenre.getName),format.raw/*66.44*/("""</td>
                <td>"""),_display_(/*67.22*/books/*67.27*/.getStock),format.raw/*67.36*/("""</td>
                <td class="text-right">&euro;"""),_display_(/*68.47*/("%.2f".format(books.getPrice))),format.raw/*68.78*/("""</td>
                <td>"""),_display_(/*69.22*/books/*69.27*/.getPages),format.raw/*69.36*/("""</td>
                <td>
                  <!-- https://fontawesome.com/get-started/web-fonts-with-css -->
                  <!-- https://fontawesome.com/icons?d=gallery -->
                  <!-- https://getbootstrap.com/docs/4.0/components/buttons/ -->
                    <a href=""""),_display_(/*74.31*/routes/*74.37*/.HomeController.updateBooks(books.getId)),format.raw/*74.77*/("""" class="btn btn-outline-danger btn-sm">
                    <i class="far fa-edit"></i></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                    <a href=""""),_display_(/*79.31*/routes/*79.37*/.HomeController.deleteBooks(books.getId)),format.raw/*79.77*/("""" class="btn btn-outline-danger btn-sm"
                    onclick="return confirmDel();">
                    <i class="far fa-trash-alt"></i></a>
                  </td>

              </tr>
            """)))}),format.raw/*85.14*/(""" """),format.raw/*85.32*/("""
            """),format.raw/*86.13*/("""</tbody>
            <tfoot>
              <tr scope="row">
                
              </tr>
            </tfoot>
          </table>





          <div class="container">
            <h2>Cards Columns</h2>
            <p>The .card-columns class creates a masonry-like grid of cards. The layout will automatically adjust as you insert more cards.</p>
            <p><strong>Note:</strong> The cards are displayed vertically on small screens (less than 576px):</p>
            <div class="card-columns">
              <div class="card bg-primary">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the first card</p>
                </div>
              </div>
              <div class="card bg-warning">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the second card</p>
                </div>
              </div>
              <div class="card bg-success">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the third card</p>
                </div>
              </div>
              <div class="card bg-danger">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the fourth card</p>
                </div>
              </div>  
              <div class="card bg-light">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the fifth card</p>
                </div>
              </div>
              <div class="card bg-info">
                <div class="card-body text-center">
                  <p class="card-text">Some text inside the sixth card</p>
                </div>
              </div>
            </div>
          </div>






		  
          <div>
              <a href=""""),_display_(/*143.25*/routes/*143.31*/.HomeController.addBooks()),format.raw/*143.57*/("""">
                <button class="btn btn-primary">Add a Book</button>
              </a>
          </div>

        </div>
 """)))}),format.raw/*149.3*/("""
"""))
      }
    }
  }

  def render(booksList:List[Books],genreList:List[Genre]): play.twirl.api.HtmlFormat.Appendable = apply(booksList,genreList)

  def f:((List[Books],List[Genre]) => play.twirl.api.HtmlFormat.Appendable) = (booksList,genreList) => apply(booksList,genreList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/books.scala.html
                  HASH: b2186459d3650aec91a6ea0f86af648bebf157aa
                  MATRIX: 651->102|992->125|1135->173|1166->179|1187->192|1226->194|1261->202|1578->492|1593->498|1638->522|1778->635|1796->644|1824->651|1893->751|1935->820|1991->849|2030->872|2070->874|2114->890|2151->900|2166->906|2221->940|2300->991|2315->996|2345->1004|2391->1022|2455->1059|2469->1064|2506->1080|2579->1122|2608->1146|2650->1160|2755->1287|2797->1302|2838->1334|2878->1336|2922->1352|3003->1406|3017->1411|3053->1426|3097->1442|3149->1463|3192->1478|3794->2118|3836->2170|3878->2185|3917->2208|3957->2210|4001->2226|4067->2265|4081->2270|4108->2276|4163->2304|4177->2309|4207->2318|4262->2346|4276->2351|4307->2361|4379->2406|4393->2411|4427->2424|4482->2452|4496->2457|4532->2472|4587->2500|4601->2505|4639->2522|4694->2550|4708->2555|4738->2564|4818->2617|4870->2648|4925->2676|4939->2681|4969->2690|5288->2982|5303->2988|5364->3028|5615->3252|5630->3258|5691->3298|5935->3511|5964->3529|6006->3543|7973->5482|7989->5488|8037->5514|8199->5645
                  LINES: 24->6|29->7|34->7|36->9|36->9|36->9|37->10|43->16|43->16|43->16|44->17|44->17|44->17|47->20|48->21|50->23|50->23|50->23|51->24|51->24|51->24|51->24|51->24|51->24|51->24|52->25|52->25|52->25|52->25|54->27|54->27|56->29|62->35|63->36|63->36|63->36|64->37|65->38|65->38|65->38|66->39|67->40|69->42|83->56|84->57|85->58|85->58|85->58|86->59|87->60|87->60|87->60|88->61|88->61|88->61|89->62|89->62|89->62|91->64|91->64|91->64|92->65|92->65|92->65|93->66|93->66|93->66|94->67|94->67|94->67|95->68|95->68|96->69|96->69|96->69|101->74|101->74|101->74|106->79|106->79|106->79|112->85|112->85|113->86|170->143|170->143|170->143|176->149
                  -- GENERATED --
              */
          