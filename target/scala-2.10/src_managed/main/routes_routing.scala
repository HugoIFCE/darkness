// @SOURCE:C:/Users/LongJonhson/warehouse/conf/routes
// @HASH:33b2b638f219c02b870b062c5068006121652001
// @DATE:Sun Apr 06 16:31:23 GFT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:10
private[this] lazy val controllers_Products_list2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:11
private[this] lazy val controllers_Products_newProduct3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/new"))))
        

// @LINE:12
private[this] lazy val controllers_Products_details4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_Products_save5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"))))
        

// @LINE:14
private[this] lazy val controllers_Products_delete6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Products.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/new""","""controllers.Products.newProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""","""controllers.Products.details(ean:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/""","""controllers.Products.save()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""","""controllers.Products.delete(ean:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:10
case controllers_Products_list2(params) => {
   call { 
        invokeHandler(controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Nil,"GET", """""", Routes.prefix + """products"""))
   }
}
        

// @LINE:11
case controllers_Products_newProduct3(params) => {
   call { 
        invokeHandler(controllers.Products.newProduct(), HandlerDef(this, "controllers.Products", "newProduct", Nil,"GET", """""", Routes.prefix + """products/new"""))
   }
}
        

// @LINE:12
case controllers_Products_details4(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Products.details(ean), HandlerDef(this, "controllers.Products", "details", Seq(classOf[String]),"GET", """""", Routes.prefix + """products/$ean<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Products_save5(params) => {
   call { 
        invokeHandler(controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Nil,"POST", """""", Routes.prefix + """products/"""))
   }
}
        

// @LINE:14
case controllers_Products_delete6(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(controllers.Products.delete(ean), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """products/$ean<[^/]+>"""))
   }
}
        
}

}
     