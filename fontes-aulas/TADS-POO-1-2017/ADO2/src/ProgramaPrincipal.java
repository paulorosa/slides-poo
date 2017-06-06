import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Assalariado assalariado = new Assalariado("Nome1", 1000);
		Horista horista = new Horista("Nome2", 2000);
		Comissionado comissionado = new Comissionado("Nome3", 3000, 1);

		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(assalariado);
		empregados.add(horista);
		empregados.add(comissionado);

		System.out.println("Salários Fixos:");
		for (Empregado e : empregados) {
			System.out.println("Nome: " + e.getNome() + " - Salário: " + e.calcularSalarioMensal());
		}

		System.out.println("-------------------------------------------------");
		System.out.println("Salários Variantes:");
		System.out.println("Nome: " + assalariado.getNome() + " - Salário + Horas Extras: R$"
				+ assalariado.calcularSalarioMensal(10));
		System.out.println("Nome: " + horista.getNome() + " - Salário: R$" + horista.calcularSalarioMensal(200));
		System.out.println("Nome: " + comissionado.getNome() + " - Salário + Comissão de vendas: R$"
				+ comissionado.calcularSalarioMensal(4000.0));
	}

}
