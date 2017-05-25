
public class Relatorio {

	public static void main(String[] args) {

		Professor p = new Professor ("P1", 1000);
		Diretor d = new Diretor("D1", 3000);
		Coordenador c = new Coordenador ("C1", 2000);
		
		System.out.println("Nome \t Salário \t Bonificação");
		System.out.println(p.getNome() +"\t" + p.getSalario() +"\t" + p.bonificacao());
		System.out.println(c.getNome() +"\t" + c.getSalario() +"\t" + c.bonificacao());
		System.out.println(d.getNome() +"\t" + d.getSalario() +"\t" + d.bonificacao());
		

	}

}
