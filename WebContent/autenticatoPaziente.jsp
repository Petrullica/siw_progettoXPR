<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="model.Paziente"%>
<!DOCTYPE html>
<html>
<head>
<title>Autenticazione Riuscita</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-1.11.3.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	

	<h1>Autenticato Come</h1>
	<ul>
		<li>Username: <b>${paziente.username}</b></li>
		<li><a href="inserisciNuovaTipologiaEsame.jsp">inserisciNuovaTipologia</a></li>

	</ul>
</body>
</html>