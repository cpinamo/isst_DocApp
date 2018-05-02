<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administración</title>
</head>
<body>

<h2>Vista de Administración</h2>


<h3>Formulario de creación de pacientes</h3>
<%@ include file = "FormNuevoPacAdmin.jsp" %>

<h4>Listado de pacientes</h4>
<table border = 1>
<tr>
<th>DNI</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Edad</th>
<th>Estado</th>
</tr>

<c:forEach items = "${paciente_list}" var="pacientei">
<tr>
<td>${pacientei.dni}</td>
<td>${pacientei.name}</td>
<td>${pacientei.apellido}</td>
<td>${pacientei.edad}</td>
<td>${pacientei.status}</td>

</tr>
</c:forEach>

</table>

<h3>Formulario de creación de Médicos</h3>
<%@ include file = "FormNuevoMedAdmin.jsp" %>

<h4>Listado de médicos</h4>
<table border = 1>
<tr>
<th>Identificación</th>
<th>Nombre</th>
<th>Especialidad</th>
<th>Email</th>

</tr>

<c:forEach items = "${medico_list}" var="medicoi">
<tr>
<td>${medicoi.dni}</td>
<td>${medicoi.name}</td>
<td>${medicoi.especialidad}</td>
<td>${medicoi.email}</td>
</tr>
</c:forEach>

</table>



</body>
</html>