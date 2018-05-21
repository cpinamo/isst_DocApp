<form action = "FormSubirDocServlet" method = "post" enctype = "multipart/form-data">
	<input type = "file" name = "file" />
	<input type = "hidden" name= "citaId" value= "${ citasi.id }" />
	<button type = "submit">Subir Informe</button>
</form>

