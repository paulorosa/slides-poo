package atividade2;

public class PolinomioGeral extends SequenciaNumerica {
	private int posicao;

	private int[] coeficientes;

	public PolinomioGeral(int[] coeficientes) {
		super(coeficientes[1]);

		this.coeficientes = coeficientes;
		this.posicao = 0;
	}

	public void proximoValor() {
		this.posicao++;
		this.valorAtual = calcula();
	}

	private int calcula() {
		int valorParcial = 0;
		for (int i=0; i<coeficientes.length; i++) {
			valorParcial += coeficientes[i]*Math.pow(posicao, i);
		}
		return valorParcial;
	}
	
	 public static void main (String[] args) {
	        int quantidade = Integer.parseInt(args[0]);
			
			int[] coeficientes = new int[args.length-1];
	        for (int i=0; i<coeficientes.length; i++) {
				coeficientes[i] = Integer.parseInt(args[args.length-1-i]);
			}

			PolinomioGeral polinomio =  new PolinomioGeral(coeficientes);

	        for (int i=0; i<quantidade; i++) {
	            System.out.print (polinomio.valorAtual() + " ");
	            polinomio.proximoValor();
	        }
	    }    
}
