<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Medico"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>Inserisci Nuovo Medico</title>

</head>
<body>
	<f:view>
		<h:form>
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Inserisci dati medico</strong>

							</div>
							<div class="panel-body">
								<div class="form-group">

									<label for="inputText3" class="col-sm-3 control-label">Nome</label>
									<div class="col-sm-9">
										<h:inputText value="#{medicoController.nome}" required="true"
											requiredMessage="Nome is mandatory" id="nome"
											styleClass="form-control" />
										<h:message for="nome" />
									</div>
								</div>

								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Cognome</label>
									<div class="col-sm-9">
										<h:inputText value="#{medicoController.cognome}"
											required="true" requiredMessage="Cognome is mandatory"
											id="cognome" styleClass="form-control" />
										<h:message for="cognome" />
									</div>
								</div>
								
								<div class="form-group last">
									<div class="col-sm-offset-3 col-sm-9">
										<h:commandLink
											action="#{medicoController.findEsamiMedicoByNomeCognome}"
											value="Mostra Esami Medico"/>
										<button type="reset" class="btn btn-default btn-sm">Reset</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
		</h:form>
	</f:view>
</body>
</html>
