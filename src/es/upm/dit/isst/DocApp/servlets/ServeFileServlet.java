package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.CitaDAO;
import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;

@WebServlet("/ServeFileServlet")
public class ServeFileServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//CitaDAO dao = CitaDAOImplementation.getInstance();

		List<Cita> citasMedico = new ArrayList<>();
		Cita cita = new Cita();
		String citasId = req.getParameter("citasId");
		
		System.out.println("==============");
		System.out.println(citasId);
		System.out.println("==============");
		
		
		Medico medico = (Medico) req.getSession().getAttribute("medico");
		
		citasMedico = medico.getCitasMedico();
		for(Cita cit : citasMedico) {
			if(cit.getId() == Integer.parseInt(citasId)){
				cita=cit;
			}
		}
			
		resp.setContentLength(cita.getDocument().length);
		resp.getOutputStream().write(cita.getDocument());
		
		
		/*
		Cita cita = (Cita) req.getSession().getAttribute("cita"); //hay que pensarlo mas
		
		resp.setContentLength(cita.getDocument().length);
		resp.getOutputStream().write(tfg.getDocument());
		*/
		
		
	}
}
