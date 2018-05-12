<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<%@ include file="Templates/Head.html"%>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">
	<!--banner-->
	<section id="banner" class="banner">
	<div class="bg-color">
		<!-- navbar-->
		<nav class="navbar navbar-default">
		<div class="container">
			<div class="col-md-12">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"><img src="img/logo.png"
						class="img-responsive" style="width: 140px; margin-top: -16px;"></a>
				</div>
				<div class="collapse navbar-collapse navbar-right" id="myNavbar">
					<ul class="nav navbar-nav">
						<li class=""><a href="LoginPaciente.jsp">Mi cuenta</a></li>
						<li class="active"><a href="FormLogout.jsp">Logout</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
		<!-- navbar-->
		<br>
		<div class="container">
			<!--doctor team-->
			<section id="doctor-team" class="section-padding">
			<div class="container jumbotron">
				<h2>Vista del Paciente</h2>
				<br>
			    <p>DNI: ${paciente.dni }</p>
				<p>Nombre: ${paciente.name }</p>
				<p>Email: ${paciente.email }</p>
				<br> 
				<form action = "Form1CitaServlet">
				<input type="hidden" name="paciente" value=${paciente.dni}>
				<button class="col-lg-2" type="submit">Pedir cita</button> <br>
				</form>
				<table class="table table-hover Table">
					<thead>
						<tr>
							<th class="col-lg-2">Identificación</th>
							<th class="col-lg-3">Nombre</th>
							<th class="col-lg-3">Especialidad</th>
							<th class="col-lg-4">Email</th>
						</tr>
						<c:forEach items="${paciente.doctores }" var="doctoresi">
							<tr>
								<td>${doctoresi.dni}</td>
								<td>${doctoresi.name}</td>
								<td>${doctoresi.especialidad}</td>
								<td>${doctoresi.email}</td>
							</tr>
						</c:forEach>
				</table>
				<br>
				<form action="FormBajaServlet">
					<button class="col-lg-3" type="submit">Darse de baja</button>
				</form>
			</div>
			</section>
		</div>
	</section>
	<!--footer-->
	<footer id="footer"> <%@ include file="Templates/Footer1.html"%>
	</footer>
	<!--/ footer-->
	<%@ include file="Templates/Imports.html"%>
</body>
</html>