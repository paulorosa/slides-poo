
public class Assalariado extends Empregado {

	private double salarioMensal;
	
	public Assalariado(String nome, double salarioMensal) {
		super(nome);
		this.salarioMensal = salarioMensal;
	}

	
	public double getSalarioMensal() {
		return salarioMensal;
	}


	@Override
	public double calcularSalarioMensal() {
		return salarioMensal;
	}

	public double calcularSalarioMensal(int horasExtras) {
		return calcularSalarioMensal() + ( 1.5 * horasExtras * (salarioMensal/160));
	}

}
