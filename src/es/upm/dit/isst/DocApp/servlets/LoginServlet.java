package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private final String USER_ADMINISTRACION = "root";
	private final String PASS_ADMINISTRACION = "root";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Date ahora = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
	    String fecha = formateador.format(ahora);
	    
	    
	    System.out.println(fecha);

		Paciente paciente = PacienteDAOImplementation.getInstance().loginPaciente(email, password);
		Medico medico = MedicoDAOImplementation.getInstance().loginMedico(email, password);

		if (USER_ADMINISTRACION.equals(email) && PASS_ADMINISTRACION.equals(password)) {
			req.getSession().setAttribute("paciente_list", PacienteDAOImplementation.getInstance().readAllPaciente());
			req.getSession().setAttribute("medico_list", MedicoDAOImplementation.getInstance().readAllMedico());
			resp.sendRedirect(req.getContextPath() + "/LoginAdministracion.jsp");
		} else if (null != paciente) {
			req.getSession().setAttribute("fecha", fecha);
			req.getSession().setAttribute("paciente", paciente);
			req.getSession().setAttribute("citasPaciente", paciente.getCitasPaciente());
			resp.sendRedirect(req.getContextPath() + "/LoginPaciente.jsp");
		} else if (null != medico) {
			req.getSession().setAttribute("medico", medico);
			req.getSession().setAttribute("citasMedico", medico.getCitasMedico());
			resp.sendRedirect(req.getContextPath() + "/LoginMedico.jsp");
		} else {
			resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
		}
	}
}