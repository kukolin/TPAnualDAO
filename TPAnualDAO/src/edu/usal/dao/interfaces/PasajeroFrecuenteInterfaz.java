package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.PasajeroFrecuente;

public interface PasajeroFrecuenteInterfaz {

	
	int AltaPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException;
	boolean BajaPasajeroFrecuente(int i) throws SQLException;

	
	
}
