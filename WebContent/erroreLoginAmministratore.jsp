<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Errore Login Amministratore</title>
</head>
<body>

	<div class="container" align="center">
		<h2>Username o password errati</h2>
		<div class="item">
			<img src="images/warning.png" alt="warning">
			<div class="carousel-caption"></div>
		</div>
		<div>
			<a href="<c:url value="loginAmministratore.jsp" />"> <strong> Riprova ad eseguire il login
		 </strong></a>
		</div>
	</div>
	

	
</body>
</html>