<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@page import="model.TipologiaEsame"%>
<%@page import="model.IndicatoreRisultato"%>

<!DOCTYPE html>
<html>
<head>
<title>Mostra Tipologia Esame</title>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
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


							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="container">
				<div>
					<label for="inputText3" class="col-sm-3 control-label">Indicatore
						Risultato</label>
					<div class="col-sm-9">
						<h:selectManyCheckbox id="grid" styleClass="form-control"
							value="#{indicatoreRisultatoController.indicatoriSelezionati}"
							layout="grid">
							<f:selectItems
								value="#{indicatoreRisultatoController.indicatoriRisultato}"
								var="indicatoreRisultato"
								itemValue="#{indicatoreRisultato.nome}" />
						</h:selectManyCheckbox>
					</div>

				</div>
				<br> <br> <br> <a
					href='<c:url value="/faces/inserisciNuovoIndicatoreRisultato.jsp" />'>
					Aggiungi Indicatore</a>

				<div class="form-group last">
					<h:commandButton value="Conferma"
						action="#{indicatoreRisultatoController.aggiornaChiave}"
						styleClass="btn btn-default btn-sm" />
				</div>

			</div>

		</h:form>
		<footer class="text-center">
			<a href="home.jsp">Clinica XPR 2016</a>
		</footer>
	</f:view>
</body>
</html>
