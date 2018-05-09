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
<h2> Elegir hora y día </h2>

<form action = "Form4CitaServlet">

<select name="dia">
	<option value="" disabled selected>Elija un dia</option>
		<option value = "1">1</option>
		<option value = "2">2</option>
		<option value = "3">3</option>
		<option value = "4">4</option>
</select>
<select name="dia">
	<option value="" disabled selected>Elija un dia</option>
		<c:forEach items = "${horas_doctor_disponibles}" var="horasi">
			<option value = ${ horasi}></option> 
		</c:forEach>
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