package es.upm.dit.isst.DocApp.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Paciente implements Serializable {

	@Id
	private int dni;
	private String email;
	private String name;
	private String apellido;
	private String password;
	private int edad;
	private int movil;
	private String domicilio;
	private String status;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "pacientes", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<Medico> doctores;

	@OneToMany(mappedBy = "pacienteCita", fetch = FetchType.EAGER)
	private List<Cita> citasPaciente;

	public Paciente() {
		this.doctores = new ArrayList<>();
		this.citasPaciente = new ArrayList<>();
	}

	public List<Cita> getCitasPaciente() {
		return citasPaciente;
	}

	public void setCitasPaciente(List<Cita> citasPaciente) {
		this.citasPaciente = citasPaciente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public List<Medico> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Medico> doctores) {
		this.doctores = doctores;
	}

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", email=" + email + ", name=" + name + ", apellido=" + apellido + ", password="
				+ password + ", edad=" + edad + ", movil=" + movil + ", domicilio=" + domicilio + ", status=" + status
				+ ", doctores=" + doctores + ", citasPaciente=" + citasPaciente + "]";
	}
	
}
