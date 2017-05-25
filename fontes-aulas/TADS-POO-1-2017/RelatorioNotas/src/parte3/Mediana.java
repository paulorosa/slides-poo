package parte3;

import java.util.ArrayList;
import java.util.Collections;

public class Mediana {
	public void calcularMediana(ArrayList<Integer> notas) {
		Collections.sort(notas);
		if (notas.size() % 2 == 0) { // quantidade par de elementos
			
			int pos1 = notas.get((notas.size()/2) - 1);
			int pos2 = notas.get((notas.size()/2));
			System.out.print("  Mediana: "+(pos1 + pos2) / 2);
		} else { // quantidade ímpar de elementos
			System.out.print("  Mediana: "+notas.get((int)notas.size()/2));	 
		}
	}
}
