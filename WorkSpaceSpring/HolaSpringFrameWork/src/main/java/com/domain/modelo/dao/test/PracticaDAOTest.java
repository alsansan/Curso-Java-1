package com.domain.modelo.dao.test;

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

import com.domain.modelo.Practica;
import com.domain.modelo.Model;
import com.domain.modelo.dao.PracticaDAO;
import com.domain.modelo.dao.DAO;
import com.domain.util.ConnectionManager;

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
			// tengo que leer
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT PRAC_NOMBRE from practicas where PRAC_NOMBRE = 'Gabriel_test'");
			rs.next();
			assertEquals("Gabriel_test", rs.getString("PRAC_NOMBRE"));
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}	
	}

	@Test
	public void testModificar() {
		try {
			
			//1- leo los datos de Marina para saber el id
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT PRAC_ID  from practicas where PRAC_NOMBRE = 'practica 2 - variables'");
			rs.next();
			//2- modifico los datos
			Practica pra = new Practica(rs.getInt("PRAC_ID"), 
									"practica 2 - variables");
			practicaDao.modificar(pra);
			
			//3- leemos lo que paso
			StringBuilder sql = new StringBuilder("SELECT PRAC_ID, PRAC_NOMBRE");
			sql.append(" from practicas");
			sql.append(" where prac_nombre = 'practica 2 - variables' ");
			
			rs = stm.executeQuery(sql.toString());
			
			rs.next();
			Practica aluLeido = new Practica( rs.getInt("PRAC_ID"), 
											rs.getString("PRAC_NOMBRE"));
			
			assertEquals(pra.getCodigo(), aluLeido.getCodigo());
			assertEquals(pra.getNombre(), aluLeido.getNombre());

		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

	@Test
	public void testEliminar() {
		
		try {
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT PRAC_ID from practicas where PRAC_NOMBRE = 'practica 1 - pantallas'");
			rs.next();
			
			// 2- elimino
			Practica alu = new Practica(rs.getInt("PRAC_ID"));
			practicaDao.eliminar(alu);
			
			//3- que paso?
			rs = stm.executeQuery("SELECT PRAC_ID  from practicas where PRAC_NOMBRE = 'practica 1 - pantallas'");
			
			assertFalse(rs.next());

			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(true);
			e.printStackTrace();
		} 	
	}

	@Test
	public void testLeerPorCodigo() {
		
		try {
			// 1- lectura de los datos, queremos el id
			ConnectionManager.conectar();			
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT PRAC_ID from practicas where PRAC_NOMBRE = 'practica 3 - if-condiciones'");
			rs.next();
					
			Practica alu = new Practica(rs.getInt("PRAC_ID"));
			List<Model> practicas = practicaDao.leer(alu);
			
			assertEquals("practica 3 - if-condiciones", 	((Practica) practicas.get(0)).getNombre());
			
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		} 
	}
	

}