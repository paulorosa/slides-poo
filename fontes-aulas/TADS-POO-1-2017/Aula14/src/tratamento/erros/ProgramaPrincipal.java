package tratamento.erros;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Paulo 1");
		Aluno a2 = new Aluno("Paulo 2");
		Aluno a3 = new Aluno("Paulo 3");
		Aluno a4 = new Aluno("Paulo 4");

		Curso c1 = new Curso("TADS");
		Curso c2 = new Curso("BSI");

		Universidade universidade = new Universidade();
		universidade.adicionar(c1);

		ProgramaPrincipal.matricula(universidade, a1, c1);
		ProgramaPrincipal.matricula(universidade, a2, c1);
		ProgramaPrincipal.matricula(universidade, a3, c1);
		ProgramaPrincipal.matricula(universidade, a4, c2);

	}

	public static void matricula(Universidade u, Aluno a, Curso c) {
		
		try {
			
			u.matricular(a, c);
			
			System.out.println("Matrícula realizada.");
			
		} catch (CursoInexistenteException e) {
			
			System.out.println("Matrícula não realizada por curso "+e.getCurso().getNome()+" inexistente.");
			
		} catch (Exception e) {
			
			System.out.println("Matrícula não realizada por que é o Aluno Paulo 2");
		}
			

	}

	
//	public static void matricula(Universidade u, Aluno a, Curso c) {
//		
//		try {
//			
//			u.matricular(a, c);
//			
//			System.out.println("Matrícula realizada.");
//			
//		} catch (CursoInexistenteException e) {
//			
//			System.out.println("Matrícula não realizada por curso inexistente.");
//			
//		} catch (Exception e) {
//			
//			System.out.println("Matrícula não realizada por que é o Aluno Paulo 2");
//			
//		}
//
//	}

	
	
	
	
	
	// public static void matricula(Universidade u, Aluno a, Curso c) {
	// int codigoRetorno = u.matricular(a, c);
	//
	// if (codigoRetorno == 0) { // matricula ok
	// System.out.println("Aluno " + a.getNome()
	// + " Matriculado no curso " + c.getNome());
	// } else if (codigoRetorno == 1) { // ALunos excedidos
	// System.out.println("Aluno " + a.getNome()
	// + " NÃO Matriculado no curso " + c.getNome() +
	// " por ter muitos alunos.");
	//
	// } else if (codigoRetorno == 2) { // CUrso inexistente
	// System.out.println("Aluno " + a.getNome()
	// + " NÃO Matriculado no curso " + c.getNome() +
	// " por curso não existir.");
	// }
	//
	// }

	// public static void matricula(Universidade u, Aluno a, Curso c) {
	// if (u.matricular(a, c)) {
	// System.out.println("Aluno " + a.getNome()
	// + " Matriculado no curso " + c.getNome());
	// } else {
	// System.out.println("Aluno " + a.getNome()
	// + " NÃO Matriculado no curso " + c.getNome());
	// }
	//
	// }
}
