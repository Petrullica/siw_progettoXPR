<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Esame"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>CreaNuovoEsame</title>
</head>
<body>
	<f:view>
		<h:form>

			<div class="container">
				<div class="row">
					<div class="col-md-11 col-md-offset-1">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Inserisci un nuovo Esame</strong>

							</div>
							<div class="panel-body">

								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Codice</label>
									<div class="col-sm-9">

										<h:inputText value="#{esameController.codice}" required="true"
											requiredMessage="Il codice è obbligatorio!" id="codice"
											styleClass="form-control" />
										<h:message for="codice" />
									</div>
								</div>
								<br> <br> <br>
								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Data
										Esame</label>
									<div class="col-sm-9">
										<h:inputText value="#{esameController.dataSvolgimentoEsame}"
											required="true"
											requiredMessage="La data di svolgimento dell'esame è obbligatoria!"
											id="dataSvolgimentoEsame" styleClass="form-control">
											<h:message for="dataSvolgimentoEsame" />
											<f:convertDateTime pattern="dd-mm-yyyy" />
										</h:inputText>
									</div>
								</div>
								<br> <br> <br>

								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Tipologia
										Esame</label>
									<div class="col-sm-9">
										<h:selectOneMenu styleClass="form-control"
											value="#{esameController.tipologiaEsame}"
											converter="#{tipologiaEsameConverter }">
											<f:selectItems
												value="#{tipologiaEsameController.tipologieEsame}"
												var="tipologiaEsame" itemValue="#{tipologiaEsame}"
												itemLabel="#{tipologiaEsame.nome }" />
										</h:selectOneMenu>
									</div>
								</div>
								<br> <br> <br>
								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Paziente</label>
									<div class="col-sm-9">
										<h:selectOneMenu styleClass="form-control"
											value="#{esameController.paziente}"
											converter="#{pazienteConverter}">
											<f:selectItems value="#{pazienteController.pazienti}"
												var="paziente" itemValue="#{paziente}"
												itemLabel="#{paziente.username}" />
										</h:selectOneMenu>
									</div>
								</div>
								<br> <br> <br>
								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Medico</label>
									<div class="col-sm-9">
										<h:selectOneMenu styleClass="form-control"
											value="#{esameController.medico}"
											converter="#{medicoConverter}">
											<f:selectItems value="#{medicoController.medici}"
												var="medico" itemValue="#{medico}"
												itemLabel="#{medico.nome}" />
										</h:selectOneMenu>
									</div>
								</div>
								<br> <br>
								<div class="form-group last">
									<div class="col-sm-offset-0 col-sm-9">
										<h:commandButton styleClass="btn btn-default btn-sm"
											value="Inserisci" action="#{esameController.creaEsame}" />
										<button type="reset" class="btn btn-default btn-sm">Reset</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>
</html>
