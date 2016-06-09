<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Inserisci un nuovo indicatore risultato</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Nome:
				<h:inputText value="#{indicatoreRisultatoController.nome}"
					required="true" requiredMessage="Nome is mandatory" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{indicatoreRisultatoController.creaIndicatoreRisultato}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>