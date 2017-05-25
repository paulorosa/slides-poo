package atividade2;
public class PolinomioGeral extends SequenciaNumerica {

	private int n;

	private int[] coeficientes;
	
	public PolinomioGeral(int[] coeficientes) {
		super(coeficientes[0]);
		this.coeficientes = coeficientes;
		this.n = 0;
		this.valorAtual = coeficientes[0];
	}

	public void proximoValor() {
		n = n + 1;
		
		int valorParcial = 0;
		for (int i=0; i<coeficientes.length; i++) {
			//valorParcial += coeficientes[i]*Math.pow(n,i);
			valorParcial += coeficientes[i]*calculaPotencia(n,i);
		}
		
		this.valorAtual = valorParcial;
	}
	
	private int calculaPotencia (int n, int i) {
		int valorParcial = 1;
		for (int j=0; j<i; j++) {
			valorParcial = valorParcial * n;
		}
		return valorParcial;
	}


	public static void main(String[] args) {
		int quantidade = Integer.parseInt(args[0]);

		int[] coeficientes = new int[args.length - 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = Integer.parseInt(args[args.length - 1 - i]);
		}

		PolinomioGeral polinomio = new PolinomioGeral(coeficientes);

		for (int i = 0; i < quantidade; i++) {
			System.out.print(polinomio.valorAtual() + " ");
			polinomio.proximoValor();
		}
	}
}


