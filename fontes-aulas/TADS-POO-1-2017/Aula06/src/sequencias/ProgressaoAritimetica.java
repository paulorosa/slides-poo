package sequencias;

public class ProgressaoAritimetica extends SequenciaNumerica{

	private int razao;
	
	public ProgressaoAritimetica(int valorInicial, int razao) {
		super(valorInicial);
		this.razao = razao;
	}

	@Override
	public void proximoValor() {
		this.valorAtual += razao;
	}

}
