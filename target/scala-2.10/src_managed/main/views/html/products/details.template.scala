
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
object details extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(productForm: Form[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.30*/("""
"""),_display_(Seq[Any](/*4.2*/main("Product form")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
<h1>Formulário de Produto</h1>
"""),_display_(Seq[Any](/*6.2*/helper/*6.8*/.form(action = routes.Products.save())/*6.46*/ {_display_(Seq[Any](format.raw/*6.48*/("""
<fieldset>
<legend>Product ("""),_display_(Seq[Any](/*8.19*/productForm("name")/*8.38*/.valueOr("Novo"))),format.raw/*8.54*/(""")</legend>
"""),_display_(Seq[Any](/*9.2*/helper/*9.8*/.inputText(productForm("ean"), '_label -> "N°"))),format.raw/*9.55*/("""
"""),_display_(Seq[Any](/*10.2*/helper/*10.8*/.inputText(productForm("name"),'_label -> "Nome"))),format.raw/*10.57*/("""
"""),_display_(Seq[Any](/*11.2*/helper/*11.8*/.textarea(productForm("description"), '_label -> "Descrição"))),format.raw/*11.69*/("""
</fieldset>
<input type="submit" class="btn btn-primary" value="Save">
<a class="btn" href=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Products.list())),format.raw/*14.45*/("""">Cancelar</a>
""")))})),format.raw/*15.2*/("""
""")))})))}
    }
    
    def render(productForm:Form[Product]): play.api.templates.HtmlFormat.Appendable = apply(productForm)
    
    def f:((Form[Product]) => play.api.templates.HtmlFormat.Appendable) = (productForm) => apply(productForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 18:08:25 GFT 2014
                    SOURCE: C:/Users/LongJonhson/warehouse/app/views/products/details.scala.html
                    HASH: 54a8920986cf875c05c0323fabbf3aa5bd0a8707
                    MATRIX: 792->1|966->29|1003->85|1031->105|1070->107|1139->142|1152->148|1198->186|1237->188|1304->220|1331->239|1368->255|1415->268|1428->274|1496->321|1534->324|1548->330|1619->379|1657->382|1671->388|1754->449|1887->546|1902->552|1940->568|1988->585
                    LINES: 26->1|32->1|33->4|33->4|33->4|35->6|35->6|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|44->15
                    -- GENERATED --
                */
            