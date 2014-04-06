
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link href=""""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*8.73*/(""""
rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    </head>
    <body>
    """),_display_(Seq[Any](/*15.6*/if(flash.containsKey("success"))/*15.38*/{_display_(Seq[Any](format.raw/*15.39*/("""
<div class="alert alert-success">
"""),_display_(Seq[Any](/*17.2*/flash/*17.7*/.get("success"))),format.raw/*17.22*/("""
</div>
""")))})),format.raw/*19.2*/("""
"""),_display_(Seq[Any](/*20.2*/if(flash.containsKey("error"))/*20.32*/{_display_(Seq[Any](format.raw/*20.33*/("""
<div class="alert alert-error">
"""),_display_(Seq[Any](/*22.2*/flash/*22.7*/.get("error"))),format.raw/*22.20*/("""
</div>
""")))})),format.raw/*24.2*/("""
        """),_display_(Seq[Any](/*25.10*/content)),format.raw/*25.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 18:13:09 GFT 2014
                    SOURCE: C:/Users/LongJonhson/warehouse/app/views/main.scala.html
                    HASH: d884d087c2a30608a3b7e7879e3bc662a309d1ef
                    MATRIX: 778->1|902->31|990->84|1016->89|1081->119|1095->125|1161->170|1285->258|1300->264|1356->298|1453->359|1468->365|1522->397|1583->422|1598->428|1665->473|1763->536|1804->568|1843->569|1914->605|1927->610|1964->625|2004->634|2041->636|2080->666|2119->667|2188->701|2201->706|2236->719|2276->728|2322->738|2351->745
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|43->15|43->15|43->15|45->17|45->17|45->17|47->19|48->20|48->20|48->20|50->22|50->22|50->22|52->24|53->25|53->25
                    -- GENERATED --
                */
            