package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.PasajeroFrecuenteImpl;
import edu.usal.dao.interfaces.PasajeroFrecuenteInterfaz;

public class PasajeroFrecuenteFactory {
	public static PasajeroFrecuenteInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new PasajeroFrecuenteImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
