package patronesfactory.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import patronesfactory.Papel;
import patronesfactory.Piedra;
import patronesfactory.PiedraPapelTijeraFactory;
import patronesfactory.Tijera;

public class PiedraPapelTijeraFactoryTest {
	PiedraPapelTijeraFactory piedra ;
	PiedraPapelTijeraFactory papel 	;
	PiedraPapelTijeraFactory tijera	;

	@Before
	public void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@After
	public void tearDown() throws Exception {
		piedra 	= null;
		papel 	= null;
		tijera 	= null;
	}
	@Test
	public void testComparaPiedraPierdePapel(){
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("piedra perdio con papel", piedra.getDescripcionResultado());
	}

	@Test
	public void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(0) instanceof Piedra);
	}

	@Test
	public void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(1) instanceof Papel);
	}
	@Test
	public void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(2) instanceof Tijera);
	}

}
