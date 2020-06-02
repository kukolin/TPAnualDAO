package edu.usal.main;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.TelefonoFactory;
import edu.usal.dao.implementacion.ClienteImpl;
import edu.usal.dao.implementacion.LineasAereasImpl;
import edu.usal.dao.implementacion.VentasImpl;
import edu.usal.dao.implementacion.VuelosImpl;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.TelefonoInterfaz;
import edu.usal.dao.interfaces.VentasInterfaz;
import edu.usal.dao.interfaces.VuelosInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Direccion;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.PasajeroFrecuente;
import edu.usal.negocio.dominio.Pasaporte;
import edu.usal.negocio.dominio.Telefono;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;

public class Principal {

	static ClienteInterfaz cliInter;
	static TelefonoInterfaz telInter;

	public static void main (String args[]) throws SQLException, IOException {
				
		Cliente cliente = new Cliente("x", "x", "x", "x", null, null, null, null, null);
		Telefono telefono = new Telefono("x", "x", "x");
		
		cliInter = ClienteFactory.GetImplementation("MSSQL");
		telInter = TelefonoFactory.GetImplementation("MSSQL");

		telInter.AltaTelefono(telefono);
		
		int id = telInter.getTelefono();
		
		
		cliInter.AltaCliente(cliente, id);
		
		
	}
	
}
