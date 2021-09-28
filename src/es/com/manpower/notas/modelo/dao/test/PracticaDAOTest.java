package es.com.manpower.notas.modelo.dao.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import es.com.manpower.notas.modelo.Practica;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.modelo.dao.PracticaDAO;
import es.com.manpower.notas.modelo.dao.DAO;
import es.com.manpower.notas.util.ConnectionManager;

public class PracticaDAOTest {
	//defino el objtedo 
	DAO practicaDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConection();
		
	    Statement consulta= con.createStatement();
	
	    String sql = "";
	    BufferedReader bf = new BufferedReader( new InputStreamReader( PracticaDAOTest.class.getResource( "PracticasCrear.sql" ).openStream() ) );
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
	    BufferedReader bf = new BufferedReader( new InputStreamReader( PracticaDAOTest.class.getResource( "PracticasEliminar.sql" ).openStream() ) );
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
		practicaDao = new PracticaDAO();
	}

	@After
	public void tearDown() throws Exception {
		practicaDao = null;
	}

	@Test
	public void testAgregar() {
		try {
			practicaDao.agregar(new Practica(0, "Gabriel_test"));
			//tengo que leer 
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select prac_nombre from practicas where prac_nombre ='Gabriel_test'");
			rs.next();
			assertEquals("Gabriel_test", rs.getString("prac_nombre"));
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	public void testModificar() {
		try {
			//1- leo los datos datos de Marina que es el registro para modificar
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select  PRAC_ID  from practicas where PRAC_NOMBRE ='Marina_test'");
			rs.next();
			
			//2- modifico el objeto con los datos de Marina			
			Practica pra = new Practica(rs.getInt("ALU_ID")		, 
									"MarinaModif_test"			);
			
			practicaDao.modificar(pra);
			
			//3 leer que paso
			StringBuilder sql = new StringBuilder("Select  PRAC_ID, PRAC_NOMBRE");
			sql.append("  from practicas");
			sql.append(" where prac_nombre ='MarinaModif_test'");			
			
			rs = stm.executeQuery(sql.toString() );
			rs.next();
			Practica praLeido = new Practica(	rs.getInt("PRAC_ID")			, 
											rs.getString("PRAC_NOMBRE"));
			
			assertEquals(pra.getCodigo()			, praLeido.getCodigo())			;
			assertEquals(pra.getNombre()			, praLeido.getNombre())			;

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
	}

	@Test
	public void testEliminar() {
		//1- leo los datos datos de Marina que es el registro para modificar
		try {
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select  PRAC_ID  from practicas where PRAC_NOMBRE ='Monsef_test'");
			rs.next();
			
		//2- elimino	
			Practica pra = new Practica(rs.getInt("ALU_ID"));
			practicaDao.eliminar(pra);
	   //3- que paso?
			
			rs = stm.executeQuery("Select  PRAC_ID  from practicas where PRAC_NOMBRE ='Monsef_test'");			
			assertFalse(rs.next());			

		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);			
			e.printStackTrace();
		}

	}

	@Test
	public void testLeerPorCodigo() {
		try {
			//1- lectura de los datos objetivo conseguir el id
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select  PRAC_ID  from practicas where PRAC_NOMBRE ='Aarn_test'");
			rs.next();
			
			Practica pra = new Practica(rs.getInt("Prac_ID"));
			List<Model>practicas = practicaDao.leer(pra);
			
			assertEquals("Aarn_test"											, ((Practica)practicas.get(0)).getNombre());
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

}
