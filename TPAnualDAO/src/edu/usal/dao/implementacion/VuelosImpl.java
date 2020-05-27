package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Vuelos;

public class VuelosImpl implements VuelosInterfaz{


	Connection con = null;
	
	public void Conexion() {
			
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	
	try {
		con = DriverManager.getConnection(
				"jdbc:sqlserver://localhost:1433;databaseName=TPAnual", "sa", "123456");
		
	}catch(SQLException e){
		e.printStackTrace();
	}		
	
	}
	
	
	
	@Override
	public String ListarVuelos() throws SQLException {

		
		Conexion();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Vuelos";
		
		ResultSet rs = stm.executeQuery(sql);
		
		String resultado = "";
		
		while(rs.next()) {
			resultado = resultado +
					" ID Vuelo: " + rs.getInt(1) +
					", Numero: " + rs.getString(2).trim() +
					", Asientos disponibles: " + rs.getInt(3) +
					", Aeropuerto salida: " + rs.getString(4).trim() +
					", Aeropuerto llegada: "  + rs.getString(5).trim() +
					", Fecha salida.: " + rs.getDate(6) +
					", Fecha llegada: " + rs.getDate(7) +
					", Tiempo de vuelo: " + rs.getString(8) +
					", ID Linea Aerea: " + rs.getInt(9) + 
					"\n";
		}
		
		
		stm.close();
		con.close();
		
		
		return resultado;
		
	}

	@Override
	public boolean BajaVuelos(int i) throws SQLException {
	
		Conexion();
		
		
		Statement stm = con.createStatement();
		
		String sql = "DELETE FROM Vuelos WHERE idVuelo = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	@Override
	public boolean AltaVuelos(Vuelos vuelos) throws SQLException {
		
		
		String aeropuertoSalida = vuelos.getAeroLlegada();
		String aeropuertoLlegada = vuelos.getAeroSalida();
		
		String numero = vuelos.getNumero();
		String tiempo = vuelos.getTiempo();
		int cantidad = vuelos.getCantAsientos();
		Date fechaSalida = vuelos.getFechaSalida();
		Date fechaLlegada = vuelos.getFechaLlegada();
		
		int idLinea = vuelos.getLineasAereas();
		

		Conexion();
		
		String sVuelos = "INSERT INTO Vuelos VALUES ('" + numero + "', " + cantidad + ", '" + aeropuertoSalida + "', '" + aeropuertoLlegada
				 + "', '" + fechaSalida + "', '" +fechaLlegada + "', '" +tiempo  + "', " + idLinea + ")";
				
		
		Statement stm = con.createStatement();
		stm.execute(sVuelos);
		stm.close();
		
	
		
		return true;
	}

}
