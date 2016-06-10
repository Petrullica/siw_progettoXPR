<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@page import="model.Amministratore"%>

<!DOCTYPE html>
<html>
<head>
<title>Autenticazione Riuscita</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
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
						<li class="active"><a href="creaEsame.jsp">Crea esame</a></li>
						<li><a href="inserisciNuovaTipologiaEsame.jsp">Crea nuova tipologia esame</a></li>
						<li><a href="inserisciNuovoPaziente.jsp">Inserisci nuovo paziente</a></li>
						<li><h:commandLink
								action="#{tipologiaEsameController.mostraTipologieEsame}"
								value="Mostra Tipologie Esame" /></li>
						<li><h:commandLink
								action="#{esameController.mostraEsamiPaziente}"
								value="Mostra Esami Paziente" /></li>
						<li><a href="mostraEsamiMedico.jsp">Mostra esami medico</a></li>
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
		
		<br>
		<br>
		<br>
		<h1 align="center">${amministratoreController.amministratore.username}</h1>
		<h2>Login effettuato con successo!</h2>
		
		
		
		<div class="jumbotron">
		<div
		><b>Operazioni</b></div>
		<ul>
		<li><a href="inserisciNuovoEsame.jsp">Crea nuovo esame</a></li>
		<li><a href="inserisciNuovoIndicatoreRisultato.jsp">Crea nuovo indicatore risultato</a></li>
		<li><a href="inserisciNuovaTipologiaEsame.jsp">Crea nuova tipologia esame</a></li>
		<li><a href="mostraEsamiMedico.jsp">Mostra esami medico</a></li>
		</ul>
		</div>
		</h:form>
	</f:view>
</body>
</html>