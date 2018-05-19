package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAO;
import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Paciente;



@WebServlet("/FormAsistenciaPacServlet")
public class FormAsistenciaPacServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	String citaId = req.getParameter("citaId");
	CitaDAO dao = CitaDAOImplementation.getInstance();
	
	Cita cita = dao.readCita(citaId);
	cita.setStatus(2);
	dao.updateCita(cita);
	
	Paciente paciente = cita.getPacienteCita();
	req.getSession().setAttribute("paciente", paciente);
	req.getSession().setAttribute("citasPaciente", paciente.getCitasPaciente());
	resp.sendRedirect(req.getContextPath() + "/LoginPaciente.jsp");
	
	}
	
}
