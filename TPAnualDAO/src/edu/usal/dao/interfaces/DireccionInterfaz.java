package edu.usal.dao.interfaces;

import java.sql.SQLException;

import edu.usal.negocio.dominio.Direccion;

public interface DireccionInterfaz {
	
	int AltaDireccion(Direccion direccion) throws SQLException;
	boolean BajaDireccion(int i) throws SQLException;
	
}
