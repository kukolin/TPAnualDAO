package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.AeropuertoImpl;
import edu.usal.dao.interfaces.AeropuertoInterfaz;

public class AeropuertoFactory {
	public static AeropuertoInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new AeropuertoImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
