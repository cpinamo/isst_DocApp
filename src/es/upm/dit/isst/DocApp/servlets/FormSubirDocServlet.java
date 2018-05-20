package es.upm.dit.isst.DocApp.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



import es.upm.dit.isst.DocApp.dao.CitaDAOImplementation;
import es.upm.dit.isst.DocApp.dao.MedicoDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Cita;
import es.upm.dit.isst.DocApp.dao.model.Medico;


@WebServlet("/FormSubirDocServlet")
@MultipartConfig
public class FormSubirDocServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		
		Part filePart = req.getPart("file");
		InputStream fileContent = filePart.getInputStream();
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buffer = new byte[10240];
		List<Cita> citasMedico = new ArrayList<>();
		Cita cita = new Cita();
		
		
		for (int length = 0; (length = fileContent.read(buffer)) > 0;) 
			output.write(buffer, 0, length);
		
//		Cita cita = (Cita)req.getSession();

		String citasId = req.getParameter("citaId");
		Medico medico = (Medico) req.getSession().getAttribute("medico"); 
		
		
		System.out.println("==============");
		System.out.println(citasId);
		System.out.println("==============");
		
//		System.out.println("\n \n \n \n \n");
//		System.out.println(medico);
		
		citasMedico = medico.getCitasMedico();
		
		for(Cita cit : citasMedico) {
			if(cit.getId() == Integer.parseInt(citasId)){
				cita=cit;
			}
		}
		
		
		cita.setDocument(output.toByteArray()); //hay que pensarlo 
		
		cita.setStatus(5); //habrá que cambiar los estados añadiendo uno por medio para que el estado de subir los documentos sea ese único
		CitaDAOImplementation.getInstance().updateCita(cita);
		
		resp.sendRedirect(req.getContextPath() + "/LoginMedico.jsp");
	}
		
		
		
	}
