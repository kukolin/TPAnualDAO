package edu.usal.dao.implementacion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.TelefonoInterfaz;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.util.Conexion;

public class TelefonoImpl implements TelefonoInterfaz{
	
	Connection con = null;
	 

	@Override
	public int getTelefono() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		ResultSet rsTelefono = stm.executeQuery("SELECT TOP 1 * FROM Telefono ORDER BY idTelefono DESC");

		int idTelefono = 0;
		
		Telefono telefono = null;
		
		while(rsTelefono.next()) {
			idTelefono = rsTelefono.getInt(1);
		}
		
		rsTelefono.close();
		stm.close();
		con.close();
		return idTelefono;
		
	}

	@Override
	public boolean AltaTelefono(Telefono telefono) throws SQLException {

		con = Conexion.getConnection();
		
		String Personal = telefono.getPersonal();
		String Celular = telefono.getCelular();
		String Laboral = telefono.getLaboral();
		
		Statement stm = con.createStatement();

		String sTelefono = "INSERT INTO Telefono VALUES ('" + Personal + "','" + Celular + "','" + Laboral + "')";

	//	

		
		stm.execute(sTelefono);
		
		stm.close();
		con.close();
		
		return true;
	}

	@Override
	public boolean BajaTelefono(int i) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
