
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
                  DATE: Wed Apr 10 13:55:20 IST 2019
                  SOURCE: /home/wdd/Semester4_Project/app/views/signup.scala.html
                  HASH: 24fffdf6329a3738a3115bc5b7efe9f7d1baefa8
                  MATRIX: 1031->1|1053->15|1092->17|1119->18|1429->301|1457->302|1488->307|1552->344|1580->345|1610->348|1639->350|1667->351|1699->356|1752->382|1780->383|1810->386|1842->391|1870->392|1902->397|2061->529|2089->530|2119->533|2155->541|2184->542|2216->547|2286->590|2314->591|2344->594|2380->602|2409->603|2441->608|2511->651|2539->652|2569->655|2605->663|2634->664|2666->669|2736->712|2764->713|2794->716|2852->746|2881->747|2913->752|2959->771|2987->772|3017->775|3056->786|3085->787|3117->792|3263->911|3291->912|3321->915|3366->932|3395->933|3427->938|3565->1049|3593->1050|3623->1053|3672->1074|3701->1075|3733->1080|3871->1191|3899->1192|3929->1195|3962->1201|3991->1202|4023->1207|4093->1250|4121->1251|4151->1254|4195->1270|4224->1271|4256->1276|4347->1340|4375->1341|4408->1347|4437->1349|4465->1350|4497->1355|4542->1373|4570->1374|4603->1380|4633->1383|4661->1384|4693->1389|4751->1420|4779->1421|4812->1427|4851->1438|4880->1439|4912->1444|4972->1477|5000->1478|5034->1485
                  LINES: 33->1|33->1|33->1|34->2|40->8|40->8|41->9|43->11|43->11|44->12|44->12|44->12|45->13|46->14|46->14|47->15|47->15|47->15|48->16|53->21|53->21|54->22|54->22|54->22|55->23|57->25|57->25|58->26|58->26|58->26|59->27|61->29|61->29|62->30|62->30|62->30|63->31|65->33|65->33|66->34|68->36|68->36|69->37|70->38|70->38|71->39|71->39|71->39|72->40|76->44|76->44|77->45|77->45|77->45|78->46|83->51|83->51|84->52|84->52|84->52|85->53|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|99->67|99->67|101->69|101->69|101->69|102->70|103->71|103->71|105->73|105->73|105->73|106->74|107->75|107->75|109->77|109->77|109->77|110->78|112->80|112->80|113->81
                  -- GENERATED --
              */
          