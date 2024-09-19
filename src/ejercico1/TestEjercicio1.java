package ejercico1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio1 {

	@ParameterizedTest
	@MethodSource("vocales")
	void testEsVocal(char letra, boolean resEsperado) {
		
		
		boolean resObtenido = Ejercicio1.esVocal(letra);
		assertEquals(resEsperado, resObtenido);
	}
	
	private static Stream<Arguments> vocales(){
		return Stream.of(Arguments.of('a', true),
				Arguments.of('A', true),
				Arguments.of('e', true),
				Arguments.of('I', true),
				Arguments.of('o', true),
				Arguments.of('U', true),
				Arguments.of('b', false));
	}
	

//	@Test
//	void testEsVocalA() {
//		boolean result = Ejercicio1.esVocal('a');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalAM() {
//		boolean result = Ejercicio1.esVocal('A');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalE() {
//		boolean result = Ejercicio1.esVocal('e');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalOM() {
//		boolean result = Ejercicio1.esVocal('O');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalIM() {
//		boolean result = Ejercicio1.esVocal('I');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalU() {
//		boolean result = Ejercicio1.esVocal('u');
//		assertTrue(result);
//	}
//
//	@Test
//	void testEsVocalConsonante() {
//		boolean result = Ejercicio1.esVocal('p');
//		assertFalse(result);
//	}
}
