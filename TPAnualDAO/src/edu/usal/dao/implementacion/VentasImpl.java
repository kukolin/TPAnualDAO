package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.util.Conexion;

public class VentasImpl implements VentasInterfaz{

	Connection con = null;
	
	
	@Override
	public String ListarVentas() throws SQLException {
		return null;
	}

	@Override
	public boolean BajaVentas(int i) throws SQLException {
		return false;
	}

	@Override
	public boolean AltaVentas(Ventas ventas) throws SQLException {
		
		con = Conexion.getConnection();
		
		Date FechaVenta = ventas.getFechaVenta();
		int idCliente = ventas.getIdCliente();
		int idVuelo = ventas.getIdVuelo();
		//int idLinea = ventas.getIdLineaAerea();
		String Pago = ventas.getFormaDePago();

		Statement stm = con.createStatement();
		
		String sql = "INSERT INTO Ventas VALUES (" + idVuelo +"," + idCliente +"," + idVuelo +",'" +FechaVenta+"','"+Pago+"')";
		
		stm.execute(sql);
		
		return true;
	}

	
	
	
	
}
