package parte6;

import java.util.ArrayList;
import java.util.Collections;

public class MaiorNota implements Calculo{
	
	public void calcular(ArrayList<Integer> notas) {
		Collections.sort(notas);
		Integer maiorNota = notas.get(notas.size()-1);
		System.out.print("  maiorNota: "+maiorNota);

	}
}
