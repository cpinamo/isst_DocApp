<form action = "FormNuevoMedAdminServlet">

<input type = "text" name= "name" placeholder = "Nombre"/>
<select name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Pediatria">Pediatr�a</option>
		<option value = "Traumatologia">Traumatolog�a</option>
		<option value = "Neurologia">Neurolog�a</option>
		<option value = "Urologia">Urolog�a</option>
</select>
<input type = "text" name= "email" placeholder = "Email"/>
<input type = "number" name= "dni" placeholder = "DNI"/>
<input type = "password" name= "password" placeholder = "Contrase�a"/>

<input type="submit"> Crear nuevo m�dico </input>

</form>