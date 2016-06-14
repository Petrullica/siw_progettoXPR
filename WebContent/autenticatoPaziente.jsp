<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="model.Paziente"%>

<!DOCTYPE html>
<html>
<head>
<title>Autenticazione Riuscita</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">

<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
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
						<li><h:commandLink
								action="#{tipologiaEsameController.mostraTipologieEsame}"
								value="Mostra Tipologie Esame" /></li>
						<li><h:commandLink
								action="#{esameController.mostraEsamiPaziente}"
								value="Mostra Esami Effettuati" /></li>
						<li><h:commandLink
								action="#{esameController.mostraEsamiEffettuatiPaziente}"
								value="Mostra Esami Effettuati Paziente" /></li>
						<li><h:commandLink
								action="#{esameController.mostraEsamiPrenotatiPaziente}"
								value="Mostra Esami Prenotati Paziente" /></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" data-hover="dropdown">Logged!<span
								class="caret"></span></a>
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

								<h1 align="center">Benvenuto
									${pazienteController.paziente.username} !</h1>
								<h2 align="center">Login effettuato con successo!</h2>

							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>
</html>