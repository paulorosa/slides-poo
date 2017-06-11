package br.senac.sp.poo.embaralhador;

import java.util.Scanner;

public class JogoEmbaralhador {

	private Scanner scanner;
	private MecanicaDoJogo mecanica;
	
	public JogoEmbaralhador () {
		this.scanner = new Scanner(System.in);
		this.mecanica= new MecanicaPorQuantidade(5);
	}
	
	public void executa () {
	
		while (!mecanica.terminou()) {
			String palavraEmbaralhada = mecanica.tentarNovamente();
			System.out.println("Qual é a Palavra? "+palavraEmbaralhada);
			
			System.out.println("Digite a palavra correta: ");
			String palavraDigitada = scanner.next();
		
			if (mecanica.acertou(palavraDigitada)) {
				System.out.println("ACERTOU!");
			} else {
				System.out.println("ERROU!");
			}
		}
		System.out.println("Pontuação Final: "+mecanica.pontuacao());
	}

	public static void main (String[] args) {
		JogoEmbaralhador jogo = new JogoEmbaralhador();
		jogo.executa();
	}
}
