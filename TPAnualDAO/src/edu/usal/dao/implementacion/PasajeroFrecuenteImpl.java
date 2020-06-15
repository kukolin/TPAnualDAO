package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.PasajeroFrecuenteInterfaz;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.util.Conexion;

public class PasajeroFrecuenteImpl implements PasajeroFrecuenteInterfaz{


	Connection con = null;

	@Override
	public int AltaPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException {
		
	con = Conexion.getConnection();
		
	int id = 0;
	
		String sTelefono = "INSERT INTO PasajeroFrecuente VALUES ('" + pasajeroFrecuente.getAlianza() + "','" + pasajeroFrecuente.getAerolinea() + "','" + pasajeroFrecuente.getNumero() + "','" + pasajeroFrecuente.getCategoria() + "')";

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
	public boolean BajaPasajeroFrecuente(int i) throws SQLException {
		
		
		
		return false;
	}


	
	
	
	
	
	
	
	
}
