		
public abstract class Automovel extends Object{

	protected String marca;

	public Automovel () {
		super();
	}
	
	public Automovel(String marca) {
		this.marca = marca;
	}
	
	public final String getMarca() {
		return marca;
	}

	public abstract int quantidadeRodas();
}
