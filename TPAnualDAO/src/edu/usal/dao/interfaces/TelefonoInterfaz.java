package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Telefono;

public interface TelefonoInterfaz {

	
	public int getTelefono() throws SQLException;
	boolean AltaTelefono(Telefono telefono) throws SQLException;
	boolean BajaTelefono(int i) throws SQLException;

	
	
}
