import java.io.FileReader;
import java.util.Scanner;

public class RelatorioNotas {

	public void calcularMedia(String filename) throws Exception {
		System.out.println("Nome do Arquivo: " + filename);

		int quantidade = 0;
		int soma = 0;
		
		Scanner scanner = new Scanner(new FileReader(filename))
				.useDelimiter("\\t|\\n");
		while (scanner.hasNext()) {
			String nome = scanner.next();
			int nota = scanner.nextInt();
			//System.out.println(nome);
			//System.out.println(nota);
			
			soma += nota;
			quantidade++;
		}

		//System.out.println("soma: "+ soma +" quantidade: "+quantidade);
		
		System.out.println("Média: "+soma/quantidade);
	}

	public static void main(String[] args) throws Exception {
		String filename = args[0];

		RelatorioNotas relatorioNotas = new RelatorioNotas();
		relatorioNotas.calcularMedia(filename);
		relatorioNotas.calcularMediana(filename);
	}
}
