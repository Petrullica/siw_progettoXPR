<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>TipologieEsame</title>
</head>
<body>
	<f:view>
		<h1>Tipologie Esame Presenti</h1>
		<h:form>
			<table>
				<tr>
					<th>Nome</th>
					<th>Descrizione</th>
					<th>Prezzo</th>
				</tr>
				<c:forEach var="tipologiaEsame"
					items="#{tipologiaEsameController.tipologieEsame}">
					<tr>
						<td><h:commandLink
								action="#{tipologiaEsameController.findTipologiaEsame}"
								value="#{tipologiaEsame.nome}">
								<f:param name="id" value="#{tipologiaEsame.id}" />
							</h:commandLink></td>
						<td>${tipologiaEsame.descrizione}</td>
						<td>${tipologiaEsame.prezzo}</td>
					</tr>
				</c:forEach>
			</table>
		</h:form>
	</f:view>
</body>
</html>