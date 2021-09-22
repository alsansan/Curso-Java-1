package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelonotas.Alumno;
import dao.AlumnoDAO;
import dao.DAO;
import es.com.manpower.notas.util.ConnectionManager;

public class AlumnoDAOTest {
	//defino el objtedo 
	DAO alumnoDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader( new InputStreamReader( AlumnoDAOTest.class.getResource( "AlumnosCrear.sql" ).openStream() ) );
	    while ( (sql = bf.readLine()) != null ) {
	       if ( sql.trim().length() != 0 &&
	            !sql.startsWith( "--" ) ) {              
	          consulta.executeUpdate( sql );
	       }
	    }
	    ConnectionManager.desConectar();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader( new InputStreamReader( AlumnoDAOTest.class.getResource( "AlumnosEliminar.sql" ).openStream() ) );
	    while ( (sql = bf.readLine()) != null ) {
	       if ( sql.trim().length() != 0 &&
	            !sql.startsWith( "--" ) ) {              
	          consulta.executeUpdate( sql );
	       }
	    }
	    ConnectionManager.desConectar();
	}

	@Before
	public void setUp() throws Exception {
		alumnoDao = new AlumnoDAO();
	}

	@After
	public void tearDown() throws Exception {
		alumnoDao = null;
	}

	@Test
	public void testAgregar() {
		try {
			alumnoDao.agregar(new Alumno(0, "Gabriel_test", "Casas_test", "Estudios_test", "Repo_test"));
			//tengo que leer 
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select alu_nombre from alumnos where alu_nombre ='Gabriel_test'");
			rs.next();
			assertEquals("Gabriel_test", rs.getString("alu_nombre"));
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	public void testModificar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

	@Test
	public void testLeer() {
		fail("Not yet implemented");
	}

}
