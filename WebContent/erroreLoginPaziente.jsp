<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>Errore Login Paziente</title>
</head>
<body>
	<p>Username o password errati</p>
	<!-- 
	<h1>error</h1>
	<div>${ex}</div>
	 -->
	<a href="<c:url value="loginPaziente.jsp" />"> Esegui il login</a>
</body>
</html>