<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<%@ include file="Templates/Head.html" %>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
  <!--banner-->
  <section id="banner" class="banner">
    <div class="bg-color">



  <!-- navbar-->
      <nav class="navbar navbar-default">
        <div class="container">
          <div class="col-md-12">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				      </button>
              <a class="navbar-brand" href="#"><img src="img/logo.png" class="img-responsive" style="width: 140px; margin-top: -16px;"></a>
            </div>
            <div class="collapse navbar-collapse navbar-right" id="myNavbar">
              <ul class="nav navbar-nav">
                <li class=""><a href="index.jsp">Inicio</a></li>
                <li class="active"><a href="reservar.jsp">Login</a></li>
                <li class=""><a href="about">Sobre nosotros</a></li>
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

<h2>Vista del Médico</h2>

<p>DNI: ${medico.dni }</p>
<p>Nombre: ${medico.name }</p>
<p>Email: ${medico.email }</p>
<p>Especialidad: ${medico.especialidad }</p>

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

<form action = "LogoutServlet">
<button type = "submit">Cerrar sesión</button>
</form>
</div>
</section>
 </div>
  </section>

<!--footer-->
  <footer id="footer">
     <%@ include file="Templates/Footer.html" %>
  </footer>
  <!--/ footer-->
  
 <%@ include file="Templates/Imports.html" %>
</body>
</html>