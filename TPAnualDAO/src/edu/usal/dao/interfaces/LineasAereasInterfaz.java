package edu.usal.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.LineasAereas;

public interface LineasAereasInterfaz {

	public ArrayList<String> ListarLineas() throws SQLException;
	boolean BajaLineas(int i) throws SQLException;
	boolean AltaLineas(LineasAereas lineas) throws SQLException;
	
}
