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

@WebServlet("/FormReprogramar1Servlet")
public class FormReprogramar1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String citaId = req.getParameter("citaId");
		
		
		Cita cita = CitaDAOImplementation.getInstance().readCita(citaId);
		
		req.getSession().setAttribute("citaId", citaId);
		
		
		resp.sendRedirect(req.getContextPath() + "/FormReprogramar2.jsp");
	}
	
}
