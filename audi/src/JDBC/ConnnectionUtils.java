package JDBC;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class ConnnectionUtils {

	public static void main(String[] args) throws SQLException,
    ClassNotFoundException {

		System.out.println("Get connection ... ");

	      Connection conn = ConnnectionUtils.getMyConnection();

	      System.out.println("Get connection " + conn);

	      System.out.println("Done!");
		
	}
	
	 public static Connection getMyConnection() throws SQLException,
     ClassNotFoundException {
		 return SQLServerConnUtils_JTDS.getSQLServerConnection();
	 }
	 
	 
}
