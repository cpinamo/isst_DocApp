<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vista del tutor</title>
</head>
<body>

<h2>Vista del Médico</h2>

<p>DNI: ${medico.dni }</p>
<p>Nombre: ${medico.name }</p>
<p>Email: ${medico.email }</p>

<table border = "1">
<tr>
<th>DNI</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Edad</th>
<th>Estado</th>
</tr>

<c:forEach items = "${medico.pacientes }" var = "pacientesi">
<tr>
<td>${pacientei.dni}</td>
<td>${pacientei.name}</td>
<td>${pacientei.apellido}</td>
<td>${pacientei.edad}</td>
<td>${pacientei.status}</td>
</tr>
</c:forEach>

</table>

</body>
</html>