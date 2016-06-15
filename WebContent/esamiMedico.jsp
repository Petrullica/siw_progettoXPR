<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Esame"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>Inserisci Nuovo Paziente</title>
</head>
<body>
	<f:view>

		<h:form>

			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<div align="center">
										<h2>Esami Presenti</h2>
										<table class="table">
											<thead>
												<tr>
													<th>Codice</th>
													<th>Data prenotazione</th>
												
												</tr>
											</thead>
											<tbody>
									<c:forEach var="esame" items="#{medicoController.esami}">
										<tr>
											<td><h:commandLink action="#{esameController.findEsame}"
													value="#{esame.codice}">
													<f:param name="id" value="#{esame.id}" />
												</h:commandLink></td>
											
											<td>${esame.dataPrenotazioneEsame}</td>
										</tr>
									</c:forEach>
									</tbody>
								</table>
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