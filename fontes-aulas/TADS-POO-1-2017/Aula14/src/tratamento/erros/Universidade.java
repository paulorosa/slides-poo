package tratamento.erros;

import java.util.ArrayList;

public class Universidade {

	private ArrayList<Curso> cursos;

	public Universidade() {
		this.cursos = new ArrayList<Curso>();
	}

	public void adicionar (Curso curso) {
		cursos.add(curso);
	}


	public void matricular(Aluno aluno, Curso curso) throws CursoInexistenteException, Exception {
		if (aluno.getNome().equals("Paulo 2")) {
			throw new Exception();
		}

		for (Curso c: cursos) {
			if (c.getNome().equals(curso.getNome())) {
				c.adicionar(aluno);
				return;
			}
		}
		
		throw new CursoInexistenteException(curso);
	}

	
	
//	public CodigoMatricula matricular(Aluno aluno, Curso curso) {
//		for (Curso c: cursos) {
//			if (c.getNome().equals(curso.getNome())) {
//				if (c.quantidadeAlunos() == 2) {
//					return CodigoMatricula.QUANTIDADE_ALUNOS_EXCEDIDA;
//				}
//				c.adicionar(aluno);
//				return CodigoMatricula.MATRICULA_OK;
//			}
//		}
//		
//		//CodigoMatricula.BANCO_DE_DADOS_FORA_DO_AR;
//		
//		return CodigoMatricula.CURSO_INEXISTENTE;
//	}

//	public boolean matricular(Aluno aluno, Curso curso) {
//		for (Curso c: cursos) {
//			if (c.getNome().equals(curso.getNome())) {
//				if (c.quantidadeAlunos() == 2) {
//					return false;
//				}
//				c.adicionar(aluno);
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
//	public void matricular(Aluno aluno, Curso curso) {
//		for (Curso c: cursos) {
//			if (c.getNome().equals(curso.getNome())) {
//				c.adicionar(aluno);
//			}
//		}
//	}

}
