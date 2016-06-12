<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.TipologiaEsame"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>Inserisci Una Nuova Tipologia Esame</title>
</head>
<body>
	<f:view>
		<h:form>
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Inserisci Nuova Tipologia Esame</strong>

							</div>
							<div class="panel-body">
								<div class="form-group">

									<label for="inputText3" class="col-sm-3 control-label">Nome</label>
									<div class="col-sm-9">
										<h:inputText value="#{tipologiaEsameController.nome}"
											required="true" requiredMessage="Nome is mandatory" id="nome"
											styleClass="form-control" />
										<h:message for="nome" />
									</div>


									<div class="form-group">
										<label for="inputText3" class="col-sm-3 control-label">Descrizione</label>
										<div class="col-sm-9">
											<h:inputText value="#{tipologiaEsameController.descrizione}"
												required="true" requiredMessage="Descrizione is mandatory"
												id="descrizione" styleClass="form-control" />
											<h:message for="descrizione" />
										</div>
									</div>
									<div class="form-group">

										<label for="inputText3" class="col-sm-3 control-label">Prezzo</label>
										<div class="col-sm-9">
											<h:inputText value="#{tipologiaEsameController.prezzo}"
												required="true" requiredMessage="Prezzo is mandatory"
												converterMessage="Prezzo must be a number" id="prezzo"
												styleClass="form-control" />
											<h:message for="prezzo" />
										</div>
									</div>
									<div class="form-group">

										<label for="inputText3" class="col-sm-3 control-label">Indicatore Risultato</label>
										<div class="col-sm-9">
											<h:selectManyListbox id="indicatoriRisultato"
												styleClass="form-control"
												value="#{tipologiaEsameController.indicatoriRisultato}">
												<f:selectItems
													value="#{indicatoreRisultatoController.indicatoriRisultato}"
													var="indicatoreRisultato"
													itemValue="#{indicatoreRisultato.nome}" />
											</h:selectManyListbox>
										</div>
									</div>
									<div class="form-group">
									
										<a href='<c:url value="/faces/inserisciNuovoIndicatoreRisultato.jsp" />'>
											Crea nuovo indicatore risultato</a>
										<div>
											<h:commandButton value="Submit"
												action="#{tipologiaEsameController.creaTipologiaEsame}" />
												
										</div>
										<a href='<c:url value="/faces/home.jsp" />'> Annulla e torna alla pagina principale</a>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!--
				<h:selectOneMenu
					value="#{indicatoreRisultatoController.indicatoreRisultato}">
					<f:selectItems
						value="#{indicatoreRisultatoController.indicatoriRisultato}"
						var="indicatoreRisultato" itemValue="#{indicatoreRisultato.nome}" />
				</h:selectOneMenu>
				-->
			</div>
			
		</h:form>
	</f:view>
</body>
</html>