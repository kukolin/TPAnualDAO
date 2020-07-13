package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Vuelos;

public interface VuelosInterfaz {

	public ArrayList<Vuelos> ListarVuelos() throws SQLException;
	boolean BajaVuelos(int i) throws SQLException;
	boolean AltaVuelos(Vuelos vuelos) throws SQLException;
	
	
	
}
