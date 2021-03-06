<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.TipologiaEsame"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>Tipologie Esame</title>
</head>
<body>
	<f:view>
		<h:form>
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Seleziona tipologia esame da completare</strong>
								<br>
								<table>
									<tr>
										<th>Nome </th>
										<th>Descrizione </th>
										<th>Prezzo</th>
									</tr>
									<c:forEach var="tipologiaEsame"
										items="#{tipologiaEsameController.tipologieEsame}">
										<tr>
											<td><h:commandLink
													action="#{tipologiaEsameController.findTipologiaEsame2}"
													value="#{tipologiaEsame.nome}">
													<f:param name="id" value="#{tipologiaEsame.id}" />
												</h:commandLink></td>
											<td>${tipologiaEsame.descrizione}</td>
											<td>${tipologiaEsame.prezzo}</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>
</html>