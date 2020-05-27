package edu.usal.negocio.dominio;

public class LineasAereas {

	String nombre, alianza;
	int vuelos;
	
	public LineasAereas(String nombre, String alianza, int vuelos) {
		super();
		this.nombre = nombre;
		this.alianza = alianza;
		this.vuelos = vuelos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlianza() {
		return alianza;
	}
	public void setAlianza(String alianza) {
		this.alianza = alianza;
	}
	public int getVuelos() {
		return vuelos;
	}
	public void setVuelos(int vuelos) {
		this.vuelos = vuelos;
	}
	
	
}
