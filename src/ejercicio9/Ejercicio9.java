package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		binario(0);
	}
	
	public static String binario(int num) {
		String numBinario = "";
		String numBinarioReal = "";

		int divisor = 2;
		int dividendo = num;
		int resto = 0;

		if (num == 0) {
			numBinarioReal="0";
		} else {
			while (dividendo != 0 && dividendo != 1) {

				resto = dividendo % divisor;

				numBinario = numBinario + resto;

				dividendo = dividendo / divisor;

				System.out.println(dividendo);
			}

			if (dividendo == 0) {
				numBinario += 0;
			} else {
				numBinario += 1;
			}

			for (int i = numBinario.length() - 1; i >= 0; i--) {

				numBinarioReal = numBinarioReal + numBinario.charAt(i);
			}
		}
		System.out.println(numBinarioReal);
		return numBinarioReal;
	}
}
