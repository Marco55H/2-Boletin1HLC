package ejercicio7;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio7Test {

	@Test
	void f1_12_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(1,12,2024);
		
		assertTrue(resultadoObtenido);
	}

	@Test
	void f1_12_2025() {
		boolean resultadoObtenido = Ejercicio7.fechas(1,12,2025);
		
		assertFalse(resultadoObtenido);
	}
	
	@Test
	void f1_13_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(1,12,2025);
		
		assertFalse(resultadoObtenido);
	}
	
	@Test
	void f32_12_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(1,12,2025);
		
		assertFalse(resultadoObtenido);
	}
	
	@Test
	void f29_12_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(29,12,2024);
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
	void f20_12_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(20,12,2024);
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
	void f20_1_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(20,1,2024);
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
	void f29_2_2024() {
		boolean resultadoObtenido = Ejercicio7.fechas(29,2,2024);
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
	void f30_3_20() {
		boolean resultadoObtenido = Ejercicio7.fechas(30,3,20);
		
		assertTrue(resultadoObtenido);
	}
	
	@Test
	void f31_2_20() {
		boolean resultadoObtenido = Ejercicio7.fechas(31,2,20);
		
		assertFalse(resultadoObtenido);
	}
	
	
	
	
	
	
}
