<form action = "FormNuevoMedAdminServlet">

<input class="col-lg-4" type = "text" name= "name" placeholder = "Nombre"/>
<select class="col-lg-offset-1 col-lg-4" name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Alergolog�a">Alergolog�a</option>
		<option value = "Cardiolog�a">Cardiolog�a</option>
		<option value = "Dermatolog�a">Dermatolog�a</option>
		<option value = "Fisioterapia">Fisioterapia</option>
		<option value = "Ginecolog�a">Ginecolog�a</option>
		<option value = "Hematolog�a">Hematolog�a</option>
		<option value = "Neumolog�a">Neumolog�a</option>
		<option value = "Neurolog�a">Neurolog�a</option>
		<option value = "Oftalmolog�a">Oftalmolog�a</option>
		<option value = "Psicolog�a">Psicolog�a</option>
		<option value = "Traumatolog�a">Traumatolog�a</option>
		<option value = "Urolog�a">Urolog�a</option>
</select>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contrase�a"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo m�dico </button>

<p>Date: <input type="text" id="datepicker" name="datepicker"></p>
<br><br>

</form>