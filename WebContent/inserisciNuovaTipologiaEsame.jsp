<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserisci Nuova Tipologia Esame</title>
</head>
<body>
	<div class="container">
		<form action="Controller" method="post">
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
