public class AtributosMetodosEstaticos {

	public static void main(String[] args) {

		// int anoNascimento = Integer.parseInt(args[0]);

		Integer valorMaximo = Integer.MAX_VALUE;
		System.out.println("M�ximo valor do inteiro: " + valorMaximo);

		Pessoa pessoa1 = new Pessoa(2000);
		System.out.println("Idade Pessoa 1: " + pessoa1.idade());

		Pessoa pessoa2 = new Pessoa(2010);
		System.out.println("Idade Pessoa 2: " + pessoa2.idade());

		// Pessoa.idade(); // ERRO

		System.out.println("Valor de PI: " + Circulo.pi);

		System.out.println("�rea do C�rculo de raio 4: " + Circulo.area(4));

		Circulo circulo1 = new Circulo(1);
		System.out.println("Tamanho da Linha do C�rculo 1: "
				+ circulo1.getTamanhoDaLinha());

		Circulo circulo2 = new Circulo(2);
		System.out.println("Tamanho da Linha do C�rculo 2: "
				+ circulo2.getTamanhoDaLinha());

		// Warning
		System.out.println("�rea do C�rculo de raio 4: " + Circulo.area(3));

	}

}
