
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

<html style="height: 100%;">
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <!-- begin bootstrap css -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.103*/("""">
       	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*13.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap-theme.css"))),format.raw/*14.105*/("""">
        <!-- end bootstrap css -->
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png"))),format.raw/*17.97*/("""">
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*18.74*/("""" type="text/javascript"></script>
        
        <!-- begin bootstrap js -->
        <script src=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*21.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*22.67*/("""" type="text/javascript"></script>
        <!-- begin bootstrap js -->
    </head>
    <body class="body-back" style="height: 100%;">
	<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
		<div class="navbar-inverse">
			<div class="container">
				<div class="navbar-header">
					<a href="" class="navbar-brand">Home</a>
				</div>
				<nav class="collapse navbar-collapse bs-navbar-collapse"
					role="navigation">
					<ul class="nav navbar-nav">
						<li><a href="">Ajuda</a></li>
						<li><a href="">Dicas</a></li>
						<li><a href="">Overview</a></li>
						<li class="active"><a href="">Colabore</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="">Sobre</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>

	<div class="btn-default" id="content">
			<div class="container">
				<h1>"""),_display_(Seq[Any](/*50.10*/title)),format.raw/*50.15*/("""</h1>
				<p>Organize suas tarefas e ganhe muito mais produtividade no seu
					dia-a-dia!</p>
			</div>
	</div>
	<div class="bs-old-docs">
		<div class="container">
		</div>
	</div>

	<div class="wrapper" style="height: 100%;">
		<div class="container">"""),_display_(Seq[Any](/*61.27*/content)),format.raw/*61.34*/("""</div>
	</div>
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
                    DATE: Thu Nov 28 01:01:28 GMT-03:00 2013
                    SOURCE: D:/play/TodoList/app/views/main.scala.html
                    HASH: ae04534c00655c05055ec711060d7c8a5ff84f4f
                    MATRIX: 778->1|902->31|1012->106|1038->111|1135->173|1149->179|1204->213|1342->315|1357->321|1418->360|1510->416|1525->422|1591->465|1683->521|1698->527|1770->576|1862->632|1877->638|1945->683|2086->788|2101->794|2155->826|2216->851|2231->857|2298->902|2436->1004|2451->1010|2515->1052|2608->1109|2623->1115|2683->1153|3588->2022|3615->2027|3906->2282|3935->2289
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|78->50|78->50|89->61|89->61
                    -- GENERATED --
                */
            