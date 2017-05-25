public class ProgramaPrincipalRelatorio {

	public static void main(String[] args) {

		Professor p1 = new Professor("P1", 1000);
		Professor p2 = new Professor("P2", 2000);

		Diretor d1 = new Diretor ("D1", 5000);
		Diretor d2 = new Diretor ("D2", 5000);
		
		////////////////////////
		
		System.out.println("Relatório");
		System.out.println("Nome \t Salário");
		System.out.println(p1.nome + "\t" + p1.getSalario());
		System.out.println(p2.nome + "\t" + p2.getSalario());
		System.out.println(d1.nome + "\t" + d1.getSalario());
		System.out.println(d2.nome + "\t" + d2.getSalario());
	}

}
