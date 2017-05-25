package atividade1;
public class Fatorial {

	private int valorAtual;
	private int posicao;

	public Fatorial() {
		this.posicao = 0;
		this.valorAtual = 1;
	}

	public void proximoValor() {
		// Posicao = 3
		posicao = posicao + 1;
		// posicao = 3 + 1 = 4

		// 3! = 6
		valorAtual = valorAtual * posicao;
		// 4! = 3! * 4
	}

	public int valorAtual() {
		return valorAtual;
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
