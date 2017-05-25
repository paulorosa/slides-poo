package produtos;

import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main (String[] args) {
		
		Fogao f1 = new Fogao("marcaFogao1", "modeloFogao1", "A", 4);
		Fogao f2 = new Fogao("marcaFogao2", "modeloFogao2", "B", 5);
		Fogao f3 = new Fogao("marcaFogao3", "modeloFogao3", "C", 5);
		
		Tv tv1 = new Tv("marcaTv1", "modeloTv1", "A", 40);
		Tv tv2 = new Tv("marcaTv2", "modeloTv2", "B", 50);
		Tv tv3 = new Tv("marcaTv3", "modeloTv3", "B", 50);
		
		
		ArrayList<Fogao> fogoes = new ArrayList<Fogao>();
		fogoes.add(f1);
		fogoes.add(f2);
		fogoes.add(f3);

		for (int i=0; i<fogoes.size(); i++) {
			Fogao fogao = fogoes.get(i);
			System.out.println(fogao.descricao());
		}
		
		
		ArrayList<Eletrodomestico> eletrodomesticos= new ArrayList<Eletrodomestico>();
		eletrodomesticos.add(f1);
		eletrodomesticos.add(f2);
		eletrodomesticos.add(f3);
		eletrodomesticos.add(tv1);
		eletrodomesticos.add(tv2);
		eletrodomesticos.add(tv3);

		for (int i=0; i<eletrodomesticos.size(); i++) {
			Eletrodomestico eletrodomestico = eletrodomesticos.get(i);
			System.out.println(eletrodomestico.descricao());
		}
		

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(f1);
		produtos.add(f2);
		produtos.add(f3);
		produtos.add(tv1);
		produtos.add(tv2);
		produtos.add(tv3);

		for (int i=0; i<produtos.size(); i++) {
			Produto produto = produtos.get(i);
			System.out.println(produto.descricao());
		}

		
	}
	
	
	
	
}
