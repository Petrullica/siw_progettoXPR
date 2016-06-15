<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="model.Esame"%>

<!DOCTYPE html>
<html>
<head>
<title>Mostra Esame</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<br>
	<br>
	<br>
	<div align="center">
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-md-offset-3">
				<div class="panel panel-default">
				       <h3 style="font-size:500%;">Codice: ${medicoController.nome}</h3>
				       
						<h4 style="font-size:300%;"><strong >Dettagli</strong></h4>
						    <br>
							<h5 style="font-size:180%;"><strong>Cognome: </strong> ${medicoController.cognome}</h5><br>
							<h5 style="font-size:180%;"><strong>Specializzazzione: </strong> ${medicoController.specializzazione}</h5><br>
							<h5 style="font-size:180%;"><strong>Tipologia esame: </strong> ${esameController.tipologiaEsame.nome}</h5><br>
						
					</div>
				</div>
			</div>
		</div>
		</div>
		<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
</body>
</html>