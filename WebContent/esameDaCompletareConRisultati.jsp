<%@page import="model.IndicatoreRisultato"%>
<%@page import="model.Risultato"%>

<!DOCTYPE html>
<html>
<head>
<title>Esame da completare</title>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<h3 style="font-size: 400%;">${esameController.esame.codice}</h3>
	<br>
	<!--
	<h:selectManyListbox styleClass="form-control"
		value="#{risultatoController.risultatiSelezionati}">
		<f:selectItems
			value="#{risultatoController.risultati}"
			var="risultatr" itemValue="#{risultato.indicatoreRisultato.nome}" />
	</h:selectManyListbox>
	
	<c:forEach var="risultatiEsame" items="#{esameController.risultati}">
		<td>${esameController.risultato.indicatoreRisultato.nome}</td>
	</c:forEach>
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
							<h2>prova2</h2>
								<h3 style="font-size: 400%;">${esameController.esame.codice}</h3>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="container">
				<div>
					<label for="inputText3" class="col-sm-3 control-label">Risultati</label>
					<div class="col-sm-9">
						<table>
							<c:forEach var="risultatiEsame"
								items="#{esameController.risultatiEsame}">
								<tr>
									<td>${esameController.risultato.indicatoreRisultato.nome}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				              lista di prova
								<h:selectManyListbox styleClass="form-control"
									value="#{esameController.risultati}">
									<f:selectItems value="#{EsameController.risultati}"
										var="risultato"
										itemValue="#{esame.risultato.indicatoreRisultato.nome}" />
								</h:selectManyListbox>
							/lista di prova
				<br> <br> <br> <a
					href='<c:url value="/faces/inserisciNuovoRisultato.jsp" />'>
					Aggiungi risultato</a> <br> <br> <br>
				<div class="form-group last">
					<div class="col-sm-offset-3 col-sm-3">
						<div>
							<h:commandButton value="Conferma" styleClass="form-control"
								action="#{esameController.aggiornaEsame}" />
						</div>
					</div>
					<br>
					<div class="form-group last">
						<a href='<c:url value="/faces/home.jsp" />'> Annulla e torna
							alla pagina principale</a>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
	-->
</body>
</html>