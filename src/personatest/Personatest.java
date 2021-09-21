package personatest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.persona;
import modelo.Alumno;
import modelo.Profesor;

public class Personatest {
    persona personaVacio;
    persona personaLleno;
    persona p1Vacio;
    //lisy y set son interfaces
    List<persona> lstpersonas; //pemite duplicados y es ordered (uno atras del otro
    Set<persona> setpersonas; //NO PERMITE suplicado y se guardan solo DIOS sabe;

	@Before
	public void setUp() throws Exception {
		//upcast 
			
		personaVacio = new Alumno();
		personaLleno = new Alumno("Jose","Garcia",12355);
		p1Vacio = new Profesor();
		
		lstpersonas = new ArrayList<persona>();
		lstpersonas.add(new Alumno());
		
		lstpersonas.add(new Alumno("Juan","García",5894791));
		lstpersonas.add(new Alumno("Javi","García",589791));
		lstpersonas.add(new Alumno("Juan","Gar",589491));
		
		lstpersonas.add(new Profesor("Gabriel", "Casas", "jfklasj"));
		lstpersonas.add(new Profesor("Samu", "Casas", "jflasj"));
		lstpersonas.add(new Profesor("Carlos", "Casas", "jfklaj"));

		setpersonas = new HashSet<persona>();
		setpersonas.add(new Alumno());
		setpersonas.add(new Profesor());
		
		setpersonas.add(new Alumno("Juan","García",5894791));
		setpersonas.add(new Alumno("Javi","García",589791));
		setpersonas.add(new Alumno("Juan","Gar",589491));
		
		setpersonas.add(new Profesor("Gabi", "Casas", "jfklasj"));
		setpersonas.add(new Profesor("Samu", "Casas", "jflasj"));
		setpersonas.add(new Profesor("Carlos", "Casas", "jfklaj"));
		
		
	}

	@After
	public void tearDown() throws Exception {
		personaVacio = null;
		personaLleno = null;
		p1Vacio	= null;
		lstpersonas  = null;
		setpersonas  = null;
		
	}
	@Test
	public void listaEqualsContainsTRUE(){
		persona cPrueba = new Alumno();
		assertTrue(lstpersonas.contains(cPrueba));
	}

	@Test
	public void testAlumnoVERDADERO(){
		persona alumno = new Alumno();
		assertTrue(personaVacio.equals(alumno));
	}
	
	@Test
	public void testpersona() {
		//pruebo el contructor vacio
		assertEquals("Alberto", personaVacio.getNombre());
		assertEquals("Sanchez", personaVacio.getApellido());
		
	}

	@Test
	public void testpersonaLleno() {
		assertEquals("Jose", personaLleno.getNombre());
		assertEquals("Garcia", personaLleno.getApellido());
	}

	}
	//TODO a los alumnos osados que agreguen los test que crean neceario hasta que pinche
