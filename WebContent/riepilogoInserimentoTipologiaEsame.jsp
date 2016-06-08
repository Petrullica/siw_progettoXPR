<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="model.TipologiaEsame"%>
<!DOCTYPE html>
<html>
<head>
<title>Mostra Parametri Tipologia Esame</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
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
			<li><a href="inserisciNuovoPaziente.jsp">InserisciNuovoPaziente</a></li>
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

	<h1>Dati inseriti nella form</h1>
	<ul>
		<li>Nome: <b>${tipologiaEsame.nome}</b></li>
		<li>Descrizione: <b>${tipologiaEsame.descrizione}</b></li>
		<li>Prezzo:<b>${tipologiaEsame.costo}</b></li>
	</ul>
</body>
</html>