package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/FormNuevoMedAdminServlet")
public class FormNuevoMedAdminServlet extends HttpServlet {

	private Boolean alerta5 = false;
	private Boolean alerta6 = false;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String dni = req.getParameter("dni");
		String especialidad = req.getParameter("especialidades");

		List<Medico> medico_list = MedicoDAOImplementation.getInstance().readAllMedico();
		List<Paciente> paciente_list = PacienteDAOImplementation.getInstance().readAllPaciente();

		
		for (Medico med : medico_list) {
			if(med.getDni()==Integer.parseInt(dni))	{
				alerta5 = true;
			}
			else {
				alerta5 = false;
			}
		}
		
		for (Medico med : medico_list) {
			if(med.getEmail().equals(email))	{
				alerta6 = true;
			}
			else {
				alerta6 = false;
			}
		}
		for (Paciente pac : paciente_list) {
			if(pac.getDni()==Integer.parseInt(dni))	{
				alerta5 = true;
			}
			else {
				alerta5=false;
			}
		}
		for (Paciente pac : paciente_list) {
			if(pac.getEmail().equals(email))	{
				alerta6 = true;
			}
			else {
				alerta6=false;
			}
		}
		
		if (alerta5==true || alerta6==true) {
			req.getSession().setAttribute("alerta5", alerta5);
			req.getSession().setAttribute("alerta6", alerta6);	
			resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
		}
		else {
			Medico medico = new Medico();
			medico.setEmail(email);
			medico.setName(name);
			medico.setPassword(password);
			medico.setDni(Integer.parseInt(dni));
			medico.setEspecialidad(especialidad);
	
			MedicoDAOImplementation.getInstance().createMedico(medico);
			req.getSession().setAttribute("medico_list", MedicoDAOImplementation.getInstance().readAllMedico());
			resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
		}
	}

}
