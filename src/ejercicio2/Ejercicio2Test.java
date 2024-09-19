package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void test2EsPar() {
		boolean esPar = Ejercicio2.esPar(2);
		
		assertTrue(esPar);
	}
	
	@Test
	void test4EsPar() {
		boolean esPar = Ejercicio2.esPar(4);
		
		assertTrue(esPar);
	}
	
	@Test
	void test5EsPar() {
		boolean esPar = Ejercicio2.esPar(5);
		
		assertFalse(esPar);
	}
	
	@Test
	void testMenos5EsPar() {
		boolean esPar = Ejercicio2.esPar(-5);
		
		assertFalse(esPar);
	}

	@Test
	void testMenos12EsPar() {
		boolean esPar = Ejercicio2.esPar(-12);
		
		assertTrue(esPar);
	}
}
