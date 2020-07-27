package edu.usal.dao.interfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Telefono;

public interface ClienteInterfaz {

	//public List<Cliente> ListarClientePorNombre() throws SQLException;
	public ArrayList<Cliente> ListarClientes() throws SQLException;
//	boolean AltaCliente(Cliente cliente) throws SQLException;
	boolean BajaCliente(int i) throws SQLException;
	public ArrayList<String> ListarPaises() throws SQLException;
	public ArrayList<String> ListarProvincias() throws IOException;
	public boolean ModificarCliente(int idCliente, Cliente cliente) throws SQLException;
	boolean AltaCliente(Cliente cliente, Telefono telefono, Pasaporte pasaporte, PasajeroFrecuente pasajeroFrecuente,
			Direccion direccion) throws SQLException;
	
	
}
