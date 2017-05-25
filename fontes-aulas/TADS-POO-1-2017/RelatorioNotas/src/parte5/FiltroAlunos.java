package parte5;

import java.util.ArrayList;

public class FiltroAlunos {

	public ArrayList<Integer> filtra(ArrayList<Aluno> alunos, String tipo) {
		ArrayList<Integer> notasAlunos = new ArrayList<Integer>();
		for (Aluno aluno : alunos) {
			if (aluno.getTipo().equals(tipo)) {
				notasAlunos.add(aluno.getNota());
			}
		}
		return notasAlunos;
	}
}
