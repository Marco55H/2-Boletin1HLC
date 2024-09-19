package ejercico3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void testFizz() {
		String esFizz = Ejercicio3.FizzBuzz(9);
		
		assertEquals("Fizz", esFizz);
	}
	
	@Test
	void testBuzz() {
		String esBuzz = Ejercicio3.FizzBuzz(10);
		
		assertEquals("Buzz", esBuzz);
	}

	@Test
	void testFizzBuzz() {
		String esFizzBuzz = Ejercicio3.FizzBuzz(15);
		
		assertEquals("FizzBuzz", esFizzBuzz);
	}
	
	@Test
	void testVacio() {
		String esVacio = Ejercicio3.FizzBuzz(23);
		
		assertEquals("", esVacio);
	}
	
}
