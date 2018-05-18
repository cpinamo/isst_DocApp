package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;

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
		
		CitaDAOImplementation.getInstance().updateCita(cita);
		
		req.getSession().setAttribute("cita_list", CitaDAOImplementation.getInstance().readAllCita());
		resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
		
		
	
	}

}
