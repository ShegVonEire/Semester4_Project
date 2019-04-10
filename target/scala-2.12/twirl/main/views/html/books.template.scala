
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


Seq[Any](format.raw/*8.1*/("""
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
                  DATE: Wed Apr 10 13:55:20 IST 2019
                  SOURCE: /home/wdd/Semester4_Project/app/views/books.scala.html
                  HASH: 44162d3c3d7c7ea0c00e40d7930ed54955635cf2
                  MATRIX: 651->97|992->119|1134->168|1162->171|1183->184|1222->186|1256->193|1567->477|1582->483|1627->507|1766->619|1784->628|1812->635|1878->732|1919->800|1973->827|2012->850|2052->852|2095->867|2132->877|2147->883|2202->917|2281->968|2296->973|2326->981|2371->998|2435->1035|2449->1040|2486->1056|2557->1096|2586->1120|2626->1132|2725->1253|2766->1267|2807->1299|2847->1301|2890->1316|2970->1369|2984->1374|3020->1389|3063->1404|3114->1424|3155->1437|3743->2063|3784->2114|3825->2128|3864->2151|3904->2153|3947->2168|4012->2206|4026->2211|4053->2217|4107->2244|4121->2249|4151->2258|4205->2285|4219->2290|4250->2300|4320->2343|4334->2348|4368->2361|4422->2388|4436->2393|4472->2408|4526->2435|4540->2440|4578->2457|4632->2484|4646->2489|4676->2498|4755->2550|4807->2581|4861->2608|4875->2613|4905->2622|5219->2909|5234->2915|5295->2955|5541->3174|5556->3180|5617->3220|5855->3427|5884->3445|5925->3458|7835->5340|7851->5346|7899->5372|8055->5497
                  LINES: 24->6|29->7|34->8|35->9|35->9|35->9|36->10|42->16|42->16|42->16|43->17|43->17|43->17|46->20|47->21|49->23|49->23|49->23|50->24|50->24|50->24|50->24|50->24|50->24|50->24|51->25|51->25|51->25|51->25|53->27|53->27|55->29|61->35|62->36|62->36|62->36|63->37|64->38|64->38|64->38|65->39|66->40|68->42|82->56|83->57|84->58|84->58|84->58|85->59|86->60|86->60|86->60|87->61|87->61|87->61|88->62|88->62|88->62|90->64|90->64|90->64|91->65|91->65|91->65|92->66|92->66|92->66|93->67|93->67|93->67|94->68|94->68|95->69|95->69|95->69|100->74|100->74|100->74|105->79|105->79|105->79|111->85|111->85|112->86|169->143|169->143|169->143|175->149
                  -- GENERATED --
              */
          