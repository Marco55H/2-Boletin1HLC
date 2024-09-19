package ejercico1;

public class Ejercicio1 {
	
public static boolean esVocal(char letra) {
	boolean vocal = false;
	char vocalMinuscula = Character.toLowerCase(letra);
	
	
	switch(vocalMinuscula) {
	case 'a','e','i','o','u':
		vocal=true;
		break;
	}
	
	return vocal;
}

}

