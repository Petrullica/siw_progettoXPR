<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Paziente"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserisci Nuovo Paziente</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{pazienteController.nome}" required="true"
					requiredMessage="Nome is mandatory" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Cognome:
				<h:inputText value="#{pazienteController.cognome}" required="true"
					requiredMessage="Cognome is mandatory" id="cognome" />
				<h:message for="cognome" />
			</div>
			<div>
				Username:
				<h:inputText value="#{pazienteController.username}" required="true"
					requiredMessage="Username is mandatory" id="username" />
				<h:message for="username" />
			</div>
			<div>
				Password:
				<h:inputSecret value="#{pazienteController.password}"
					required="true" requiredMessage="Password is mandatory"
					id="password" />
				<h:message for="password" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{pazienteController.creaPaziente}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>