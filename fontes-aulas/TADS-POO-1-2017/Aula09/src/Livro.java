public class Livro {

	private String titulo;
	
	private Editora editora;

	public Livro(String titulo, Editora editora) {
		this.titulo = titulo;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public Editora getEditora () {
		return editora;
	}
}
