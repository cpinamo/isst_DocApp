package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/FormReprogramar2Servlet")
public class FormReprogramar2Servlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String fecha = req.getParameter("datepicker");
		req.getSession().setAttribute("fecha", fecha);
		
		String citaId = req.getParameter("citaId");
		req.getSession().setAttribute("citaId", citaId);
		
		Cita cita = CitaDAOImplementation.getInstance().readCita(citaId);
		Medico doctor = cita.getMedicoCita();
		req.getSession().setAttribute("medico", doctor);
		
		List<Cita> citas_list = CitaDAOImplementation.getInstance().readAllCita();
		req.getSession().setAttribute("citas_list", citas_list);

		List<Cita> citas_doctor = new ArrayList<>();
		List<String> horas_doctor = new ArrayList<>();
		List<String> horas_disponibles = new ArrayList<>();
		horas_disponibles.add("9:00");
		horas_disponibles.add("10:00");
		horas_disponibles.add("11:00");
		horas_disponibles.add("12:00");
		horas_disponibles.add("13:00");
		horas_disponibles.add("14:00");
		horas_disponibles.add("15:00");
		horas_disponibles.add("16:00");
		horas_disponibles.add("17:00");

		if (citas_list.size() != 0) {
			for (Cita cit : citas_list) {
				if(cit.getMedicoCita().getEmail().equals(doctor.getEmail()) && cit.getDia().equals(fecha))	{
					System.out.println("ha entrado");
					citas_doctor.add(cit);
				}
			}
		}
		
		if (citas_doctor.size() != 0) {
			for (Cita cit: citas_doctor) {
				String hora = cit.getHora();
				horas_doctor.add(hora);
			}
		}
		
		if (horas_doctor.size() != 0) {
			for (String hor: horas_doctor) {
					horas_disponibles.remove(hor);
			}
		}
		
		
		req.getSession().setAttribute("citas_doctor", citas_doctor);
		req.getSession().setAttribute("horas_doctor", horas_doctor);
		req.getSession().setAttribute("horas_disponibles", horas_disponibles);
		
		
		
		resp.sendRedirect(req.getContextPath() + "/FormReprogramar3.jsp");
		
		
	
	}

}
