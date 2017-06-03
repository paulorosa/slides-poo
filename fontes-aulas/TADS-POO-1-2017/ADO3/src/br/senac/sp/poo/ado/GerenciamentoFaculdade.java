package br.senac.sp.poo.ado;

import java.util.Scanner;

import br.senac.sp.poo.ado.aluno.AlunoDaoImpl;
import br.senac.sp.poo.ado.aluno.Faculdade;
import br.senac.sp.poo.ado.aluno.comando.Comando;
import br.senac.sp.poo.ado.aluno.comando.FabricaDeComandos;

public class GerenciamentoFaculdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		AlunoDaoImpl alunoDao = new AlunoDaoImpl();
		//AlunoDaoMysql alunoDao = new AlunoDaoMysql();
		
		Faculdade faculdade = new Faculdade(alunoDao);
		
		FabricaDeComandos fabricaDeComando = new FabricaDeComandos(faculdade, scanner);

		fabricaDeComando.criar(2);
		while (true) {
			System.out.print("Digite o numero da operacao: ");
			Comando comando = fabricaDeComando.criar(scanner.nextInt());
			
			comando.executar();
		}

	}
}
