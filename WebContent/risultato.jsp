<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Risultato"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" prefix="h"
	uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<title>Riepilogo risultato creato</title>
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
						<h4 style="font-size: 300%;">
							<strong>Dati risultato creato</strong>
						</h4>
						<br>
						<h5 style="font-size: 180%;">
							<strong>IndicatoreRisultato: </strong>
							${risultatoController.risultato.indicatoreRisultato.nome}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Esame: </strong> ${risultatoController.risultato.esame.codice}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Valore: </strong> ${risultatoController.risultato.valore}
						</h5>
						<br>
					</div>
				</div>
			</div>
		</div>
		<div class="form-group last">
			<h:commandButton value="Torna alla compilazione esame"
				action="/faces/esameDaCompletareConRisultati.jsp"
				styleClass="btn btn-default btn-sm" />
		</div>
	</div>
</body>
</html>