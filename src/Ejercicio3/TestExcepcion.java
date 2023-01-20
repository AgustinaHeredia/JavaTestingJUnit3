package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExcepcion {
		
	//Lo he querido hacer primero así pero me da un error que no entiendo
	/*@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testArrayOutOfBounds() {
	    ArrayExcepcion arrayExcepcion = new ArrayExcepcion();
	    arrayExcepcion.listanombre();
	}*/
	
	
	@Test
	public void testArrayOutOfBounds() {
	    ArrayExcepcion arrayExcepcion = new ArrayExcepcion();
	    assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
	       arrayExcepcion.listanombre();
	    });
	}

}
