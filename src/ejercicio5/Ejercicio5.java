package ejercicio5;

public class Ejercicio5 {

	public static boolean esCapicua(int numero) {
		
		boolean capicua=false;
		int numReves=0;
		int aux=numero;
		int cifra = 0;

		
//		if(numero<=9) {  4334
//			capicua=true;
//		}else if (numero>=9 && numero<=99 && numero%11==0){
//			capicua=true;
//		}else if (numero>=99 && numero<=999 && numero%10==numero/100) {
//			capicua=true;
//		}
		

		while(aux!=0) {		
			
			cifra = aux % 10;
			
			numReves = numReves * 10 + cifra;
			
			aux = aux /10;
			
		}
		
		if(numReves == numero) {
			capicua=true;
		}
		
		return capicua;
	}
	
}
