import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Editoras infoEditora = new Editoras(100, "EmpresaLTDA", "editora@gmail.com", "+55 8199999-1010");
		
		Produtos infoProdutos = new Produtos(500, "Livros", 20, 8);
		
		Revistas infoRevistas = new Revistas(101, "Revistas legais", "Moda");
		
		infoEditora.listardados();
		infoProdutos.listaraDados();
		infoRevistas.GetEdicao(5122, 5);
		
		Scanner teclado = new Scanner(System.in);
		
		int resp = 0;
		
		System.out.println("\nDeseja alterar as informacoes da edicao? (0 - S | 1 - N)");
		resp = teclado.nextInt();
		
		switch(resp) {
		case 0:
			int nArtigos = 0;
			int nEdicao = 0;
			
			infoRevistas.SetEdicao(nArtigos, nEdicao);
			infoEditora.listardados();
			infoProdutos.listaraDados();			
		break;
		
		case 1:
			System.out.println("Programa finalizado!");
		break;
		}
		
		
		teclado.close();
	}

}
