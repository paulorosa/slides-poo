import java.util.ArrayList;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		Veiculo c2 = new Carro();
		
		Carro c1 = new Carro();
		Formula1 f1 = new Formula1();

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo> ();
		veiculos.add(c2);
		veiculos.add(c1);
		veiculos.add(f1);
		
		for (Veiculo v: veiculos) {
			v.deslocamento();
			
			if (v instanceof Formula1) {
				Formula1 f = (Formula1) v;
				f.patrocinadores();
			}
		}
		
	}

}















