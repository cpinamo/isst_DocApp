<!DOCTYPE html>
<html lang="en">






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
<%@ include file = "FormLogin.jsp" %>
    </div>
  </section>
  <!--/ doctor team-->

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
