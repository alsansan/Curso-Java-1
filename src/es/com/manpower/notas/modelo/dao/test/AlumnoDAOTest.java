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

import es.com.manpower.notas.modelo.Alumno;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.modelo.dao.AlumnoDAO;
import es.com.manpower.notas.modelo.dao.DAO;
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
		try {
			//1- leo los datos datos de Marina que es el registro para modificar
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConection();
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select  ALU_ID  from alumnos where alu_nombre ='Marina_test'");
			rs.next();
			
			//2- modifico el objeto con los datos de Marina			
			Alumno alu = new Alumno(rs.getInt("ALU_ID")		, 
									"MarinaModif_test"		,
									"Calvo PereaModif_test", 
									"FisicaMofi_test"		, 
									"RepoModif")			;
			
			alumnoDao.modificar(alu);
			
			//3 leer que paso
			StringBuilder sql = new StringBuilder("Select  ALU_ID, ALU_NOMBRE, ALU_APELLIDO , ALU_ESTUDIOS , ALU_LINKGIT");
			sql.append("  from alumnos");
			sql.append(" where alu_nombre ='MarinaModif_test'");			
			
			rs = stm.executeQuery(sql.toString() );
			rs.next();
			Alumno aluLeido = new Alumno(	rs.getInt("ALU_ID")			, 
											rs.getString("ALU_NOMBRE")	,
											rs.getString("ALU_APELLIDO"),  
											rs.getString("ALU_ESTUDIOS"), 
											rs.getString("ALU_LINKGIT"));
			
			assertEquals(alu.getCodigo()			, aluLeido.getCodigo())			;
			assertEquals(alu.getNombre()			, aluLeido.getNombre())			;
			assertEquals(alu.getApellido()			, aluLeido.getApellido())		;
			assertEquals(alu.getEstudios()			, aluLeido.getEstudios())		;
			assertEquals(alu.getLinkArepositorio()	, aluLeido.getLinkArepositorio());

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
			ResultSet rs = stm.executeQuery("Select  ALU_ID  from alumnos where alu_nombre ='Monsef_test'");
			rs.next();
			
		//2- elimino	
			Alumno alu = new Alumno(rs.getInt("ALU_ID"));
			alumnoDao.eliminar(alu);
	   //3- que paso?
			
			rs = stm.executeQuery("Select  ALU_ID  from alumnos where alu_nombre ='Monsef_test'");			
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
			ResultSet rs = stm.executeQuery("Select  ALU_ID  from alumnos where alu_nombre ='Aarn_test'");
			rs.next();
			
			Alumno alu = new Alumno(rs.getInt("ALU_ID"));
			List<Model>alumnos = alumnoDao.leer(alu);
			
			assertEquals("Aarn_test"											, ((Alumno)alumnos.get(0)).getNombre());
			assertEquals("Snchez Snchez_test"									, ((Alumno)alumnos.get(0)).getApellido());
			assertEquals("Desarrollo de Aplicaciones Multiplataforma_test"		, ((Alumno)alumnos.get(0)).getEstudios());
			assertEquals("https://github.com/Pashinian/CursoJava2021.git_test"	, ((Alumno)alumnos.get(0)).getLinkArepositorio());
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}

	}

}
