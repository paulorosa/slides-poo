package parte2B;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RelatorioNotas {

	public ArrayList<Integer> leArquivo (String nomeDoArquivo) throws Exception {
		Scanner scanner = new Scanner(new FileReader(nomeDoArquivo));
		scanner.useDelimiter("\\t|\\n");
		
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		while (scanner.hasNext()) {
			String nome = scanner.next();
			int nota = scanner.nextInt();

			notas.add(nota);
		}
		
		return notas;
	}
	
	
	public void calcularMedia(String nomeDoArquivo) throws Exception {		
		ArrayList<Integer> notas  = leArquivo (nomeDoArquivo);
		
		int soma = 0;
		for (int i = 0; i < notas.size(); i++) {
			soma += notas.get(i);
		}
		
		int quantidade = notas.size();
		
		System.out.println("Media: "+soma/quantidade);
	}

	public void calcularMediana(String nomeDoArquivo) throws Exception {
		ArrayList<Integer> notas  = leArquivo (nomeDoArquivo);
		
		Collections.sort(notas);
		
		// neste ponto a lista notas está ordenada
		
		if (notas.size() % 2 == 0) { // quantidade par de elementos
			
			int pos1 = notas.get((notas.size()/2) - 1);
			int pos2 = notas.get((notas.size()/2));
			System.out.println("Mediana: "+(pos1 + pos2) / 2);
			
		} else { // quantidade ímpar de elementos
			System.out.println("Mediana: "+notas.get((int)notas.size()/2));	 
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		String nomeDoArquivo = args[0];

		RelatorioNotas relatorioNotas = new RelatorioNotas();
		relatorioNotas.calcularMedia(nomeDoArquivo);
		relatorioNotas.calcularMediana(nomeDoArquivo);
	}
}



















