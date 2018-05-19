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
				<h2>Vista del Médico</h2>
				<br>
				<p>DNI: ${medico.dni }</p>
				<p>Nombre: ${medico.name }</p>
				<p>Email: ${medico.email }</p>
				<p>Especialidad: ${medico.especialidad }</p>
				<br>
				<table class="table table-hover Table">
					<thead>
						<tr>
							<th class="col-lg-2">DÍA</th>
							<th class="col-lg-1">HORA</th>
							<th class="col-lg-2">PACIENTE</th>
							<th class="col-lg-1">ID CITA</th> 
							<th class="col-lg-2">INFO CONSULTA</th>
							<th class="col-lg-2">Informar de retraso</th>
							<th class="col-lg-2">Pedir interconsulta</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${citasMedico}" var="citasi">
							<tr>
								<td>${citasi.dia}</td>
								<td>${citasi.hora}</td>
								<td>${citasi.pacienteCita.getName()}</td>
								<td>${citasi.id}</td>
								
								<td>
								<c:if test="${citasi.status == 1}">
								Paciente no ha asistido
								</c:if>
								<c:if test="${citasi.status == 2}">
									<%@  include file= "FormEmpezarConsulta.jsp" %>
								</c:if>
								<c:if test="${citasi.status == 3}">
									<%@  include file= "FormEmpezarConsulta.jsp" %>
								</c:if>
								<c:if test="${citasi.status == 4}">
									<%@  include file= "FormTerminarConsulta.jsp" %>
								</c:if>
								</td>
								<td>
								<c:if test="${citasi.status == 2}">
									<%@  include file= "FormInfoRetraso.jsp" %>
								</c:if>
								<c:if test="${citasi.status == 3}">
									Paciente informado
								</c:if>
								</td>
								<td>
								<c:if test="${citasi.status == 4}">
									<%@  include file= "FormInterconsulta.jsp" %>
								</c:if>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			</section>
		</div>
	</section>
	<script>
		//DataTable
		$(document).ready(function() {
			var aTable = $('.Table').DataTable({
				"scrollY" : true,
				"ordering" : true,
				"searching" : true,
				"aLengthMenu" : [ [ 5, 10, 25, -1 ], [ 5, 10, 25, "Todas" ] ],
				"pageLength" : 10,
				"paging" : true,
				"orderClasses" : false,
				 "language": {
			            "lengthMenu": "Mostrando _MENU_ entradas por página",
			            "zeroRecords": "No se ha encontrado nada - sorry",
			            "info": "Mostrando _PAGE_ de _PAGES_",
			            "infoEmpty": "No existe el escenario",
			            "sProcessing":     "Procesando...",
			            "sLengthMenu":     "Mostrar _MENU_ registros",
			            "sZeroRecords":    "No se encontraron resultados",
			            "sEmptyTable":     "Ningún dato disponible en esta tabla",
			            "sInfo":           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			            "sInfoEmpty":      "Mostrando registros del 0 al 0 de un total de 0 registros",
			            "sInfoFiltered":   "(filtrado de un total de _MAX_ registros)",
			            "sInfoPostFix":    "",
			            "sSearch":         "Buscar:",
			            "sUrl":            "",
			            "sInfoThousands":  ",",
			            "sLoadingRecords": "Cargando...",
			            "oPaginate": {
			                "sFirst":    "Primero",
			                "sLast":     "Último",
			                "sNext":     "Siguiente",
			                "sPrevious": "Anterior"
			            },
			            "oAria": {
			                "sSortAscending":  ": Activar para ordenar la columna de manera ascendente",
			                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
			            }
			        }
			});
		});
		</script>
	<!--footer-->
	<footer id="footer"> <%@ include file="Templates/Footer3.html"%>
	</footer>
	<!--/ footer-->
	<%@ include file="Templates/Imports.html"%>
</body>
</html>