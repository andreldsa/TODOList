// @SOURCE:D:/play/TodoList/conf/routes
// @HASH:87b11ad46ac5939f68708f6b0fbda546d8d98335
// @DATE:Wed Nov 27 23:12:01 GMT-03:00 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def tasks(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:11
def newTask(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:12
def deleteTask(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def tasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tasks",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def newTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:12
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:10
def tasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tasks(), HandlerDef(this, "controllers.Application", "tasks", Seq(), "GET", """""", _prefix + """tasks""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def newTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq(), "POST", """""", _prefix + """tasks""")
)
                      

// @LINE:12
def deleteTask(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]), "POST", """""", _prefix + """tasks/$id<[^/]+>/delete""")
)
                      
    
}
                          
}
        
    