package br.senac.sp.poo.ado.aluno;

import java.util.HashMap;
import java.util.Scanner;

import br.senac.sp.poo.ado.aluno.comando.Comando;
import br.senac.sp.poo.ado.aluno.comando.ConsultarComando;
import br.senac.sp.poo.ado.aluno.comando.FabricaComandos;
import br.senac.sp.poo.ado.aluno.comando.HelpComando;
import br.senac.sp.poo.ado.aluno.comando.ListarTodosAlunosComando;

public class GerenciamentoFaculdade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		AlunoDAO alunoDao = new AlunoDAOImpl();
		
		Faculdade faculdade = new Faculdade (alunoDao);
		
		FabricaComandos fabrica = new FabricaComandos(faculdade);
		
		while (true) {
			// interação com a Faculdade...
			System.out.print("Digite comando: ");
			int comandoId = scanner.nextInt();
		
			Comando comando = fabrica.criar(comandoId);
			comando.executa();
			
		}
		
	}

}
