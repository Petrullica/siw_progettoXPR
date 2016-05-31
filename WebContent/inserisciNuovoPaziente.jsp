<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserisci Nuova Paziente</title>
</head>
<body>
	<div class="container">
		<form action="<c:url value="/controller/paziente.crea" />" method="post">
			<p>${nomError}</p>
			<label>Nome</label> <input type="text" placeholder="Nome" name="nome"
				value="${nome}">
			<p>${cognomeError}</p>
			<label>Cognome</label> <input type="text" placeholder="Cognome"
				name="cognome" value="${cognome}">
			<input type="submit" name="sumbit" value="invia" />
		</form>
	</div>
</body>
</html>
