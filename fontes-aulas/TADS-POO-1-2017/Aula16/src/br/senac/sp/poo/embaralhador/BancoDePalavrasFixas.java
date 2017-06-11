package br.senac.sp.poo.embaralhador;

import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavrasFixas implements BancoDePalavras {

	private Random random;
	private ArrayList<String> palavras;

	public BancoDePalavrasFixas() {
		this.random = new Random();
		this.palavras = new ArrayList<String>();
		this.palavras.add("Palavra");
		this.palavras.add("Fixa");
		this.palavras.add("Banco");
		this.palavras.add("Embaralhador");
		this.palavras.add("Fabrica");
		this.palavras.add("Inverte");
		this.palavras.add("Permuta");
	}

	@Override
	public String proximaPalavra() {
		return palavras.get(random.nextInt(palavras.size()));
	}

}
