package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAO;
import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/FormTerminarConsultaServlet")
public class FormTerminarConsultaServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	String citaId = req.getParameter("citaId");
	CitaDAO dao = CitaDAOImplementation.getInstance();
	
	Cita cita = dao.readCita(citaId);
	cita.setStatus(5);
	dao.updateCita(cita);
	
	Medico medico = cita.getMedicoCita();
	req.getSession().setAttribute("medico", medico);
	req.getSession().setAttribute("citasMedico", medico.getCitasMedico());
	resp.sendRedirect(req.getContextPath() + "/LoginMedico.jsp");
	
	}
	
}
