package tratamento.erros;

public class CursoInexistenteException extends Exception {

	private Curso curso;

	public CursoInexistenteException(Curso curso) {
		this.curso = curso;

	}

	public Curso getCurso() {
		return curso;
	}
}
