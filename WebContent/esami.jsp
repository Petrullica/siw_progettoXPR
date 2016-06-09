<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Esami</title>
</head>
<body>
	<f:view>
		<h1>Esami Presenti</h1>
		<h:form>
			<table>
				<tr>
					<th>Codice</th>
					<th>Data prenotazione</th>
				</tr>
				<c:forEach var="esame" items="#{esameController.esami}">
					<tr>
						<td><h:commandLink action="#{esameController.findEsame}"
								value="#{esame.codice}">
								<f:param name="id" value="#{esame.id}" />
							</h:commandLink></td>
						<td>${esame.codice}</td>
						<td>${esame.dataPrenotazioneEsame}</td>
					</tr>
				</c:forEach>
			</table>
		</h:form>
	</f:view>
</body>
</html>