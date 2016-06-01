<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<%@ page import="model.Paziente" %>
<% Paziente paziente = (Paziente)session.getAttribute("paziente");
   boolean autorizzato = true;
   if (paziente!=null)
	   autorizzato &= true;
   else 
   	   autorizzato = false;
   if (!autorizzato) {
   	   out.clear();
	   RequestDispatcher rd = application.getRequestDispatcher("/fallimento.jsp");
   	   rd.forward(request, response);
	   return;
	}%>
	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserisci Nuova Tipologia Esame</title>
</head>
<body>
	<div class="container">
		<form action="<c:url value="/controller/tipologiaEsame.crea" />" method="post">
			<p>${nomError}</p>
			<label>Nome</label> <input type="text" placeholder="Nome" name="nome"
				value="${nome}">
			<p>${descrizioneError}</p>
			<label>Descrizione</label> <input type="text" placeholder="Descrizione"
				name="descrizione" value="${descrizione}">
			<p>${prezzoError}</p>
			<label>Prezzo</label><input type="text"
				placeholder="Prezzo" name="prezzo" value="${prezzo}">
			<input type="submit" name="sumbit" value="invia" />
		</form>
	</div>
</body>
</html>
