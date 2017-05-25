public class AnimalAnfibio implements CapacidadeAndar, CapacidadeNadar {

	private AnimalTerreste animalTerrestre;
	private AnimalMaritimo animalMaritmo;

	public AnimalAnfibio() {
		this.animalTerrestre = new AnimalTerreste();
		this.animalMaritmo = new AnimalMaritimo();
	}

	public void andar() {
		animalTerrestre.andar();
	}

	public void nadar() {
		animalMaritmo.nadar();
	}

}
