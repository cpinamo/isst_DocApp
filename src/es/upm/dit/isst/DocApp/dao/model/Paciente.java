package es.upm.dit.isst.DocApp.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Paciente implements Serializable{
	
	@Id
	private int dni; //Hemos decidido que el número de la tarjeta sanitaria sea el mismo que el del dni para simplificar
	private String name;
	private String apellido;
	private String password;
	private String email;
	private int edad;
	private int movil;
	private String domicilio;
	private String status;
	
	@ManyToMany(fetch=FetchType.EAGER, mappedBy="pacientes", cascade= {CascadeType.MERGE, CascadeType.PERSIST})
	private List<Medico> doctores;
	
	public Paciente(){
		this.doctores = new ArrayList<>();
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

	
}
