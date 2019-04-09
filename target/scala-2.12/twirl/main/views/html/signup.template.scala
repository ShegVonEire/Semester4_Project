
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Signup")/*1.16*/ {_display_(Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<html>
  <head>
  <link rel="stylesheet" type="text/css" href="main.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="styylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style>
      body """),format.raw/*8.12*/("""{"""),format.raw/*8.13*/("""
    """),format.raw/*9.5*/("""font-size: 17px;
    padding: 8px;
  """),format.raw/*11.3*/("""}"""),format.raw/*11.4*/("""
  """),format.raw/*12.3*/("""* """),format.raw/*12.5*/("""{"""),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""box-sizing: border-box;
  """),format.raw/*14.3*/("""}"""),format.raw/*14.4*/("""
  """),format.raw/*15.3*/(""".row """),format.raw/*15.8*/("""{"""),format.raw/*15.9*/("""
    """),format.raw/*16.5*/("""display: -ms-flexbox; /* IE10 */
    display: flex;
    -ms-flex-wrap: wrap; /* IE10 */
    flex-wrap: wrap;
    margin: 0 -16px;
  """),format.raw/*21.3*/("""}"""),format.raw/*21.4*/("""
  """),format.raw/*22.3*/(""".col-25 """),format.raw/*22.11*/("""{"""),format.raw/*22.12*/("""
    """),format.raw/*23.5*/("""-ms-flex: 25%; /* IE10 */
    flex: 25%;
  """),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
  """),format.raw/*26.3*/(""".col-50 """),format.raw/*26.11*/("""{"""),format.raw/*26.12*/("""
    """),format.raw/*27.5*/("""-ms-flex: 50%; /* IE10 */
    flex: 50%;
  """),format.raw/*29.3*/("""}"""),format.raw/*29.4*/("""
  """),format.raw/*30.3*/(""".col-75 """),format.raw/*30.11*/("""{"""),format.raw/*30.12*/("""
    """),format.raw/*31.5*/("""-ms-flex: 75%; /* IE10 */
    flex: 75%;
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
  """),format.raw/*34.3*/(""".col-25,
  .col-50,
  .col-75 """),format.raw/*36.11*/("""{"""),format.raw/*36.12*/("""
    """),format.raw/*37.5*/("""padding: 0 16px;
  """),format.raw/*38.3*/("""}"""),format.raw/*38.4*/("""
  """),format.raw/*39.3*/(""".container """),format.raw/*39.14*/("""{"""),format.raw/*39.15*/("""
    """),format.raw/*40.5*/("""background-color: #f2f2f2;
    padding: 5px 25px 15px 20px;
    border: 1px solid lightgrey;
    border-radius: 3px;
  """),format.raw/*44.3*/("""}"""),format.raw/*44.4*/("""
  """),format.raw/*45.3*/("""input[type=text] """),format.raw/*45.20*/("""{"""),format.raw/*45.21*/("""
    """),format.raw/*46.5*/("""width: 100%;
    margin-bottom: 20px;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 3px;
  """),format.raw/*51.3*/("""}"""),format.raw/*51.4*/("""
  """),format.raw/*52.3*/("""input[type=password] """),format.raw/*52.24*/("""{"""),format.raw/*52.25*/("""
    """),format.raw/*53.5*/("""width: 100%;
    margin-bottom: 20px;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 3px;
  """),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""
  """),format.raw/*59.3*/("""label """),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""margin-bottom: 10px;
    display: block;
  """),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""
  """),format.raw/*63.3*/(""".icon-container """),format.raw/*63.19*/("""{"""),format.raw/*63.20*/("""
    """),format.raw/*64.5*/("""margin-bottom: 20px;
    padding: 7px 0;
    font-size: 24px;
  """),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""
  
  """),format.raw/*69.3*/("""a """),format.raw/*69.5*/("""{"""),format.raw/*69.6*/("""
    """),format.raw/*70.5*/("""color: #2196F3;
  """),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""
  
  """),format.raw/*73.3*/("""hr """),format.raw/*73.6*/("""{"""),format.raw/*73.7*/("""
    """),format.raw/*74.5*/("""border: 1px solid lightgrey;
  """),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
  
  """),format.raw/*77.3*/("""span.price """),format.raw/*77.14*/("""{"""),format.raw/*77.15*/("""
    """),format.raw/*78.5*/("""float: right;
    color: grey;
  """),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
      """),format.raw/*81.7*/("""</style>
  <body>
  <div class="row">
  <div class="container">
  <h3> Sign Up </h3>
  <p1>Fill out this form to enter your account details and press the "Sign up" button after you finish
      
  </p1><br>
  <form action="/action_page.php">
    First Name: <input type="text" name="firstname" placeholder="First Name"><br>
    Last Name: <input type="text" name="lastname" placeholder="Last Name"><br>
    Password: <input type="password" name="password" placeholder="Password"><br>
    Email: <input type="text" name="email" placeholder="email@example.com"><br>
    Address: <input type="text" name="address" placeholder="Address"><br>
    City: <input type="text" name="city" placeholder="City"><br>
    Country: <input type="text" name="country" placeholder="Country"><br>
    Postal: <input type="text" name="postcode" placeholder="Post Code"><br>
    Phone: <input type="text" name="phone" placeholder="Phone Number"><br>
    <input type="submit" value="Create Account">
  </form>
  </div>
  <form>
    <div class="col-25">
    <div class="container">
        <h3>Log in</h3>
        <p1>Enter your existing account details and click the "Log in" button after you finish</p1><br>
          Email: <input type="text" name="email"><br>
          Password: <input type="password" name="password">
    <input type="submit" value="Log in">
      </div>
      
  </form>
  </div>
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
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/signup.scala.html
                  HASH: e924080aebea38c0291cbae2d5f4bce0624d4d9d
                  MATRIX: 1031->1|1053->15|1092->17|1120->19|1436->308|1464->309|1496->315|1562->354|1590->355|1621->359|1650->361|1678->362|1711->368|1765->395|1793->396|1824->400|1856->405|1884->406|1917->412|2081->549|2109->550|2140->554|2176->562|2205->563|2238->569|2310->614|2338->615|2369->619|2405->627|2434->628|2467->634|2539->679|2567->680|2598->684|2634->692|2663->693|2696->699|2768->744|2796->745|2827->749|2887->781|2916->782|2949->788|2996->808|3024->809|3055->813|3094->824|3123->825|3156->831|3306->954|3334->955|3365->959|3410->976|3439->977|3472->983|3615->1099|3643->1100|3674->1104|3723->1125|3752->1126|3785->1132|3928->1248|3956->1249|3987->1253|4020->1259|4049->1260|4082->1266|4154->1311|4182->1312|4213->1316|4257->1332|4286->1333|4319->1339|4413->1406|4441->1407|4476->1415|4505->1417|4533->1418|4566->1424|4612->1443|4640->1444|4675->1452|4705->1455|4733->1456|4766->1462|4825->1494|4853->1495|4888->1503|4927->1514|4956->1515|4989->1521|5051->1556|5079->1557|5114->1565
                  LINES: 33->1|33->1|33->1|34->2|40->8|40->8|41->9|43->11|43->11|44->12|44->12|44->12|45->13|46->14|46->14|47->15|47->15|47->15|48->16|53->21|53->21|54->22|54->22|54->22|55->23|57->25|57->25|58->26|58->26|58->26|59->27|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|68->36|68->36|69->37|70->38|70->38|71->39|71->39|71->39|72->40|76->44|76->44|77->45|77->45|77->45|78->46|83->51|83->51|84->52|84->52|84->52|85->53|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|99->67|99->67|101->69|101->69|101->69|102->70|103->71|103->71|105->73|105->73|105->73|106->74|107->75|107->75|109->77|109->77|109->77|110->78|112->80|112->80|113->81
                  -- GENERATED --
              */
          