package es.upm.dit.isst.DocApp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.upm.dit.isst.DocApp.dao.PacienteDAOImplementation;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

@WebServlet("/FormRegistroPacienteServlet")
public class FormRegistroPacienteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	resp.sendRedirect(req.getContextPath() + "/FormRegistroPaciente.jsp");
	}

}
