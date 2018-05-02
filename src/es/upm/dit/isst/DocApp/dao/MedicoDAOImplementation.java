package es.upm.dit.isst.DocApp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.upm.dit.isst.DocApp.dao.model.Medico;

public class MedicoDAOImplementation implements MedicoDAO{

	 private static MedicoDAOImplementation instance;
	 private MedicoDAOImplementation() {};
	 public static MedicoDAOImplementation getInstance() {
		 if (null==instance){
			 instance = new MedicoDAOImplementation();

		 }
		 return instance;
	 }

	 @Override
	 public Medico loginMedico(String email, String password) {
		 Session session = SessionFactoryService.get().openSession();
		 Medico medico = null;
		 try {
			 session.beginTransaction();
			 medico = (Medico) session.createQuery("select t from Medico t where t.email= :email and t.password = :password")
					 .setParameter("email", email)
					 .setParameter("password", password).uniqueResult();
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {

		 }
		 finally {
			 session.close();
		 }
		 return medico;
	 }


	 public List<Medico> readAllMedico() {
		 Session session = SessionFactoryService.get().openSession();
		 List<Medico> medicos = new ArrayList<>();
		 try {
			 session.beginTransaction();
			 medicos.addAll(session.createQuery("select t from Medico t").getResultList());
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
		 }
		 finally {
			 session.close();
		 }
		 return medicos;
	 }
	 
	 @Override
	 public void createMedico(Medico medico) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.save(medico);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
	
		 }
		 finally {
			 session.close();
		 }
	 }
	 
	 
	 @Override
	 public Medico readMedico(String email) {
		 Medico medico = null;
		 Session session = SessionFactoryService.get().openSession();
	
		 try {
			 session.beginTransaction();
			 medico = session.get(Medico.class, email);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
	
		 }
		 finally {
			 session.close();
		 }
		 return medico;
	 }

	 @Override
	 public void updateMedico(Medico medico) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.saveOrUpdate(medico);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {
		 }
		 finally {
			 session.close();
		 }
	 }

	 @Override
	 public void deleteMedico(Medico medico) {
		 Session session = SessionFactoryService.get().openSession();
		 try {
			 session.beginTransaction();
			 session.delete(medico);
			 session.getTransaction().commit();
		 }
		 catch(Exception e) {

		 }
		 finally {
			 session.close();
		 }
	 }
	
}
