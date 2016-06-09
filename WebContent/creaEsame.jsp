<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>CreaNuovoEsame</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Codice:
				<h:inputText value="#{esameController.codice}" required="true"
					requiredMessage="Codice is mandatory" id="codice" />
				<h:message for="codice" />
			</div>
			<div>
				DataEsame:
				<h:inputText value="#{esameController.dataSvolgimentoEsame}"
					required="true" requiredMessage="dataSvolgimentoEsame is mandatory"
					id="dataSvolgimentoEsame">
					<h:message for="dataSvolgimentoEsame" />
					<f:convertDateTime pattern="dd-mm-yyyy" />
				</h:inputText>
			</div>
			<div>
				TipologiaEsame:
				<h:selectOneMenu value="#{tipologiaEsameController.tipologiaEsame}"
					converter="#{tipologiaEsameConverter }">
					<f:selectItems value="#{tipologiaEsameController.tipologieEsame}"
						var="tipologiaEsame" itemValue="#{tipologiaEsame}"
						itemLabel="#{tipologiaEsame.nome }" />
				</h:selectOneMenu>
			</div>
			<div>
				Paziente:
				<h:selectOneMenu value="#{pazienteController.paziente}"
					converter="#{pazienteConverter}">
					<f:selectItems value="#{pazienteController.pazienti}"
						var="paziente" itemValue="#{paziente}"
						itemLabel="#{paziente.username}" />
				</h:selectOneMenu>
			</div>
			<div>
				Medico:
				<h:selectOneMenu value="#{medicoController.medico}"
					converter="#{medicoConverter}">
					<f:selectItems value="#{medicoController.medici}" var="medico"
						itemValue="#{medico}" itemLabel="#{medico.nome}" />
				</h:selectOneMenu>
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{esameController.creaEsame}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>