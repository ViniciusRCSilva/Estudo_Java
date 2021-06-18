package pacote;

//Adicionar a bibliotecas necessárias.
import java.util.Scanner;
import java.util.Date;

public class ProjetoVendas {
	public static void main(String[] args) {
		// Scanner para ler o teclado.
		Scanner teclado = new Scanner(System.in);
		
		// Cria o objeto funcionário.
	    Funcionario funcionario1 = new Funcionario();
	    funcionario1.setCodigo(01);
	    funcionario1.setDataAdmissao(new Date());
	    
	    // Instanciando dois vetores de tamanho 100.
	    Cliente[] cliente = new Cliente[100];
	    Fornecedor[] fornecedor = new Fornecedor[100];
	    
	    // Menu
	    while(true) {
	    	int opcao = 0;
	    	
			System.out.println("\n##--Menu--##");
			System.out.println("|-------------------------|");
			System.out.println("| Opção 1 - Novo Cadastro |");
			System.out.println("| Opção 2 - Listar        |");			
			System.out.println("| Opção 3 - Consultar     |");
			System.out.println("| Opção 4 - Alterar       |");
			System.out.println("| Opção 5 - Remover       |");
			System.out.println("| Opção 6 - Sair          |");
			System.out.println("|-------------------------|");
			System.out.println("Digite uma opção: ");
			
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			// Se a opção escolhida for 6, o programa é finalizado.
			if(opcao == 6) {
				System.out.println("\nFinalizando programa.");
				teclado.close();
				
				System.exit(0);
			}
			
			// Cria as opções disponíveis no menu.
			switch(opcao) {
			// Cadastro.
			case 1:
				opcao = 0;
				
				System.out.println("\nDeseja cadastrar um 1 - cliente ou um 2- fornecedor?");
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch(opcao) {
				// Cadastro do cliente, apenas.
				case 1:
				    // Pede para o funcionário o número de clientes para cadastrar.
				    System.out.println("\nDigite o numero de clientes: ");
				    int n = teclado.nextInt(); 
				    teclado.nextLine();
				    
				    // Laço para cadastrar o cliente.
				    for(int i=0; i<n; i++) {  
				    	cliente[i] = new Cliente();
				    	
					    System.out.println("\nCadastro do cliente "+ (i+1) +":");
					    System.out.println("Informe o codigo: ");
					    cliente[i].setCodigo(teclado.nextInt());
					    teclado.nextLine();
					    System.out.println("Informe o nome: ");
					    cliente[i].setNome(teclado.nextLine());
					    System.out.println("Informe a data de nascimento (dd/mm/yyyy): ");
					    cliente[i].setData_de_nascimento(teclado.nextLine());
					    System.out.println("Informe a identidade: ");
					    cliente[i].setIdentidade(teclado.nextLine());
					    
						System.out.println("Contatos do cliente "+ (i+1) +":");
						System.out.println("Informe o telefone: "); 
						cliente[i].contato.setTel1(teclado.nextLine());
						System.out.println("Informe o celular: ");
						cliente[i].contato.setCel1(teclado.nextLine()); 
						System.out.println("Informe o email: ");
						cliente[i].contato.setEmail(teclado.nextLine());
						  
						System.out.println("Endereco do cliente "+ (i+1) +":");
						System.out.println("Informe o CEP: ");
						cliente[i].endereco.setCep(teclado.nextLine()); 
						System.out.println("Informe o estado: ");
						cliente[i].endereco.setEstado(teclado.nextLine());
						System.out.println("Informe a cidade: ");
						cliente[i].endereco.setCidade(teclado.nextLine());
						System.out.println("Informe a rua: ");
						cliente[i].endereco.setRua(teclado.nextLine());
						System.out.println("Informe o numero: ");
						cliente[i].endereco.setNumero(teclado.nextLine()); 
						System.out.println("Informe o complemento: ");
						cliente[i].endereco.setComplemento(teclado.nextLine());
						
					    cliente[i].setDataCadastro(new Date());
					    
					    System.out.println("Informe o valor em aberto: ");
					    cliente[i].setValorEmAberto(teclado.nextDouble());
					    teclado.nextLine();
					    
					    cliente[i].setFuncionario(funcionario1);
					    funcionario1.cadastraCliente(cliente[i]);
					    
					    System.out.println("\nCliente cadastrado com sucesso!");
				    }
				break;
				
				// Cadastro do fornecedor, apenas.
				case 2:
				    // Pede para o funcionário o número de fornecedores para cadastrar.
				    System.out.println("Digite o numero de fornecedores: ");
				    n = teclado.nextInt(); 
				    teclado.nextLine();
				    
				    // Laço para cadastrar o cliente.
				    for(int i=0; i<n; i++) {  
				    	fornecedor[i] = new Fornecedor();
				    	
					    System.out.println("Cadastro do fornecedor "+ (i+1) +":");
					    System.out.println("Informe o codigo: ");
					    fornecedor[i].setCodFornecedor(teclado.nextInt());
					    teclado.nextLine();
					    System.out.println("Informe a razao: ");
					    fornecedor[i].setRazao(teclado.nextLine());
					    System.out.println("Informe o nome: ");
					    fornecedor[i].setNomeFantasia(teclado.nextLine());
					    System.out.println("Informe a inscricao estadual: ");
					    fornecedor[i].setInscEstadual(teclado.nextLine());
					    System.out.println("Informe o CNPJ: ");
					    fornecedor[i].setCnpj(teclado.nextInt());
					    teclado.nextLine();

						System.out.println("Contatos do fornecedor "+ (i+1) +":");
						System.out.println("Informe o telefone: "); 
						fornecedor[i].contato.setTel1(teclado.nextLine());
						System.out.println("Informe o celular: ");
						fornecedor[i].contato.setCel1(teclado.nextLine()); 
						System.out.println("Informe o email: ");
						fornecedor[i].contato.setEmail(teclado.nextLine());
						  
						System.out.println("Endereco do fornecedor "+ (i+1) +":");
						System.out.println("Informe o CEP: ");
						fornecedor[i].endereco.setCep(teclado.nextLine()); 
						System.out.println("Informe o estado: ");
						fornecedor[i].endereco.setEstado(teclado.nextLine());
						System.out.println("Informe a cidade: ");
						fornecedor[i].endereco.setCidade(teclado.nextLine());
						System.out.println("Informe a rua: ");
						fornecedor[i].endereco.setRua(teclado.nextLine());
						System.out.println("Informe o numero: ");
						fornecedor[i].endereco.setNumero(teclado.nextLine()); 
						System.out.println("Informe o complemento: ");
						fornecedor[i].endereco.setComplemento(teclado.nextLine());
						 
					    
					    fornecedor[i].setFuncionario(funcionario1);
					    funcionario1.cadastraFornecedor(fornecedor[i]);	  
					    
					    System.out.println("\nFornecedor cadastrado com sucesso!");
				    }	
				break;
				
				// Caso a opção não exista.
				default:
					System.out.println("\nOpcao Invalida!");
				break;
				}
			break;
			
			// Listar.
			case 2:
				opcao = 0;
				
				System.out.println("\nDeseja listar todos 1 - cliente(s) ou todos 2- fornecedor(es)?");
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch(opcao) {
				// Listar todos os clientes.
				case 1:
					if(funcionario1.quantidadeClientes() == 0) {
						System.out.println("\nNenhum cliente cadastrado.");
					}else {
					    // Mostrar a lista dos clientes.
					    System.out.println("\nClientes Cadastrados: ("+ funcionario1.quantidadeClientes() +" no total)");
					    for(int i=0; i< funcionario1.quantidadeClientes(); i++){
					    	System.out.println("Cliente "+(i+1)+":");
					        System.out.println("Codigo: "+funcionario1.getCliente(i).getCodigo()); 
					        System.out.println("Nome: "+funcionario1.getCliente(i).getNome()); 
					        System.out.println("Data de nascimento: "+funcionario1.getCliente(i).getData_de_nascimento()); 
					        System.out.println("Identidade: "+funcionario1.getCliente(i).getIdentidade()); 
					        System.out.println("Data de cadastro: "+funcionario1.getCliente(i).getDataCadastro()); 
					        System.out.println("Valor em aberto: R$"+funcionario1.getCliente(i).getValorEmAberto()); 
					        System.out.println("Telefone: "+funcionario1.getCliente(i).contato.getTel1()+
					        		", Celular: "+funcionario1.getCliente(i).contato.getCel1());
					        System.out.println("Email: "+funcionario1.getCliente(i).contato.getEmail());
					        System.out.println("Endereco: "+funcionario1.getCliente(i).endereco.getCep()+
					        		", "+funcionario1.getCliente(i).endereco.getEstado()+
					        		", "+funcionario1.getCliente(i).endereco.getCidade()+
					        		", "+funcionario1.getCliente(i).endereco.getRua()+
					        		" "+funcionario1.getCliente(i).endereco.getNumero()+
					        		", "+funcionario1.getCliente(i).endereco.getComplemento());
					    }		
					}
				break;
				
				// Listar todos os fornecedores.
				case 2:
					if(funcionario1.quantidadeFornecedores() == 0) {
						System.out.println("\nNenhum fornecedor cadastrado.");
					}else {
					    // Mostrar a lista dos fornecedores.
					    System.out.println("\nFornecedores Cadastrados: ("+ funcionario1.quantidadeFornecedores() +" no total)");
					    for(int i=0; i< funcionario1.quantidadeFornecedores(); i++){
					    	System.out.println("Fornecedor "+(i+1)+":");
					        System.out.println("Codigo: "+funcionario1.getFornecedor(i).getCodFornecedor()); 
					        System.out.println("Razao: "+funcionario1.getFornecedor(i).getRazao()); 
					        System.out.println("Nome: "+funcionario1.getFornecedor(i).getNomeFantasia()); 
					        System.out.println("Inscricao estadual: "+funcionario1.getFornecedor(i).getInscEstadual()); 
					        System.out.println("CNPJ: "+funcionario1.getFornecedor(i).getCnpj()); 
					        System.out.println("Telefone: "+funcionario1.getFornecedor(i).contato.getTel1()+
					        		", Celular: "+funcionario1.getFornecedor(i).contato.getCel1());
					        System.out.println("Email: "+funcionario1.getFornecedor(i).contato.getEmail());
					        System.out.println("Endereco: "+funcionario1.getFornecedor(i).endereco.getCep()+
					        		", "+funcionario1.getFornecedor(i).endereco.getEstado()+
					        		", "+funcionario1.getFornecedor(i).endereco.getCidade()+
					        		", "+funcionario1.getFornecedor(i).endereco.getRua()+
					        		" "+funcionario1.getFornecedor(i).endereco.getNumero()+
					        		", "+funcionario1.getFornecedor(i).endereco.getComplemento());
					    }	
					}
				break;
				
				// Caso a opção não existir.
				default:
					System.out.println("\nOpcao Invalida!");
				break;
			}
			break;
			
			// Consultar.
			case 3:
				opcao = 0;
				
				System.out.println("\nDeseja consultar um 1 - cliente ou um 2- fornecedor?");
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch(opcao) {
				// Consulta um cliente, apenas.
				case 1:
					if(funcionario1.quantidadeClientes() == 0) {
						System.out.println("\nNenhum cliente cadastrado.");
					}else {
					    // Consultar cliente.
					    System.out.println("\nInforme o codigo para consultar o cliente: ");
					    int codigo = teclado.nextInt();
					    
					    for(int i=0; i< funcionario1.quantidadeClientes(); i++) {
					        if(codigo == funcionario1.getCliente(i).getCodigo()) {
					        	// VERIFICAR!!!
								/* funcionario1.consultaCliente(codigo); */
						        System.out.println("Nome: "+funcionario1.getCliente(i).getNome()); 
						        System.out.println("Data de nascimento: "+funcionario1.getCliente(i).getData_de_nascimento()); 
						        System.out.println("Identidade: "+funcionario1.getCliente(i).getIdentidade()); 
						        System.out.println("Data de cadastro: "+funcionario1.getCliente(i).getDataCadastro()); 
						        System.out.println("Valor em aberto: R$"+funcionario1.getCliente(i).getValorEmAberto()); 
						        System.out.println("Telefone: "+funcionario1.getCliente(i).contato.getTel1()+
						        		", Celular: "+funcionario1.getCliente(i).contato.getCel1());
						        System.out.println("Email: "+funcionario1.getCliente(i).contato.getEmail());
						        System.out.println("Endereco: "+funcionario1.getCliente(i).endereco.getCep()+
						        		", "+funcionario1.getCliente(i).endereco.getEstado()+
						        		", "+funcionario1.getCliente(i).endereco.getCidade()+
						        		", "+funcionario1.getCliente(i).endereco.getRua()+
						        		" "+funcionario1.getCliente(i).endereco.getNumero()+
						        		", "+funcionario1.getCliente(i).endereco.getComplemento());

					        }
					    }
					}
				break;
				
				// Consulta um fornecedor, apenas.
				case 2:
					if(funcionario1.quantidadeFornecedores() == 0) {
						System.out.println("\nNenhum fornecedor cadastrado.");
					}else {
					    // Consultar Fornecedor.
					    System.out.println("\nInforme o codigo para consultar o fornecedor: ");
					    int codigo = teclado.nextInt();
					    
					    for(int i=0; i< funcionario1.quantidadeFornecedores(); i++) {
					        if(codigo == funcionario1.getFornecedor(i).getCodFornecedor()) {
						        System.out.println("Razao: "+funcionario1.getFornecedor(i).getRazao()); 
						        System.out.println("Nome: "+funcionario1.getFornecedor(i).getNomeFantasia()); 
						        System.out.println("Inscricao estadual: "+funcionario1.getFornecedor(i).getInscEstadual()); 
						        System.out.println("CNPJ: "+funcionario1.getFornecedor(i).getCnpj()); 
						        System.out.println("Telefone: "+funcionario1.getFornecedor(i).contato.getTel1()+
						        		", Celular: "+funcionario1.getFornecedor(i).contato.getCel1());
						        System.out.println("Email: "+funcionario1.getFornecedor(i).contato.getEmail());
						        System.out.println("Endereco: "+funcionario1.getFornecedor(i).endereco.getCep()+
						        		", "+funcionario1.getFornecedor(i).endereco.getEstado()+
						        		", "+funcionario1.getFornecedor(i).endereco.getCidade()+
						        		", "+funcionario1.getFornecedor(i).endereco.getRua()+
						        		" "+funcionario1.getFornecedor(i).endereco.getNumero()+
						        		", "+funcionario1.getFornecedor(i).endereco.getComplemento());
					        }
					    }
					}
				break;
				
				// Caso a opção não exista.
				default:
					System.out.println("\nOpcao Invalida!");
				break;
				}
			break;
			
			// Alterar.
			case 4:
				opcao = 0;
				
				System.out.println("\nDeseja alterar um 1 - cliente ou um 2- fornecedor?");
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch(opcao) {
				// Altera um cliente, apenas.
				case 1:
					if(funcionario1.quantidadeClientes() == 0) {
						System.out.println("\nNenhum cliente cadastrado.");
					}else {
					    // Alterar cliente.
					    System.out.println("\nInforme o codigo para alterar o cliente: ");
					    int codigo = teclado.nextInt();
					    teclado.nextLine();	 
					    
					    for(int i=0; i< funcionario1.quantidadeClientes(); i++) {				 
					        if(codigo == funcionario1.getCliente(i).getCodigo()) {
							    System.out.println("Informe o nome: ");
							    cliente[i].setNome(teclado.nextLine());
							    System.out.println("Informe a data de nascimento (dd/mm/yyyy): ");
							    cliente[i].setData_de_nascimento(teclado.nextLine());
							    System.out.println("Informe a identidade: ");
							    cliente[i].setIdentidade(teclado.nextLine());
							    
								System.out.println("Contatos do cliente "+ (i+1) +":");
								System.out.println("Informe o telefone: "); 
								cliente[i].contato.setTel1(teclado.nextLine());
								System.out.println("Informe o celular: ");
								cliente[i].contato.setCel1(teclado.nextLine()); 
								System.out.println("Informe o email: ");
								cliente[i].contato.setEmail(teclado.nextLine());
								  
								System.out.println("Endereco do cliente "+ (i+1) +":");
								System.out.println("Informe o CEP: ");
								cliente[i].endereco.setCep(teclado.nextLine()); 
								System.out.println("Informe o estado: ");
								cliente[i].endereco.setEstado(teclado.nextLine());
								System.out.println("Informe a cidade: ");
								cliente[i].endereco.setCidade(teclado.nextLine());
								System.out.println("Informe a rua: ");
								cliente[i].endereco.setRua(teclado.nextLine());
								System.out.println("Informe o numero: ");
								cliente[i].endereco.setNumero(teclado.nextLine()); 
								System.out.println("Informe o complemento: ");
								cliente[i].endereco.setComplemento(teclado.nextLine());
								
							    cliente[i].setDataCadastro(new Date());
							    
							    System.out.println("Informe o valor em aberto: ");
							    cliente[i].setValorEmAberto(teclado.nextDouble());
							    teclado.nextLine();
					        }
					    }
					    System.out.println("\nCliente alterado com sucesso!");
					}
				break;
				
				// Altera um fornecedor, apenas.
				case 2:
					if(funcionario1.quantidadeFornecedores() == 0) {
						System.out.println("\nNenhum cliente cadastrado.");
					}else {
					    // Alterar Fornecedor.
					    System.out.println("\nInforme o codigo para alterar o fornecedor: ");
					    int codigo = teclado.nextInt();
					    teclado.nextLine();

					    for(int i=0; i< funcionario1.quantidadeFornecedores(); i++) {
					        if(codigo == funcionario1.getFornecedor(i).getCodFornecedor()) {
							    System.out.println("Informe a razao: ");
							    fornecedor[i].setRazao(teclado.nextLine());
							    System.out.println("Informe o nome: ");
							    fornecedor[i].setNomeFantasia(teclado.nextLine());
							    System.out.println("Informe a inscricao estadual: ");
							    fornecedor[i].setInscEstadual(teclado.nextLine());
							    System.out.println("Informe o CNPJ: ");
							    fornecedor[i].setCnpj(teclado.nextInt());
							    teclado.nextLine();

								System.out.println("Contatos do fornecedor "+ (i+1) +":");
								System.out.println("Informe o telefone: "); 
								fornecedor[i].contato.setTel1(teclado.nextLine());
								System.out.println("Informe o celular: ");
								fornecedor[i].contato.setCel1(teclado.nextLine()); 
								System.out.println("Informe o email: ");
								fornecedor[i].contato.setEmail(teclado.nextLine());
								  
								System.out.println("Endereco do fornecedor "+ (i+1) +":");
								System.out.println("Informe o CEP: ");
								fornecedor[i].endereco.setCep(teclado.nextLine()); 
								System.out.println("Informe o estado: ");
								fornecedor[i].endereco.setEstado(teclado.nextLine());
								System.out.println("Informe a cidade: ");
								fornecedor[i].endereco.setCidade(teclado.nextLine());
								System.out.println("Informe a rua: ");
								fornecedor[i].endereco.setRua(teclado.nextLine());
								System.out.println("Informe o numero: ");
								fornecedor[i].endereco.setNumero(teclado.nextLine()); 
								System.out.println("Informe o complemento: ");
								fornecedor[i].endereco.setComplemento(teclado.nextLine());	
					        }
					    }
					    System.out.println("\nFornecedor alterado com sucesso!");
					}
				break;
				
				// Caso a opção não exista.
				default:
					System.out.println("\nOpcao Invalida!");
				break;
				}
			break;
			
			// Remove.
			case 5:
				opcao = 0;
				
				System.out.println("\nDeseja remover um 1 - cliente ou um 2- fornecedor?");
				opcao = teclado.nextInt();
				teclado.nextLine();
				
				switch(opcao) {
				// Remove um cliente, apenas.
				case 1:
					if(funcionario1.quantidadeClientes() == 0) {
						System.out.println("\nNenhum cliente cadastrado.");
					}else {
					    System.out.println("\nInforme o codigo para remover o cliente: ");
					    int codigo = teclado.nextInt();
					    teclado.nextLine();
						
					    for(int i=0; i< funcionario1.quantidadeClientes(); i++){
					    	if(codigo == funcionario1.getCliente(i).getCodigo()) {
					    		funcionario1.removeCliente(cliente[i]);
					    	}
					    }
					    System.out.println("\nCliente removido com sucesso!");
					}
				break;
				
				// Remove um fornecedor, apenas.
				case 2:
					if(funcionario1.quantidadeFornecedores() == 0) {
						System.out.println("\nNenhum fornecedor cadastrado.");
					}else {
					    System.out.println("\nInforme o codigo para remover o fornecedor: ");
					    int codigo = teclado.nextInt();
					    teclado.nextLine();

					    for(int i=0; i< funcionario1.quantidadeFornecedores(); i++){
					    	if(codigo == funcionario1.getFornecedor(i).getCodFornecedor()) {
					    		funcionario1.removeFornecedor(fornecedor[i]);
					    	}
					    }
					    System.out.println("\nFornecedor removido com sucesso!");
					}
				break;
				
				// Caso a opção não exista.
				default:
					System.out.println("\nOpcao Invalida!");
				break;
			}
			break;
			
			// Caso a opção não exista.
			default:
				System.out.println("\nOpcao Invalida!");
			break;
			}
	    }
	}
}
