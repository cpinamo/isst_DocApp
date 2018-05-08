package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;

@WebServlet("/Form4CitaServlet")
public class Form4CitaServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
		String dia = req.getParameter("dia");
		String hora = req.getParameter("hora");
		//String Medico = req.getParameter("")
		
		Cita cita = new Cita();
		
		cita.setDia(dia);
		cita.setHora(hora);
		//cita.setMedicoCita();
		
		CitaDAOImplementation.getInstance().createCita(cita);
		resp.sendRedirect(req.getContextPath() + "/FormLogin.jsp");
		
		System.out.println(cita.getHora());
		System.out.println(cita.getDia());
		
		
		
		
	
	}
	

}
