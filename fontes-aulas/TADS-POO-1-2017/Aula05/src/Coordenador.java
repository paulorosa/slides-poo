
public class Coordenador extends Professor {

	public Coordenador(String nome, double salario) {
		super(nome, salario);
	}

	public double bonificacao() {
		return 0.2 * getSalario();
	}

}
