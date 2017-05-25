import java.util.ArrayList;

public class Empresa {

	private String razaoSocial;
	private String cnpj;

	private ArrayList<Funcionario> funcionarios;

	// Multiplicidade 0..*
	public Empresa(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		
		this.funcionarios = new ArrayList<Funcionario>();
	}

	// Multiplicidade 1..*
	public Empresa(String razaoSocial, String cnpj, Funcionario funcionario) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		
		this.funcionarios = new ArrayList<Funcionario>();
		contratar(funcionario);
	}

	public void contratar (Funcionario funcionario) {
		// regras de negócio
		funcionarios.add(funcionario);
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public ArrayList<Funcionario> getFuncionarios () {
		return funcionarios;
	}
}
