package sequencias;
public class PolinomioSegundoGrau extends SequenciaNumerica {
	
	private int n;
	
	private int coeficienteGrauDois; 
	private int coeficienteGrauUm;
	private int coeficienteGrauZero;
	
	public PolinomioSegundoGrau(int coeficienteGrauDois, int coeficienteGrauUm,
			int coeficienteGrauZero) {
		super (coeficienteGrauZero);

		this.coeficienteGrauDois = coeficienteGrauDois; 
		this.coeficienteGrauUm = coeficienteGrauUm;
		this.coeficienteGrauZero = coeficienteGrauZero;
		
		this.n = 0;
	}

	public void proximoValor() {
		n = n + 1;
		valorAtual = coeficienteGrauDois*n*n 
				   + coeficienteGrauUm*n 
				   + coeficienteGrauZero;
	}

	public static void main(String[] args) {
		int quantidade = Integer.parseInt(args[0]);

		int coeficienteGrauDois = Integer.parseInt(args[1]);
		int coeficienteGrauUm = Integer.parseInt(args[2]);
		int coeficienteGrauZero = Integer.parseInt(args[3]);

		PolinomioSegundoGrau polinomio = new PolinomioSegundoGrau(
				coeficienteGrauDois, coeficienteGrauUm, coeficienteGrauZero);

		for (int i = 0; i < quantidade; i++) {
			System.out.print(polinomio.valorAtual() + " ");
			polinomio.proximoValor();
		}
	}
}
