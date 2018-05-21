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
						<li class=""><a href="LoginMedico.jsp">Mi cuenta</a></li>
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
				<h2>Elija una especialidad</h2>
				<br><br>
				
				
<form action = "FormInterconsulta2Servlet">

<input type="hidden" name="paciente" value="${paciente}">
<input type="hidden" name="medico" value="${medico}">
     
     <div class="col-lg-4" align="center"> 
		<input name="especialidades" type="image" src="img/alergologia.jpg" value="Alergologia" alt="" height="120px"/>    
                 
              <h3>Alergología</h3>
              
            
    </div>
    
     <div class="col-lg-4" align="center">
     
		<input name="especialidades" type="image" src="img/cardiologia.jpg" value="Cardiologia" alt="" height="120px"/>
	
                 
              <h3>Cardiología</h3>
            
    </div>
         
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6" align="center">    
		<input name="especialidades" type="image" src="img/dermatologia.jpg" value="Dermatologia" alt="" height="120px"/>		         
        <h3>Dermatología</h3>
        <br>           
    </div>
    
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
  
		<input name="especialidades" type="image" src="img/fisioterapia.jpg" value="Fisioterapia" alt="" height="120px"/>

             
              <h3>Fisioterapia</h3>
         
    </div>
    
 
        <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
         
		<input name="especialidades" type="image" src="img/ginecologia.jpg" value="Ginecologia" alt="" height="120px"/>
		
               
              <h3>Ginecología</h3>
            
    </div>
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
     
		<input name="especialidades" type="image" src="img/hematologia.jpg" value="Hematologia" alt="" height="120px"/>
		
               
              <h3>Hematología</h3>
         <br>
    </div>
    <br>
    
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
      
		<input name="especialidades" type="image" src="img/neumologia.jpg" value="Neumologia" alt="" height="120px"/>
		
              
              <h3>Neumología</h3>
        
    </div>
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
      
		<input name="especialidades" type="image" src="img/neurologia.jpg" value="Neurologia" alt="" height="120px"/>
		
               
              <h3>Neurología</h3>
            
    </div>
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
  
		<input name="especialidades" type="image" src="img/oftalmologia.jpg" value="Oftalmologia" alt="" height="120px" />

              
              <h3>Oftalmología</h3>
              <br>
          
    </div>
    <br>
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
     
		<input name="especialidades" type="image" src="img/psicologia.jpg" value="Psicologia" alt="" height="120px" />
		
                 
              <h3>Psicología</h3>
           
    </div>
     <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
     
		<input name="especialidades" type="image" src="img/traumatologia.jpg" value="Traumatologia" alt="" height="120px" />
		   
              <h3>Traumatología</h3>
           
    </div>
    <div class="col-lg-4 col-md-3 col-sm-3 col-xs-6 container" align="center">
    

		<input name="especialidades" type="image" src="img/urologia.jpg" value="Urologia" alt="" height="120px" />
		
               
              <h3>Urología</h3>
            
    </div>


</form>
			</div>
			</section>
		</div>
	</section>
	<!--footer-->
	<footer id="footer"> <%@ include file="Templates/Footer3.html"%>
	</footer>
	<!--/ footer-->
	<%@ include file="Templates/Imports.html"%>
</body>
</html>