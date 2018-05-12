package es.upm.dit.isst.DocApp.dao;

import java.util.List;
import es.upm.dit.isst.DocApp.dao.model.Cita;

public interface CitaDAO {

		public List<Cita> readAllCita();

		public void createCita(Cita cita);

		public Cita readCita(String id);

		public void updateCita(Cita cita);

		public void deleteCita(Cita cita);

}
