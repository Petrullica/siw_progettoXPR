<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="model.TipologiaEsame"%>

<!DOCTYPE html>
<html>
<head>
<title>Mostra Tipologia Esame</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="home.jsp">Clinica XPR</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="inserisciNuovaTipologiaEsame.jsp">CreaNuovaTipologiaEsame</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" data-hover="dropdown">Login<span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Area Amministratori</a></li>
						<li><a href="#">Area Pazienti</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<br>
	<div align="center">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<div class="panel panel-default">
						<h3 style="font-size: 400%;">${tipologiaEsameController.tipologiaEsame.nome}</h3>

						<h4 style="font-size: 300%;">
							<strong>Dettagli</strong>
						</h4>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Descrizione: </strong>
							${tipologiaEsameController.tipologiaEsame.descrizione}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Prezzo:</strong>
							${tipologiaEsameController.tipologiaEsame.prezzo}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<c:forEach var="indicatoreRisultato"
								items="#{indicatoreRisultatoController.indicatoriRisultato}">
								<td>${indicatoreRisultato.nome}</td>
							</c:forEach>
						</h5>
						<br>
						<a href='<c:url value="/faces/inserisciNuovoPaziente.jsp" />'>
								Registrati</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
