package pacote;

public class Pessoa {
	private int codigo;
	private String nome;
	private String data_de_nascimento;
	private String identidade;
	
	// Faz assossiação de endereco e contato (Agregação).
    Endereco endereco = new Endereco();
	Contatos contato = new Contatos();
	
	/* GETTERS E SETTERS */
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getData_de_nascimento() {
		return data_de_nascimento;
	}
	
	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	
	public String getIdentidade() {
		return identidade;
	}
	
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
}
