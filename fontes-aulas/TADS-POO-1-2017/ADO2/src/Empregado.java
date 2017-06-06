
public abstract class Empregado {

	private String nome;

	public Empregado(String nome) {
		this.nome = nome;
	}

	public final String getNome() {
		return nome;
	}
	
	public abstract double calcularSalarioMensal();
	
}
