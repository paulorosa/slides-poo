public class Diretor extends Funcionario{

	public double salario;

	public Diretor(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
