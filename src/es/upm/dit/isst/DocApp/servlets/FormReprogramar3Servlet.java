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

@WebServlet("/FormReprogramar3Servlet")
public class FormReprogramar3Servlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String hora = req.getParameter("hora");
		String fecha = req.getParameter("fecha");
		String citaId = req.getParameter("citaId");
		
		Cita cita = CitaDAOImplementation.getInstance().readCita(citaId);
		
		
		
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println(cita);
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		System.out.println("----------------------");
		
		
		cita.setHora(hora);
		cita.setDia(fecha);
		
		Paciente pacienteCita = cita.getPacienteCita();
		pacienteCita.getCitasPaciente().remove(cita);
		
		CitaDAOImplementation.getInstance().updateCita(cita);
		pacienteCita.getCitasPaciente().add(cita);
		
		req.getSession().setAttribute("cita", cita);
	
		
		req.getSession().setAttribute("cita_list", CitaDAOImplementation.getInstance().readAllCita());
		req.getSession().setAttribute("paciente", pacienteCita);
		req.getSession().setAttribute("citasPaciente", pacienteCita.getCitasPaciente());
		resp.sendRedirect(req.getContextPath() + "/LoginPaciente.jsp");
		
	
	}

}
