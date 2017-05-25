
public class ProgressaoAritmetica {

	public int valorAtual;
	public int razao;
	
	public ProgressaoAritmetica (int valorInicial, int razao) {
		this.valorAtual = valorInicial;
		this.razao = razao;
	}
	
	public void proximoValor() {
		valorAtual = valorAtual + razao;
	}
	
	public int valorAtual () {
		return valorAtual;
	}
}
