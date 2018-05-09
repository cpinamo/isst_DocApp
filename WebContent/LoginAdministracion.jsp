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

<h2>Vista de Administración</h2>


<h3>Formulario de creación de pacientes</h3>
<%@ include file = "FormNuevoPacAdmin.jsp" %>

<h4>Listado de pacientes</h4>
<table class="table table-hover" id="Table">
<tr>
<th class="col-lg-2">DNI</th>
<th class="col-lg-3">Nombre</th>
<th class="col-lg-3">Apellido</th>
<th class="col-lg-1">Edad</th>
<th class="col-lg-3">Estado</th>
</tr>

<c:forEach items = "${paciente_list}" var="pacientei">
<tr>
<td>${pacientei.dni}</td>
<td>${pacientei.name}</td>
<td>${pacientei.apellido}</td>
<td>${pacientei.edad}</td>
<td>${pacientei.status}</td>

</tr>
</c:forEach>

</table>

<h3>Formulario de creación de Médicos</h3>
<%@ include file = "FormNuevoMedAdmin.jsp" %>

<h4>Listado de médicos</h4>
<table class="table table-hover" id="Table" >
<tr>
<th>Identificación</th>
<th>Nombre</th>
<th>Especialidad</th>
<th>Email</th>

</tr>

<c:forEach items = "${medico_list}" var="medicoi">
<tr>
<td>${medicoi.dni}</td>
<td>${medicoi.name}</td>
<td>${medicoi.especialidad}</td>
<td>${medicoi.email}</td>
</tr>
</c:forEach>

</table>

<form action = "LogoutServlet">
<button type = "submit">Cerrar sesión</button>
</form>
    </div>
  </section>
  <!--/ doctor team-->

    </div>
  </section>
  <!--/ banner-->
	<script>
	//DataTable
	//DataTable
	var aTable = $('#Tabla');
	aTable.DataTable( {
        "scrollX": true,
        "ordering": false, 
        "searching": false,
        "aLengthMenu": [[5, 10, 25, -1], [5, 10, 25, "Todas"]],
        "pageLength": 52,
        "paging": true,
        "orderClasses": false,
    } );
	
	aTable.DataTable().page.len(5).draw();


	</script>
</body>

</html>