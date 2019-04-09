
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href=""""),_display_(/*15.29*/routes/*15.35*/.Assets.versioned("images/favicon.pico")),format.raw/*15.75*/("""">

    <title>Isle Of Books</title>

    <!-- Bootstrap 4.0 core CSS -->
    <link rel="stylesheet" 
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
          crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*26.65*/("""" rel="stylesheet">
  </head>

  <body>

    <!-- Navigation Menu-->
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">

      <!-- Page 'brtand' (top left)-->
      <a class="navbar-brand" href=""""),_display_(/*35.38*/routes/*35.44*/.HomeController.index()),format.raw/*35.67*/(""""><b>The Isle of Books</b></a>

      <!-- Responsive menu button - display when page is collapsed (e.g. mobile) -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navigation Links-->
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">

          <!-- Each link is a list item <li> -->
          <!-- nav-item active used to highlight current page-->

          <!-- Home -->
          <li class="nav-item active">
            <a class="nav-link" href=""""),_display_(/*51.40*/routes/*51.46*/.HomeController.index()),format.raw/*51.69*/(""""><button class="btn-success">Home </button></a>
          </li>

          <!-- Books -->
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*56.40*/routes/*56.46*/.HomeController.books()),format.raw/*56.69*/(""""><button class="btn-primary">Books </button><span class="sr-only">(current)</span></a>
          </li>

          <!-- Send Us Feedback -->
          <li class="nav-item">
            <a class="nav-link disabled" href=""""),_display_(/*61.49*/routes/*61.55*/.HomeController.sendfeedback()),format.raw/*61.85*/(""""><button class="btn-warning">Send Us Feedback </button></a>
          </li>

          <!-- About -->
          <li class="nav-item">
            <a class="nav-link" href=""""),_display_(/*66.40*/routes/*66.46*/.HomeController.about()),format.raw/*66.69*/(""""><button class="btn-info">About Us </button></a>
          </li>

          <!-- contact -->
          <!-- This link is disabled (as an example) -->
          <li class="nav-item">
            <a class="nav-link disabled" href=""""),_display_(/*72.49*/routes/*72.55*/.HomeController.contactus()),format.raw/*72.82*/(""""><button class="btn-warning">Contact US</button></a>
          </li>

          <!-- Example Dropdown menu (# links point to this page) -->
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Log In or Sign Up</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="https://www.google.ie">Log In</a>
              <a class="dropdown-item" href="signup">Sign Up</a>
            </div>
          </li>
        </ul> <!-- End of Nav list-->
        
        <!-- Example search box (doesn't work yet!) -->
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>

    <!-- Content area-->
    <main role="main" class="container-fluid">
      <!-- Page content goes here -->
      """),_display_(/*96.8*/content),format.raw/*96.15*/("""
      """),format.raw/*97.7*/("""<a class="nav-link disabled" href=""""),_display_(/*97.43*/routes/*97.49*/.HomeController.payment()),format.raw/*97.74*/(""""><button class="btn-warning">Test link to make sure page is opening</button></a>
    </main><!-- /.container -->

    <!-- Page Footer-->
    <!-- css class .footer defined in ./css/style.css -->
        <!-- Footer -->

        <footer class="footer">
          <hr>
          <div class="container-fluid">
              <h3 style="text-align:center">Follow us on Social Media</h3>
          
            <div class="row">
              
            <div class="col-sm-2"><a href="https://www.facebook.com/"><img src=""""),_display_(/*111.82*/routes/*111.88*/.Assets.versioned("images/Facebookicon.png")),format.raw/*111.132*/("""" alt="1" width="50" height="50"></a></div>
            <div class="col-sm-2"><a href="https://www.plus.google.com/"><img src=""""),_display_(/*112.85*/routes/*112.91*/.Assets.versioned("images/googleplusicon.png")),format.raw/*112.137*/("""" alt="3" width="50" height="50"></a></div>
            <div class="col-sm-2"><a href="https://www.youtube.com/"><img src=""""),_display_(/*113.81*/routes/*113.87*/.Assets.versioned("images/youtubeicon.png")),format.raw/*113.130*/("""" alt="4" width="50" height="50"></a></div>
            <div class="col-sm-2"><a href="https://www.twitter.com/"><img src=""""),_display_(/*114.81*/routes/*114.87*/.Assets.versioned("images/twittericon.png")),format.raw/*114.130*/("""" alt="2" width="50" height="50"></a></div>
            <div class="col-sm-2"><a href="https://www.pinterest.com/"><img src=""""),_display_(/*115.83*/routes/*115.89*/.Assets.versioned("images/pintresticon.png")),format.raw/*115.133*/("""" alt="5" width="50" height="50" ></a></div>
            <div class="col-sm-2"><a href="https://www.flickr.com/"><img src=""""),_display_(/*116.80*/routes/*116.86*/.Assets.versioned("images/flickricon.png")),format.raw/*116.128*/("""" alt="7" width="50" height="50"></a></div>
            
              
            
            </div>
          </div>
      </footer>
    
    <!-- script.js-->  
    <script src=""""),_display_(/*125.19*/routes/*125.25*/.Assets.versioned("javascripts/script.js")),format.raw/*125.67*/(""""></script>
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <!-- Font Awesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">

  </body>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 09 14:10:20 IST 2019
                  SOURCE: /home/wdd/Isle-of-books/app/views/main.scala.html
                  HASH: b361bf97978707c92598b5ea21c121a35aede1e0
                  MATRIX: 1206->260|1330->291|1622->556|1637->562|1698->602|2108->985|2123->991|2185->1032|2430->1250|2445->1256|2489->1279|3264->2027|3279->2033|3323->2056|3512->2218|3527->2224|3571->2247|3819->2468|3834->2474|3885->2504|4086->2678|4101->2684|4145->2707|4403->2938|4418->2944|4466->2971|5602->4081|5630->4088|5664->4095|5727->4131|5742->4137|5788->4162|6337->4683|6353->4689|6420->4733|6576->4861|6592->4867|6661->4913|6813->5037|6829->5043|6895->5086|7047->5210|7063->5216|7129->5259|7283->5385|7299->5391|7366->5435|7518->5559|7534->5565|7599->5607|7811->5791|7827->5797|7891->5839
                  LINES: 33->7|38->8|45->15|45->15|45->15|56->26|56->26|56->26|65->35|65->35|65->35|81->51|81->51|81->51|86->56|86->56|86->56|91->61|91->61|91->61|96->66|96->66|96->66|102->72|102->72|102->72|126->96|126->96|127->97|127->97|127->97|127->97|141->111|141->111|141->111|142->112|142->112|142->112|143->113|143->113|143->113|144->114|144->114|144->114|145->115|145->115|145->115|146->116|146->116|146->116|155->125|155->125|155->125
                  -- GENERATED --
              */
          