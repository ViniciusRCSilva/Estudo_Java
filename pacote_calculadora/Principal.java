package pacote_calculadora;

public class Principal {

	public static void calculaOperacao(Calculadora op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}
		
	public static void main(String[] args) {
		
		calculaOperacao(new Soma(), 100, 200);
		calculaOperacao(new Subtracao(), 100, 200);
		calculaOperacao(new Multiplicacao(), 100, 200);
		calculaOperacao(new Divisao(), 100, 200);

	}

}
