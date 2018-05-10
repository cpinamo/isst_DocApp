package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/Form4CitaServlet")
public class Form4CitaServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String hora = req.getParameter("hora");
		String fecha = req.getParameter("fecha");
	

		System.out.println("fechaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");

		System.out.println(fecha);
		
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		
		
		
		//String Medico = req.getParameter("")
		
		Cita cita = new Cita();
		
		cita.setDia(fecha);
		cita.setHora(hora);
	

		System.out.println("citaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println(cita.getHora());
		System.out.println(cita.getDia());
		System.out.println("citaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		
		CitaDAOImplementation.getInstance().createCita(cita);
		resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
		
	
		
	
		
		
		
		
		
	
	}
	

}
