<form action = "FormNuevoMedAdminServlet">

<input class="col-lg-4" type = "text" name= "name" placeholder = "Nombre"/>
<select class="col-lg-offset-1 col-lg-4" name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Alergología">Alergología</option>
		<option value = "Cardiología">Cardiología</option>
		<option value = "Dermatología">Dermatología</option>
		<option value = "Fisioterapia">Fisioterapia</option>
		<option value = "Ginecología">Ginecología</option>
		<option value = "Hematología">Hematología</option>
		<option value = "Neumología">Neumología</option>
		<option value = "Neurología">Neurología</option>
		<option value = "Oftalmología">Oftalmología</option>
		<option value = "Psicología">Psicología</option>
		<option value = "Traumatología">Traumatología</option>
		<option value = "Urología">Urología</option>
</select>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contraseña"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo médico </button>

<p>Date: <input type="text" id="datepicker" name="datepicker"></p>
<br><br>

</form>