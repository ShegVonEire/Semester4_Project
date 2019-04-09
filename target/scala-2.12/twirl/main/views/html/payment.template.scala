
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
                  DATE: Tue Apr 09 15:44:25 BST 2019
                  SOURCE: C:/Users/X00148076/Downloads/Semester4_Project/app/views/payment.scala.html
                  HASH: 0e8cc21827183380417ec71c2a8a221081502c00
                  MATRIX: 1032->1|1055->16|1094->18|1122->20|1437->309|1464->310|1495->314|1557->349|1585->350|1616->354|1645->356|1673->357|1704->361|1756->386|1784->387|1815->391|1847->396|1875->397|1906->401|2060->528|2088->529|2119->533|2154->541|2183->542|2214->546|2282->587|2310->588|2341->592|2376->600|2405->601|2436->605|2504->646|2532->647|2563->651|2598->659|2627->660|2658->664|2726->705|2754->706|2785->710|2840->738|2869->739|2900->743|2945->761|2973->762|3004->766|3043->777|3072->778|3103->782|3245->897|3273->898|3304->902|3349->919|3378->920|3409->924|3542->1030|3570->1031|3601->1035|3634->1041|3662->1042|3693->1046|3761->1087|3789->1088|3820->1092|3864->1108|3893->1109|3924->1113|4012->1174|4040->1175|4071->1179|4100->1181|4128->1182|4159->1186|4203->1203|4231->1204|4262->1208|4292->1211|4320->1212|4351->1216|4408->1246|4436->1247|4467->1251|4506->1262|4535->1263|4566->1267|4624->1298|4652->1299|4683->1303
                  LINES: 33->1|33->1|33->1|34->2|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|48->16|48->16|50->18|50->18|50->18|51->19|56->24|56->24|58->26|58->26|58->26|59->27|61->29|61->29|63->31|63->31|63->31|64->32|66->34|66->34|68->36|68->36|68->36|69->37|71->39|71->39|73->41|75->43|75->43|76->44|77->45|77->45|79->47|79->47|79->47|80->48|84->52|84->52|86->54|86->54|86->54|87->55|92->60|92->60|94->62|94->62|94->62|95->63|97->65|97->65|99->67|99->67|99->67|100->68|103->71|103->71|105->73|105->73|105->73|106->74|107->75|107->75|109->77|109->77|109->77|110->78|111->79|111->79|113->81|113->81|113->81|114->82|116->84|116->84|118->86
                  -- GENERATED --
              */
          