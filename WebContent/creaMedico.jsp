<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>InserisciMedico</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{medicoController.nome}" required="true"
					requiredMessage="Nome is mandatory" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Cognome:
				<h:inputText value="#{medicoController.cognome}" required="true"
					requiredMessage="Cognome is mandatory" id="cognome" />
				<h:message for="cognome" />
			</div>
			<div>
				Specializzazione:
				<h:inputText value="#{medicoController.specializzazione}"
					required="true" requiredMessage="Prezzo is mandatory"
					converterMessage="Specializzazione must be a number"
					id="specializzazione" />
				<h:message for="specializzazione" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{medicoController.creaMedico}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>