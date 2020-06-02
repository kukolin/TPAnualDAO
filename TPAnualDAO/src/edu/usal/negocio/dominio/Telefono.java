package edu.usal.negocio.dominio;

public class Telefono {

	String personal, celular, laboral;

	public Telefono(String personal, String celular, String laboral) {
		super();
		this.personal = personal;
		this.celular = celular;
		this.laboral = laboral;
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
