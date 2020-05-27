package edu.usal.negocio.dominio;

import java.sql.Date;

public class Cliente {

	String nombreyApellido, dni, cuit_cuil, email;
	Date fechaNac;
	Pasaporte pasaporte;
	Telefono telefono;
	Direccion direccion;
	PasajeroFrecuente pasajeroFrecuente;
	public Cliente(String nombreyApellido, String dni, String cuit_cuil, String email, Date fechaNac,
			Pasaporte pasaporte, Telefono telefono, Direccion direccion, PasajeroFrecuente pasajeroFrecuente) {
		super();
		this.nombreyApellido = nombreyApellido;
		this.dni = dni;
		this.cuit_cuil = cuit_cuil;
		this.email = email;
		this.fechaNac = fechaNac;
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.direccion = direccion;
		this.pasajeroFrecuente = pasajeroFrecuente;
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
	public Pasaporte getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public PasajeroFrecuente getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}
	public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}
	
}
