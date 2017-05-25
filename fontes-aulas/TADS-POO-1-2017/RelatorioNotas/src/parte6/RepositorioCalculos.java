package parte6;

import java.util.ArrayList;

public class RepositorioCalculos {

	private ArrayList<Calculo> calculos;

	public RepositorioCalculos() {
		calculos = new ArrayList<Calculo>();
		calculos.add(new MediaAritimetica());
		calculos.add(new Mediana());
		calculos.add(new MaiorNota());
		calculos.add(new MenorNota());
	}

	public void calcular(ArrayList<Integer> notasAlunosGraduacao) {

		for (Calculo calculo : calculos) {
			calculo.calcular(notasAlunosGraduacao);
		}

	}

}
