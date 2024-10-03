package ejercicio6;

public class Ejercicio6 {

	public static double calculadora(int num1, int num2, int opc) {
		
		double result=0;
		
		switch(opc) {
		case 1:
			result=num1+num2;
			break;
		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
			break;
		}
		
		return result;
	}
	
}
