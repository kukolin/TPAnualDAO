package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.LineasAereasInterfaz;

import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.util.Conexion;

public class LineasAereasImpl implements LineasAereasInterfaz {

	Connection con = null;
	
	
	@Override
	public ArrayList<String> ListarLineas() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM LineasAereas";
		
		ResultSet rs = stm.executeQuery(sql);
		
		String resultado = "";
		
		ArrayList<String> lista = new ArrayList<String>();
		
		while(rs.next()) {

			resultado = " ID Linea Aerea: " + rs.getInt(1) +
					", Nombre: " + rs.getString(2).trim() +
					", Alianza: " + rs.getString(3).trim() +
			
			lista.add(resultado);
		}
		
		
		stm.close();
		con.close();
		
		
		return lista;
		
	}

	@Override
	public boolean AltaLineas(LineasAereas lineas) throws SQLException {
		
		String Nombre = lineas.getNombre();
		String Alianza = lineas.getAlianza();
		int VuelosAsignados = lineas.getVuelos();


		con = Conexion.getConnection();
		
		String sVuelos = "INSERT INTO LineasAereas VALUES ('" + Nombre + "', '" + Alianza + "', " + VuelosAsignados + ")";
		
		Statement stm = con.createStatement();
		
		stm.execute(sVuelos);
		
		stm.close();
		
		
		return true;
	}

	@Override
	public boolean BajaLineas(int i) throws SQLException {
		
		
		con = Conexion.getConnection();
		
		String sVuelos = "DELETE FROM LineasAereas WHERE idLineaAerea = " + i;
		
		Statement stm = con.createStatement();
		
		stm.execute(sVuelos);
		
		stm.close();
		
		
		return true;

	}
	
	
	
	
	
	
}
