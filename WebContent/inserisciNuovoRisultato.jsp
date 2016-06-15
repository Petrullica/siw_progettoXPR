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
			<div align="center">
				<div class="container">
					<div class="row">
						<div class="col-md-6 col-md-offset-3">
							<div class="panel panel-default">
								<label for="inputText3" class="col-sm-3 control-label">Seleziona
									Risultato da completare</label>
								<div class="col-sm-9">
									<h:selectOneMenu styleClass="form-control"
										value="#{risultatoController.indicatoreRisultato}">
										<f:selectItems
											value="#{esameControllerController.tipologiaEsame.indicatoriRisultato}"
											var="indicatoreRisultato"
											itemValue="#{indicatoreRisultato.nome}" />
									</h:selectOneMenu>
									<br> <label for="inputText3"
										class="col-sm-3 control-label">Valore</label>
									<div class="col-sm-9">
										<h:inputText value="#{risultatoController.valore}"
											required="true" requiredMessage="Il valore è obbligatorio!"
											id="valore" styleClass="form-control" />
										<h:message for="valore" />
									</div>
									<br> <br> <br>
									<div class="form-group last">
										<div class="col-sm-offset-3 col-sm-3">
											<div>
												<h:commandButton value="Conferma" styleClass="form-control"
													action="#{risultatoController.creaRisultato}" />
													<button type="reset" id="bottone" class="btn btn-default btn-sm">Reset</button>
										        <script>document.getElementById("bottone").addEventListener("click", resetta);
												function resetta(){window.alert("In questo modo resetterai tutti i campi!")};</script>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
		</h:form>
	</f:view>
</body>
</html>