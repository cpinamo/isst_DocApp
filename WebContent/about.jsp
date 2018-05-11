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
						<li class="active"><a href="Index.jsp">Inicio</a></li>
						<li class=""><a href="FormLogin.jsp">Login</a></li>
						<li class=""><a href="about.jsp">Sobre nosotros</a></li>
					</ul>
				</div>
			</div>
		</div>
		</nav>
	<div class="container">
			<div class="row">
				<div class="banner-2">
					<div class="banner-logo text-center">
						<img src="img/logo.png" class="img-responsive" height="60" width="60">
					</div>
					<div class="banner-text text-center">
						<h1 class="white">Sobre nosotros</h1>
						<p>DocApp es una aplicación de uso sencillo para la reserva de citas médicas.</p>
						<p>A través de esta aplicación podrá escoger fecha y hora para pasar consulta, y 
						podrá seleccionar a su médico mediante un listado por especialidad.</p>
						<p> </p>
						<p>Si desea contactar con nosotros, 
						podrá hacerlo a través de los siguientes medios:</p>
						<p>Teléfono +34 111111111</p>
						<p>Correo Electrónico xxxxx@xxx.com</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--/ banner-->
	<!--footer-->
	<footer id="footer"> <%@ include file="Templates/Footer.html"%>
	</footer>
	<!--/ footer-->
	<%@ include file="Templates/Imports.html"%>
</body>
</html>