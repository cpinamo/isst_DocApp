package es.upm.dit.isst.DocApp.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import es.upm.dit.isst.DocApp.dao.model.Cita;

public class CitaDAOImplementation implements CitaDAO {

	private static CitaDAOImplementation instance;

	private CitaDAOImplementation() {
	};
	public static CitaDAOImplementation getInstance() {
		if (null == instance) {
			instance = new CitaDAOImplementation();

		}
		return instance;
	}

	@Override
	public List<Cita> readAllCita() {
		Session session = SessionFactoryService.get().openSession();
		List<Cita> citas = new ArrayList<>();
		try {
			session.beginTransaction();
			citas.addAll(session.createQuery("select t from Cita t").getResultList());
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return citas;
	}

	@Override
	public void createCita(Cita cita) {
		
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(cita);
			
			session.getTransaction().commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
	}

	@Override
	public Cita readCita(String id) {
		Cita cita = null;
		Session session = SessionFactoryService.get().openSession();

		try {
			session.beginTransaction();
			cita = session.get(Cita.class, Long.parseLong(id));
			session.getTransaction().commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
		return cita;
	}

	@Override
	public void updateCita(Cita cita) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(cita);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteCita(Cita cita) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(cita);
			session.getTransaction().commit();
		} catch (Exception e) {

		} finally {
			session.close();
		}
	}
}
