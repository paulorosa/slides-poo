package sequencias;

public abstract class SequenciaNumerica {
	protected int valorAtual;

	public SequenciaNumerica(int valorAtual) {
		this.valorAtual = valorAtual;
	}

	public final int valorAtual() {
		return valorAtual;
	}
	
	// fa�lkdsjfsa�jfa�sdjfas�djfaj�
	public abstract void proximoValor();
}
