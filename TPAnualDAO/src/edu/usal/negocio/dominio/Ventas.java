package edu.usal.negocio.dominio;

import java.sql.Date;

public class Ventas {
	
	Cliente cliente;
	Vuelos vuelos;
	
	Date fechaVenta;
	String formaDePago;
	
	public Ventas(Cliente cliente, Vuelos vuelos, Date fechaVenta, String formaDePago) {
		super();
		this.cliente = cliente;
		this.vuelos = vuelos;
		this.fechaVenta = fechaVenta;
		this.formaDePago = formaDePago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vuelos getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelos vuelos) {
		this.vuelos = vuelos;
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
