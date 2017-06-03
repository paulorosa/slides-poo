package br.senac.sp.poo.ado.aluno.comando;

import java.util.Scanner;

import br.senac.sp.poo.ado.aluno.Aluno;
import br.senac.sp.poo.ado.aluno.Faculdade;

public class MatricularAlunoComando implements Comando {
	private Faculdade faculdade;
	private Scanner scanner;

	public MatricularAlunoComando(Faculdade faculdade, Scanner scanner) {
		this.faculdade = faculdade;
		this.scanner = scanner;
	}

	public void executar() {
		System.out.print("  Digite o nome: ");
		String nome = scanner.next();
		Aluno aluno = new Aluno(nome, 0);
		faculdade.matricular(aluno);
		System.out.print("Aluno matriculado");
	}

}
