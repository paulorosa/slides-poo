public class Professor {

	public String nome;

	public double salario;

	public Professor () {
		nome = "";
	}
	
	public Professor (String nomeInicial) {
		nome = nomeInicial;
	}
	
	public Professor (double salarioInicial) {
		salario = salarioInicial;
		nome = "";
	}
	
	public Professor (String nomeInicial, double salarioInicial) {
		nome = nomeInicial;
		salario = salarioInicial;
	}
	
	
	public String obterNomeDoProfessor() {
		return nome;
	}

	public void alterarNomeDoProfessor(String novoNome) {
		nome = novoNome;
	}

	public double obterSalarioDoProfessor() {
		return salario;
	}

	public void alterarSalarioDoProfessor(double novoSalario) {
		salario = novoSalario;
	}

}
