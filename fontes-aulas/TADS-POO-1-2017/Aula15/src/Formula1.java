
public class Formula1 extends Carro {

	@Override
	public int deslocamento() {
		System.out.println("deslocamento 10");

		return 10;
	}

	public String[] patrocinadores () {
		String[] patrocinadores = new String[1];
		patrocinadores[0] = "Patrocinador 1";
		return patrocinadores;
	}
}
