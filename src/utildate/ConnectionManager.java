package utildate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection conection;
	
	
	public static void  conectar() throws ClassNotFoundException, SQLException {
		//1- driver levantar el driver			
		Class.forName("com.mysql.jdbc.Driver");
		//2- conexion
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "sistema", "sistema");
	}
	
	public static void desConectar() throws SQLException{
		conection.close();
	}
	public static Connection getConection(){
		return conection;
	}

}
