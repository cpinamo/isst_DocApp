<form action = "FormNuevoMedAdminServlet">

<input class="col-lg-4" type = "text" name= "name" placeholder = "Nombre"/>
<select class="col-lg-offset-1 col-lg-4" name="especialidades">
	<option value="" disabled selected>Elija una especialidad</option>
		<option value = "Alergologia">Alergolog�a</option>
		<option value = "Cardiologia">Cardiolog�a</option>
		<option value = "Dermatologia">Dermatolog�a</option>
		<option value = "Fisioterapia">Fisioterapia</option>
		<option value = "Ginecologia">Ginecolog�a</option>
		<option value = "Hematologia">Hematolog�a</option>
		<option value = "Neumologia">Neumolog�a</option>
		<option value = "Neurologia">Neurolog�a</option>
		<option value = "Oftalmologia">Oftalmolog�a</option>
		<option value = "Psicologia">Psicolog�a</option>
		<option value = "Traumatologia">Traumatolog�a</option>
		<option value = "Urologia">Urolog�a</option>
</select>
<input class="col-lg-offset-1 col-lg-2" type = "number" name= "dni" placeholder = "DNI"/>
<br><br>

<input class="col-lg-4" type = "email" name= "email" placeholder = "Email"/>
<input class="col-lg-offset-1 col-lg-2" type = "password" name= "password" placeholder = "Contrase�a"/>
<button class="col-lg-offset-1 col-lg-4" type="submit"> Crear nuevo m�dico </button>

<p>Date: <input type="text" id="datepicker" name="datepicker"></p>
<br><br>

</form>