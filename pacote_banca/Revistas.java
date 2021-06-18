import java.util.Date;
import java.util.Scanner;

public class Revistas {
	int codigo;
	String titulo;
	String tipo;
	
	public Revistas(int codigo, String titulo, String tipo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public void SetEdicao(int numEdicao, int numArtigos) {
		Date dataEdicao = new Date();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\nDigite o numero da edicao: ");
		numEdicao = teclado.nextInt(); 
		
		System.out.println("Digite a quantidade de artigos: ");
		numArtigos = teclado.nextInt();

		System.out.println("\nRevistas:\n" + " Numero edicao:" + numEdicao + " | Data:" + dataEdicao + " | Numero de artigos:" + numArtigos);
		
		teclado.close();
	}
	
	public void GetEdicao(int numEdicao, int numArtigos) {
		Date dataEdicao = new Date();
		
		System.out.println("Revistas:\n" + " Numero edicao: " + numEdicao + " | Data: " + dataEdicao + " | Numero de artigos: " + numArtigos);
	}
}
