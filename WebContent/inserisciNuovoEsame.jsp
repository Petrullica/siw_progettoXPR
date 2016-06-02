<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuovo esame</title>
</head>
<body>
	<div class="container">
		<form action="<c:url value="/controller/esame.crea" />" method="post">
			<label>Tipologia Esame</label>
			<label>Medico</label>
			<label>Paziente</label>
			<input type="submit" name="sumbit" value="invia" />
		</form>
	</div>
</body>
</html>