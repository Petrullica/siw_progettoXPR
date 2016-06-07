<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
	<%@ page import="model.Paziente" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Inserisci Una Nuova Tipologia Esame</title>
</head>
<body>
<f:view>
<h:form>
    <div>Username: <h:inputText value="#{pazienteController.username}" 
                     required="true"
                     requiredMessage="Nome is mandatory"
                     id="username"/> <h:message for="username" />
	</div>
    <div>Password: <h:inputSecret value="#{pazienteController.password}" 
                     required="true"
                     requiredMessage="Descrizione is mandatory"
                     id="password"/> <h:message for="password" />
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{pazienteController.loginPaziente}"/>
	</div>

</h:form>
</f:view>
</body>
</html>