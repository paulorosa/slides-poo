
public class Diretor extends Funcionario {

	public Diretor(String nome, double salario) {
 		super(nome, salario);
	}

	public double bonificacao() {
		return 0.3 * getSalario();
	}
}
