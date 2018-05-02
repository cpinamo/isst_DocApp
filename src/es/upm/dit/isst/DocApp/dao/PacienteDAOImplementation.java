package es.upm.dit.isst.DocApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.DocApp.dao.model.Paciente;

public class PacienteDAOImplementation implements PacienteDAO{

	 private static PacienteDAOImplementation instance;
	 private PacienteDAOImplementation() {};
	 public static PacienteDAOImplementation getInstance() {
		 if (null==instance){
			 instance = new PacienteDAOImplementation();

		 }
		 return instance;
	 }

	 @Override
	 public Paciente loginPaciente(String email, String password) {
		 Session session = SessionFactoryService.get().openSession();
		 Paciente paciente = null;
		 try {
			 session.beginTransaction();
			 paciente = (Paciente) session.createQuery("select t from Paciente t where t.email= :email and t.password = :password")
					 .setParameter("email", email)
					 .setParameter("password", password).uniqueResult();
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {

		 }
		 finally {
			 session.close();
		 }
		 return paciente;
	 }


	 public List<Paciente> readAllPaciente() {
		 Session session = SessionFactoryService.get().openSession();
		 List<Paciente> pacientes = new ArrayList<>();
		 try {
			 session.beginTransaction();
			 pacientes.addAll(session.createQuery("select t from Paciente t").getResultList());
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
		 }
		 finally {
			 session.close();
		 }
		 return pacientes;
	 }
	 
	 @Override
	 public void createPaciente(Paciente paciente) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.save(paciente);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
	
		 }
		 finally {
			 session.close();
		 }
	 }
	 
	 
	 @Override
	 public Paciente readPaciente(String email) {
		 Paciente paciente = null;
		 Session session = SessionFactoryService.get().openSession();
	
		 try {
			 session.beginTransaction();
			 paciente = session.get(Paciente.class, email);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
	
		 }
		 finally {
			 session.close();
		 }
		 return paciente;
	 }

	 @Override
	 public void updatePaciente(Paciente paciente) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.saveOrUpdate(paciente);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
		 }
		 finally {
			 session.close();
		 }
	 }

	 @Override
	 public void deletePaciente(Paciente paciente) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.delete(paciente);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {

		 }
		 finally {
			 session.close();
		 }
	 }
	
	
	
}
