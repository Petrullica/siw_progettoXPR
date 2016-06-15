<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en" data-ng-app="Scroller">
<head>
<title>Home Prova 1</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/wrapper.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
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

		var marker = new google.maps.Marker({
			position : new google.maps.LatLng(41.862141, 12.479580),
			map : map,
		});
	}

	google.maps.event.addDomListener(window, 'load', initialize);
</script>

<script>
	var Scroller = angular.module("Scroller", []).controller("Controller",
			function($scope, $location, $anchorScroll) {
				$scope.scrollTo = function(scrollLocation) {
					$location.hash(scrollLocation);
					$anchorScroll();
				}
			})
</script>
</head>
<body data-ng-controller="Controller">
	<script>
		$('.hover').mouseover(function() {
			$('.text').css("visibility", "visible");
		});

		$('.hover').mouseout(function() {
			$('.text').css("visibility", "hidden");
		});
	</script>
	<f:view>
		<h:form>
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="home.jsp">Clinica XPR</a>
					</div>
					<ul class="nav navbar-nav">
						<li><a href="" data-ng-click="scrollTo('tipologie')">I tipi di esame</a></li>
						<li><a href="" data-ng-click="scrollTo('contatti')">Contatti</a></li>
						<li><a href="" data-ng-click="scrollTo('googleMap')">Dove Siamo</a></li>
						<li><a href="" data-ng-click="scrollTo('Registrati')">Registrati</a></li>
						<li><a href="" data-ng-click="scrollTo('riservato')">Area Riservata</a></li>
						
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" data-hover="dropdown">Login<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="loginAmministratore.jsp">Login
										Amministratori</a></li>
								<li><a href="loginPaziente.jsp">Login Pazienti</a></li>
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
					<div class="item active" align="center">
						<img src="images/RomaTre.jpg" alt="RomaTre">
						<div class="carousel-caption">
							<h3>Edifici Innovativi</h3>
							<p>Da Sempre Al passo coi tempi.</p>
						</div>
					</div>

					<div class="item" align="center">
						<img src="images/Medico.jpg" alt="Medico">
						<div class="carousel-caption">
							<h3>Non Avere Paura</h3>
							<p>Iscriviti come paziente.</p>
						</div>
					</div>

					<div class="item" align="center">
						<img src="images/TeamDottori.jpg" alt="TeamDottori">
						<div class="carousel-caption">
							<h3>Team Professionale</h3>
							<p>Solo i migliori medici provenienti da tutto il globo.</p>
						</div>
					</div>

					<div class="item" align="center">
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


			<!-- Immagini con Link -->

			<br>
			<br>
			<br>

			<div class="container">

				<div id="posts" class="row">

					<div id="tipologie" class="jumbotron">
						<font size="8"><strong><h:commandLink
									action="#{tipologiaEsameController.mostraTipologieEsame}"
									value="Le Nostre Tipologie D'esame" /></strong></font>

						<div class="row">
							<div id="wrapper" class="col-md-4" class="thumbnail"
								class="hover">
								<h:commandLink
									action="#{tipologiaEsameController.mostraTipologieEsame}">
									<h:graphicImage value="images/clipboard.jpg" alt="clipboard"
										style="width: 300px; height: 300px" />
								</h:commandLink>
								<p class="text">
									<strong><b>Siamo i Boss del Settore</b></strong>
								</p>
							</div>

							<div id="wrapper" class="col-md-4" class="thumbnail"
								class="hover">
								<h:commandLink
									action="#{tipologiaEsameController.mostraTipologieEsame}">
									<h:graphicImage value="images/analisiDelSangue.jpg"
										alt="analisi" style="width: 300px; height: 300px" />
								</h:commandLink>
								<p class="text">
									<strong><b>La puntura non fà male</b></strong>
								</p>
							</div>

							<div id="wrapper" class="col-md-4" class="thumbnail"
								class="hover">
								<h:commandLink
									action="#{tipologiaEsameController.mostraTipologieEsame}">
									<h:graphicImage value="images/dentista.jpg" alt="dentista"
										style="width: 300px; height: 300px" />
								</h:commandLink>
								>
								<p class="text">
									<strong><b>Riderai Come un Malato</b></strong>
								</p>
							</div>
						</div>
					</div>

					<div id="Registrati" class="jumbotron">
						<font size="8"><strong><a
								href="inserisciNuovoPaziente.jsp">Registrati Come Nostro
									Paziente</a></strong></font>
						<div class="row">
							<div id="wrapper" class="col-md-4" class="thumbnail"
								class="hover">
								<a href="inserisciNuovoPaziente.jsp"> <img
									src="images/pazienti.jpeg" alt="pazienti"
									style="width: 1000px; height: 300px" />
								</a>
								<p class="text">
									<strong><b>Non ne uscirai Vivo</b></strong>
								</p>
							</div>
						</div>
					</div>

					<div id="posts" class="row">

						<div id="riservato" class="jumbotron">

							<div class="row">


								<div id="wrapper" class="col-md-4" class="hover">
									<font size="5"><strong><a
											href="autenticatoPaziente.jsp">Sei già Nostro Paziente?</a></strong></font> <a
										href="autenticatoPaziente.jsp"> <img src="images/paziente.jpg"
										alt="pazienti" style="width: 400px; height: 400px" />
									</a>
									<p class="text">
										<strong><b>Accedi!</b></strong>
									</p>
								</div>

								<div id="wrapper" class="col-md-4 col-md-offset-3" class="hover">
									<font size="5"><strong><a
											href="autenticatoAmministratore.jsp">Sei un Boss?</a></strong></font> <a
										href="autenticatoAmministratore.jsp"> <img
										src="images/admin.jpg" alt="admin"
										style="width: 400px; height: 400px" />
									</a>
									<p class="text">
										<strong><b>Accedi!</b></strong>
									</p>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div id="contatti" class="container">
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

			<br>
			<br>

			<p align="center">
				<font size="5"><strong><b>Dove ci Troviamo</b></strong></font>
			</p>
			<div class="container" id="googleMap" style="height: 450px;" /></div>

			<br>
			<br>
			<footer class="text-center">
				<a href="" data-ng-click="scrollTo('myCarousel')">Clinica XPR 2016</a>
			</footer>
		</h:form>
	</f:view>
</body>
</html>