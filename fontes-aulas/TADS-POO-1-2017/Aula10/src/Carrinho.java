import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> produtos;
	
	
	public Carrinho () {
		this.produtos = new ArrayList<Produto>();
	}
	
	public ArrayList<Produto>  produtos() {
		return this.produtos;
	}
	
	public void adicionar (Produto produto) {
		produtos.add(produto);
	}
	
	public double valor () {
		double soma = 0.0;
		for (int i = 0; i < produtos.size(); i++) {
			soma += produtos.get(i).getPreco();
		}
		return soma;
	}
}
