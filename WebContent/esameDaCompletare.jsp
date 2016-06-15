<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Esame" import="model.IndicatoreRisultato"
	import="model.Risultato"%>

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
				<!-- 
								<h:selectManyListbox styleClass="form-control"
									value="#{esameController.risultati}">
									<f:selectItems value="#{EsameController.risultati}"
										var="risultato"
										itemValue="#{esame.risultato.indicatoreRisultato.nome}" />
								</h:selectManyListbox>
				-->
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
			
			<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
		</h:form>
	</f:view>
</body>
</html>