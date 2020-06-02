package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.TelefonoImpl;
import edu.usal.dao.interfaces.TelefonoInterfaz;

public class TelefonoFactory {
	public static TelefonoInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new TelefonoImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
