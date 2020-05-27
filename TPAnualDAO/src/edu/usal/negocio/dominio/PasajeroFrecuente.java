package edu.usal.negocio.dominio;

public class PasajeroFrecuente {

	String alianza, aerolinea, numero, categoria;

	public PasajeroFrecuente(String alianza, String aerolinea, String numero, String categoria) {
		super();
		this.alianza = alianza;
		this.aerolinea = aerolinea;
		this.numero = numero;
		this.categoria = categoria;
	}

	public String getAlianza() {
		return alianza;
	}

	public void setAlianza(String alianza) {
		this.alianza = alianza;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
