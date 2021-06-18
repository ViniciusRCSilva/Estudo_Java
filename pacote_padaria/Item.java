
public class Item {
	Produto produto;
	int quantidade;
	
	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String getInfo() {
		return produto.codigo + " " +  produto.nome + " R$" + produto.preco + " " + quantidade + " R$" + this.quantidade*produto.preco;
	}
	
	public float getValorTotal() {
		return this.quantidade*produto.preco;
	}
}