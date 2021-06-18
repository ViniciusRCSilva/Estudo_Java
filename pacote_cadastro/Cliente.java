package pacote;

import java.util.Date;

//Heran�a -> Cliente herda Pessoa.
public class Cliente extends Pessoa {
	private Date dataCadastro;
	private double valorEmAberto;
	
	// Associa��o com funcion�rio.
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

	/* MET�DOS */
	public double tiraExtrato() {
		return valorEmAberto;
	}
	
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado.");
	}
} 