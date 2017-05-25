
public class ProgramaPrincipalCarrinho {

	public static void main(String[] args) {

		Produto p1 = new Produto(10.0);
		Produto p2 = new Produto(30.0);
		Produto p3 = new Produto(50.0);

		Usuario u1 = new Usuario();
		Carrinho carrinho = u1.carrinho();

		carrinho.adicionar(p1);
		carrinho.adicionar(p2);
		carrinho.adicionar(p3);

		System.out.println("Valor Carrinho: " + carrinho.valor());
	}

}
