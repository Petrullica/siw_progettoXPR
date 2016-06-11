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
<link rel="stylesheet" type="text/css" href="css/sfondo.css">
<title>Login Paziente</title>

</head>
<body>
	<f:view>
		<h:form>

			<div class="container">
				<div class="row">
					<div class="col-md-4 col-md-offset-7">
						<div class="panel panel-default">
							<div class="panel-heading">
								<strong class="">Login</strong>

							</div>
							<div class="panel-body">
									<div class="form-group">


										<label for="inputText3" class="col-sm-3 control-label">Username</label>
										<div class="col-sm-9">
											<h:inputText value="#{pazienteController.username}"
												required="true" requiredMessage="Nome is mandatory" 
												id="username" styleClass="form-control" />
											<h:message for="username" />
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword3" class="col-sm-3 control-label">Password</label>
										<div class="col-sm-9">
											<h:inputSecret value="#{pazienteController.password}"
												required="true" requiredMessage="Password is mandatory"
												id="password" styleClass="form-control" />
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-9">
											<div class="checkbox">
												<label class=""> <input type="checkbox" class="">Remember
													me
												</label>
											</div>
										</div>
									</div>
									<div class="form-group last">
										<div class="col-sm-offset-3 col-sm-9">
										<h:commandButton value="Sign in"
					                             action="#{pazienteController.loginPaziente}" styleClass="btn btn-default btn-sm" />
											<button type="reset" class="btn btn-default btn-sm">Reset</button>
										</div>
									</div>
							</div>
							<div class="panel-footer">
								Not Registered? <a href="inserisciNuovoPaziente.jsp" class="">Register
									here</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>
</html>
