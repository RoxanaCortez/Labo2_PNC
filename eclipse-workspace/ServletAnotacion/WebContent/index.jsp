<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarea</title>
</head>
<body>
	<h1>Login</h1>
	<!-- En action especificamos a que mapping queremos que nos redirija -->
	<form action="AnotacionServlet" method="post">
	
	<label>Ingrese usuario </label><input name="usuario" type="text">
	<label>Ingrese contraseña </label><input name="contra" type="text" >
	<input type="submit" value="Log In">
	</form>
</body>
</html>