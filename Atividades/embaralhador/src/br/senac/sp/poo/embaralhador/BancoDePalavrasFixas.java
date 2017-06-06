package br.senac.sp.poo.embaralhador;

import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavrasFixas implements BancoDePalavras {

	private Random random;
	private ArrayList<String> palavras;
	
	public BancoDePalavrasFixas () {
		this.random = new Random();
		this.palavras = new ArrayList<String>();
		
	}
	@Override
	public String proxima() {
		return palavras.get(random.nextInt(palavras.size()));
	}


}
