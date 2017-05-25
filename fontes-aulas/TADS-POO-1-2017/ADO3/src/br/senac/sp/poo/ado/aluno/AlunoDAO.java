package br.senac.sp.poo.ado.aluno;

import java.util.ArrayList;

public interface AlunoDAO {

	public void criar (Aluno aluno);
	
	/**
	 * @return
	 */
	public ArrayList<Aluno> listarTodosAlunos();
}
