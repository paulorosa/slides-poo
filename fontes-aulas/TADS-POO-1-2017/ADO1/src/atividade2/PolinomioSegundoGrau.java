package atividade2;

public class PolinomioSegundoGrau extends SequenciaNumerica {
	private int posicao;

	private int coeficienteGrauDois;
	private int coeficienteGrauUm;
	private int coeficienteGrauZero;

	public PolinomioSegundoGrau(int coeficienteGrauDois, int coeficienteGrauUm, int coeficienteGrauZero) {
		super(coeficienteGrauZero);
		this.coeficienteGrauDois = coeficienteGrauDois;
		this.coeficienteGrauUm = coeficienteGrauUm;
		this.coeficienteGrauZero = coeficienteGrauZero;
	}

	public void proximoValor() {
		this.posicao++;
		this.valorAtual = calcula();
	}

	private int calcula() {
		return (coeficienteGrauDois*posicao*posicao) + (coeficienteGrauUm*posicao) + coeficienteGrauZero;
	}
	
	 public static void main (String[] args) {
	        int quantidade = Integer.parseInt(args[0]);

			int coeficienteGrauDois = Integer.parseInt(args[1]);
			int coeficienteGrauUm = Integer.parseInt(args[2]);
			int coeficienteGrauZero = Integer.parseInt(args[3]);

			PolinomioSegundoGrau polinomio =  new PolinomioSegundoGrau(coeficienteGrauDois,coeficienteGrauUm,coeficienteGrauZero);

	        for (int i=0; i<quantidade; i++) {
	            System.out.print (polinomio.valorAtual() + " ");
	            polinomio.proximoValor();
	        }
	    }    
}