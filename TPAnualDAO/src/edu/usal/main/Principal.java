package edu.usal.main;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.implementacion.ClienteImpl;
import edu.usal.dao.implementacion.LineasAereasImpl;
import edu.usal.dao.implementacion.VentasImpl;
import edu.usal.dao.implementacion.VuelosImpl;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.LineasAereasInterfaz;
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

	public static void main (String args[]) throws SQLException, IOException {
		
//		Date date1 = new Date(125125125);
//		
//		Pasaporte pasaporte1 = new Pasaporte("b", "b", "b", date1, date1);
//		Direccion direccion1 = new Direccion("a", "a", "a","a","a","a");
//		PasajeroFrecuente ps = new PasajeroFrecuente("c","c","c","c");
//		Telefono telefono = new Telefono("d","d","d");
//		
//		Cliente Lucas = new Cliente("e","e","e","e",date1, pasaporte1, telefono, direccion1, ps);
//		LineasAereas lineas = new LineasAereas("a", "a", 0);
//		
//		Ventas ventas = new Ventas(3, 3, 3, date1, "asd");
//		
//		Vuelos vuelos = new Vuelos("b", "b", 10, date1, date1, "b", "b", 10);
//		
//		ClienteInterfaz inter = new ClienteImpl();
//		LineasAereasInterfaz inter2 = new LineasAereasImpl();
//		VuelosInterfaz inter3 = new VuelosImpl();
//		VentasInterfaz inter4 = new VentasImpl();
//		
//		//inter4.AltaVentas(ventas);
//		
//		
//		//inter3.AltaVuelos(vuelos);
//		//inter3.BajaVuelos(3);
//		
//		ArrayList<String> lista = new ArrayList();
//		
//		lista = inter.ListarProvincias();
//		
//		for(int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
//		
//		
//		
//		//inter2.BajaLineas(2);
//		//System.out.print(inter2.ListarLineas());
//		
//		//System.out.println(inter.AltaCliente(Lucas));
//		
//		//inter.BajaCliente(5);
//		
//	//	System.out.println(inter.ListarClientes());
//		
	}
	
}
