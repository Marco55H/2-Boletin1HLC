package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4Test {

	@Test
	void test2() {
		Boolean esPrimo = Ejercicio4.EsPrimo(2);
		
		assertTrue(esPrimo);
	}
	
	@Test
	void test3() {
		Boolean esPrimo = Ejercicio4.EsPrimo(3);
		
		assertTrue(esPrimo);
	}
	
	@Test
	void test5() {
		Boolean esPrimo = Ejercicio4.EsPrimo(5);
		
		assertTrue(esPrimo);
	}
	
	@Test
	void test8() {
		Boolean esPrimo = Ejercicio4.EsPrimo(8);
		
		assertFalse(esPrimo);
	}
	
	@Test
	void test9() {
		Boolean esPrimo = Ejercicio4.EsPrimo(9);
		
		assertFalse(esPrimo);
	}
	
	@Test
	void test15() {
		Boolean esPrimo = Ejercicio4.EsPrimo(15);
		
		assertFalse(esPrimo);
	}
}
