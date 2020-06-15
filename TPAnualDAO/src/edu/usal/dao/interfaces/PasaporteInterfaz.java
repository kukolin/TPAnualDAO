package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.Pasaporte;

public interface PasaporteInterfaz {
	
	
	int AltaPasaporte(Pasaporte pasaporte) throws SQLException;
	boolean BajaPasaporte(int i) throws SQLException;

	
	
	
	
	
}
