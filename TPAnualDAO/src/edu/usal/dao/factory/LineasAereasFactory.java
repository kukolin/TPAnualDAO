package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.implementacion.LineasAereasImpl;
import edu.usal.dao.interfaces.LineasAereasInterfaz;

public class LineasAereasFactory {

	
	public static LineasAereasInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new LineasAereasImpl();
		}
		else if(source.equals("MySQL")) {
			
	//		return new SQLDAOMysql();
		}
		return null;
	}
	
}
