package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.DireccionImpl;
import edu.usal.dao.interfaces.DireccionInterfaz;

public class DireccionFactory {
	public static DireccionInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new DireccionImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
