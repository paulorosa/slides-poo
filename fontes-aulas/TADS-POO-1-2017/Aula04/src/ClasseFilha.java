public class ClasseFilha extends ClasseMae {

	public String atributoB;
	
	public ClasseFilha(String atributoA, String atributoB) {
		super(atributoA);
		this.atributoB = atributoB;
		
		System.out.println("Construtor ClasseFilha. Atributo B: "+atributoB);
	}

	public void metodoClasseFilha() {
		System.out.println("método classe Filha");
	}
}
