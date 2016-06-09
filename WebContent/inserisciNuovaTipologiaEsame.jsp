<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Amministratore"%>

<%
	Amministratore amministratore = (Amministratore) session.getAttribute("amministratore");
	boolean autorizzato = true;
	if (amministratore != null)
		autorizzato &= true;
	else
		autorizzato = false;
	if (!autorizzato) {
		out.clear();
		RequestDispatcher rd = application.getRequestDispatcher("/fallimento.jsp");
		rd.forward(request, response);
		return;
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Inserisci Una Nuova Tipologia Esame</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{tipologiaEsameController.nome}"
					required="true" requiredMessage="Nome is mandatory" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Descrizione:
				<h:inputText value="#{tipologiaEsameController.descrizione}"
					required="true" requiredMessage="Descrizione is mandatory"
					id="descrizione" />
				<h:message for="descrizione" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{tipologiaEsameController.prezzo}"
					required="true" requiredMessage="Prezzo is mandatory"
					converterMessage="Prezzo must be a number" id="prezzo" />
				<h:message for="prezzo" />
			</div>
			<div>
				Indicatori Risultato:
				<h:selectManyMenu id="indicatoriRisultato"
					value="#{indicatoreRisultatoController.indicatoriRisultatoSelezionati}">
					<f:selectItems
						value="#{indicatoreRisultatoController.indicatoriRisultato}"
						var="indicatoreRisultato" itemValue="#{indicatoreRisultato.nome}" />
				</h:selectManyMenu>
				<!--
				<h:selectOneMenu
					value="#{indicatoreRisultatoController.indicatoreRisultato}">
					<f:selectItems
						value="#{indicatoreRisultatoController.indicatoriRisultato}"
						var="indicatoreRisultato" itemValue="#{indicatoreRisultato.nome}" />
				</h:selectOneMenu>
				-->
			</div>
			<li><a
				href='<c:url value="/faces/inserisciNuovoIndicatoreRisultato.jsp" />'>
					Crea nuovo indicatore risultato</a></li>
			<div>
				<h:commandButton value="Submit"
					action="#{tipologiaEsameController.creaTipologiaEsame}" />
			</div>
			<li><a href='<c:url value="/faces/home.jsp" />'> Annulla e
					torna alla pagina principale</a></li>
		</h:form>
	</f:view>
</body>
</html>