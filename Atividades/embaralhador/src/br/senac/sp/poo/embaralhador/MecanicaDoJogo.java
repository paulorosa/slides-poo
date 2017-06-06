package br.senac.sp.poo.embaralhador;

public interface MecanicaDoJogo {

	boolean terminou();
	
	boolean acertou(String palavra);
	
	String proximaPalavra ();
	
	int pontuacao();
	
}
