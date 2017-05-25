package sequencias;

public class ImpressorSequencias {

	public void imprime (SequenciaNumerica sequencia ) {

		for (int i = 0; i < 5; i++) {
			System.out.print(sequencia.valorAtual() + " - ");
			sequencia.proximoValor();
		}	
	}
}
