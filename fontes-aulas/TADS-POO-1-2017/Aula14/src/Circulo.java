public class Circulo {

	public static final double pi = 3.14; // constante
	
	private int tamanhoDaLinha;

	public Circulo(int tamanhoDaLinha) {
		this.tamanhoDaLinha = tamanhoDaLinha;
	}

	public double  getTamanhoDaLinha() {
		return tamanhoDaLinha * Circulo.area(1);
	}

	public static double area(double raio) {
		return Circulo.pi * raio * raio;
	}
}
