package atividade2;

public class ProgressaoGeometrica extends SequenciaNumerica {
	private int razao;

	public ProgressaoGeometrica(int valorInicial, int razao) {
		super(valorInicial);
		this.razao = razao;
	}


	public void proximoValor() {
		valorAtual = valorAtual * razao;
	}

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(args[0]);
		int valorInicial = Integer.parseInt(args[1]);
		int razao = Integer.parseInt(args[2]);

		ProgressaoGeometrica pg = new ProgressaoGeometrica(valorInicial, razao);

		for (int i = 0; i < quantidade; i++) {
			System.out.print(pg.valorAtual() + " ");
			pg.proximoValor();
		}
	}
}
