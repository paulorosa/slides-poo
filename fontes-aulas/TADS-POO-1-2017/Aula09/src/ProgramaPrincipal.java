import java.util.ArrayList;


public class ProgramaPrincipal {


	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("F1", "111");
		
		Empresa empresa = new Empresa ("RazaoSocial", "CNPJ");
		empresa.contratar(funcionario);
		
		ArrayList<Funcionario> funcionarios = empresa.getFuncionarios();
		
	}

}
