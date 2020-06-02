package edu.usal.dao.interfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Telefono;

public interface ClienteInterfaz {

	//public List<Cliente> ListarClientePorNombre() throws SQLException;
	public ArrayList<String> ListarClientes() throws SQLException;
	boolean AltaCliente(Cliente cliente, int idTelefono) throws SQLException;
	boolean BajaCliente(int i) throws SQLException;
	public ArrayList<String> ListarPaises() throws SQLException;
	public ArrayList<String> ListarProvincias() throws IOException;

	
}
