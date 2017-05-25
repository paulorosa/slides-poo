import java.util.ArrayList;


public class ProgramaPrincipalLivros {

	public static void main(String[] args) {

		Editora e1 = new Editora ("E1", "11111");
		Editora e2 = new Editora ("E2", "22222");
		
		Livro l1 = new Livro("L1", e1);
		Livro l2 = new Livro("L2", e1);
		Livro l3 = new Livro("L3", e2);
		Livro l4 = new Livro("L4", e2);
		
		Pessoa p1 = new Pessoa("P1", "111");
		p1.le(l1);
		p1.le(l2);
		p1.le(l3);
		p1.le(l4);
		
		///////////////////////////////
		
		
		ArrayList<Livro> livros = p1.getLivros();
		for (int i = 0; i < livros.size(); i++) {
			Livro livro = livros.get(i);
			Editora editora = livro.getEditora();
			
			System.out.println("Editora: "+ editora.getNome());
		}
		
	}

}
