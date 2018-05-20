package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/FormNuevoPacAdminServlet")
public class FormNuevoPacAdminServlet extends HttpServlet {

	private Boolean alerta3=false;
	private Boolean alerta4=false;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String apellido = req.getParameter("apellido");
		String edad = req.getParameter("edad");
		String movil = req.getParameter("movil");
		String dni = req.getParameter("dni");
		String domicilio = req.getParameter("domicilio");

		List<Paciente> paciente_list = PacienteDAOImplementation.getInstance().readAllPaciente();
		
		for (Paciente pac : paciente_list) {
			if(pac.getDni()==Integer.parseInt(dni))	{
				alerta3 = true;
			}
			else {
				alerta3=false;
			}
		}
		for (Paciente pac : paciente_list) {
			if(pac.getEmail().equals(email))	{
				alerta4 = true;
			}
			else {
				alerta4=false;
			}
		}
		
		if (alerta3==true || alerta4==true) {
			req.getSession().setAttribute("alerta3", alerta3);
			req.getSession().setAttribute("alerta4", alerta4);	
			resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
		}
		else {
		
		Paciente paciente = new Paciente();
		paciente.setEmail(email);
		paciente.setName(name);
		paciente.setPassword(password);
		paciente.setApellido(apellido);
		paciente.setEdad(Integer.parseInt(edad));
		paciente.setMovil(Integer.parseInt(movil));
		paciente.setDni(Integer.parseInt(dni));
		paciente.setDomicilio(domicilio);

		PacienteDAOImplementation.getInstance().createPaciente(paciente);

		req.getSession().setAttribute("paciente_list", PacienteDAOImplementation.getInstance().readAllPaciente());
		resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
		}
	}
}
