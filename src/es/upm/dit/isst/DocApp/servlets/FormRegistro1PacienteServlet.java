package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/FormRegistro1PacienteServlet")
public class FormRegistro1PacienteServlet extends HttpServlet{

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

	resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
	}
}
