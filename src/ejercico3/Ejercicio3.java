package ejercico3;

public class Ejercicio3 {

	public static String FizzBuzz(int numero) {
		String frase = "";
		
		if(numero%3==0) {
			frase = "Fizz";
		}

		if(numero%5==0) {
			frase += "Buzz";
		}
		
		return frase;
	}
}
