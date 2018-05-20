<form action = "FormRegistro1PacienteServlet">

  <c:if test="${alerta}">
		<li><p style="color:red;">El DNI es incorrecto</p></li>
		<% session.setAttribute("alerta", false); %>
</c:if>
<c:if test="${alerta2}">
		<li><p style="color:red;">El email no está disponible</p></li>
		<% session.setAttribute("alerta2", false); %>
</c:if>
  
<input class="col-lg-3" type = "text" name= "name" placeholder = "Nombre"/>
<input class="col-lg-offset-1 col-lg-5" type = "text" name= "apellido" placeholder = "Apellidos"/>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>	

<input class="col-lg-6" type = "text" name= "domicilio" placeholder = "Dirección Completa"/>
<input class="col-lg-offset-1 col-lg-1" type = "number" name= "edad" placeholder = "Edad"/>
<input class="col-lg-offset-1 col-lg-3" type = "number" name= "movil" placeholder = "Número de teléfono"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contraseña"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo paciente </button>

</form>
