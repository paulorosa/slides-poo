package parte5;

public class Aluno {

	private String tipo;
	private String nome;
	private int nota;

	public Aluno(String tipo, String nome, int nota) {
		this.tipo = tipo;
		this.nome = nome;
		this.nota = nota;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public int getNota() {
		return nota;
	}

}
