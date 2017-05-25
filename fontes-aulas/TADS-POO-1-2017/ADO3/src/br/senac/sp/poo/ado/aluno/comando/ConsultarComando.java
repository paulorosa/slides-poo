package br.senac.sp.poo.ado.aluno.comando;

import java.util.Scanner;

import br.senac.sp.poo.ado.aluno.Aluno;
import br.senac.sp.poo.ado.aluno.Faculdade;

public class ConsultarComando implements Comando{

	private Faculdade faculdade;
	private Scanner scanner;

	public ConsultarComando(Faculdade faculdade) {
		this.faculdade = faculdade;
		this.scanner = scanner;
	}

	public void executa() {
		System.out.print("Digite o número da matricula: ");
		Integer matricula = scanner.nextInt();
		Aluno aluno = faculdade.consultar(matricula);
		System.out.println("Nome do Aluno: " + aluno.getNome());
	}

}
