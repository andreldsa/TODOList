
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("TODO LIST")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    <h1> """),_display_(Seq[Any](/*7.11*/tasks/*7.16*/.size())),format.raw/*7.23*/(""" tasks()</h1>

	<ul>
		"""),_display_(Seq[Any](/*10.4*/for(task <- tasks) yield /*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
			<li>
				"""),_display_(Seq[Any](/*12.6*/task/*12.10*/.label)),format.raw/*12.16*/("""
				
				"""),_display_(Seq[Any](/*14.6*/form(routes.Application.deleteTask(task.id))/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
					<input type="submit" value="Delete">
				""")))})),format.raw/*16.6*/("""
			</li>
		""")))})),format.raw/*18.4*/("""
	</ul>
	
	<h2>add a new task</h2>
	
	"""),_display_(Seq[Any](/*23.3*/form(routes.Application.newTask())/*23.37*/ {_display_(Seq[Any](format.raw/*23.39*/("""
		"""),_display_(Seq[Any](/*24.4*/inputText(taskForm("label")))),format.raw/*24.32*/("""
		
		<input type="submit" value="Create">
	""")))})),format.raw/*27.3*/("""

""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 28 00:51:56 GMT-03:00 2013
                    SOURCE: D:/play/TodoList/app/views/index.scala.html
                    HASH: 6e158b51ccf3381cf0e141ef3077990e5dffed55
                    MATRIX: 789->1|940->42|968->61|1004->63|1029->80|1068->82|1115->94|1128->99|1156->106|1215->130|1249->148|1289->150|1338->164|1351->168|1379->174|1425->185|1478->229|1518->231|1597->279|1641->292|1715->331|1758->365|1798->367|1837->371|1887->399|1963->444|1997->447
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|42->14|42->14|42->14|44->16|46->18|51->23|51->23|51->23|52->24|52->24|55->27|57->29
                    -- GENERATED --
                */
            