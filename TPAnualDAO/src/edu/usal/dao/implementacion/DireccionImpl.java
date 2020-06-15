package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.DireccionInterfaz;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.util.Conexion;

public class DireccionImpl implements DireccionInterfaz{


	Connection con = null;

	@Override
	public int AltaDireccion(Direccion direccion) throws SQLException {
		
	con = Conexion.getConnection();
		
	int id = 0;
	
		String sTelefono = "INSERT INTO Direccion VALUES ('" + direccion.getCalle() + "','" + direccion.getAltura() + "','" + direccion.getCiudad() + "','" + direccion.getPais() +  "','" + direccion.getProvincia() + "','" + direccion.getCodigo() +"')";

		PreparedStatement stm = con.prepareStatement(sTelefono, Statement.RETURN_GENERATED_KEYS);
		
		int rowAffected = stm.executeUpdate();
		
		if(rowAffected == 1)
		{
			ResultSet rs = stm.getGeneratedKeys();
			
			while(rs.next()) {
				id = rs.getInt(1);
			}
		
			rs.close();
		}
				
		stm.close();
		con.close();
		return id;
		
	}

	@Override
	public boolean BajaDireccion(int i) throws SQLException {
		
		
		
		return false;
	}


	
	
	
	
	
	
	
	
}
