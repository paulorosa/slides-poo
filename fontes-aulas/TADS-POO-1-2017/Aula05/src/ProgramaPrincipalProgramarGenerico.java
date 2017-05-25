import java.util.ArrayList;

public class ProgramaPrincipalProgramarGenerico {

	public static void main(String[] args) {

		Carro c1 = new Carro("Ford");
		Carro c2 = new Carro("Fiat");

		Moto m1 = new Moto("Honda");
		Moto m2 = new Moto("Suzuki");

		Automovel a1 = new Automovel("abc");
		
		ArrayList<Automovel> autos = new ArrayList<Automovel>();
		autos.add(c1);
		autos.add(c2);
		autos.add(m1);
		autos.add(m2);
		autos.add(a1);

		// //////////////

		for (int i = 0; i < autos.size(); i++) {
			Automovel auto = autos.get(i);
			System.out.println("Marca: " + auto.getMarca());
			System.out.println("Rodas: " + auto.quantidadeRodas());
		}

	}

}









