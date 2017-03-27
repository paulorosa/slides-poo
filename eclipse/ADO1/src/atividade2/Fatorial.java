package atividade2;

public class Fatorial extends SequenciaNumerica {
	private int posicao;

	public Fatorial() {
		super(1);
		this.posicao = 0;
	}

	public void proximoValor() {
		posicao = posicao + 1;
		valorAtual = valorAtual * posicao;
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