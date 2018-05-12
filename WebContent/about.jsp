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
						<p><Strong>Teléfono:</Strong> +34 111111111</p>
						<p><Strong>Correo Electrónico:</Strong> root@docapp.com</p>					
					</div>
				</div>
				<br>
				<div align="center">
				<h4 class="white">Ubícanos en el mapa:</h4>
				<div class="banner-text text-center">
				<p>Nuestra dirección es Avenida Complutense, nº 30 (28040 Madrid).</p>
				<p>En transporte público se puede llegar por metro (Línea Circular,<br>
				 estación Ciudad Universitaria) o autobús (líneas EMT 82, F, G y U).</p><br>	
				</div>
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3786.7471745315297!2d
				-3.7259889242342874!3d40.45140853882517!2m3!1f0!2f0!3f0!3m2!
				1i1024!2i768!4f13.1!3m3!1m2!1s0xd422834b7ba343b%3A0x9f310b10
				6880a45f!2sETSIT%3A+Biblioteca!5e0!3m2!1ses!2ses!4v1526121858476" 
				width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
							
				</div>
				<br><br>
				
							
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