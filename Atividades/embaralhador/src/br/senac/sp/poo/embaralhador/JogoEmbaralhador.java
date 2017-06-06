package br.senac.sp.poo.embaralhador;

import java.util.Scanner;

public class JogoEmbaralhador {

	private Scanner scanner;
	private MecanicaDoJogo mecanica;
	
	public JogoEmbaralhador () {
		this.mecanica = new MecanicaPorQuantidade(5);
		this.scanner = new Scanner(System.in);
	}
	
	public void executar () {
		while (!mecanica.terminou()) {
			String proximaPalavra = mecanica.proximaPalavra();
			System.out.println("Qual é a palavra? "+proximaPalavra);
			String palavraDigitada = scanner.next();
			
			if (mecanica.acertou(palavraDigitada)) {
				System.out.println("ACERTOU");
			} else {
				System.out.println("ERROU");
			}
		}
		System.out.println("Pontuação: "+mecanica.pontuacao());
		
	}
}
