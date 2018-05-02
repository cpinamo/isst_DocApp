<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio</title>
</head>
<body>
<h1>Bienvenidos a nuestro hospital</h1>
<form action = "LoginServlet">
<input type = "text" name = "email" placeholder = "email"/>
<input type = "password" name = "password" placeholder = "password"/>
<button type = "submit">Acceder</button>
</form>
<a href="FormRegistroPacienteServlet">Registrar nuevo paciente</a>
<p></p>
<a href="FormRegistroPacienteServlet">Recuperar Contraseña</a>
</body>
</html>