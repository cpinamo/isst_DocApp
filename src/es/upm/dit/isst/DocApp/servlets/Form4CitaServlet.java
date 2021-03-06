package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/Form4CitaServlet")
public class Form4CitaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String hora = req.getParameter("hora");
		String fecha = req.getParameter("fecha");
		String medico = req.getParameter("medico");
		String paciente = req.getParameter("paciente");
		int dni = Integer.parseInt(paciente);
		Medico doctor = MedicoDAOImplementation.getInstance().readMedico(medico);
		Paciente pacientePersona = PacienteDAOImplementation.getInstance().readPaciente(dni);
		
		Date ahora = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
	    String dia = formateador.format(ahora);
		

		Cita cita = new Cita();
		cita.setDia(fecha);
		cita.setHora(hora);
		cita.setMedicoCita(doctor);
		cita.setPacienteCita(pacientePersona);
		cita.setStatus(1);
		


		CitaDAOImplementation.getInstance().createCita(cita);
		Paciente pacienteCita = cita.getPacienteCita();
		pacienteCita.getCitasPaciente().add(cita);
		
		req.getSession().setAttribute("cita", cita);
		
		req.getSession().setAttribute("cita_list", CitaDAOImplementation.getInstance().readAllCita());
		req.getSession().setAttribute("paciente", pacienteCita);
		req.getSession().setAttribute("citasPaciente", pacienteCita.getCitasPaciente());
		req.getSession().setAttribute("fecha", dia);
		resp.sendRedirect(req.getContextPath() + "/LoginPaciente.jsp");
	}
}
