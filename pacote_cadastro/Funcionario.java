package pacote;

import java.util.ArrayList;
import java.util.Date;

//Herança -> Funcionario herda Pessoa.
public class Funcionario extends Pessoa {
   
	private Date dataAdmissao;
	private Date dataRecisao;
	
	// Instancia vetores do tipo ArrayList (Lista de vetores com tamanho indeterminado).
	private final ArrayList<Cliente> clientes = new ArrayList<>();
	private final ArrayList<Fornecedor> fornecedores = new ArrayList<>();   
    
	/* GETTERS E SETTERS */
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public Date getDataRecisao() {
		return dataRecisao;
	}
    
	/*METODOS DOS CLIENTES*/
	
    public int quantidadeClientes(){
        return clientes.size();
    }
	
	public void setDataRecisao(Date dataRecisao) {
		this.dataRecisao = dataRecisao;
	}
	
	public void cadastraCliente(Cliente cliente) {
		clientes.add(cliente);
    }

	public Cliente getCliente(int posicao) {
		return clientes.get(posicao);
    }
	
	public void removeCliente(Cliente cliente) {   
		clientes.remove(cliente);           
	}
	
	/*METODOS DOS FORNECEDORES*/
	
    public int quantidadeFornecedores(){
        return fornecedores.size();
    }
	
	public void cadastraFornecedor(Fornecedor fornecedor) {
		fornecedores.add(fornecedor);
    }

	public Fornecedor getFornecedor(int posicao) {
		return fornecedores.get(posicao);
    }
	
	public void removeFornecedor(Fornecedor fornecedor) {   
		fornecedores.remove(fornecedor);           
	}

}

