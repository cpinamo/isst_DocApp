package es.upm.dit.isst.DocApp.servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormBajaServlet
 */
@WebServlet("/FormBajaServlet")
public class FormBajaServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		resp.sendRedirect(req.getContextPath() + "/Form3Paciente.jsp");
	}

}
