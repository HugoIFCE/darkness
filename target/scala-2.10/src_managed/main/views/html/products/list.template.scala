
package views.html.products

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
"""),_display_(Seq[Any](/*2.2*/main("Products catalogue")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
<h2>Todos os Produtos</h2>
<script>
function del(urlToDelete) """),format.raw/*5.27*/("""{"""),format.raw/*5.28*/("""
$.ajax("""),format.raw/*6.8*/("""{"""),format.raw/*6.9*/("""
url: urlToDelete,
type: 'DELETE',
success: function(results) """),format.raw/*9.28*/("""{"""),format.raw/*9.29*/("""
// Refresh the page
location.reload();
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/(""");
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""
</script>
<table class="table table-striped">
<thead>
<tr>
<th>n°</th>
<th>Nome</th>
<th>Descrição</th>
<th></th>
</tr>
</thead>
<tbody>
"""),_display_(Seq[Any](/*26.2*/for(product <- products) yield /*26.26*/ {_display_(Seq[Any](format.raw/*26.28*/("""
<tr>
<td><a href=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Products.details(product.ean))),format.raw/*28.51*/("""">
"""),_display_(Seq[Any](/*29.2*/product/*29.9*/.ean)),format.raw/*29.13*/("""
</a></td>
<td><a href=""""),_display_(Seq[Any](/*31.15*/routes/*31.21*/.Products.details(product.ean))),format.raw/*31.51*/("""">
"""),_display_(Seq[Any](/*32.2*/product/*32.9*/.name)),format.raw/*32.14*/("""</a></td>
<td><a href=""""),_display_(Seq[Any](/*33.15*/routes/*33.21*/.Products.details(product.ean))),format.raw/*33.51*/("""">
"""),_display_(Seq[Any](/*34.2*/product/*34.9*/.description)),format.raw/*34.21*/(""" </a></td>
<td>
<a href=""""),_display_(Seq[Any](/*36.11*/routes/*36.17*/.Products.details(product.ean))),format.raw/*36.47*/("""">
<i class="icon icon-pencil"></i></a>
<a onclick="del('"""),_display_(Seq[Any](/*38.19*/routes/*38.25*/.Products.delete(product.ean))),format.raw/*38.54*/("""')">
<i class="icon icon-trash"></i></a>
</td>
</tr>
""")))})),format.raw/*42.2*/("""
</tbody>
</table>
<a href=""""),_display_(Seq[Any](/*45.11*/routes/*45.17*/.Products.newProduct())),format.raw/*45.39*/("""" class="btn">
<i class="icon-plus"></i> Novo Produto</a>
""")))})))}
    }
    
    def render(products:List[Product]): play.api.templates.HtmlFormat.Appendable = apply(products)
    
    def f:((List[Product]) => play.api.templates.HtmlFormat.Appendable) = (products) => apply(products)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 18:10:13 GFT 2014
                    SOURCE: C:/Users/LongJonhson/warehouse/app/views/products/list.scala.html
                    HASH: adfa4426373f01eb541c592aeb177f3251444f6b
                    MATRIX: 789->1|908->26|945->29|979->55|1018->57|1111->123|1139->124|1174->133|1201->134|1293->199|1321->200|1391->243|1419->244|1448->246|1476->247|1507->251|1535->252|1721->403|1761->427|1801->429|1859->451|1874->457|1926->487|1966->492|1981->499|2007->503|2070->530|2085->536|2137->566|2177->571|2192->578|2219->583|2280->608|2295->614|2347->644|2387->649|2402->656|2436->668|2500->696|2515->702|2567->732|2663->792|2678->798|2729->827|2818->885|2886->917|2901->923|2945->945
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|34->6|34->6|37->9|37->9|40->12|40->12|41->13|41->13|42->14|42->14|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|64->36|64->36|64->36|66->38|66->38|66->38|70->42|73->45|73->45|73->45
                    -- GENERATED --
                */
            