<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Amministratore</title>
  	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
  </head>
  <body>
    <h1>Login Amministratore</h1>
	 <form action="autenticaAmministratore" method="POST">
		<p>Username: <input type="text" name="username"/></p>
		<p>Password: <input type="password" name="password"/></p>
		<p><input type="reset" value="Reimposta"/></p>
        <p><input type="submit" value="Login" name="login"/></p>
	</form>
  </body>
</html>