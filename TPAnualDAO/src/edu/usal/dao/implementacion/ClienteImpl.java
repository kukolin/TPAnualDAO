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
	
//	
//	public void Conexion() {
//			
//	try {
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	}catch(ClassNotFoundException e){
//		e.printStackTrace();
//	}
//	
//	try {
//		con = DriverManager.getConnection(
//				"jdbc:sqlserver://localhost:1433;databaseName=TPAnual", "sa", "123456");
//		
//	}catch(SQLException e){
//		e.printStackTrace();
//	}		
//	
//	}
//	
	
	
	
	@Override
	public boolean AltaCliente(Cliente cliente) throws SQLException {
		
		String nombreApellido = cliente.getNombreyApellido();
		String dni = cliente.getDni();
		String CuitCuil = cliente.getCuit_cuil();
		Date fechaNac = cliente.getFechaNac();
		String email = cliente.getEmail();
		Telefono telefono = cliente.getTelefono();
		Pasaporte pasaporte = cliente.getPasaporte();
		PasajeroFrecuente ps = cliente.getPasajeroFrecuente();
		Direccion direccion = cliente.getDireccion();
		
		String Personal = telefono.getPersonal();
		String Celular = telefono.getCelular();
		String Laboral = telefono.getLaboral();
		
		String NumeroPas = pasaporte.getNumero();
		String PaisPas = pasaporte.getPais();
		String Autoridad = pasaporte.getAutoridad();
		Date FechaEmision = pasaporte.getFechaEmision();
		Date FechaVencimiento = pasaporte.getFechaVencimiento();
		
		String Alianza = ps.getAlianza();
		String Aerolinea = ps.getAerolinea();
		String NumeroFrec = ps.getNumero();
		String Categoria = ps.getCategoria();
		
		String Calle = direccion.getCalle();
		String Altura = direccion.getAltura();
		String Ciudad = direccion.getCiudad();
		String Provincia = direccion.getProvincia();
		String PaisDir = direccion.getPais();
		String CodigoPos = direccion.getCodigo();
		
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();

		String sTelefono = "INSERT INTO Telefono VALUES ('" + Personal + "','" + Celular + "','" + Laboral + "')";
		String sPasaporte = "INSERT INTO Pasaporte VALUES ('" + NumeroPas + "','" + PaisPas + "','" + Autoridad + "','"+ FechaEmision  + "','"+ FechaVencimiento + "')";
		String sPasajero = "INSERT INTO PasajeroFrecuente VALUES ('" + Alianza + "','" + Aerolinea + "','" + NumeroFrec + "','" + Categoria + "')";
		String sDireccion = "INSERT INTO Direccion VALUES ('" + Calle + "','" + Altura + "','" + Ciudad + "','" + Provincia + "','" + PaisDir +"','"+ CodigoPos + "')";

		
		
		Statement stmTelefono = con.createStatement();
		Statement stmPasaporte = con.createStatement();
		Statement stmFrecuente = con.createStatement();
		Statement stmDireccion = con.createStatement();
		
		ResultSet rsTelefono = stmTelefono.executeQuery("SELECT TOP 1 * FROM Telefono ORDER BY idTelefono DESC");
		ResultSet rsPasaporte = stmPasaporte.executeQuery("SELECT TOP 1 * FROM Pasaporte ORDER BY idPasaporte DESC");
		ResultSet rsFrecuente = stmFrecuente.executeQuery("SELECT TOP 1 * FROM PasajeroFrecuente ORDER BY idPasajeroFrecuente DESC");
		ResultSet rsDireccion = stmDireccion.executeQuery("SELECT TOP 1 * FROM Direccion ORDER BY idDireccion DESC");

		int idTelefono = 0;
		
		while(rsTelefono.next()) {
			idTelefono = rsTelefono.getInt(1);
		}
		
		int idPasaporte = 0;
		
		while(rsPasaporte.next()) {
			idPasaporte = rsPasaporte.getInt(1);
		}
		
		int idFrecuente = 0;
		
		while(rsFrecuente.next()) {
			idFrecuente = rsFrecuente.getInt(1);
		}
		int idDireccion = 0;
		
		while(rsDireccion.next()) {
			idDireccion = rsDireccion.getInt(1);
		}
		
		stmDireccion.close();
		stmFrecuente.close();
		stmPasaporte.close();
		stmTelefono.close();
		
		
		
		String str = "INSERT INTO Cliente VALUES (";
		
		str = str + "'" + nombreApellido + "','" + dni + "'," + idPasaporte +", '" + CuitCuil+ "','" 
		+ fechaNac + "','" + email + "'," + idTelefono + "," + idFrecuente +", " + idDireccion + ")";
		
		
		
		
		
		stm.execute(sTelefono);
		stm.execute(sPasajero);
		stm.execute(sDireccion);
		stm.execute(sPasaporte);

		
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
	public ArrayList<String> ListarClientes() throws SQLException {
		
		con = Conexion.getConnection();
		
		Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM Cliente";
		
		ResultSet rs = stm.executeQuery(sql);
		
		String resultado = "";
		
		ArrayList<String> lista = new ArrayList<String>();
		
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
}
