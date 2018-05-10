package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/FormNuevosDatosServlet")
public class FormNuevosDatosServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Compruebo los datos con los que tenia guardados
		String emailIntroducido = req.getParameter("email");
		String dniIntroducido = req.getParameter("dni");
		String passwordIntroducido = req.getParameter("password");
		String password2Introducido = req.getParameter("password2");

		Integer dni2 = Integer.parseInt(dniIntroducido);

		List<Paciente> paciente_list = PacienteDAOImplementation.getInstance().readAllPaciente();
		req.getSession().setAttribute("paciente_list", paciente_list);
		List<Medico> medico_list = MedicoDAOImplementation.getInstance().readAllMedico();
		req.getSession().setAttribute("medico_list", medico_list);

		for (Paciente p : paciente_list) {
			if (passwordIntroducido.equals(password2Introducido)) {
				if (p.getEmail().equals(emailIntroducido)) {
					if (p.getDni() == dni2) {
						p.setPassword(passwordIntroducido);
						PacienteDAOImplementation.getInstance().updatePaciente(p);
					}
				}
			}
		}
		for (Medico m : medico_list) {
			if (passwordIntroducido.equals(password2Introducido)) {
				if (m.getEmail().equals(emailIntroducido)) {
					if (m.getDni() == dni2) {
						m.setPassword(passwordIntroducido);
						MedicoDAOImplementation.getInstance().updateMedico(m);
					}
				}
			}
		}
		resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
	}
}
