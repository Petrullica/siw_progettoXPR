<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fallimento</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>Area Riservata</h2>
		<div class="item">
			<img src="images/warning.png" alt="warning">
			<div class="carousel-caption"></div>
		</div>
		<div>
			<strong>Attenzione!</strong> Per accedere a questa zona bisogna prima
			autenticarsi.
		</div>
	</div>
	<div align="center">
		<a class="container" href="loginAmministratore.jsp">
			<button type="button" class="btn btn-primary">Accedi Come
				Amministratore</button>
		</a> <a class="container" href="loginPaziente.jsp">
			<button type="button" class="btn btn-primary">Accedi Come
				Paziente</button>
		</a>
	</div>
	<footer class="text-center">
				<a href="home.jsp">Clinica XPR 2016</a>
			</footer>
</body>
</html>