<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="model.TipologiaEsame" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mostra Parametri Tipologia Esame</title>
</head>
<body>

	<h1>Dati inseriti nella form</h1>
	<ul>
		<li>Nome: <b>${tipologiaEsame.nome}</b></li>
		<li>Descrizione: <b>${tipologiaEsame.descrizione}</b></li>
		<li>Costo:<b>${tipologiaEsame.costo}</b></li>
	</ul>
</body>
</html>