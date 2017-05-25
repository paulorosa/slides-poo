public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("Aula 02");

		Professor professor = new Professor("Fulano", 100);

		double salario = professor.obterSalarioDoProfessor();
		System.out.println("Salário: " + salario);
		professor.alterarSalarioDoProfessor(1000);
		System.out.println("Salário Alterado: " + professor.obterSalarioDoProfessor());

		String nome = professor.obterNomeDoProfessor();
		System.out.println("Nome: "+nome);
		System.out.println("Tamannho do Nome: "+nome.length());
		professor.alterarNomeDoProfessor("Paulo");
		System.out.println("Nome Alterado: "+ professor.obterNomeDoProfessor());
		
	}

}
