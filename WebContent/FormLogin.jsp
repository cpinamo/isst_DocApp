<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<style type="text/css">
	<%@ include file="WEB-INF/style.css" %>
</style>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio</title>
</head>
<body>
<h1>Bienvenidos a nuestro hospital</h1>

<img src="https://www.kmchospital.com/wp-content/uploads/bfi_thumb/close200-33nlczheutuszxjugll4ow.jpeg">

<form action = "LoginServlet">

<div id="intro"></br>
<label>Email:</label>
<input type = "text" name = "email" placeholder = "Introduzca su correo"/>
<label>Contraseña:</label>
<input type = "password" name = "password" placeholder = "Introduzca su contraseña"/>
<button type = "submit">Acceder</button>
</div>

</form></br>
<a id="enlace" href="FormRegistroPacienteServlet">Registrar nuevo paciente</a>
<a if="enlace" href="FormRegistroPacienteServlet">Recuperar Contraseña</a>
</body>
</html>
