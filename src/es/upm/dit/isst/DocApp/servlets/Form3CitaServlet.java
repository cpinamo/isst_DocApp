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
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Paciente;


@WebServlet("/Form3CitaServlet")
public class Form3CitaServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		String medico = req.getParameter("doctorCita");
		Medico doctor = MedicoDAOImplementation.getInstance().readMedico(medico);
		
		List<Cita> citas_list = CitaDAOImplementation.getInstance().readAllCita();
		req.getSession().setAttribute("citas_list", citas_list);
		
		
		List<Cita> citas_doctor = new ArrayList<>();
		List<String> horas_doctor = new ArrayList<>();
		List<String> horas_doctor_disponibles = new ArrayList<>();
		horas_doctor_disponibles.add("9:00");
		

		System.out.println("Comprobacion");
		System.out.println(citas_list.size());
		if(citas_list.size() != 0) {
			//for (Cita cit: citas_list) {
				//CitaDAOImplementation.getInstance().deleteCita(cit);
//				System.out.println("--------------------");
//				System.out.println(doctor);
//				System.out.println(cit.toString());
//				//System.out.println(med.getName());
//				System.out.println("--------------------");
//				if (cit.getMedicoCita().equals(doctor) ) {
//					System.out.println("ha entrado");
//					citas_doctor.add(cit);
//					
//				}
			//}
		req.getSession().setAttribute("citas_doctor", citas_doctor);
		req.getSession().setAttribute("horas_doctor_disponibles", horas_doctor_disponibles);

		
		
		//for (Cita cit: citas_doctor) {
			//for (int i = 1; i<32; i++) {
				//for(int j=9; j<20; j++) {
				
			//System.out.println("Comprobacion");
			//System.out.println(cit.getEspecialidad());
			//System.out.println(especialidad);
			//System.out.println(med.getName());
			//System.out.println("--------------------");
		
				//if ((Integer.parseInt(cit.getDia()) != i) && (Integer.parseInt(cit.getHora()) != i)){
					
				//}
				//System.out.println("ha entrado");
				
				
				
			//}
		//}
		
		resp.sendRedirect(req.getContextPath() + "/Form3Cita.jsp");
	}
	
	
	
}
}


