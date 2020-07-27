package edu.usal.negocio.dominio;

import java.sql.Date;

public class Vuelos {

	String numero, tiempo;
	int cantAsientos;
	Date fechaSalida, fechaLlegada;
	String aeroSalida, aeroLlegada;
	LineasAereas lineasAereas;
	int idVuelo;
	
	public Vuelos( String numero, String tiempo, int cantAsientos, Date fechaSalida, Date fechaLlegada,
			String aeroSalida, String aeroLlegada, LineasAereas lineasAereas) {
		super();
		this.numero = numero;
		this.tiempo = tiempo;
		this.cantAsientos = cantAsientos;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.aeroSalida = aeroSalida;
		this.aeroLlegada = aeroLlegada;
		this.lineasAereas = lineasAereas;
//		this.idVuelo = idVuelo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public int getCantAsientos() {
		return cantAsientos;
	}
	public void setCantAsientos(int cantAsientos) {
		this.cantAsientos = cantAsientos;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getAeroSalida() {
		return aeroSalida;
	}
	public void setAeroSalida(String aeroSalida) {
		this.aeroSalida = aeroSalida;
	}
	public String getAeroLlegada() {
		return aeroLlegada;
	}
	public void setAeroLlegada(String aeroLlegada) {
		this.aeroLlegada = aeroLlegada;
	}
	public LineasAereas getLineasAereas() {
		return lineasAereas;
	}
	public void setLineasAereas(LineasAereas lineasAereas) {
		this.lineasAereas = lineasAereas;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	
	
	
}
