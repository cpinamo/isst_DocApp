<form action = "FormNuevoPacAdminServlet">

<c:if test="${alerta3}">
		<li><p style="color:red;">El DNI es incorrecto</p></li>
		<% session.setAttribute("alerta3", false); %>
</c:if>
<c:if test="${alerta4}">
		<li><p style="color:red;">El email no est� disponible</p></li>
		<% session.setAttribute("alerta4", false); %>
</c:if>
  
<input class="col-lg-3" type = "text" name= "name" placeholder = "Nombre"/>
<input class="col-lg-offset-1 col-lg-5" type = "text" name= "apellido" placeholder = "Apellidos"/>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>

<input class="col-lg-6" type = "text" name= "domicilio" placeholder = "Direcci�n Completa"/>
<input class="col-lg-offset-1 col-lg-1" type = "number" name= "edad" placeholder = "Edad"/>
<input class="col-lg-offset-1 col-lg-3" type = "number" name= "movil" placeholder = "N�mero de tel�fono"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contrase�a"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo paciente </button>
<br><br>

</form>
