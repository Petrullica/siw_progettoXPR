<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<div class="container">
				Indicatore Risultato
				<h:selectManyCheckbox
					value="#{indicatoreRisultatoController.indicatoriSelezionati}"
					converter="#{indicatoreRisultatoConverter}">
					<f:selectItems
						value="#{indicatoreRisultatoController.indicatoriRisultato}"
						var="indicatoreRisultato" itemValue="#{indicatoreRisultato}"
						itemLabel="#{indicatoreRisultato.nome }" />
				</h:selectManyCheckbox>
			</div>


			<div>
				<h:commandButton value="Conferma"
					styleClass="btn btn-default btn-sm"
					action="#{indicatoreRisultatoController.aggiornaChiave}" />
			</div>


		</h:form>
	</f:view>
</body>
</html>