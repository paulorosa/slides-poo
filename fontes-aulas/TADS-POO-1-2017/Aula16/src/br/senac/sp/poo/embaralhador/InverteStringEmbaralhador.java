package br.senac.sp.poo.embaralhador;

public class InverteStringEmbaralhador implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		String novaPalavra = "";
		for (int i = palavra.length() -1; i>=0 ; i--) {
			novaPalavra = novaPalavra + palavra.charAt(i);
		}
		return novaPalavra;
	}

	@Override
	public int dificuldade() {
		return 1;
	}

	public static void main (String[] args) {
		InverteStringEmbaralhador embaralhador = new InverteStringEmbaralhador();
		String palavra = "paulo";
		String embaralhada = embaralhador.embaralhar(palavra);		
		System.out.println("original: "+palavra + " - embaralhada: "+embaralhada);
	}
}
