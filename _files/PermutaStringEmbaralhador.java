package br.senac.sp.poo.embaralhador;

import java.util.ArrayList;
import java.util.Collections;

public class PermutaStringEmbaralhador implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i< palavra.length(); i++) {
			indices.add(new Integer(i));
		}
		Collections.shuffle(indices);
		
		String novaPalavra = "";
		for (int i = 0; i< palavra.length(); i++) {
			novaPalavra = novaPalavra + palavra.charAt(indices.get(i));
		}
		
		return novaPalavra;
	}

	@Override
	public int dificuldade() {
		return 3;
	}

	
	public static void main(String[] args) {
		PermutaStringEmbaralhador embaralhador = new PermutaStringEmbaralhador();
		String palavra = "paulo";
		String embaralhada = embaralhador.embaralhar(palavra);
		System.out.println("palavra: " + palavra + " - embaralhada: " + embaralhada);
	}

}
