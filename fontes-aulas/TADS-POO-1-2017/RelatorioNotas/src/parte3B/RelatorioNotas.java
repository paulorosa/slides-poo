package parte3B;

import java.util.ArrayList;

public class RelatorioNotas {

	public static void main(String[] args) throws Exception {
		String nomeDoArquivo = "src/parte3/notas-parte-3.txt";

		LeituraArquivo leituraArquivo = new LeituraArquivo();
		ArrayList<Aluno> alunos = leituraArquivo.leArquivo(nomeDoArquivo);
		
		ArrayList<Integer> notasAlunosGraduacao = new ArrayList<Integer>();
		for (Aluno aluno: alunos) {
			if (aluno.getTipo().equals("G")) {
				notasAlunosGraduacao.add(aluno.getNota());
			}
		} 

		System.out.println("Gradução:");

		MediaAritimetica mediaAritimetica = new MediaAritimetica();
		mediaAritimetica.calcularMedia(notasAlunosGraduacao);

		Mediana mediana = new Mediana();
		mediana.calcularMediana(notasAlunosGraduacao);
		
		
		ArrayList<Integer> notasAlunosMestrado = new ArrayList<Integer>();
		for (Aluno aluno: alunos) {
			if (aluno.getTipo().equals("M")) {
				notasAlunosMestrado.add(aluno.getNota());
			}
		} 

		System.out.println("");
		System.out.println("Mestrado:");

		MediaAritimetica mediaAritimeticaMestrado = new MediaAritimetica();
		mediaAritimeticaMestrado.calcularMedia(notasAlunosMestrado);

		Mediana medianaMestrado = new Mediana();
		medianaMestrado.calcularMediana(notasAlunosMestrado);
		
	}
}
