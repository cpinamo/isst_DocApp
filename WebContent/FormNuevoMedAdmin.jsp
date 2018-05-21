<form action = "FormNuevoMedAdminServlet">

<c:if test="${alerta5}">
		<li><p style="color:red;">El DNI es incorrecto</p></li>
		<% session.setAttribute("alerta5", false); %>
</c:if>
<c:if test="${alerta6}">
		<li><p style="color:red;">El email no esta disponible</p></li>
		<% session.setAttribute("alerta6", false); %>
</c:if>

<input class="col-lg-4" type = "text" name= "name" placeholder = "Nombre"/>
<select class="col-lg-offset-1 col-lg-4" name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Alergologia">Alergología</option>
		<option value = "Cardiologia">Cardiología</option>
		<option value = "Dermatologia">Dermatología</option>
		<option value = "Fisioterapia">Fisioterapia</option>
		<option value = "Ginecologia">Ginecología</option>
		<option value = "Hematologia">Hematología</option>
		<option value = "Neumologia">Neumología</option>
		<option value = "Neurologia">Neurología</option>
		<option value = "Oftalmologia">Oftalmología</option>
		<option value = "Psicologia">Psicología</option>
		<option value = "Traumatologia">Traumatología</option>
		<option value = "Urologia">Urología</option>
</select>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contraseña"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo médico </button>

<br><br>

</form>