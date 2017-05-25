package produtos;

public abstract class Produto {

	private String marca;
	private String modelo;
	
	public Produto (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public final String getMarca() {
		return marca;
	}
	
	public final String getModelo() {
		return modelo;
	}
	
	public abstract String descricao();
	
}
