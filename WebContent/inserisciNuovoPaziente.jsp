<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ page import="model.Paziente"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/sfondoRegistrazione.css">
<link rel="stylesheet" type="text/css" href="css/suggerimento.css">
<script src="js/suggerimento.js"></script>
<title>Inserisci Nuovo Paziente</title>

</head>
<body>
	<f:view>
		<h:form>
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-3">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Registrati!</strong>

							</div>
							<div class="panel-body">
								<div class="form-group">

									<label for="inputText3" class="col-sm-3 control-label">Nome</label>
									<div class="col-sm-9">
										<h:inputText value="#{pazienteController.nome}"
											required="true" requiredMessage="Il nome è obbligatorio!" id="nome"
											styleClass="form-control" />
										<h:message for="nome" />
									</div>
								</div>

								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Cognome</label>
									<div class="col-sm-9">
										<h:inputText value="#{pazienteController.cognome}"
											required="true" requiredMessage="Il cognome è obbligatorio!"
											id="cognome" styleClass="form-control" />
										<h:message for="cognome" />
									</div>
								</div>
								<div class="form-group">
									<label for="inputText3" class="col-sm-3 control-label">Username <a href="#" class="hintanchor" 
									onMouseover="showhint('Inserisci uno username per il tuo account compreso tra 6 e 10 caratteri alfanumerici', this, event, '150px')">[?]</a></label>
									
									<div class="col-sm-9">
										<h:inputText value="#{pazienteController.username}"
											required="true" requiredMessage="Lo username è obbligatorio!"
											validatorMessage="Lo username può essere compreso tra 6 e 10 caratteri!"
											id="username" styleClass="form-control">
										<h:message for="username" />
										<f:validateLength minimum="6" maximum="10"/>
										</h:inputText>
										
									     
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword3" class="col-sm-3 control-label">Password <a href="#" class="hintanchor" 
									onMouseover="showhint('Inserisci una password segreta per il tuo account compresa tra 6 e 10 caratteri alfanumerici', this, event, '150px')">[?]</a></label>
									
									<div class="col-sm-9">
										<h:inputSecret value="#{pazienteController.password}"
											required="true" requiredMessage="La password è obbilgatoria!"
											validatorMessage="Lo password può essere compresa tra 6 e 10 caratteri!"
											id="password" styleClass="form-control">
											<f:validateLength minimum="6" maximum="10"/>
											</h:inputSecret>
											
								            									</div>
								</div>


								<div class="form-group last">
									<div class="col-sm-offset-3 col-sm-9">
										<h:commandButton value="Sign in" 
											action="#{pazienteController.creaPaziente}"
											styleClass="btn btn-default btn-sm" />
											<button type="reset" id="bottone"
											class="btn btn-default btn-sm">Reset</button>
										<script>
											document.getElementById("bottone")
													.addEventListener("click",
															resetta);
											function resetta() {
												window.alert("In questo modo resetterai tutti i campi!")
											};
										</script>
										
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
