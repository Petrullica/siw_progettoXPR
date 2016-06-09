<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
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
		<h1>${amministratoreController.amministratore.username}</h1>
		<h2>Login effettuato con successo!</h2>
		<li><a href="inserisciNuovoEsame.jsp">Crea nuovo esame</a></li>
		<li><a href="inserisciNuovoIndicatoreRisultato.jsp">Crea nuovo indicatore risultato</a></li>
		<li><a href="inserisciNuovaTipologiaEsame.jsp">Crea nuova tipologia esame</a></li>
		<li><a href="mostraEsamiMedico.jsp">Mostra esami medico</a></li>
	</f:view>
</body>
</html>