package parte3C;

import java.util.ArrayList;

public class RelatorioNotas {

	public static void main(String[] args) throws Exception {
		String nomeDoArquivo = "src/parte3/notas-parte-3.txt";

		LeituraArquivo leituraArquivo = new LeituraArquivo();
		ArrayList<Aluno> alunos = leituraArquivo.leArquivo(nomeDoArquivo);
		
		FiltroAlunos filtroAlunos = new FiltroAlunos();
		
		ArrayList<Integer> notasAlunosGraduacao = filtroAlunos.filtra(alunos, "G");

		System.out.println("Gradução:");

		MediaAritimetica mediaAritimetica = new MediaAritimetica();
		mediaAritimetica.calcularMedia(notasAlunosGraduacao);

		Mediana mediana = new Mediana();
		mediana.calcularMediana(notasAlunosGraduacao);
		
		ArrayList<Integer> notasAlunosMestrado = filtroAlunos.filtra(alunos, "M");

		System.out.println("");
		System.out.println("Mestrado:");

		MediaAritimetica mediaAritimeticaMestrado = new MediaAritimetica();
		mediaAritimeticaMestrado.calcularMedia(notasAlunosMestrado);

		Mediana medianaMestrado = new Mediana();
		medianaMestrado.calcularMediana(notasAlunosMestrado);
		
	}
}
