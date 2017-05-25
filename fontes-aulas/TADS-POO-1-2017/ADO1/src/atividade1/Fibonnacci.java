package atividade1;

public class Fibonnacci {
	private int valorAnterior;
	private int valorAtual;

	public Fibonnacci () {
		this.valorAnterior = 0;
        this.valorAtual = 1;
    }

    public void proximoValor () {
    	int temporario = this.valorAtual;
    	this.valorAtual = this.valorAtual + this.valorAnterior;
    	this.valorAnterior = temporario;
    }
    
    public int valorAtual () {
        return valorAtual;
    }
    
    
    public static void main (String[] args) {
        int quantidade = Integer.parseInt(args[0]);

        Fibonnacci fibonnacci = new Fibonnacci();

        for (int i=0; i<quantidade; i++) {
            System.out.print (fibonnacci.valorAtual() + " ");
            fibonnacci.proximoValor();
        }
    } 
}
