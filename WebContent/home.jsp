<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Prova 1</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
	function initialize() {
		var mapProp = {
			center : new google.maps.LatLng(41.862141, 12.479580),
			zoom : 17,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		};
		var map = new google.maps.Map(document.getElementById("googleMap"),
				mapProp);
	}
	google.maps.event.addDomListener(window, 'load', initialize);
</script>
</head>
<body>
	<f:view>
		<h:form>
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="home.jsp">Clinica XPR</a>
					</div>
					<ul class="nav navbar-nav">
						<li class="active"><a href="inserisciNuovoEsame.jsp">Crea esame</a></li>
						<li><a href="inserisciNuovaTipologiaEsame.jsp">Crea nuova tipologia esame</a></li>
						<li><a href="inserisciNuovoPaziente.jsp">Inserisci nuovo paziente</a></li>
						<li><h:commandLink
								action="#{tipologiaEsameController.mostraTipologieEsame}"
								value="Mostra Tipologie Esame" /></li>
						<li><h:commandLink
								action="#{esameController.mostraEsamiPaziente}"
								value="Mostra Esami Paziente" /></li>
						<li><a href="mostraEsamiMedico.jsp">Mostra esami medico</a></li>
						<li><a href="inserisciCodiceEsame.jsp">Inserisci risultati Esame</a></li>
					
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" data-hover="dropdown">Login<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="loginAmministratore.jsp">Area Amministratori</a></li>
								<li><a href="loginPaziente.jsp">Area Pazienti</a></li>
							</ul></li>
					</ul>
				</div>
			</nav>

			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
					<li data-target="#myCarousel" data-slide-to="3"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="images/RomaTre.jpg" alt="RomaTre">
						<div class="carousel-caption">
							<h3>Edifici Innovativi</h3>
							<p>Da Sempre Al passo coi tempi.</p>
						</div>
					</div>

					<div class="item">
						<img src="images/Medico.jpg" alt="Medico">
						<div class="carousel-caption">
							<h3>Non Avere Paura</h3>
							<p>Iscriviti come paziente.</p>
						</div>
					</div>

					<div class="item">
						<img src="images/TeamDottori.jpg" alt="TeamDottori">
						<div class="carousel-caption">
							<h3>Team Professionale</h3>
							<p>Solo i migliori medici provenienti da tutto il globo.</p>
						</div>
					</div>

					<div class="item">
						<img src="images/infermiera.jpg" alt="Infermiera">
						<div class="carousel-caption">
							<h3>La prima puntura è gratis</h3>
							<p>Niente rimborsi</p>
						</div>
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>

			<div class="container">
				<h2>Admins</h2>
				<table class="table">
					<thead>
						<tr>
							<th>Firstname</th>
							<th>Lastname</th>
							<th>Email</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Andrea</td>
							<td>Xu</td>
							<td>andrea@example.com</td>
						</tr>
						<tr>
							<td>Simone</td>
							<td>Petrucci</td>
							<td>simone@example.com</td>
						</tr>
						<tr>
							<td>Alessandro</td>
							<td>Raguzzi</td>
							<td>alessandro@example.com</td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="container" id="googleMap" style="height: 450px;" /></div>
		</h:form>
	</f:view>
</body>
</html>