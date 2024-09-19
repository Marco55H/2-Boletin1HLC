package ejercicio4;

public class Ejercicio4 {

	public static boolean EsPrimo(int numero) {

		boolean esPrimo = true;
		int cont = 2;

		while (cont <= (numero/2) && esPrimo) {
			
			if(numero%cont==0) {
				esPrimo=false;
			}
			
			cont++;
		}

		return esPrimo;
	}
}
