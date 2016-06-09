<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>TipologiaEsame</title>
</head>
<body>
	<f:view>
		<h1>${tipologiaEsameController.tipologiaEsame.nome}</h1>
		<h2>Details</h2>
		<div>Descrizione:
			${tipologiaEsameController.tipologiaEsame.descrizione}</div>
		<div>Prezzo: ${tipologiaEsameController.tipologiaEsame.prezzo}</div>
		<c:forEach var="indicatoreRisultato"
			items="#{indicatoreRisultatoController.indicatoriRisultato}">
			<td>${indicatoreRisultato.nome}</td>
		</c:forEach>


		<li><a href='<c:url value="/faces/inserisciNuovoPaziente.jsp" />'>
				Registrati</a></li>
	</f:view>
</body>
</html>