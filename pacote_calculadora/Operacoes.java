package pacote_calculadora;

public class Operacoes extends Calculadora {
	public double soma(double x, double y) {
		return x+y;
	}
	
	public double subtracao(double x, double y) {
		return x-y;
	}
	
	public double multiplicacao(double x, double y) {
		return x*y;
	}
	
	public double divisao(double x, double y) {
		if(y == 0) {
			System.out.println("Error");
			return -1;
		}else {
			return x/y;	
		}	
	}
}
