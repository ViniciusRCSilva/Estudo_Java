package pacote_calculadora;

public class Divisao extends Calculadora {
	public double calcular(double x, double y) {
		if(y == 0) {
			System.out.println("Error");
			return -1;
		}else {
			return x/y;	
		}	
	}
}
