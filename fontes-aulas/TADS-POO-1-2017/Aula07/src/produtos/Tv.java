package produtos;

public class Tv extends Eletrodomestico {

	private int polegadas;

	public Tv(String marca, String modelo, String seloProcel, int polegadas) {
		super(marca, modelo, seloProcel);
		this.polegadas = polegadas;
	}

	public final int getPolegadas() {
		return polegadas;
	}

	@Override
	public String descricao() {
		return "Tv " + super.descricao() + " " + getPolegadas();
	}

}
