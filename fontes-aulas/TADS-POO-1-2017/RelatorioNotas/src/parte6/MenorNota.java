package parte6;

import java.util.ArrayList;
import java.util.Collections;

public class MenorNota implements Calculo {

	public void calcular(ArrayList<Integer> notas) {
		Collections.sort(notas);
		Integer menorNota = notas.get(0);
		System.out.print("  menorNota: " + menorNota);

	}
}
