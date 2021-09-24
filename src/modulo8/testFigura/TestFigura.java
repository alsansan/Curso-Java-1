package modulo8.testFigura;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo8.Figura;
import modulo8.Circulo;
import modulo8.Cuadrado;
import modulo8.Rectangulo;
import modulo8.Triangulo;

public class TestFigura {
	
	Figura circulo1;
	Figura circulo2;
	Figura cuadrado1;
	Figura cuadrado2;
	Figura rectangulo1;
	Figura rectangulo2;
	Figura triangulo1;
	Figura triangulo2;
	
	List<Figura> lstfigura;
	Set<Figura> setfigura;
	
	@Before
	public void setUp() throws Exception {
		circulo1 = new Circulo();
		circulo2 = new Circulo("circulo",30);
		cuadrado1 = new Cuadrado();
		cuadrado2 = new Cuadrado("cuadrado",30);
		rectangulo1 = new Rectangulo();
		rectangulo2 = new Rectangulo("rectangulo",30,10);
		triangulo1 = new Triangulo();
		circulo2 = new Triangulo("triangulo",5,10,15);
		
		lstfigura = new ArrayList<Figura>();
		lstfigura.add(new Circulo());
		lstfigura.add(new Cuadrado());
		lstfigura.add(new Rectangulo());
		lstfigura.add(new Triangulo());
		
		lstfigura.add(new Circulo("circulo", 10));
		lstfigura.add(new Circulo("circulo",20));
		
		lstfigura.add(new Cuadrado("cuadrado", 10));
		lstfigura.add(new Cuadrado("cuadrado",20));
		
		lstfigura.add(new Rectangulo("rectangulo", 10, 20));
		lstfigura.add(new Rectangulo("rectangulo", 15, 15));
		
		lstfigura.add(new Triangulo("triangulo", 10,15,20));
		lstfigura.add(new Triangulo("triangulo",1,2,3));
		
		setfigura = new HashSet<Figura>();
		setfigura.add(new Circulo());
		setfigura.add(new Cuadrado());
		setfigura.add(new Rectangulo());
		setfigura.add(new Triangulo());
		
		setfigura.add(new Circulo("circulo", 10));
		setfigura.add(new Circulo("circulo",20));
		
		setfigura.add(new Cuadrado("cuadrado", 10));
		setfigura.add(new Cuadrado("cuadrado",20));
		
		setfigura.add(new Rectangulo("rectangulo", 10, 20));
		setfigura.add(new Rectangulo("rectangulo", 15, 15));
		
		setfigura.add(new Triangulo("triangulo", 10,15,20));
		setfigura.add(new Triangulo("triangulo",1,2,3));
		
	}
	
	@After
	public void tearDown() throws Exception {
		circulo1 = null;
		circulo2 = null;
		cuadrado1 = null;
		cuadrado2 = null;
		rectangulo1 = null;
		rectangulo2 = null;
		triangulo1 = null;
		circulo2 = null;
		lstfigura = null;
		setfigura = null;
		Figura.setMaximasuperficie(0);
	}
	

	@Test
	public void testListaEqualsTRUE() {
		Figura forma = new Circulo();
		assertTrue(lstfigura.contains(forma));
	}
	@Test
	public void testListaAdd(){		
		Figura cPrueba = new Circulo();		
		assertTrue(lstfigura.add(cPrueba));
		System.out.println("lstfigura=" + lstfigura);
	}
	@Test
	public void testSetAdd(){
		Figura cPrueba = new Circulo();		
		assertFalse(setfigura.add(cPrueba));
		System.out.println("setfigura=" + setfigura);
	}
	@Test
	public void testCirculoEqualsVERDADERO(){
		Figura circulo = new Circulo();
		assertTrue(circulo1.equals(circulo));
	}
	public void testFigura() {
		assertEquals(1, circulo1.getFigura());
		assertEquals(1,circulo1.getMaximasuperficie(),1);
	}
	public void testEquals() {
		Circulo ci = new Circulo();
		assertTrue(cuadrado1.equals(ci));
	}


}
