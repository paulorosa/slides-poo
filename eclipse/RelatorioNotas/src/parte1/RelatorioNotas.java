package parte1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RelatorioNotas {

	public void calcularMedia(String filename) throws Exception {
		int soma = 0;
		int quantidade = 0;

		FileInputStream stream = new FileInputStream(filename);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			String nome = linha.substring(0, linha.indexOf('\t'));
			String nota = linha.substring(linha.lastIndexOf('\t') + 1, linha.length());

			quantidade++;
			soma += Integer.parseInt(nota);

			// System.out.println(nome + " " + nota);
			linha = br.readLine();
		}
		br.close();

		System.out.println(soma + " " + quantidade);
	}

	public static void main(String[] args) throws Exception {
		String filename = args[0];

		RelatorioNotas relatorioNotas = new RelatorioNotas();
		relatorioNotas.calcularMedia(filename);
	}

}
