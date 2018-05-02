package es.upm.dit.isst.DocApp.dao;

import java.util.List;

import es.upm.dit.isst.DocApp.dao.model.Medico;

public interface MedicoDAO {

	public Medico loginMedico( String email, String password );
    
	public List<Medico> readAllMedico();
	                
	public void createMedico( Medico medico );

	public Medico readMedico( String email );

	public void updateMedico( Medico medico );

	public void deleteMedico( Medico medico );
}
