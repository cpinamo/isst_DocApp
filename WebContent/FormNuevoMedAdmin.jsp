<form action = "FormNuevoMedAdminServlet">

<input type = "text" name= "name" placeholder = "Nombre"/>
<select name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Pediatria">Pediatría</option>
		<option value = "Traumatologia">Traumatología</option>
		<option value = "Neurologia">Neurología</option>
		<option value = "Urologia">Urología</option>
</select>
<input type = "text" name= "email" placeholder = "Email"/>
<input type = "number" name= "dni" placeholder = "DNI"/>
<input type = "password" name= "password" placeholder = "Contraseña"/>

<input type="submit"> Crear nuevo médico </input>

</form>