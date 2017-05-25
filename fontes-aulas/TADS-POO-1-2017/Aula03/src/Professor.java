public class Professor extends Funcionario {
	public double salario;

	public Professor (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public Professor(String nome) {
		this.nome = nome;
		this.salario = 1000.0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentaSalario (double aumento) {
		this.salario = this.salario + aumento;
	}
	
	public void zeraSalario () {
		this.salario = 0;
	}
	
	public static void main(String[] args) {

		Professor professor = new Professor("Paulo", 3000);
		System.out.println("Nome: " + professor.nome);
		System.out.println("Salário Atual: " + professor.getSalario());

		professor.nome = "Paulo Rosa";
		professor.setSalario(2000);
		System.out.println("Nome: " + professor.nome);
		System.out.println("Salário Atual: " + professor.getSalario());

		professor.aumentaSalario(5000);
		System.out.println("Salário Atual: " + professor.getSalario());
		
		professor.zeraSalario();
		System.out.println("Salário Atual: " + professor.getSalario());
	}

}
