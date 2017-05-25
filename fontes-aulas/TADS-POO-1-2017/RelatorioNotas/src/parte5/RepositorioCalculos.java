package parte5;

import java.util.ArrayList;

public class RepositorioCalculos {

	public void calcular (ArrayList<Integer> notasAlunosGraduacao) {
		MediaAritimetica mediaAritimetica = new MediaAritimetica();
		mediaAritimetica.calcularMedia(notasAlunosGraduacao);

		Mediana mediana = new Mediana();
		mediana.calcularMediana(notasAlunosGraduacao);
		
		MaiorNota maiorNota = new MaiorNota();
		maiorNota.calcularMaiorNota(notasAlunosGraduacao);
	}
	
}
