import java.util.ArrayList;

public class ProgramaPrincipalAutomovel {

	public static void main(String[] args) {

		Carro c1 = new Carro("Ford");
		Carro c2 = new Carro("Fiat");
		c2.quantidadeRodas("abc");
		c2.quantidadeRodas();
		
		Moto m1 = new Moto("Honda");
		Moto m2 = new Moto("Suzuki");

		ArrayList<Carro> carros = new ArrayList<Carro>();
		carros.add(c1);
		carros.add(c2);

		ArrayList<Moto> motos = new ArrayList<Moto>();
		motos.add(m1);
		motos.add(m2);
		
		////////////////////
		
		for (int i=0; i< carros.size(); i++) {
			Carro carro = carros.get(i);
			System.out.println("Marca: "+carro.getMarca());
			System.out.println("Rodas: "+carro.quantidadeRodasDoCarro());
		}
		
		for (int i=0; i< motos.size(); i++) {
			Moto moto = motos.get(i);
			System.out.println("Marca: "+moto.getMarca());
			System.out.println("Rodas: "+moto.quantidadeRodasDa());
		}
		
		
		
		
	}

}
