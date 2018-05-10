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

@WebServlet("/FormDarseDeBajaServlet")
public class FormDarseDeBajaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String dniIntroducido = req.getParameter("dni");
		String passwordIntroducido = req.getParameter("password");
		List<Paciente> paciente_list = PacienteDAOImplementation.getInstance().readAllPaciente();
		req.getSession().setAttribute("paciente_list", paciente_list);
		Integer dni2 = Integer.parseInt(dniIntroducido);
		for (Paciente p : paciente_list) {
			if ((p.getDni() == dni2) && (p.getPassword().equals(passwordIntroducido))) {
				PacienteDAOImplementation.getInstance().deletePaciente(p);
				resp.sendRedirect(req.getContextPath() + "/Form1DarseDeBaja.jsp");
			} else {
				resp.sendRedirect(req.getContextPath() + "/Form4Paciente.jsp");
			}
		}
	}
}