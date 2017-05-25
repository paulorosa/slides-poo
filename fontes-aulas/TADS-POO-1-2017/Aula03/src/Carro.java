public class Carro {

	public String modelo;
	public int velocidadeAtual;

	public Carro() {
		this.modelo = "";
		this.velocidadeAtual = 0;
	}

	public Carro(String modelo, int velocidadeAtual) {
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
	}

	public String getModelo() {
		return modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void acelerar() {
		this.velocidadeAtual = this.velocidadeAtual + 1;
	}

	public void frear() {
		this.velocidadeAtual = this.velocidadeAtual - 1;
	}
	
	
	public static void main (String[] args) {
		
		Carro carro = new Carro();
		carro.acelerar();
		carro.acelerar();
		System.out.println("Velocidade: "+carro.getVelocidadeAtual());
	}
	
}
