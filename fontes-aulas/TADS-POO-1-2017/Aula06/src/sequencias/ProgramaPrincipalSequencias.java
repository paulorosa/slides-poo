package sequencias;

import java.util.ArrayList;

public class ProgramaPrincipalSequencias {

	public static void main(String[] args) {

		ArrayList<SequenciaNumerica> sequencias 
		            = new ArrayList<SequenciaNumerica>();
		
		sequencias.add(new ProgressaoAritimetica(1, 3));
		sequencias.add(new Fibonnacci());
		sequencias.add(new Fatorial());
	
		for (int j=0; j<sequencias.size(); j++) {
			SequenciaNumerica sequencia = sequencias.get(j);

			ImpressorSequencias impressor = new ImpressorSequencias();
			impressor.imprime(sequencia);
			System.out.println();

		}
		
	}

}
