package database;

import java.sql.Connection;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class Util {
	
	public static Connection getConnection(String datasourceName) throws Exception {
		
		Connection con;
		
		try {
			DataSource ds = (DataSource) new InitialContext().lookup(datasourceName);
			con = ds.getConnection();
		}
		catch(Exception e) {
			throw new Exception(e);
		}
		
		return con;
	}

}
