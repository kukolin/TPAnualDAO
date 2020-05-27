package edu.usal.negocio.dominio;

public class Aeropuerto {

	String identificacion, ciudad, provincia, pais;

	public Aeropuerto(String identificacion, String ciudad, String provincia, String pais) {
		super();
		this.identificacion = identificacion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
