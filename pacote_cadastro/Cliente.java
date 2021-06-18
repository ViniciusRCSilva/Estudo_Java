package pacote;

import java.util.Date;

//Herança -> Cliente herda Pessoa.
public class Cliente extends Pessoa {
	private Date dataCadastro;
	private double valorEmAberto;
	
	// Associação com funcionário.
	Funcionario funcionario;
 
	/* GETTERS E SETTERS */
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contatos getContato() {
		return contato;
	}

	public void setContato(Contatos contato) {
		this.contato = contato;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public Funcionario getFuncionario() {
         return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
         this.funcionario = funcionario;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public double getValorEmAberto() {
		return valorEmAberto;
	}

	public void setValorEmAberto(double valorEmAberto) {
		this.valorEmAberto = valorEmAberto;
	}

	/* METÓDOS */
	public double tiraExtrato() {
		return valorEmAberto;
	}
	
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado.");
	}
} 