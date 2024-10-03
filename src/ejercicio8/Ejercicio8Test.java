package ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio8Test {

	@Test
	void Fibonacci1() throws Exception {
		int resultadoObtenido= Ejercicio8.fibonacci(1);
		
		assertEquals(1,resultadoObtenido);
	}

	@Test
	void Fibonacci3() throws Exception {
		int resultadoObtenido= Ejercicio8.fibonacci(3);
		
		assertEquals(2,resultadoObtenido);
	}
	
	@Test
	void Fibonacci6() throws Exception {
		int resultadoObtenido= Ejercicio8.fibonacci(6);
		
		assertEquals(8,resultadoObtenido);
	}
	
	@Test
	void Fibonacci13() throws Exception {
		int resultadoObtenido= Ejercicio8.fibonacci(13);
		
		assertEquals(233,resultadoObtenido);
	}
	
	@Test
	void Fibonacci0() {
		try {
			int resultadoObtenido= Ejercicio8.fibonacci(0);
			
			fail("Debería haber tirado excepción");
		} catch (Exception e) {
			
			
		}
		
		
	}
}
