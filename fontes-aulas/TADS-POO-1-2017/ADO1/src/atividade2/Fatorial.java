package atividade2;
public class Fatorial extends SequenciaNumerica {

	private int posicao;

	public Fatorial() {
		super(1);
		this.posicao = 0;
	}

	public void proximoValor() {
		// Posicao = 3
		posicao = posicao + 1;
		// posicao = 3 + 1 = 4

		// 3! = 6
		valorAtual = valorAtual * posicao;
		// 4! = 3! * 4
	}

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(args[0]);

		Fatorial fatorial = new Fatorial();

		for (int i = 0; i < quantidade; i++) {
			System.out.print(fatorial.valorAtual() + " ");
			fatorial.proximoValor();
		}
	}
}
