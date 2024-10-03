package ejercicio7;

public class Ejercicio7 {

	public static boolean fechas(int dia, int mes, int año) {
		boolean res = false;

		if (año >= 1 && año <= 2024) {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:

				if (dia >= 1 && dia <= 31) {
					res = true;
				}

				break;
			case 4, 6, 9, 11:

				if (dia >= 1 && dia <= 30) {
					res = true;
				}

				break;
			case 2:

				if (año % 4 == 0) {
					if (dia >= 1 && dia <= 29) {
						res = true;
					}
				} else {
					if (dia >= 1 && dia <= 28) {
						res = true;
					}
				}

				break;
			}
		}
		return res;
	}
}
