package ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio4.Ejercicio4;

class Ejercicio5Test {

	@Test
	void capicua2() {
		Boolean esCapicua = Ejercicio5.esCapicua(2);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua9() {
		Boolean esCapicua = Ejercicio5.esCapicua(9);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua10() {
		Boolean esCapicua = Ejercicio5.esCapicua(10);
		
		assertFalse(esCapicua);
	}
	
	@Test
	void capicua22() {
		Boolean esCapicua = Ejercicio5.esCapicua(22);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua31() {
		Boolean esCapicua = Ejercicio5.esCapicua(10);
		
		assertFalse(esCapicua);
	}
	
	@Test
	void capicua55() {
		Boolean esCapicua = Ejercicio5.esCapicua(55);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua100() {
		Boolean esCapicua = Ejercicio5.esCapicua(100);
		
		assertFalse(esCapicua);
	}
	
	@Test
	void capicua202() {
		Boolean esCapicua = Ejercicio5.esCapicua(202);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua301() {
		Boolean esCapicua = Ejercicio5.esCapicua(301);
		
		assertFalse(esCapicua);
	}
	
	@Test
	void capicua555() {
		Boolean esCapicua = Ejercicio5.esCapicua(555);
		
		assertTrue(esCapicua);
	}
	
	@Test
	void capicua1000() {
		Boolean esCapicua = Ejercicio5.esCapicua(1000);
		
		assertFalse(esCapicua);
	}
	
	@Test
	void capicua4334() {
		Boolean esCapicua = Ejercicio5.esCapicua(4334);
		
		assertFalse(esCapicua);
	}
	
}
