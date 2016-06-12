<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@page import="model.Esame" import="model.IndicatoreRisultato"
	import="model.Risultato" import="model.TipologiaEsame"%>

<!DOCTYPE html>
<html>
<head>
<title>Scrivi risultato</title>
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
			<div class="container">
				<label for="inputText3" class="col-sm-3 control-label">Seleziona
					Risultato da completare</label>
				<div class="col-sm-9">
					<h:selectOneMenu styleClass="form-control"
						value="#{risultatoController.indicatoreRisultato}">
						<f:selectItems
							value="#{esameControllerController.tipologiaEsame.indicatoriRisultato}"
							var="indicatoreRisultato" itemValue="#{indicatoreRisultato.nome}" />
					</h:selectOneMenu>
				</div>
				<div class="panel-body">
					<div class="form-group">
						<label for="inputText3" class="col-sm-3 control-label">Valore</label>
						<div class="col-sm-9">
							<h:inputText value="#{risultatoController.valore}"
								required="true" requiredMessage="Valore is mandatory"
								id="valore" styleClass="form-control" />
							<h:message for="valore" />
						</div>
						<br> <br> <br> <a
							href='<c:url value="/faces/inserisciNuovoIndicatoreRisultato.jsp" />'>
							Aggiungi Tipologia</a>

						<div class="form-group last">
							<div class="col-sm-offset-3 col-sm-3">
								<div>
									<h:commandButton value="Confer,a" styleClass="form-control"
										action="#{risultatoController.creaRisultato}" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>
</html>