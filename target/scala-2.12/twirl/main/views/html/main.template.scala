
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


Seq[Any](format.raw/*7.32*/("""
"""),format.raw/*8.1*/("""<!doctype html>
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
            <a class="nav-link disabled" href=""""),_display_(/*61.49*/routes/*61.55*/.HomeController.sendFeedback()),format.raw/*61.85*/(""""><button class="btn-warning">Send Us Feedback </button></a>
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
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/main.scala.html
                  HASH: 0096e2be7e2867421d3be21695a6ee9464ebc511
                  MATRIX: 1211->266|1336->296|1364->298|1663->570|1678->576|1739->616|2160->1010|2175->1016|2237->1057|2491->1284|2506->1290|2550->1313|3341->2077|3356->2083|3400->2106|3594->2273|3609->2279|3653->2302|3906->2528|3921->2534|3972->2564|4178->2743|4193->2749|4237->2772|4501->3009|4516->3015|4564->3042|5724->4176|5752->4183|5787->4191|5850->4227|5865->4233|5911->4258|6474->4793|6490->4799|6557->4843|6714->4972|6730->4978|6799->5024|6952->5149|6968->5155|7034->5198|7187->5323|7203->5329|7269->5372|7424->5499|7440->5505|7507->5549|7660->5674|7676->5680|7741->5722|7962->5915|7978->5921|8042->5963
                  LINES: 33->7|38->7|39->8|46->15|46->15|46->15|57->26|57->26|57->26|66->35|66->35|66->35|82->51|82->51|82->51|87->56|87->56|87->56|92->61|92->61|92->61|97->66|97->66|97->66|103->72|103->72|103->72|127->96|127->96|128->97|128->97|128->97|128->97|142->111|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113|145->114|145->114|145->114|146->115|146->115|146->115|147->116|147->116|147->116|156->125|156->125|156->125
                  -- GENERATED --
              */
          