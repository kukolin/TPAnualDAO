package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;

public interface VentasInterfaz {

	public String ListarVentas() throws SQLException;
	boolean BajaVentas(int i) throws SQLException;
	boolean AltaVentas(Ventas ventas) throws SQLException;
	
	
}
