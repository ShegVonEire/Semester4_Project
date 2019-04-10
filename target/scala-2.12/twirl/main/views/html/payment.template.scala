
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

object payment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("payment")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="main.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body """),format.raw/*9.6*/("""{"""),format.raw/*9.7*/("""
  """),format.raw/*10.3*/("""font-size: 17px;
  padding: 8px;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""* """),format.raw/*14.3*/("""{"""),format.raw/*14.4*/("""
  """),format.raw/*15.3*/("""box-sizing: border-box;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

"""),format.raw/*18.1*/(""".row """),format.raw/*18.6*/("""{"""),format.raw/*18.7*/("""
  """),format.raw/*19.3*/("""display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

"""),format.raw/*26.1*/(""".col-25 """),format.raw/*26.9*/("""{"""),format.raw/*26.10*/("""
  """),format.raw/*27.3*/("""-ms-flex: 25%; /* IE10 */
  flex: 25%;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""

"""),format.raw/*31.1*/(""".col-50 """),format.raw/*31.9*/("""{"""),format.raw/*31.10*/("""
  """),format.raw/*32.3*/("""-ms-flex: 50%; /* IE10 */
  flex: 50%;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".col-75 """),format.raw/*36.9*/("""{"""),format.raw/*36.10*/("""
  """),format.raw/*37.3*/("""-ms-flex: 75%; /* IE10 */
  flex: 75%;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/(""".col-25,
.col-50,
.col-75 """),format.raw/*43.9*/("""{"""),format.raw/*43.10*/("""
  """),format.raw/*44.3*/("""padding: 0 16px;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""

"""),format.raw/*47.1*/(""".container """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
  """),format.raw/*48.3*/("""background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/("""input[type=text] """),format.raw/*54.18*/("""{"""),format.raw/*54.19*/("""
  """),format.raw/*55.3*/("""width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""

"""),format.raw/*62.1*/("""label """),format.raw/*62.7*/("""{"""),format.raw/*62.8*/("""
  """),format.raw/*63.3*/("""margin-bottom: 10px;
  display: block;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/(""".icon-container """),format.raw/*67.17*/("""{"""),format.raw/*67.18*/("""
  """),format.raw/*68.3*/("""margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""

"""),format.raw/*73.1*/("""a """),format.raw/*73.3*/("""{"""),format.raw/*73.4*/("""
  """),format.raw/*74.3*/("""color: #2196F3;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""

"""),format.raw/*77.1*/("""hr """),format.raw/*77.4*/("""{"""),format.raw/*77.5*/("""
  """),format.raw/*78.3*/("""border: 1px solid lightgrey;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/("""span.price """),format.raw/*81.12*/("""{"""),format.raw/*81.13*/("""
  """),format.raw/*82.3*/("""float: right;
  color: grey;
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""

"""),format.raw/*86.1*/("""</style>
</head>
<body>

<h2>Checkout</h2>
<p>Please fill out the following information to continue with your purchase.</p>
<div class="row">
  <div class="col-75">
    <div class="container">
      <form action="/action_page.php">
      
        <div class="row">
          <div class="col-50">
            <h3>Billing Address</h3>
            <label for="fname"><i class="fa fa-user"></i> Full Name</label>
            <input type="text" id="fname" name="firstname" placeholder="Name">
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" placeholder="email@example.com">
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="address">
            <label for="city"><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="city">

            <div class="row">
              <div class="col-50">
                <label for="state">State</label>
                <input type="text" id="state" name="state" placeholder="state">
              </div>
              <div class="col-50">
                <label for="zip">Zip</label>
                <input type="text" id="zip" name="zip" placeholder="10001">
              </div>
            </div>
          </div>

          <div class="col-50">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname">Name on Card</label>
            <input type="text" id="cname" name="cardname" placeholder="Name on Card">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="Exp Month">
            <div class="row">
              <div class="col-50">
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              <div class="col-50">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">
              </div>
            </div>
          </div>
          
        </div>
        <label>
          <input type="checkbox" checked="checked" name="sameadr"> Shipping address same as billing
        </label>
        <input type="submit" value="Continue to checkout" class="btn">
      </form>
    </div>
  </div>
  <div class="col-25">
    <div class="container">
      <h4>Cart <span class="price" style="color:black"><i class="fa fa-shopping-cart"></i> <b>4</b></span></h4>
      <p><a href="#">Product 1</a> <span class="price">$15</span></p>
      <p><a href="#">Product 2</a> <span class="price">$5</span></p>
      <p><a href="#">Product 3</a> <span class="price">$8</span></p>
      <p><a href="#">Product 4</a> <span class="price">$2</span></p>
      <hr>
      <p>Total <span class="price" style="color:black"><b>$30</b></span></p>
    </div>
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
                  DATE: Wed Apr 10 13:55:21 IST 2019
                  SOURCE: /home/wdd/Semester4_Project/app/views/payment.scala.html
                  HASH: 18142c36eb3a4bb2b273bb6bcc637c88cf00be02
                  MATRIX: 1032->1|1055->16|1094->18|1121->19|1429->301|1456->302|1486->305|1546->338|1574->339|1603->341|1632->343|1660->344|1690->347|1741->371|1769->372|1798->374|1830->379|1858->380|1888->383|2037->505|2065->506|2094->508|2129->516|2158->517|2188->520|2254->559|2282->560|2311->562|2346->570|2375->571|2405->574|2471->613|2499->614|2528->616|2563->624|2592->625|2622->628|2688->667|2716->668|2745->670|2798->696|2827->697|2857->700|2901->717|2929->718|2958->720|2997->731|3026->732|3056->735|3194->846|3222->847|3251->849|3296->866|3325->867|3355->870|3483->971|3511->972|3540->974|3573->980|3601->981|3631->984|3697->1023|3725->1024|3754->1026|3798->1042|3827->1043|3857->1046|3942->1104|3970->1105|3999->1107|4028->1109|4056->1110|4086->1113|4129->1129|4157->1130|4186->1132|4216->1135|4244->1136|4274->1139|4330->1168|4358->1169|4387->1171|4426->1182|4455->1183|4485->1186|4541->1215|4569->1216|4598->1218
                  LINES: 33->1|33->1|33->1|34->2|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|48->16|48->16|50->18|50->18|50->18|51->19|56->24|56->24|58->26|58->26|58->26|59->27|61->29|61->29|63->31|63->31|63->31|64->32|66->34|66->34|68->36|68->36|68->36|69->37|71->39|71->39|73->41|75->43|75->43|76->44|77->45|77->45|79->47|79->47|79->47|80->48|84->52|84->52|86->54|86->54|86->54|87->55|92->60|92->60|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|103->71|103->71|105->73|105->73|105->73|106->74|107->75|107->75|109->77|109->77|109->77|110->78|111->79|111->79|113->81|113->81|113->81|114->82|116->84|116->84|118->86
                  -- GENERATED --
              */
          