package edu.usal.negocio.dominio;

import java.sql.Date;

public class Cliente {

	String nombreyApellido, dni, cuit_cuil, email;
	Date fechaNac;
	int idPasaporte;
	int idTelefono;
	int idDireccion;
	int idPasajeroFrecuente;
	
	
	public Cliente(String nombreyApellido, String dni, String cuit_cuil, String email, Date fechaNac, int idPasaporte,
			int idTelefono, int idDireccion, int idPasajeroFrecuente) {
		super();
		this.nombreyApellido = nombreyApellido;
		this.dni = dni;
		this.cuit_cuil = cuit_cuil;
		this.email = email;
		this.fechaNac = fechaNac;
		this.idPasaporte = idPasaporte;
		this.idTelefono = idTelefono;
		this.idDireccion = idDireccion;
		this.idPasajeroFrecuente = idPasajeroFrecuente;
	}


	public String getNombreyApellido() {
		return nombreyApellido;
	}


	public void setNombreyApellido(String nombreyApellido) {
		this.nombreyApellido = nombreyApellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCuit_cuil() {
		return cuit_cuil;
	}


	public void setCuit_cuil(String cuit_cuil) {
		this.cuit_cuil = cuit_cuil;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int getIdPasaporte() {
		return idPasaporte;
	}


	public void setIdPasaporte(int idPasaporte) {
		this.idPasaporte = idPasaporte;
	}


	public int getIdTelefono() {
		return idTelefono;
	}


	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}


	public int getIdDireccion() {
		return idDireccion;
	}


	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}


	public int getIdPasajeroFrecuente() {
		return idPasajeroFrecuente;
	}

	public void setIdPasajeroFrecuente(int idPasajeroFrecuente) {
		this.idPasajeroFrecuente = idPasajeroFrecuente;
	}
	
	public String getInfo() {
		
		String string = "Nombre: " + this.nombreyApellido + ", DNI: " + this.dni + ", Cuit/Cuil: "  + this.cuit_cuil + ", email: "+ this.email +
				", Fecha Nac.: "+ this.getFechaNac() + ".";

		return string;
		
	}
	
}
