<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Esame"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Riepilogo Esame completato</title>
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
						<h3 style="font-size: 500%;">Codice:
							${esameController.esame.codice}</h3>

						<h4 style="font-size: 300%;">
							<strong>Dettagli</strong>
						</h4>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Data prenotazione: </strong>
							${esameController.esame.dataPrenotazioneEsame}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Data svolgimento: </strong>
							${esameController.esame.dataSvolgimentoEsame}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Tipologia esame: </strong>
							${esameController.tipologiaEsame.nome}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Medico: </strong> ${esameController.medico.nome}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Paziente: </strong> ${esameController.paziente.nome}
						</h5>
						<br>
						<h5 style="font-size: 180%;">
							<strong>Risultati: </strong>
							<c:forEach var="risultatiEsame"
								items="#{esameController.risultatiEsame}">
								<tr>
									<td>${esameController.risultato.indicatoreRisultato.nome}</td>
									<td>${esameController.risultato.valore}</td>
								</tr>
							</c:forEach>
						</h5>
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