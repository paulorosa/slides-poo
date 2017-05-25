package parte2D;

import java.util.ArrayList;

public class MediaAritimetica {

	public void calcularMedia(ArrayList<Integer> notas)  {		
		int soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i);
		}
		
		int quantidade = notas.size();
		System.out.println("Media: "+soma/quantidade);
	}

}
