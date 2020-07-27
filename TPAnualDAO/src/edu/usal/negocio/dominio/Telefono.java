package edu.usal.negocio.dominio;

public class Telefono {

	String personal, celular, laboral;
	int idTelefono;

	public Telefono(int idTelefono, String personal, String celular, String laboral) {
		super();
		this.personal = personal;
		this.celular = celular;
		this.laboral = laboral;
		this.idTelefono = idTelefono;
	}
	
	public int getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getPersonal() {
		return personal;
	}
	

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getLaboral() {
		return laboral;
	}

	public void setLaboral(String laboral) {
		this.laboral = laboral;
	}
	
}
