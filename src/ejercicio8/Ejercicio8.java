package ejercicio8;

public class Ejercicio8 {
	
	public static int fibonacci(int num) throws Exception {

		int siguiente = 1;
		int anterior = 0;
		int suma = 0;

		if (num >= 1) {

			if (num == 2 || num==1) {
				suma = 1;
			} else {

				for (int i = 2; i <= num; i++) {

					if (i == 2) {
						siguiente = 1;
						anterior = 0;
						suma = 0;
					}

					suma = siguiente + anterior;

					anterior = siguiente;

					siguiente = suma;

				}
			}
		} else
			throw new Exception("Número no válido");
		
		System.out.println(suma);
		return suma;
	}

}
