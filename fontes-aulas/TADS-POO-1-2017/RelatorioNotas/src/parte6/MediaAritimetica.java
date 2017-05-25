package parte6;

import java.util.ArrayList;

public class MediaAritimetica implements Calculo{

	public void calcular(ArrayList<Integer> notas)  {		
		int soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i);
		}
		
		int quantidade = notas.size();
		System.out.print("  Media: "+soma/quantidade);
	}

}
