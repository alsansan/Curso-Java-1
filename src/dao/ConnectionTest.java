package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public ConnectionTest() {	}

	public static void main(String[] args) {
		try {
			//1- driver levantar el driver			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2- conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "admin", "admin");
			//3- creao la sentencia
			Statement stm = conexion.createStatement();
			//4-ejecuto la consulta
			ResultSet rs = stm.executeQuery("select alu_id, alu_apellido, alu_nombre, alu_estudios, alu_linkgit from alumnos");
			while(rs.next()){
				System.out.print("apellido=" + rs.getString("alu_apellido"));
				System.out.println(", nombre=" + rs.getString("alu_nombre"));
			}
			rs.close();
			conexion.close();		
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

}
