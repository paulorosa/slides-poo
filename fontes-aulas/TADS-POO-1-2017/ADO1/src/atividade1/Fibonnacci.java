package atividade1;

public class Fibonnacci {
	private int valorAtual;
	private int valorAnterior;

	public Fibonnacci() {
		this.valorAtual = 1;
		this.valorAnterior = 1;
	}

	public void proximoValor() {
		int temp = valorAnterior;
		valorAnterior = valorAtual;
		valorAtual = valorAnterior + temp;
	}

	public int valorAtual() {
		return this.valorAtual;
	}

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(args[0]);

		Fibonnacci fibonnacci = new Fibonnacci();

		for (int i = 0; i < quantidade; i++) {
			System.out.print(fibonnacci.valorAtual() + " ");
			fibonnacci.proximoValor();
		}
	}
}