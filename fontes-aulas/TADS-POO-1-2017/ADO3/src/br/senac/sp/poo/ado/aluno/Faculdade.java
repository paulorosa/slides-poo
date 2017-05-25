package br.senac.sp.poo.ado.aluno;

import java.util.ArrayList;

public class Faculdade {

	private AlunoDAO alunoDao;
	
	public Faculdade(AlunoDAO alunoDao) {
		this.alunoDao = alunoDao;
	}

	public Aluno consultar (Integer matricula) {
		return null;
	}
	
	public void matricular (Aluno aluno) {
		alunoDao.criar(aluno);
	}
	
	public ArrayList<Aluno> listarTodosAlunos () {
		return alunoDao.listarTodosAlunos();
	}
	
	// ...
}
