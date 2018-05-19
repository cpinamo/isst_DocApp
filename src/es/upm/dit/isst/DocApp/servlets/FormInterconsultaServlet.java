package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Paciente;


@WebServlet("/FormInterconsultaServlet")
public class FormInterconsultaServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String citaId = req.getParameter("citaId");
		String medico = req.getParameter("medico");
	
		req.getSession().setAttribute("medico", medico);
		
		
		Cita cita = CitaDAOImplementation.getInstance().readCita(citaId);
		
		Paciente pacienteCita = cita.getPacienteCita();
		
		int paciente = pacienteCita.getDni();
		
		
		
		req.getSession().setAttribute("paciente", paciente);
		
		
		
		resp.sendRedirect(req.getContextPath() + "/FormInterconsulta2.jsp");
	}
	
}
