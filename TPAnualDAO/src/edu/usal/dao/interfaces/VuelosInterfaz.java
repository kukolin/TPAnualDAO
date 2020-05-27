package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.Vuelos;

public interface VuelosInterfaz {

	public String ListarVuelos() throws SQLException;
	boolean BajaVuelos(int i) throws SQLException;
	boolean AltaVuelos(Vuelos vuelos) throws SQLException;
	
	
	
}
