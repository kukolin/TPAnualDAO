package edu.usal.pruebas;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.DireccionFactory;
import edu.usal.dao.factory.LineasAereasFactory;
import edu.usal.dao.factory.PasajeroFrecuenteFactory;
import edu.usal.dao.factory.PasaporteFactory;
import edu.usal.dao.factory.TelefonoFactory;
import edu.usal.dao.factory.VuelosFactory;
import edu.usal.dao.implementacion.ClienteImpl;
import edu.usal.dao.implementacion.LineasAereasImpl;
import edu.usal.dao.implementacion.VentasImpl;
import edu.usal.dao.implementacion.VuelosImpl;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.DireccionInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
import edu.usal.dao.interfaces.PasajeroFrecuenteInterfaz;
import edu.usal.dao.interfaces.PasaporteInterfaz;
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
	static PasajeroFrecuenteInterfaz pFrecuenteInterfaz;
	static DireccionInterfaz direccionInterfaz;
	static PasaporteInterfaz pasaporteInterfaz;
	static LineasAereasInterfaz lineasAereasInterfaz;
	static VuelosInterfaz vuelosInterfaz;
	public static void main (String args[]) throws SQLException, IOException {
	
		
		lineasAereasInterfaz = LineasAereasFactory.GetImplementation("MSSQL");
		vuelosInterfaz = VuelosFactory.GetImplementation("MSSQL");
		
//		Vuelos vuelos = new Vuelos("123", "2 horas", 300, new Date(123456789), new Date(1234567891), "EZE", "MDQ", 12, 3);
		
//		vuelosInterfaz.BajaVuelos(8);
		
	//<Vuelos> alArrayList = vuelosInterfaz.ListarVuelos();


	//	for(int i=0; i<alArrayList.size();i++) {
		
	//	System.out.println(alArrayList.get(i).getNumero());
		
//	}
		
		
//		LineasAereas linea = new LineasAereas("Nombre", "Alianza", 5);
//		
//		ArrayList<LineasAereas> alArrayList = lineasAereasInterfaz.ListarLineas();
//		
//		for(int i=0; i<alArrayList.size();i++) {
//			
//			System.out.println(alArrayList.get(i).getVuelos());
//			
//		}
		
		
		//-----------------------------------------------------------------
//		
//		pasaporteInterfaz = PasaporteFactory.GetImplementation("MSSQL");
//
		Date date = new Date(123123123);
//		
//		
//		Pasaporte pasaporte = new Pasaporte("a", "b", "c", date, date);
//		

		//-----------------------------------------------------------------

//		pFrecuenteInterfaz = PasajeroFrecuenteFactory.GetImplementation("MSSQL");
//		
//		PasajeroFrecuente psFrecuente = new PasajeroFrecuente("a", "a", "b", "b");
		
		//-----------------------------------------------------------------

		cliInter = ClienteFactory.GetImplementation("MSSQL");
		
//		Cliente cliente = new Cliente(0, "ave", "123456", "111", "111", date, 3, 1, 2, 3);
		
		
//		ArrayList<String> asd = cliInter.ListarPaises();
//		
//		for (String i : asd) {
//			
//		if(i != null) System.out.println(i.toString());}
		
		//-----------------------------------------------------------------

		
		telInter = 	TelefonoFactory.GetImplementation("MSSQL");
			
//		Telefono telefono = new Telefono("a", "b", "c");
	
		//-----------------------------------------------------------------

		direccionInterfaz  = DireccionFactory.GetImplementation("MSSQL");
		
//		Direccion direccion = new Direccion("c", "d", "d", "d", "d", "d");
		
		//-----------------------------------------------------------------

		
//		telInter.AltaTelefono(telefono);
//		int telefonoID = telInter.getTelefono();
//		System.out.println(telefonoID);
//		
//		int pfID = pFrecuenteInterfaz.AltaPasajeroFrecuente(psFrecuente);
//		System.out.println(pfID);
//		
//		int pasaporteID = pasaporteInterfaz.AltaPasaporte(pasaporte);
//		System.out.println(pasaporteID);
//
//		int idDireccion = direccionInterfaz.AltaDireccion(direccion);
//		System.out.println(idDireccion);
		
//		cliente.setIdDireccion(idDireccion);
//		cliente.setIdPasajeroFrecuente(pfID);
//		cliente.setIdPasaporte(pasaporteID);
//		cliente.setIdTelefono(telefonoID);
		
		
 //		System.out.println(cliInter.ModificarCliente(265, cliente));
			
			
}
}
	