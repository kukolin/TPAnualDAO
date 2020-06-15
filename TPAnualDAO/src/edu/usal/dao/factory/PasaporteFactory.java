package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.PasaporteImpl;
import edu.usal.dao.interfaces.PasaporteInterfaz;

public class PasaporteFactory {
	public static PasaporteInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new PasaporteImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
