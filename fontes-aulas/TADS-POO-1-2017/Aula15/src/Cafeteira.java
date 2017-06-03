public class Cafeteira {

	private int quantidadeCafe;

	private boolean booleano;

	public Cafeteira() {
		this.quantidadeCafe = 255;
	}

	public Cafeteira(int quantidadeCafe) {
		if (quantidadeCafe < 0) {
			throw new IllegalArgumentException("quantidade inválida");
		} else {
			this.quantidadeCafe = quantidadeCafe;
		}
	}

	// public Cafeteira (int quantidadeCafe) {
	// if (quantidadeCafe < 0) {
	// this.quantidadeCafe = 0;
	// } else {
	// this.quantidadeCafe = quantidadeCafe;
	// }
	//
	// }

	private Integer valor;

	public int getQuantidadeCafe() {
		return this.quantidadeCafe;
	}

	public boolean getBooleano() {
		return this.booleano;
	}

	public Integer getValor() {
		return this.valor;
	}

	
	public static void main(String[] args) {
		int tamanho = -100;

		try {
			
			Cafeteira cafeteira = new Cafeteira(tamanho);
			System.out.println("Quantidade Café: " + cafeteira.getQuantidadeCafe());
			System.out.println("Booleano: " + cafeteira.getBooleano());
			System.out.println("valor: " + cafeteira.getValor());
	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}
}
















