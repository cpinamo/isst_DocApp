<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vista del Paciente</title>
</head>
<body>

<h2>Vista del Paciente</h2>

<p>DNI: ${paciente.dni }</p>
<p>Nombre: ${paciente.name }</p>
<p>Email: ${paciente.email }</p>

<table border = "1">
<tr>
<th>Identificación</th>
<th>Nombre</th>
<th>Especialidad</th>
<th>Email</th>
</tr>

<c:forEach items = "${paciente.doctores }" var = "doctoresi">
<tr>
<td>${doctoresi.dni}</td>
<td>${doctoresi.name}</td>
<td>${doctoresi.especialidad}</td>
<td>${doctoresi.email}</td>
</tr>
</c:forEach>

</table>



</body>
</html>