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
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<f:view>
		<h:form>

			<br>
			<br>
			<br>
			<div align="center">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-md-offset-3">
							<div class="panel panel-default">


								<h1 align="center">Benvenuto
									${amministratoreController.amministratore.username} !</h1>
								<h2>Login effettuato con successo!</h2>

							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div align="center">
			<font size="5"><strong>Operazioni</strong></font>
			<br> <br>
			<div class="panel panel-default">
			<ul>
				<li><a href="inserisciNuovoEsame.jsp">Crea
						esame</a></li>
				<li><a href="inserisciNuovaTipologiaEsame.jsp">Crea nuova
						tipologia esame</a></li>
				<li><h:commandLink
						action="#{tipologiaEsameController.mostraTipologieEsame}"
						value="Mostra Tipologie Esame" /></li>
				<li><a href="creaMedico.jsp">Inserisci Un Nuovo Medico</a></li>
				<li><a href="mostraEsamiMedico.jsp">Mostra esami medico</a></li>
				
			</ul>
			</div>
</div>

<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>

		</h:form>
	</f:view>
</body>
</html>
