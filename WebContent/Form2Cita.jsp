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
<h2> Elegir médico </h2>
<form action = "Form3CitaServlet">

<select name="doctorCita">
	<option value="" disabled selected>Elija un doctor</option>
		<c:forEach items = "${medico_especial}" var="medicoi">
			<option value = ${ medicoi.email}> ${medicoi.name}</option> 
		</c:forEach>
</select>

<select name="diaCita">
<option value="" disabled selected>Elija un dia</option>
		<c:forEach items = "${medico_especial}" var="medicoi">
			<option value = ${ medicoi.email}> ${medicoi.name}</option> 
		</c:forEach>

</select>


<input type = "submit">Elegir doctor y dia</input>

</form>
</body>
</html>