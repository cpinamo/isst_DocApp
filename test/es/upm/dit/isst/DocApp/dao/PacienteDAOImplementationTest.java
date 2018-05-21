package es.upm.dit.isst.DocApp.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.upm.dit.isst.DocApp.dao.model.Medico;
import es.upm.dit.isst.DocApp.dao.model.Paciente;

public class PacienteDAOImplementationTest {

	private Medico medico;
	private Paciente paciente;
	
	@Before
	public void setUp() throws Exception {
		
		medico = new Medico();
		medico.setEspecialidad("especialidad1");
		medico.setEmail("medico@medico");
		medico.setPassword("medico");
		medico.setName("medico1");
		medico.setDni(3108);
		
		paciente = new Paciente();
		paciente.setName("paciente");
		paciente.setEmail("paciente@paciente");
		paciente.setPassword("paciente");
		paciente.setApellido("paciente");
		paciente.setDni(1791);
		paciente.setDomicilio("domicilio");
		paciente.setEdad(22);
		paciente.setMovil(684105825);

		
		PacienteDAOImplementation.getInstance().createPaciente(paciente);
	
		MedicoDAOImplementation.getInstance().createMedico(medico);
		
	}

	@After
	public void tearDown() throws Exception {
		MedicoDAOImplementation.getInstance().deleteMedico(medico);
		PacienteDAOImplementation.getInstance().deletePaciente(paciente);
		paciente =null;
		medico = null;
	}

	@Test
	public void testGetInstance() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoginPaciente() {
	/*
		 PacienteDAO dao = PacienteDAOImplementation.getInstance();
		
		Paciente paciente6 = new Paciente();
		paciente6.setEmail( "paciente@paciente");
		paciente6.setPassword("7788");
		paciente6.setName("Carlos");

		//paciente.getEmail();
		String password = "7788";//paciente.getPassword();
		String email = "paciente@paciente";
		
		Paciente paciente7 = dao.loginPaciente(email, password);*/
		
		fail("Not yet implemented");
		
	}

	@Test
	public void testReadAllPaciente() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreatePaciente() {
		
		PacienteDAO dao = PacienteDAOImplementation.getInstance();

		Paciente paciente2 = new Paciente();
		paciente2.setName("paciente1");
		paciente2.setEmail("paciente1@paciente");
		paciente2.setPassword("paciente");
		paciente2.setApellido("paciente");
		paciente2.setDni(4444);
		paciente2.setDomicilio("domicilio");
		paciente2.setEdad(22);
		paciente2.setMovil(684105825);
		dao.createPaciente(paciente2);
		 
		  Paciente paciente3 = dao.readPaciente(4444);
		  dao.deletePaciente(paciente2);
		  assertEquals(paciente2.getName(), paciente3.getName());
		  assertEquals(paciente2.getEmail(), paciente3.getEmail());
		  assertEquals(paciente2.getPassword(), paciente3.getPassword());
		  assertEquals(paciente2.getApellido(), paciente3.getApellido());
		  assertEquals(paciente2.getDni(), paciente3.getDni());
		  assertEquals(paciente2.getDomicilio(), paciente3.getDomicilio());
		  assertEquals(paciente2.getEdad(), paciente3.getEdad());
		  assertEquals(paciente2.getMovil(), paciente3.getMovil());
		
	}

	@Test
	public void testReadPaciente() {
		PacienteDAO dao = PacienteDAOImplementation.getInstance();
		dao.updatePaciente(paciente);
		
		Paciente pacienteUpdated = dao.readPaciente(paciente.getDni());
	}

	@Test
	public void testUpdatePaciente() {
		paciente.setName("nuevo paciente");
		
		
		PacienteDAO dao = PacienteDAOImplementation.getInstance();
		dao.updatePaciente(paciente);
		
		Paciente pacienteUpdated = dao.readPaciente(paciente.getDni());
	
		  assertEquals(paciente.getName(), pacienteUpdated.getName());
			}

	@Test
	public void testDeletePaciente() {
		
		PacienteDAO dao = PacienteDAOImplementation.getInstance();
		Paciente paciente4 = dao.readPaciente(4444);
		dao.deletePaciente(paciente4);
		
		Assert.assertNull(paciente4);
		
	}

}
