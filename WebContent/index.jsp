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
                <li class="active"><a href="index.jsp">Inicio</a></li>
                <li class=""><a href="reservar.jsp">Login</a></li>
                <li class=""><a href="about">Sobre nosotros</a></li>
              </ul>
            </div>
          </div>
        </div>
      </nav>
<!-- navbar-->
      <div class="container">
        <div class="row">
          <div class="banner-info">
            <div class="banner-logo text-center">
              <img src="img/logo.png" class="img-responsive">
            </div>
            <div class="banner-text text-center">
              <h1 class="white">DocAPP</h1>
              <p>La página que te permite reservar todas tus citas medicas de una forma sencilla <br>AQUI PONED LO QUE QUERAIS O QUITARLO</p>
              <a href="reservar.jsp" class="btn btn-appoint">Inicia sesión aquí</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ banner-->
  
  

<!--footer-->
  <footer id="footer">
   <%@ include file="Templates/Footer.html" %>
  </footer>
  <!--/ footer-->
	
	<%@ include file="Templates/Imports.html" %>

</body>
</html>