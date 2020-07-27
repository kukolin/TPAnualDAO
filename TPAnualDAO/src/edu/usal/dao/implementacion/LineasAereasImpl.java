package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.util.Conexion;

public class LineasAereasImpl implements LineasAereasInterfaz {

	Connection con = null;
	
	
	@Override
	public ArrayList<LineasAereas> ListarLineas() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM LineasAereas";
		
		ResultSet rs = stm.executeQuery(sql);
		
		String resultado = "";
		
		ArrayList<LineasAereas> lista = new ArrayList<LineasAereas>();
		
		
		
		while(rs.next()) {

			LineasAereas lineasAereas = new LineasAereas(rs.getInt(1), rs.getString(2).trim(), rs.getString(3).trim(), rs.getInt(4));
			
			lista.add(lineasAereas);

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
	
	@Override
	public boolean ModificarLineas(int idLinea, LineasAereas lineas) throws SQLException {

		String nombre = lineas.getNombre();
		String alianza = lineas.getAlianza();
		int vuelosAsignados = lineas.getVuelos();


		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateLineaString = "UPDATE LineasAereas SET Nombre = '" + nombre + 
				"', Alianza = '" + alianza +
				"', VuelosAsignados = '" + vuelosAsignados + 
				"' WHERE idLineaAerea = " + idLinea;
		
		stm.execute(updateLineaString);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}
	
	
	
	
}
