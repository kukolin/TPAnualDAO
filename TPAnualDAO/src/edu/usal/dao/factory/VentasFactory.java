package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.VentasImpl;
import edu.usal.dao.interfaces.VentasInterfaz;

public class VentasFactory {

	
	
	public static VentasInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new VentasImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
