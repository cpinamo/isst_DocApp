package es.upm.dit.isst.DocApp.dao;

import java.util.List;

import es.upm.dit.isst.DocApp.dao.model.Paciente;

public interface PacienteDAO {

	public Paciente loginPaciente( String email, String password );
    
	public List<Paciente> readAllPaciente();
	                
	public void createPaciente( Paciente paciente );

	public Paciente readPaciente( String email );

	public void updatePaciente( Paciente paciente );

	public void deletePaciente( Paciente paciente );

}
