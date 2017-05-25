package parte5;

import java.util.ArrayList;

public class RelatorioNotas {

	public static void main(String[] args) throws Exception {
		String nomeDoArquivo = "src/parte5/notas-parte-3.txt";

		LeituraArquivo leituraArquivo = new LeituraArquivo();
		ArrayList<Aluno> alunos = leituraArquivo.leArquivo(nomeDoArquivo);
		
		FiltroAlunos filtroAlunos = new FiltroAlunos();
		
		ArrayList<Integer> notasAlunosGraduacao = filtroAlunos.filtra(alunos, "G");

		System.out.println("Gradução:");

		RepositorioCalculos repositorioCalculos = new RepositorioCalculos();
		repositorioCalculos.calcular(notasAlunosGraduacao);
		
		
		ArrayList<Integer> notasAlunosMestrado = filtroAlunos.filtra(alunos, "M");

		System.out.println("");
		System.out.println("Mestrado:");

		repositorioCalculos.calcular(notasAlunosMestrado);

		System.out.println("");
		System.out.println("Doutorado:");

		ArrayList<Integer> notasAlunosDoutorado = filtroAlunos.filtra(alunos, "D");

		repositorioCalculos.calcular(notasAlunosDoutorado);
		
	}
}
