<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de petición de cita</title>
</head>
<body>
<h2> Elegir hora y día </h2>

<form action = "Form4CitaServlet">

<select name="dia">
	<option value="" disabled selected>Elija un dia</option>
		<option value = "1">1</option>
		<option value = "2">2</option>
		<option value = "3">3</option>
		<option value = "4">4</option>
</select>

<select name="hora">
	<option value="" disabled selected>Elija una hora</option>
		<option value = "9">9</option>
		<option value = "9:15">9:15</option>
		<option value = "9:30">9:30</option>
		<option value = "9:45">9:45</option>
</select>


<input type = "submit">Pedir cita</input>

</form>

</body>
</html>