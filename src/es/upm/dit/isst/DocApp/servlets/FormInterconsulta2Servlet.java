package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/FormInterconsulta2Servlet")
public class FormInterconsulta2Servlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String paciente = req.getParameter("paciente");
		req.getSession().setAttribute("paciente", paciente);
		
		String especialidad = req.getParameter("especialidades");
		List<Medico> medico_list = MedicoDAOImplementation.getInstance().readAllMedico();
		req.getSession().setAttribute("medico_list", medico_list);
		List<Medico> medico_especial = new ArrayList<>();
		
		for (Medico med : medico_list) {
			if (med.getEspecialidad().equals(especialidad)) {
				medico_especial.add(med);
			}
		}
		
		req.getSession().setAttribute("medico_especial", medico_especial);
		resp.sendRedirect(req.getContextPath() + "/FormInterconsulta3.jsp");
		
		
		
	}

}
