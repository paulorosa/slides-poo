package produtos;

public abstract class Eletrodomestico extends Produto {

	private String seloProcel;

	public Eletrodomestico(String marca, String modelo, String seloProcel) {
		super(marca, modelo);
		this.seloProcel = seloProcel;
	}

	public final String getSeloProcel() {
		return seloProcel;
	}

	@Override
	public String descricao() {
		return getMarca() + " " + getModelo() + " " + getSeloProcel();
	}

}
