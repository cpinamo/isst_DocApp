package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/Form1CitaServlet")
public class Form1CitaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Medico> medicos = MedicoDAOImplementation.getInstance().readAllMedico();
		req.getSession().setAttribute("medico_list", medicos);
		String paciente = req.getParameter("paciente");
		req.getSession().setAttribute("paciente", paciente);
		resp.sendRedirect(req.getContextPath() + "/Form2Paciente.jsp");
	}
}