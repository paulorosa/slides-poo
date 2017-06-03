package br.senac.sp.poo.ado.aluno;

import java.util.ArrayList;
import java.util.Collection;

public class AlunoDaoImpl implements AlunoDao {

	private ArrayList<Aluno> alunos;
	private int ultimoNumeroMatricula;
	
	public AlunoDaoImpl () {
		this.alunos = new ArrayList<Aluno>();
		this.ultimoNumeroMatricula = 0;
	}
	
	@Override
	public void create(Aluno aluno) {
		aluno.setMatricula(ultimoNumeroMatricula);
		alunos.add(aluno);
		ultimoNumeroMatricula++;
	}

	@Override
	public Aluno read(Integer matricula) {
		for (Aluno aluno: alunos) {
			if (aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		return null;
	}

	@Override
	public void update(Aluno aluno) {
		Aluno alunoAtualizado = read (aluno.getMatricula());
		alunoAtualizado.setNome(aluno.getNome());
	}

	@Override
	public void delete(Integer matricula) {
		int index = -1;
		for (int i=0; i<alunos.size(); i++) {
			if (alunos.get(i).getMatricula().equals(matricula)) {
				index = i;
			}
		}
		alunos.remove(index);
	}

	@Override
	public Collection<Aluno> findAll() {
		return alunos;
	}
}
