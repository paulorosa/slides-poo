package parte3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RelatorioNotas {

	public ArrayList<Integer> leArquivo(String nomeDoArquivo, String tipoAluno) throws Exception {
		Scanner scanner = new Scanner(new FileReader(nomeDoArquivo));
		scanner.useDelimiter("\\t|\\n");

		ArrayList<Integer> notas = new ArrayList<Integer>();

		while (scanner.hasNext()) {
			String tipo = scanner.next();
			String nome = scanner.next();
			int nota = scanner.nextInt();

			if (tipo.equals(tipoAluno)) {
				notas.add(nota);
			}
		}
		return notas;
	}

	public static void main(String[] args) throws Exception {
		String nomeDoArquivo = "src/parte3/notas-parte-3.txt";

		RelatorioNotas relatorioNotas = new RelatorioNotas();

		ArrayList<Integer> notasAlunosGraduacao = relatorioNotas.leArquivo(nomeDoArquivo, "G");

		System.out.println("Gradução:");

		MediaAritimetica mediaAritimetica = new MediaAritimetica();
		mediaAritimetica.calcularMedia(notasAlunosGraduacao);

		Mediana mediana = new Mediana();
		mediana.calcularMediana(notasAlunosGraduacao);
		
		
		ArrayList<Integer> notasAlunosMestrado = relatorioNotas.leArquivo(nomeDoArquivo, "M");

		System.out.println("");
		System.out.println("Mestrado:");

		MediaAritimetica mediaAritimeticaMestrado = new MediaAritimetica();
		mediaAritimeticaMestrado.calcularMedia(notasAlunosMestrado);

		Mediana medianaMestrado = new Mediana();
		medianaMestrado.calcularMediana(notasAlunosMestrado);
		
	}
}
