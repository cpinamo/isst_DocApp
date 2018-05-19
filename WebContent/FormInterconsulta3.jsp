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
				<h2>Elegir médico</h2>
				<br>
				<form action="FormInterconsulta3Servlet">
					<div>
						<select class="col-lg-3" name="doctorCita">
							<option value="" disabled selected>Elija un doctor</option>
							<c:forEach items="${medico_especial}" var="medicoi">
								<option value=${ medicoi.email}>${medicoi.name}</option>
							</c:forEach>
						</select>
					</div>
					<input type="hidden" name="paciente" value="${paciente}">
					<br><br>
					<div>
						Date: <input type="text" id="datepicker" name="datepicker">
					</div>
					<script>
						var date = new Date();
						var currentMonth = date.getMonth();
						var currentDate = date.getDate();
						var currentYear = date.getFullYear();
						$('#datepicker').datepicker(
								{
									minDate : new Date(currentYear, currentMonth, currentDate),
									maxDate : new Date(currentYear, currentMonth + 3, currentDate),
									dateFormat : "dd/mm/yy"
								}).val();
					</script>
					<br>
					<button class="col-lg-2" type="submit">Elegir doctor y dia</button>
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