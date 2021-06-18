import java.util.ArrayList;

public class Comanda {
	ArrayList<Item> itens;
	
	public Comanda() {
		itens = new ArrayList<Item>();
	}
	
	public void inserir_produto(Produto produto, int quantidade) {
		itens.add(new Item(produto, quantidade));
	}
	
	public void imprimir_comanda() {
		float preco_total = 0;
		Item item;
		
		for (int i=0; i<itens.size(); i++){
			item = itens.get(i);
			
			preco_total += item.getValorTotal();
			
			System.out.println(item.getInfo());
		}
		
		System.out.println("\nValor total da compra: R$" + preco_total);
		
	}

}