package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.VuelosImpl;
import edu.usal.dao.interfaces.VuelosInterfaz;

public class VuelosFactory {
	public static VuelosInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new VuelosImpl();
		}
		else if(source.equals("MySQL")) {
			
	//		return new SQLDAOMysql();
		}
		return null;
	}
}
