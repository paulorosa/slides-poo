import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String cpf;
	
	private ArrayList<Livro> livros;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
		this.livros = new ArrayList<Livro>();
	}

	public void le (Livro livro) {
		livros.add(livro);
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}
