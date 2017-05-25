package tratamento.erros;

import java.util.ArrayList;

public class Curso {

	private String nome;
	
	private ArrayList<Aluno> alunos;

	public Curso(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}

	public void adicionar (Aluno aluno) {
		alunos.add(aluno);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int quantidadeAlunos () {
		return alunos.size();
	}

}
