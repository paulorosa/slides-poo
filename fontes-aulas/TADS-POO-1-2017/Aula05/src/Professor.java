
public class Professor extends Funcionario {

	public Professor(String nome, double salario) {
		super(nome, salario);
	}

	public double bonificacao() {
		return 0.1 * getSalario();
	}

}
