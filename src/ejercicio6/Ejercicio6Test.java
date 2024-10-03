package ejercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio5.Ejercicio5;

class Ejercicio6Test {

	@Test
	void suma1() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,1);
		
		assertEquals(5,resultadoObtenido);
	}
	
	@Test
	void suma2() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,1);
		
		assertNotEquals(6,resultadoObtenido);
	}
	
	@Test
	void resta1() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,2);
		
		assertEquals(1,resultadoObtenido);
	}
	
	@Test
	void resta2() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,2);
		
		assertNotEquals(8,resultadoObtenido);
	}
	
	@Test
	void multiplicacion1() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,3);
		
		assertEquals(6,resultadoObtenido);
	}
	@Test
	void multiplicacion2() {
		double resultadoObtenido = Ejercicio6.calculadora(3,2,3);
		
		assertNotEquals(8,resultadoObtenido);
	}
	
	@Test
	void division1() {
		double resultadoObtenido = Ejercicio6.calculadora(3,1,4);
		
		assertEquals(3,resultadoObtenido);
	}
	@Test
	void division2() {
		double resultadoObtenido = Ejercicio6.calculadora(3,1,4);
		
		assertNotEquals(8,resultadoObtenido);
	}
	
	@Test
	void raro() {
		double resultadoObtenido = Ejercicio6.calculadora(3,1,8);
		
		assertEquals(0,resultadoObtenido);
	}

}
