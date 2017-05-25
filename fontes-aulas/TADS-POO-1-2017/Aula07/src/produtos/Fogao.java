package produtos;

public final class Fogao extends Eletrodomestico {
	
	private int bocas;

	public Fogao (String marca, String modelo, String seloProcel, int bocas) {
		super (marca, modelo, seloProcel);
		this.bocas = bocas;
	}
	
	public final int getBocas() {
		return bocas;
	}

	@Override
	public String descricao() {
		return "Fogao "+ super.descricao() + " " + getBocas();
	}
}
