package edu.usal.dao.implementacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.usal.dao.interfaces.PasaporteInterfaz;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.util.Conexion;

public class PasaporteImpl implements PasaporteInterfaz{
	
	String numero, pais, autoridad;
	Date fechaEmision, fechaVencimiento;

	Connection con = null;

	@Override
	public int AltaPasaporte(Pasaporte pasaporte) throws SQLException {
		
	con = Conexion.getConnection();
		
	int id = 0;
	
		String sTelefono = "INSERT INTO Pasaporte VALUES ('" + pasaporte.getNumero() + "','" + pasaporte.getPais() + "','" + pasaporte.getAutoridad() + "','" + pasaporte.getFechaEmision() + "','" + pasaporte.getFechaVencimiento() + "')";

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
	public boolean BajaPasaporte(int i) throws SQLException {
		
		
		
		return false;
	}


	
	
	
	
	
	
	
	
}
