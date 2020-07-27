package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Vuelos;
import edu.usal.util.Conexion;

public class VuelosImpl implements VuelosInterfaz{


	Connection con = null;
	
	
	@Override
	public ArrayList<Vuelos> ListarVuelos() throws SQLException {

		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Vuelos";
		
		ResultSet rs = stm.executeQuery(sql);
		
		String resultado = "";
		
		ArrayList<Vuelos> lista = new ArrayList<Vuelos>();
		
		
		while(rs.next()) {
			
			LineasAereas lineasAereas = new LineasAereas(0, "", "", 0);
			
			Vuelos vuelos = new Vuelos(rs.getString(2).trim(), rs.getString(8).trim(), rs.getInt(3), rs.getDate(6), rs.getDate(7), rs.getString(4).trim(), rs.getString(5).trim(), lineasAereas);							
			lista.add(vuelos);
			
		}
		
		stm.close();
		con.close();
		
		
		return lista;
		
	}

	@Override
	public boolean BajaVuelos(int i) throws SQLException {
	
		con = Conexion.getConnection();
		
		
		Statement stm = con.createStatement();
		
		String sql = "DELETE FROM Vuelos WHERE idVuelo = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	@Override
	public boolean AltaVuelos(Vuelos vuelos, LineasAereas lineasAereas) throws SQLException {
		
		
		String aeropuertoSalida = vuelos.getAeroLlegada();
		String aeropuertoLlegada = vuelos.getAeroSalida();
		
		String numero = vuelos.getNumero();
		String tiempo = vuelos.getTiempo();
		int cantidad = vuelos.getCantAsientos();
		Date fechaSalida = vuelos.getFechaSalida();
		Date fechaLlegada = vuelos.getFechaLlegada();
		
		
		con = Conexion.getConnection();
		
		String sVuelos = "INSERT INTO Vuelos VALUES ('" + numero + "', " + cantidad + ", '" + aeropuertoSalida + "', '" + aeropuertoLlegada
				 + "', '" + fechaSalida + "', '" +fechaLlegada + "', '" +tiempo  + "', " + lineasAereas.getIdLinea() + ")";
				
		
		Statement stm = con.createStatement();
		stm.execute(sVuelos);
		stm.close();
		
	
		
		return true;
	}
	
	@Override
	public boolean ModificarVuelo(int idVuelo, Vuelos vuelos, LineasAereas lineasAereas) throws SQLException {

		String aeropuertoSalida = vuelos.getAeroLlegada();
		String aeropuertoLlegada = vuelos.getAeroSalida();
		
		String numero = vuelos.getNumero();
		String tiempo = vuelos.getTiempo();
		int cantidad = vuelos.getCantAsientos();
		Date fechaSalida = vuelos.getFechaSalida();
		Date fechaLlegada = vuelos.getFechaLlegada();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateVuelo = "UPDATE Vuelos SET Numero = '" + numero + 
				"', CantAsientos = '" + cantidad +
				"', AeropuertoSalida = '" + aeropuertoSalida + 
				"', AeropuertoLlegada = '" + aeropuertoLlegada +
				"', FechaSalida = '" + fechaSalida +
				"', FechaLegada = '" + fechaLlegada +
				"', TiempoVuelo = '" + tiempo +
				"', idLineaAerea = '" + lineasAereas.getIdLinea() +				
				
				"' WHERE idVuelo = " + idVuelo;
		
		stm.execute(updateVuelo);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}

}
