
public class ProgramaPrincipalHeranca {

	public static void main(String[] args) {

		ClasseA ca = new ClasseA();
		ClasseB cb = new ClasseB();

		ca.metodoA();
		System.out.println("----");
		cb.metodoB();
		cb.metodoA();
		
	}

}
