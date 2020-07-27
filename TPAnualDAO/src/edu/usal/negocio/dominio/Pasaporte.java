package edu.usal.negocio.dominio;

import java.sql.Date;

public class Pasaporte {

	String numero, pais, autoridad;
	Date fechaEmision, fechaVencimiento;
	
	int idPasaporte;

	public Pasaporte(int idPasaporte ,String numero, String pais, String autoridad, Date fechaEmision, Date fechaVencimiento) {
		super();
		this.numero = numero;
		this.pais = pais;
		this.autoridad = autoridad;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
		this.idPasaporte = idPasaporte;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAutoridad() {
		return autoridad;
	}

	public void setAutoridad(String autoridad) {
		this.autoridad = autoridad;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getIdPasaporte() {
		return idPasaporte;
	}

	public void setIdPasaporte(int idPasaporte) {
		this.idPasaporte = idPasaporte;
	}
	

}
