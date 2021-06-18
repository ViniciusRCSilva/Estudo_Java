
public class Principal {

	public static void main(String[] args) {
		Comanda lista_comanda = new Comanda();
		
		lista_comanda.inserir_produto(new Produto("Leite", 123, 15), 3);
		lista_comanda.inserir_produto(new Produto("Pao", 124, 8), 5);
		lista_comanda.inserir_produto(new Produto("Biscoito", 125, 5), 2);
		lista_comanda.inserir_produto(new Produto("Nescau", 126, 10), 1);
		
		lista_comanda.imprimir_comanda();
	}

}