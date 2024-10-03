package ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio9Test {

	@Test
	void test1() {

		String resultadoObtenido=Ejercicio9.binario(1);
		
		assertEquals("1",resultadoObtenido);
		
	}
	
	@Test
	void test13() {

		String resultadoObtenido=Ejercicio9.binario(13);
		
		assertEquals("1101",resultadoObtenido);
		
	}


	@Test
	void test10() {

		String resultadoObtenido=Ejercicio9.binario(13);
		
		assertEquals("1010",resultadoObtenido);
		
	}

}
