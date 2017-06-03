package atividade2;

public class Fibonnacci extends SequenciaNumerica {
	private int valorAnterior;

	public Fibonnacci() {
		super(1);
		this.valorAnterior = 1;
	}

	public void proximoValor() {
		int temp = valorAnterior;
		valorAnterior = valorAtual;
		valorAtual = valorAnterior + temp;
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