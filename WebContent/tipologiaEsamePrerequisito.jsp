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

			<!-- Inserimento Prerequisito -->

			<div class="container">
				<div class="col-sm-9">
					Nome<h:inputText value="#{prerequisitoController.nome}" required="true"
						requiredMessage="Il nome è obbligatorio!" id="nome"
						styleClass="form-control" />
					<h:message for="nome" />
				</div>

				<div class="col-sm-9">
					Valore<h:inputText value="#{prerequisitoController.valore}"
						required="true" requiredMessage="Il valore è obbligatorio!"
						id="valore" styleClass="form-control" />
					<h:message for="valore" />
				</div>
			</div>
			<div class="form-group last">
				<div class="col-sm-offset-3 col-sm-9">
					<h:commandButton value="Aggiungi e Continua"
						action="#{prerequisitoController.creaPrerequisito}"
						styleClass="btn btn-default btn-sm" />
				</div>

				<div class="col-sm-offset-3 col-sm-9">
					<h:commandButton value="Completato"
						action="#{prerequisitoController.creaPrerequisitoStop}"
						styleClass="btn btn-default btn-sm" />
				</div>
			</div>
			<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
		</h:form>
	</f:view>
</body>
</html>