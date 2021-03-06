package es.upm.dit.isst.DocApp.dao.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Cita implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	private String dia;
	private String hora;
	private int status;
	
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@ManyToOne
	private Medico medicoCita;

	@ManyToOne
	private Paciente pacienteCita;

	public Cita() {
	
	}

	@Lob
	private byte[] document;
	
	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}
	
	
	public long getId() {
		return id;
	}

	

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Medico getMedicoCita() {
		return medicoCita;
	}

	@Override
	public String toString() {
		return "Cita [dia=" + dia + ", hora=" + hora + ", id=" + id + ", medicoCita=" + medicoCita + ", pacienteCita="
				+ pacienteCita + "]";
	}

	public void setMedicoCita(Medico medicoCita) {
		this.medicoCita = medicoCita;
	}

	public Paciente getPacienteCita() {
		return pacienteCita;
	}

	public void setPacienteCita(Paciente pacienteCita) {
		this.pacienteCita = pacienteCita;
	}
	
}
