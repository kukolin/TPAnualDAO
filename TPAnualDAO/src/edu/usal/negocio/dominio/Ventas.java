package edu.usal.negocio.dominio;

import java.sql.Date;

public class Ventas {

	int idCliente, idVuelo, idLineaAerea;
	Date fechaVenta;
	String formaDePago;
	public Ventas(int idCliente, int idVuelo, int idLineaAerea, Date fechaVenta, String formaDePago) {
		super();
		this.idCliente = idCliente;
		this.idVuelo = idVuelo;
		this.idLineaAerea = idLineaAerea;
		this.fechaVenta = fechaVenta;
		this.formaDePago = formaDePago;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public int getIdLineaAerea() {
		return idLineaAerea;
	}
	public void setIdLineaAerea(int idLineaAerea) {
		this.idLineaAerea = idLineaAerea;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	
	
}
