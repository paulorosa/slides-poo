package parte5;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraArquivo {

	public ArrayList<Aluno> leArquivo(String nomeDoArquivo) throws Exception {
		Scanner scanner = new Scanner(new FileReader(nomeDoArquivo));
		scanner.useDelimiter("\\t|\\n");

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		while (scanner.hasNext()) {
			String tipo = scanner.next();
			String nome = scanner.next();
			int nota = scanner.nextInt();
			
			Aluno aluno = new Aluno (tipo, nome, nota);
			alunos.add(aluno);
		}
		return alunos;
	}

}
