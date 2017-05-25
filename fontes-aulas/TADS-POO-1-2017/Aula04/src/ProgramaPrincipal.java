
public class ProgramaPrincipal {

	public static void main(String[] args) {

		int valorInicial = 5;
		int razao = 3;
		
		ProgressaoAritmetica pa = new ProgressaoAritmetica(valorInicial, razao);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(pa.valorAtual + " ");
			pa.proximoValor();
		}
		
	}

}
