package edu.usal.dao.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;

import edu.usal.negocio.dominio.Telefono;

import edu.usal.util.Conexion;

public class ClienteImpl implements ClienteInterfaz{

	Connection con = null;
	
	
	@Override
	public boolean AltaCliente(Cliente cliente, Telefono telefono,
			Pasaporte pasaporte, PasajeroFrecuente pasajeroFrecuente, Direccion direccion) throws SQLException {
		
		String nombreApellido = cliente.getNombreyApellido();
		String dni = cliente.getDni();
		String CuitCuil = cliente.getCuit_cuil();
		Date fechaNac = cliente.getFechaNac();
		String email = cliente.getEmail();
		
//		int idTelefono = cliente.getIdTelefono();
//		int idPasaporte = cliente.getIdPasaporte();
//		int idPasajeroFrecuente = cliente.getIdPasajeroFrecuente();
//		int idDireccion = cliente.getIdDireccion();
		
		int idTelefono = telefono.getIdTelefono();
		int idPasaporte = pasaporte.getIdPasaporte();
		int idPasajeroFrecuente = pasajeroFrecuente.getIdPasajeroFrecuente();
		int idDireccion = direccion.getIdDireccion();
		
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		
		
		String str = "INSERT INTO Cliente VALUES (";
		
		str = str + "'" + nombreApellido + "','" + dni + "'," + idPasaporte +", '" + CuitCuil+ "','" 
		+ fechaNac + "','" + email + "'," + idTelefono + "," + idPasajeroFrecuente +", " + idDireccion + ")";
		
		
		
		stm.execute(str);
		
		stm.close();
		
		
		con.close();
		return true;
	}

	@Override
	public boolean BajaCliente(int i) throws SQLException {
		
		con = Conexion.getConnection();
		
		
		Statement stm = con.createStatement();
		
		String sql = "DELETE FROM Cliente WHERE idCliente = " + i;
		
		stm.execute(sql);
		
		stm.close();
		con.close();
		
		return true;
	}

	
	
	
	
	@Override
	public ArrayList<Cliente> ListarClientes() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Cliente";
		
		ResultSet rs = stm.executeQuery(sql);
				
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	/*	
		while(rs.next()) {
			resultado = resultado +
					" ID Cliente: " + rs.getInt(1) +
					", Nombre y Apellido: " + rs.getString(2).trim() +
					", DNI: " + rs.getString(3).trim() +
					", ID Pasaporte: " + rs.getInt(4) +
					", Cuit/Cuil: "  + rs.getString(5).trim() +
					", Fecha de Nac.: " + rs.getDate(6) +
					", Email: " + rs.getString(7).trim() +
					", ID Telefono: " + rs.getInt(8) +
					", ID Pasajero Frec.: " + rs.getInt(9) +
					", ID Direccion: " + rs.getInt(10) + "\n";
			lista.add(resultado);
		}
		*/
		while(rs.next()) {
			
			PasajeroFrecuente pasajeroFrecuente = new PasajeroFrecuente(0, "", "", "", "");
			Telefono telefono = new Telefono(0, "", "", "");
			Pasaporte pasaporte = new Pasaporte(0, "", "", "", new Date(1), new Date(1));
			Direccion direccion = new Direccion(0, "", "", "", "", "", "");
			
			Cliente cliente = new Cliente(rs.getInt(1), rs.getString(2).trim(), rs.getString(3).trim(), rs.getString(5).trim(),
					rs.getString(7).trim(), rs.getDate(6), pasaporte, telefono, direccion, pasajeroFrecuente);
								
			lista.add(cliente);
			
		}
		stm.close();
		con.close();
		
		
		return lista;
	}




	@Override
	public ArrayList<String> ListarPaises() throws SQLException {
		
		con = Conexion.getConnection();
		
		ArrayList<String> lista = new ArrayList<String>();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Paises";
		
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			lista.add(rs.getString(2));
		}
	
		rs.close();
		stm.close();
		con.close();
		
		return lista;
	}
	
	public ArrayList<String> ListarProvincias() throws IOException {
		
		File file = new File("provincias.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> prov = new ArrayList<String>();

		String linea = "";
		
		while((linea = br.readLine()) != null) {
			
			prov.add(linea);
			
		}
			br.close();
			return prov;		
	}

	@Override
	public boolean ModificarCliente(int idCliente, Cliente cliente) throws SQLException {

		String nombreApellido = cliente.getNombreyApellido();
		String dni = cliente.getDni();
		String CuitCuil = cliente.getCuit_cuil();
		Date fechaNac = cliente.getFechaNac();
		String email = cliente.getEmail();
		
//		int idTelefono = cliente.getIdTelefono();
//		int idPasaporte = cliente.getIdPasaporte();
//		int idPasajeroFrecuente = cliente.getIdPasajeroFrecuente();
//		int idDireccion = cliente.getIdDireccion();
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String updateCliente = "UPDATE Cliente SET NombreApellido = '" + nombreApellido + 
				"', DNI = '" + dni +
				"', CuitCuil = '" + CuitCuil + 
				"', FechaNac = '" + fechaNac +
				"', Email = '" + email +
				"' WHERE idCliente = " + idCliente;
		
		stm.execute(updateCliente);
		
		stm.close();
		
		
		con.close();
		return true;
		
	}
}
