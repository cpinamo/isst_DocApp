package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/FormNuevoMedAdminServlet")
public class FormNuevoMedAdminServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

	String email = req.getParameter("email");
	String name = req.getParameter("name");
	String password = req.getParameter("password");
	String dni = req.getParameter("dni");
	String especialidad = req.getParameter("especialidad");
		
	Medico medico = new Medico();
	medico.setEmail(email);
	medico.setName(name);
	medico.setPassword(password);
	medico.setDni(Integer.parseInt(dni));
	medico.setEspecialidad(especialidad);

	MedicoDAOImplementation.getInstance().createMedico(medico);

	resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
	}

	
}
