<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Amministratore"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Amministratore</title>
</head>
<body>
	<f:view>
		<h:form>
			<center>
				<div>
					Username:
					<h:inputText value="#{amministratoreController.username}"
						required="true" requiredMessage="Nome is mandatory" id="username" />
					<h:message for="username" />
				</div>
				<div>
					Password:
					<h:inputText value="#{amministratoreController.password}"
						required="true" requiredMessage="Descrizione is mandatory"
						id="password" />
					<h:message for="password" />
				</div>
				<div>
					<h:commandButton value="Submit"
						action="#{amministratoreController.loginAmministratore}" />
				</div>
			</center>

		</h:form>
	</f:view>
</body>
</html>