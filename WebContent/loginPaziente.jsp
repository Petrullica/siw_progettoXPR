<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Loggati</title>
</head>
<body>
<f:view>
<h:form>
    <div>Username: <h:inputText value="#{pazienteController.username}" 
                     required="true"
                     requiredMessage="Nome is mandatory"
                     id="nome"/> <h:message for="nome" />
	</div>
    <div>Password: <h:inputText value="#{pazienteController.password}" 
                     required="true"
                     requiredMessage="Descrizione is mandatory"
                     id="descrizione"/> <h:message for="descrizione" />
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{pazienteController.loginPaziente}"/>
	</div>

</h:form>
</f:view>
</body>
</html>